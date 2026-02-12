package com.example.growbyday

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val value = intent.getDoubleExtra("VALUE", 0.0)
        val totaldays = intent.getIntExtra("DAYS", 0)
        val username = intent.getStringExtra("USERNAME") ?: ""

        val name = findViewById<TextView>(R.id.name)
        name.text = "Olá ,$username 👋🏻"
        val days = findViewById<TextView>(R.id.days)
        days.text = "Desafio: $totaldays dias!"



    }
}