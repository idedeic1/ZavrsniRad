package dedeic.ibrahim.zavrsnirad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

import androidx.appcompat.app.AppCompatActivity


class Korpa : AppCompatActivity() {

    private lateinit var btn_naruci: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korpa)

        btn_naruci = findViewById(R.id.btn_naruci)
        btn_naruci.setOnClickListener{
            val intent = Intent(this, Naruci::class.java)
            startActivity(intent)
        }
    }

}
