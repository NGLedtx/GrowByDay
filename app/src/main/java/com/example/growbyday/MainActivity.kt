package com.example.growbyday

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var numberdaysInput: EditText
    lateinit var nextBtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        numberdaysInput = findViewById(R.id.numberdays_input)
        nextBtn = findViewById(R.id.next_btn)

        nextBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val numberdays = numberdaysInput.text.toString().toIntOrNull() ?:0

            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra("USERNAME", username)
            intent.putExtra("TOTAL_DAYS", numberdays)

            startActivity(intent)

        }
    }
}