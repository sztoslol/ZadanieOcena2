package com.example.zadanieocena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.wyswietl).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text = findViewById<TextView>(R.id.poleT).text.toString()
        }
        findViewById<Button>(R.id.zastap).setOnClickListener {
            findViewById<TextView>(R.id.wyniktext).text = "wynik: " + findViewById<TextView>(R.id.poleT).text.toString()
        }
    }
}