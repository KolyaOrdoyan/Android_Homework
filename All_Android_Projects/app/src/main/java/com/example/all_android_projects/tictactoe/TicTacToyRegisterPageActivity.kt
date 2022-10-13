package com.example.all_android_projects.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.R
import com.example.all_android_projects.tictactoe.gameplay.GamePlay

class TicTacToyRegisterPageActivity : AppCompatActivity() {

    private lateinit var startgamebutton: AppCompatButton
    private lateinit var playerOneName: EditText
    private lateinit var playerTwoName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toy_register_page)

        startgamebutton = findViewById(R.id.game)
        playerOneName = findViewById(R.id.player1)
        playerTwoName = findViewById(R.id.player2)

        click()
    }

    private fun click() {

        startgamebutton.setOnClickListener() {
            val intent = Intent(this, GamePlay::class.java)
            intent.putExtra("PLAYER_ONE_NAME", playerOneName.text.toString())
            intent.putExtra("PLAYER_TWO_NAME", playerTwoName.text.toString())
            startActivity(intent)
        }
    }
}