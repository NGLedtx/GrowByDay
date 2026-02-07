package com.example.growbyday

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val username = intent.getStringExtra("USERNAME")
        val totaldays = intent.getIntExtra("TOTAL_DAYS", 0)

        Log.i("Dashboard", "Usuário: $username | Meta: $totaldays dias")
    }
}