package pe.edu.tecsup.contactosapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, CallActivity::class.java)

        supportActionBar?.hide()

        val bottom = findViewById<Button>(R.id.btnLlamar)
        bottom.setOnClickListener {
            intent.putExtra("nombre", "David Jimenez")
            intent.putExtra("numero", "951 720 566")
            startActivity(intent)

        }


        }
}