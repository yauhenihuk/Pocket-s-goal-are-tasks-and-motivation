package com.example.pocketsgoalaretasksandmotivation.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.ImageView
import com.example.pocketsgoalaretasksandmotivation.R
import com.example.pocketsgoalaretasksandmotivation.activities.goals.*

class GoalsSetup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_goals)
        val ivHealth = findViewById(R.id.iv_health) as ImageView
        val ivBusiness = findViewById(R.id.iv_businessGoals) as ImageView
        val ivCareersGoals = findViewById(R.id.iv_careersGoals) as ImageView
        val ivFinanceGoals = findViewById(R.id.iv_financeGoals) as ImageView
        val ivOthers = findViewById(R.id.iv_others) as ImageView



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

    fun onClickSport(v: View) {
        val ivSport = findViewById<ImageView>(R.id.iv_sport)
        ivSport.setOnClickListener {
            val intent = Intent(this, Sport::class.java)
            startActivity(intent)
        }

    }

}
