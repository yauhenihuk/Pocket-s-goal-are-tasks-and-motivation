package com.example.pocketsgoalaretasksandmotivation.activities

import android.app.DatePickerDialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import com.example.pocketsgoalaretasksandmotivation.R
import kotlinx.android.synthetic.main.activity_dateofbirthday.*
import java.text.SimpleDateFormat
import java.util.*

class DateOfBirthday : AppCompatActivity() {

    var btn_date: Button? = null
    var tv_dateToday: TextView? = null
    var tv_dateBirthday: TextView? = null

    var cal = Calendar.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dateofbirthday)

        tv_dateBirthday = this.tv_birthday
        btn_date = this.btn_next
        tv_dateToday = this.tv_enterDate

        tv_enterDate!!.text = "--/--/----"

        tv_dateToday!!.text = SimpleDateFormat("MM/dd/yyyy", Locale.US).format(cal.getTime())

        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int,
                                   dayOfMonth: Int) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateInView()
            }
        }

        tv_dateToday!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val dpDialog = DatePickerDialog(this@DateOfBirthday,
                    android.R.style.Widget_DatePicker,dateSetListener,
                    cal.get(Calendar.YEAR),  cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH))
                dpDialog.window?.setBackgroundDrawable(ColorDrawable(Color.WHITE))
                dpDialog.show()
            }
        })

        btn_next!!.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    private fun updateDateInView() {
        val myFormat = "MM/dd/yyyy" // mention the format you need
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        tv_dateToday!!.text = sdf.format(cal.getTime())
    }

}
