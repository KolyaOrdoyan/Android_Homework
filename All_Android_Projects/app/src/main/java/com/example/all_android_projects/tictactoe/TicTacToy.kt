package com.example.all_android_projects.tictactoe

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.all_android_projects.R
import kotlinx.android.synthetic.main.activity_tic_tac_toy.*
import kotlinx.android.synthetic.main.activity_tic_tac_toy_register_page.*

class TicTacToy : AppCompatActivity(), View.OnClickListener {
    lateinit var b0: Button
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button
    lateinit var tv: TextView

    lateinit var textView1: TextView
    lateinit var textView3: TextView


    var player1 = 0
    var player2 = 1
    var activePlayer = player1
    lateinit var filledPos: IntArray

    var scorePlayer1 = 0
    var scorePlayer2 = 0

    var gameActive = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toy)

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

        b0.setOnClickListener(this)
        b1.setOnClickListener(this)
        b2.setOnClickListener(this)
        b3.setOnClickListener(this)
        b4.setOnClickListener(this)
        b5.setOnClickListener(this)
        b6.setOnClickListener(this)
        b7.setOnClickListener(this)
        b8.setOnClickListener(this)

        clickEndButton()
    }

    override fun onClick(p0: View?) {

        if (!gameActive)
            return

        var buttonClicked = findViewById<Button>(p0!!.id)
        var clickedTag = Integer.parseInt(buttonClicked.tag.toString())

        if (filledPos[clickedTag] != -1)
            return

        filledPos[clickedTag] = activePlayer

        if (activePlayer == player1) {
            buttonClicked.text = "X"
            activePlayer = player2
            tv.text = "Player 2 turn"
            buttonClicked.setTextColor(Color.RED)
        } else {
            buttonClicked.text = "O"
            activePlayer = player1
            tv.text = "Player 1 turn"
            buttonClicked.setTextColor(Color.YELLOW)

        }
        checkForWin()
    }

    private fun checkForWin() {
        var winPos = arrayOf(
            intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8),
            intArrayOf(0, 3, 6), intArrayOf(1, 4, 7), intArrayOf(2, 5, 8),
            intArrayOf(0, 4, 8), intArrayOf(2, 4, 6)
        )

        for (i in winPos.indices) {
            var val0 = winPos[i][0]
            var val1 = winPos[i][1]
            var val2 = winPos[i][2]


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
            val intent = Intent(this, TicTacToeEndPage::class.java)
            startActivity(intent)

        }
    }

    private fun restartGame() {
        filledPos = intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1)
        activePlayer = player1
        textView1.text = scorePlayer1.toString()
        textView3.text = scorePlayer2.toString()
        gameActive = true
        tv.text = "Player 1 turn"
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