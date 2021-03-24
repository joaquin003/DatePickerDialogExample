package com.example.datepickerdialogexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        etDate.setOnClickListener{
            showDatePickerDialog()
        }
    }
    private fun showDatePickerDialog(){
        val datePicker = DatePickerFragment{day, month, year -> onDateSelected(day, month ,year)}
        datePicker.show(supportFragmentManager, "datePicker")
    }
    fun onDateSelected(day:Int,month:Int,year:Int){
        etDate.setText("Has seleccionado el dia $day del mes $month del $year")
    }
}