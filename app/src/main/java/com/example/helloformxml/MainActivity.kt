package com.example.helloformxml

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los elementos del layout
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val tvMensaje = findViewById<TextView>(R.id.tvMensaje)

        // Evento click en el botón
        btnSaludar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()

            if (nombre.isEmpty()) {
                tvMensaje.text = "Introduce tu nombre"
            } else {
                tvMensaje.text = "👋 Hola, $nombre"
            }
        }
    }
}