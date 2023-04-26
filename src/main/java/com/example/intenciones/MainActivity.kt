package com.example.intenciones

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)

        btn1.setOnClickListener{
            Log.w("Boton", "A Pantalla")
            val intent1 = Intent(this, Tecladito::class.java)
            startActivity(intent1)
        }
        btn2.setOnClickListener{
            Log.w("Boton", "A Pagina")
            val aPagina = Intent(Intent.ACTION_VIEW)
            aPagina.data = Uri.parse("https://google.com.mx")
            startActivity(aPagina)
        }

    }
}