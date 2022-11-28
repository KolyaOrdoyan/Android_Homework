package com.example.all_android_projects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.api.ui.ApiMainActivity
import com.example.all_android_projects.calculator.CalculatorActivity
import com.example.all_android_projects.country.ui.CountryListActivity
import com.example.all_android_projects.lesson.LessonActivity
import com.example.all_android_projects.menuvariety.MenuVarietyActivity
import com.example.all_android_projects.registermenu.WelcomePageActivity
import com.example.all_android_projects.sharepage.ui.ChooseTypeActivity
import com.example.all_android_projects.store.StoreActivity
import com.example.all_android_projects.tictactoe.TicTacToyRegisterPageActivity

class DashBoardActivity : AppCompatActivity() {

    private lateinit var buttoncalculator: AppCompatButton
    private lateinit var buttontictactoy: AppCompatButton
    private lateinit var buttonlesson: AppCompatButton
    private lateinit var buttoncountry: AppCompatButton
    private lateinit var buttonListPage: AppCompatButton
    private lateinit var buttonMenuVariety: AppCompatButton
    private lateinit var buttonWelcomePage: AppCompatButton
    private lateinit var buttonApi: AppCompatButton
    private lateinit var buttonStore: AppCompatButton
    private lateinit var radiobuttonyes: RadioButton
    private lateinit var radiobuttonno: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        buttoncalculator = findViewById(R.id.Calculator)
        buttontictactoy = findViewById(R.id.TicTacToy)
        buttonlesson = findViewById(R.id.Lesson)
        buttoncountry = findViewById(R.id.Country)
        buttonListPage = findViewById(R.id.list_page)
        buttonMenuVariety = findViewById(R.id.menu_variety)
        buttonWelcomePage = findViewById(R.id.register_page)
        buttonStore = findViewById(R.id.store)
        buttonApi = findViewById(R.id.API)
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
            val intent = Intent(this, LessonActivity::class.java)
            startActivity(intent)
        }

        buttoncountry.setOnClickListener {
            val intent = Intent(this, CountryListActivity::class.java)
            startActivity(intent)
        }

        buttonListPage.setOnClickListener {
            val intent = Intent(this, ChooseTypeActivity::class.java)
            startActivity(intent)
        }

        buttonMenuVariety.setOnClickListener {
            val intent = Intent(this,MenuVarietyActivity::class.java)
            startActivity(intent)
        }

        buttonWelcomePage.setOnClickListener {
            val intent = Intent(this,WelcomePageActivity::class.java)
            startActivity(intent)
        }

        buttonStore.setOnClickListener {
            val intent = Intent(this, StoreActivity::class.java)
            startActivity(intent)
        }

        buttonApi.setOnClickListener {
            val intent = Intent(this, ApiMainActivity::class.java)
            startActivity(intent)
        }
    }

}