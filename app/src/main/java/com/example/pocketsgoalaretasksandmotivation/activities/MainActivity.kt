package com.example.pocketsgoalaretasksandmotivation.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pocketsgoalaretasksandmotivation.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGoals: Button = findViewById(R.id.btn_goals)
        btnGoals.setOnClickListener {
            val intent = Intent(this, GoalsSetup::class.java)
            startActivity(intent)
        }
    }
}
