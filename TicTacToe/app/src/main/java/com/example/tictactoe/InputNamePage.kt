package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import com.example.tictactoe.gameplay.GamePlay

class InputNamePage : AppCompatActivity() {

    private lateinit var startgamebutton: AppCompatButton
    private lateinit var playerOneName: EditText
    private lateinit var playerTwoName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_name_page)

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

//    companion object{
//        const val  PLAYER_ONE_NAME = "player_one_name"
//        const val  PLAYER_TWO_NAME = "player_two_name"
//    }

}