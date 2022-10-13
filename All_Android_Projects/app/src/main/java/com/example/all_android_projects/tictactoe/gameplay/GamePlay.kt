package com.example.all_android_projects.tictactoe.gameplay

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.all_android_projects.R
import com.example.all_android_projects.tictactoe.endpage.TicTacToeEndPageActivity
import kotlinx.android.synthetic.main.activity_game_play.*

class GamePlay : AppCompatActivity(), View.OnClickListener {
    private lateinit var b0: Button
    private lateinit var b1: Button
    private lateinit var b2: Button
    private lateinit var b3: Button
    private lateinit var b4: Button
    private lateinit var b5: Button
    private lateinit var b6: Button
    private lateinit var b7: Button
    private lateinit var b8: Button
    private lateinit var b9: Button
    private lateinit var tv: TextView


    private lateinit var textView1: TextView
    private lateinit var playeronename: TextView
    private lateinit var playertwoname: TextView
    private lateinit var textView3: TextView


    private var player1 = 0
    private var player2 = 1
    private var activePlayer = player1
    private lateinit var filledPos: IntArray

    private var scorePlayer1 = 0
    private var scorePlayer2 = 0

    private var gameActive = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_play)

//        intent?.let {
//            val playerOneName = it.getStringExtra("PLAYER_ONE_NAME") ?: "Player 1"
//            val playerTwoName = it.getStringExtra("PLAYER_TWO_NAME") ?: "Player 2"
//        }

        val playerOneName = intent.extras?.getString("PLAYER_ONE_NAME")
        val playerTwoName = intent.extras?.getString("PLAYER_TWO_NAME")

        filledPos = intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1)

        tv = findViewById(R.id.scorePanelPlayer2)
        b0 = findViewById(R.id.appCompatButton1)
        b1 = findViewById(R.id.appCompatButton2)
        b2 = findViewById(R.id.appCompatButton3)
        b3 = findViewById(R.id.appCompatButton4)
        b4 = findViewById(R.id.appCompatButton5)
        b5 = findViewById(R.id.appCompatButton6)
        b6 = findViewById(R.id.appCompatButton7)
        b7 = findViewById(R.id.appCompatButton8)
        b8 = findViewById(R.id.appCompatButton9)
        b9 = findViewById(R.id.appCompatButton10)

        textView1 = findViewById(R.id.ScorePlayer1)
        textView3 = findViewById(R.id.ScorePlayer2)
        playeronename = findViewById(R.id.player1Name)
        playertwoname = findViewById(R.id.player2Name)

        b0.setOnClickListener(this)
        b1.setOnClickListener(this)
        b2.setOnClickListener(this)
        b3.setOnClickListener(this)
        b4.setOnClickListener(this)
        b5.setOnClickListener(this)
        b6.setOnClickListener(this)
        b7.setOnClickListener(this)
        b8.setOnClickListener(this)


        playeronename.text = playerOneName
        playertwoname.text = playerTwoName

        clickEndButton()
    }

    override fun onClick(p0: View?) {

        if (!gameActive)
            return

        val buttonClicked = findViewById<Button>(p0!!.id)
        val clickedTag = Integer.parseInt(buttonClicked.tag.toString())

        if (filledPos[clickedTag] != -1)
            return

        filledPos[clickedTag] = activePlayer

        if (activePlayer == player1) {
            buttonClicked.text = "X"
            activePlayer = player2
            tv.text = "player 2 turn"
            buttonClicked.setTextColor(Color.RED)
        } else {
            buttonClicked.text = "O"
            activePlayer = player1
            tv.text = "player 1 turn"
            buttonClicked.setTextColor(Color.YELLOW)

        }
        checkForWin()
    }

    private fun checkForWin() {
        val winPos = arrayOf(
            intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8),
            intArrayOf(0, 3, 6), intArrayOf(1, 4, 7), intArrayOf(2, 5, 8),
            intArrayOf(0, 4, 8), intArrayOf(2, 4, 6)
        )

        for (i in winPos.indices) {
            val val0 = winPos[i][0]
            val val1 = winPos[i][1]
            val val2 = winPos[i][2]


            if (filledPos[val0] == filledPos[val1] && filledPos[val1] == filledPos[val2]) {

                if (filledPos[val0] != -1) {
                    gameActive = false

                    if (filledPos[val0] == player1) {
                        scorePlayer1 += 1
                        showMessage("Player 1 win")
                    } else {
                        scorePlayer2 += 1
                        showMessage("Player 2 win")
                    }
                }
            }
        }
    }

    private fun showMessage(s: String) {
        AlertDialog.Builder(this)
            .setMessage(s)
            .setTitle("Tic Tac Toe")
            .setPositiveButton("Restart game") { _, _ -> restartGame() }.show()
    }

    private fun clickEndButton() {
        appCompatButton10.setOnClickListener {
            val intent = Intent(this, TicTacToeEndPageActivity::class.java)
            startActivity(intent)

        }
    }

    private fun restartGame() {
        filledPos = intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1)
        activePlayer = player1
        textView1.text = scorePlayer1.toString()
        textView3.text = scorePlayer2.toString()
        gameActive = true
        tv.text = "player 1 turn"
        b0.text = ""
        b1.text = ""
        b2.text = ""
        b3.text = ""
        b4.text = ""
        b5.text = ""
        b6.text = ""
        b7.text = ""
        b8.text = ""
    }

}