package com.example.zadanieocena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var skladnik1 = 0
        var skladnik2 = 0
        var suma = 0

        findViewById<Button>(R.id.zastap).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text = findViewById<EditText>(R.id.poleT).text
        }
        findViewById<Button>(R.id.laczenie).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text = findViewById<TextView>(R.id.wyniktext).text.toString() + findViewById<EditText>(R.id.poleT).text
        }
        findViewById<Button>(R.id.suma).setOnClickListener {
            skladnik1 = findViewById<EditText>(R.id.LICZBA).text.toString().toInt()
            skladnik2 = findViewById<EditText>(R.id.LICZBA2).text.toString().toInt()
            suma = skladnik1 + skladnik2
            findViewById<TextView>(R.id.wyniktext).text = suma.toString()
        }
    }
}