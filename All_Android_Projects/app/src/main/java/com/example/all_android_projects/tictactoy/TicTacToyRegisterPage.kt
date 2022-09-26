package com.example.all_android_projects.tictactoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.R
import kotlinx.android.synthetic.main.activity_main.*

class TicTacToyRegisterPage : AppCompatActivity() {

    private lateinit var startgamebutton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toy_register_page)

        startgamebutton = findViewById(R.id.game)

        click()
    }


    fun click() {

        startgamebutton.setOnClickListener() {

            val intent = Intent(this, TicTacToy::class.java)
            startActivity(intent)
        }
    }

}