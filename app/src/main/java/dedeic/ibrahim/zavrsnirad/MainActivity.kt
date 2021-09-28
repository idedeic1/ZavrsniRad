package dedeic.ibrahim.zavrsnirad

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView


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
    private lateinit var dodajJelo: Button

    private var jelaListViewModel =  JeloListViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        dodajJelo = findViewById(R.id.dodajJelo)
        korpa_button = findViewById(R.id.korpaButton)
        predjela = findViewById(R.id.predjela)
        glavnaJela = findViewById(R.id.glavnaJela)
        dezerti = findViewById(R.id.dezerti)
        pica = findViewById(R.id.pica)

        predjela.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        glavnaJela.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        dezerti.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        pica.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        predjelaAdapter = JeloListAdapter(listOf()) { jelo -> showJeloDetails(jelo) }
        glavnaJelaAdapter = JeloListAdapter(listOf()) { jelo -> showJeloDetails(jelo) }
        dezertiAdapter = JeloListAdapter(listOf()) { jelo -> showJeloDetails(jelo) }
        picaAdapter = JeloListAdapter(listOf()) { jelo -> showJeloDetails(jelo) }

        predjela.adapter = predjelaAdapter
        glavnaJela.adapter = glavnaJelaAdapter
        dezerti.adapter = dezertiAdapter
        pica.adapter = picaAdapter

        predjelaAdapter.updateJela(jelaListViewModel.getPredjela())
        glavnaJelaAdapter.updateJela(jelaListViewModel.getGlavnaJela())
        dezertiAdapter.updateJela(jelaListViewModel.getDezerti())
        picaAdapter.updateJela(jelaListViewModel.getPica())



        dodajJelo.setOnClickListener{
            val intent = Intent(this, NovoJelo::class.java)
            startActivity(intent)
        }

        korpa_button.setOnClickListener{
            val intent = Intent(this, Korpa::class.java)
            startActivity(intent)
        }
    }

    private fun showJeloDetails(jelo: Jelo) {
        val intent = Intent(this, JeloDetail::class.java).apply {
            putExtra("nazivJela", jelo.naziv)
        }
        startActivity(intent)
    }
}



