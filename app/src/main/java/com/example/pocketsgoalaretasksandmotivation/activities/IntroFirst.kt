package com.example.pocketsgoalaretasksandmotivation.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pocketsgoalaretasksandmotivation.R
import com.example.pocketsgoalaretasksandmotivation.activities.goals.Sport

class IntroFirst : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_first)
        val btnNext: Button = findViewById(R.id.btn_next)

        btnNext.setOnClickListener {
            val intent = Intent(this, IntroSecond::class.java)
            startActivity(intent)
        }
    }
}
