package com.example.tictactoe.showScore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.tictactoe.R
import com.example.tictactoe.inputnamepage.InputNamePage
import kotlin.system.exitProcess

class ShowScore : AppCompatActivity() {

    private lateinit var quitbutton: AppCompatButton
    private lateinit var playername1: TextView
    private lateinit var playername2: TextView
    private lateinit var showscore1: TextView
    private lateinit var showscore2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_score)

        playername1 = findViewById(R.id.playerName1)
        showscore1 = findViewById(R.id.showScore1)

        playername2 = findViewById(R.id.playerName2)
        showscore2 = findViewById(R.id.showScore2)

        quitbutton = findViewById(R.id.quitbutton)

        setClick()

    }

    private fun setClick() {

        quitbutton.setOnClickListener() {

            moveTaskToBack(true)
            android.os.Process.killProcess(android.os.Process.myPid())
            exitProcess(1)

        }

    }
}