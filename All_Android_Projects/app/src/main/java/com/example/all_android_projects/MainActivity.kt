package com.example.all_android_projects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.calculator.CalculatorActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttoncalculator: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttoncalculator = findViewById(R.id.Calculator)

        buttonClick()

    }


    fun buttonClick() {

        buttoncalculator.setOnClickListener() {

            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)

        }
    }
}