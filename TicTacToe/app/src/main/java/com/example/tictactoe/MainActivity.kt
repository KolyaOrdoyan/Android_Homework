package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.tictactoe.inputnamepage.InputNamePage
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var ButtonPlay: AppCompatButton
    private lateinit var ButtonHelp: AppCompatButton
    private lateinit var ButtonQuit: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonPlay = findViewById(R.id.buttonPlay)
        ButtonHelp = findViewById(R.id.buttonHelp)
        ButtonQuit = findViewById(R.id.buttonQuit)

        setClick()

    }

    private fun setClick() {

        ButtonPlay.setOnClickListener() {

            val intent = Intent(this, InputNamePage::class.java)
            startActivity(intent)

        }

        ButtonHelp.setOnClickListener {
            Toast.makeText(this, "Not Realisation", Toast.LENGTH_SHORT).show()
        }

        ButtonQuit.setOnClickListener() {

            moveTaskToBack(true)
            android.os.Process.killProcess(android.os.Process.myPid())
            exitProcess(1)

        }
    }
}