package com.example.all_android_projects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.calculator.CalculatorActivity
import com.example.all_android_projects.country.ui.CountryListActivity
import com.example.all_android_projects.tictactoe.TicTacToyRegisterPageActivity
import kotlinx.android.synthetic.main.activity_dash_board.*

class DashBoardActivity : AppCompatActivity() {

    private lateinit var buttoncalculator: AppCompatButton
    private lateinit var buttontictactoy: AppCompatButton
    private lateinit var buttonlesson: AppCompatButton
    private lateinit var buttoncountry: AppCompatButton
    private lateinit var radiobuttonyes: RadioButton
    private lateinit var radiobuttonno: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        buttoncalculator = findViewById(R.id.Calculator)
        buttontictactoy = findViewById(R.id.TicTacToy)
        buttonlesson = findViewById(R.id.Lesson)
        buttoncountry = findViewById(R.id.Country)
        radiobuttonyes = findViewById(R.id.radioButtonYes)
        radiobuttonno = findViewById(R.id.radioButtonNo)

        buttonClick()

    }

    private fun buttonClick() {

        buttoncalculator.setOnClickListener() {

            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)

        }

        buttontictactoy.setOnClickListener() {

            val intent = Intent(this, TicTacToyRegisterPageActivity::class.java)
            startActivity(intent)

        }

        buttonlesson.setOnClickListener() {

            val intent = Intent(this, Lesson::class.java)
            startActivity(intent)

        }

        buttoncountry.setOnClickListener {

            val intent = Intent(this, CountryListActivity::class.java)
            startActivity(intent)

        }

    }

}


