package dedeic.ibrahim.zavrsnirad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner


import androidx.appcompat.app.AppCompatActivity


class NovoJelo : AppCompatActivity() {

    private lateinit var btn_potvrdi: Button
    private lateinit var naziv: EditText
    private lateinit var sifra: EditText
    private lateinit var sastav: EditText
    private lateinit var kategorija: Spinner
    private lateinit var opis: EditText
    private lateinit var cijena: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_jelo)

        naziv = findViewById(R.id.naziv)
        sifra = findViewById(R.id.sifra)
        sastav = findViewById(R.id.sastav)
        opis = findViewById(R.id.opis)
        cijena = findViewById(R.id.cijena)
        kategorija = findViewById(R.id.kategorija)
        btn_potvrdi = findViewById(R.id.btn_potvrdi)


        btn_potvrdi.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            //intent.putExtra(NOVOJELO, jelo)
            startActivity(intent)
        }
    }

}
