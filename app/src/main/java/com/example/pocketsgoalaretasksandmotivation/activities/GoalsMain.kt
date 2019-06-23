package com.example.pocketsgoalaretasksandmotivation.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast
import com.example.pocketsgoalaretasksandmotivation.R
import com.example.pocketsgoalaretasksandmotivation.activities.goals.*

class GoalsMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_goals)

        val ivSport: ImageView = findViewById(R.id.iv_sport) as ImageView
        val ivHealth: ImageView = findViewById(R.id.iv_health) as ImageView
        val ivBusiness: ImageView = findViewById(R.id.iv_businessGoals) as ImageView
        val ivCareersGoals: ImageView = findViewById(R.id.iv_careersGoals) as ImageView
        val ivFinanceGoals: ImageView = findViewById(R.id.iv_financeGoals) as ImageView
        val ivOthers: ImageView = findViewById(R.id.iv_others) as ImageView

        ivSport.setOnClickListener {
            Toast.makeText(this@GoalsMain, "You clicked on ImageView.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Sport::class.java)
            startActivity(intent)
        }

        ivHealth.setOnClickListener {
            val intent = Intent(this, Health::class.java)
            startActivity(intent)
        }

        ivBusiness.setOnClickListener {
            val intent = Intent(this, Business::class.java)
            startActivity(intent)
        }

        ivCareersGoals.setOnClickListener {
            val intent = Intent(this, Career::class.java)
            startActivity(intent)
        }

        ivFinanceGoals.setOnClickListener {
            val intent = Intent(this, Financial::class.java)
            startActivity(intent)
        }

        ivOthers.setOnClickListener {
            val intent = Intent(this, Others::class.java)
            startActivity(intent)
        }

    }
}