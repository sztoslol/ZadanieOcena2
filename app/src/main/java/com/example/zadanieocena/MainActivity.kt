package com.example.zadanieocena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var skladnik1 = 0
        var skladnik2 = 0
        var suma2 = 0

        findViewById<Button>(R.id.wyswietl).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text = findViewById<TextView>(R.id.poleT).text.toString()
        }
        findViewById<Button>(R.id.zastap).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text = "wynik: " + findViewById<TextView>(R.id.poleT).text.toString()
        }
        findViewById<Button>(R.id.suma).setOnClickListener {
            skladnik1 = findViewById<TextInputEditText>(R.id.LICZBA).toString().toInt()
            //skladnik2 = findViewById<TextInputEditText>(R.id.dodawanie2).toString().toInt()
           // suma2 = skladnik1 + skladnik1
            findViewById<TextView>(R.id.wyniktext).text = suma2.toString()
        }
    }
}