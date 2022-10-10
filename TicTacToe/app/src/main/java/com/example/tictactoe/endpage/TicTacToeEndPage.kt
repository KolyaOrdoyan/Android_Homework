package com.example.tictactoe.endpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.tictactoe.inputnamepage.InputNamePage
import com.example.tictactoe.R
import kotlin.system.exitProcess

class TicTacToeEndPage : AppCompatActivity() {

    private lateinit var buttonNewPlayers: AppCompatButton
    private lateinit var buttonBackToMainManu: AppCompatButton
    private lateinit var buttonShowScore: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe_end_page)

        buttonNewPlayers = findViewById(R.id.newPlayers)
      //  buttonShowScore = findViewById(R.id.showScore)
        buttonBackToMainManu = findViewById(R.id.backToMainManu)

        setClick()
    }

    private fun setClick() {

        buttonNewPlayers.setOnClickListener() {

            val intent = Intent(this, InputNamePage::class.java)
            startActivity(intent)

        }

//        buttonShowScore.setOnClickListener {
//            Toast.makeText(this, "no realisation", Toast.LENGTH_SHORT).show()
//        }

        buttonBackToMainManu.setOnClickListener() {

            moveTaskToBack(true)
            android.os.Process.killProcess(android.os.Process.myPid())
            exitProcess(1)

        }

    }
}