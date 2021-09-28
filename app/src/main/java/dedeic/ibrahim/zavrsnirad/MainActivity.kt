package dedeic.ibrahim.zavrsnirad

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var predjela: RecyclerView
    private lateinit var predjelaAdapter: JeloListAdapter

    private lateinit var glavnaJela: RecyclerView
    private lateinit var glavnaJelaAdapter: JeloListAdapter

    private lateinit var dezerti: RecyclerView
    private lateinit var dezertiAdapter: JeloListAdapter

    private lateinit var pica: RecyclerView
    private lateinit var picaAdapter: JeloListAdapter

    private lateinit var korpa_button: ImageButton
    private lateinit var filterKategorije: Spinner

    private var jelaListViewModel =  JeloListViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        filterKategorije = findViewById(R.id.filterKategorije)
        korpa_button = findViewById(R.id.korpaButton)
        predjela = findViewById(R.id.predjela)
        glavnaJela = findViewById(R.id.glavnaJela)
        dezerti = findViewById(R.id.dezerti)
        pica = findViewById(R.id.pica)

        predjela.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        glavnaJela.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        dezerti.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        pica.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        predjelaAdapter = JeloListAdapter(listOf())
        glavnaJelaAdapter = JeloListAdapter(listOf())
        dezertiAdapter = JeloListAdapter(listOf())
        picaAdapter = JeloListAdapter(listOf())

        predjela.adapter = predjelaAdapter
        glavnaJela.adapter = glavnaJelaAdapter
        dezerti.adapter = dezertiAdapter
        pica.adapter = picaAdapter

        predjelaAdapter.updateJela(jelaListViewModel.getPredjela())
        glavnaJelaAdapter.updateJela(jelaListViewModel.getGlavnaJela())
        dezertiAdapter.updateJela(jelaListViewModel.getDezerti())
        picaAdapter.updateJela(jelaListViewModel.getPica())


        korpa_button.setOnClickListener{
            val intent = Intent(this, Korpa::class.java)
            startActivity(intent)
        }
    }
}



