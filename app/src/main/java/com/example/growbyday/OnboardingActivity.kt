package com.example.growbyday

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity: AppCompatActivity() {

    lateinit var nextBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val username = intent.getStringExtra("USERNAME")
        val totaldays = intent.getIntExtra("TOTAL_DAYS", 0)

        val name = findViewById<TextView>(R.id.name)
        name.text = "Olá ${username ?: "usuário"}👋🏻, tudo bem?"

        val days = findViewById<TextView>(R.id.days)
        val valgoal = findViewById<TextView>(R.id.valgoal)
        fun soma(){
            val a1 = 1
            val r = 1
            val n = totaldays

            var term = a1
            var value = 0

            for(i in 1..n){
                value += term
                term += r
            }
            days.text = "Você estabeleceu a meta para: ${totaldays} dias! Ou seja, no final do desafio você vai ter acumulado"
            valgoal.text = "R$ ${value},00"

            nextBtn = findViewById(R.id.discover_btn)
            nextBtn.setOnClickListener {
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra("VALUE", value)
                intent.putExtra("DAYS", totaldays)
                intent.putExtra("USERNAME", username)

                startActivity(intent)
            }

        }
        soma()

    }
}