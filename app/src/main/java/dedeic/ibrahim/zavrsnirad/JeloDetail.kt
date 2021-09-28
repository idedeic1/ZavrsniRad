package dedeic.ibrahim.zavrsnirad

import android.content.Context
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class JeloDetail : AppCompatActivity() {
    private var jeloDetailViewModel =  JeloDetailViewModel()
    private lateinit var jelo: Jelo
    private lateinit var naziv : TextView
    private lateinit var opis : TextView
    private lateinit var kategorija : TextView
    private lateinit var sastav : TextView
    private lateinit var cijena : TextView
    private lateinit var poster : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalji)
        naziv = findViewById(R.id.jelo_title)
        opis = findViewById(R.id.jelo_pregled)
        kategorija = findViewById(R.id.jelo_release)
        sastav = findViewById(R.id.jelo_kategorija)
        cijena = findViewById(R.id.jelo_kategorija)
        poster = findViewById(R.id.jelo_poster)
        val extras = intent.extras
        if (extras != null) {
            jelo = jeloDetailViewModel.getJelobyNaziv(extras.getString("nazivJela",""))
            populateDetails()
        } else {
            finish()
        }
    }
    private fun populateDetails() {
        naziv.text=jelo.naziv
        opis.text=jelo.opis
        kategorija.text=jelo.kategorija
        sastav.text=jelo.sastav

        val context: Context = poster.getContext()
        var id: Int = context.getResources()
            .getIdentifier(jelo.sifra, "drawable", context.getPackageName())
        if (id===0) id=context.getResources()
            .getIdentifier("bif", "drawable", context.getPackageName())
        poster.setImageResource(id)
    }
}