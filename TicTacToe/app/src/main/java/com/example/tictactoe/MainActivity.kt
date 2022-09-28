package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private lateinit var startgamebutton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startgamebutton = findViewById(R.id.game)

        click()
    }

    private fun click() {

        startgamebutton.setOnClickListener() {
            val intent = Intent(this, TicTacToe::class.java)
            startActivity(intent)
        }
    }

}