package com.example.intenciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tecladito : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito)


        lateinit var numero: TextView
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btnborrar: Button = findViewById(R.id.btnborrar)
        val btneliminar: Button = findViewById(R.id.btneliminar)
        numero = findViewById(R.id.txtnumeros)

       btn1.setOnClickListener{
            numero.text = numero.text.toString() + "1"
        }
        btn2.setOnClickListener{
            numero.text = numero.text.toString() + "2"
        }
        btn3.setOnClickListener{
            numero.text = numero.text.toString() + "3"
        }
        btn4.setOnClickListener{
            numero.text = numero.text.toString() + "4"
        }
        btnborrar.setOnClickListener {
            val filaactual = numero.text.toString()
            if (filaactual.isNotEmpty()) {
                numero.text = filaactual.substring(0, filaactual.length - 1)
            }
        }
        btneliminar.setOnClickListener{
            numero.text = ""
        }

    }

}
