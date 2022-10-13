package com.example.all_android_projects.tictactoe.endpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.DashBoardActivity
import com.example.all_android_projects.R
import com.example.all_android_projects.tictactoe.TicTacToyRegisterPageActivity

class TicTacToeEndPageActivity : AppCompatActivity() {
    private lateinit var buttonNewPlayers: AppCompatButton
    private lateinit var buttonBackToMainManu: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe_end_page)

        buttonNewPlayers = findViewById(R.id.newPlayers)
        buttonBackToMainManu = findViewById(R.id.backToMainManu)

        setClick()
    }

    private fun setClick() {

        buttonNewPlayers.setOnClickListener() {

            val intent = Intent(this, TicTacToyRegisterPageActivity::class.java)
            startActivity(intent)

        }

        buttonBackToMainManu.setOnClickListener() {

            val intent = Intent(this, DashBoardActivity::class.java)
            startActivity(intent)

        }
    }
}