package com.example.all_android_projects.tictactoy

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.MainActivity
import com.example.all_android_projects.R

class TicTacToeEndPage : AppCompatActivity() {

    private lateinit var buttonReplay: AppCompatButton
    private lateinit var buttonShowScore: AppCompatButton
    private lateinit var buttonNewPlayers: AppCompatButton
    private lateinit var buttonBackToMainManu: AppCompatButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe_end_page)

        buttonReplay = findViewById(R.id.replay)
        buttonShowScore = findViewById(R.id.showScore)
        buttonNewPlayers = findViewById(R.id.newPlayers)
        buttonBackToMainManu = findViewById(R.id.backToMainManu)

        setclik()
    }


    private fun setclik() {
        buttonReplay.setOnClickListener() {

            val intent = Intent(this, TicTacToy::class.java)
            startActivity(intent)

        }

        buttonShowScore.setOnClickListener() {

            val intent = Intent(this, TicTacToy::class.java)
            startActivity(intent)

        }

        buttonNewPlayers.setOnClickListener() {

            val intent = Intent(this, TicTacToyRegisterPage::class.java)
            startActivity(intent)

        }

        buttonBackToMainManu.setOnClickListener() {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}