package pe.edu.tecsup.contactosapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        val nombre = intent.getStringExtra("nombre")
        val numero = intent.getStringExtra("numero")

        val tvNombre = findViewById<TextView>(R.id.text_name)
        tvNombre.text = nombre

        val tvNumero = findViewById<TextView>(R.id.text_numero)
        tvNumero.text = numero

        supportActionBar?.hide()


    }
}