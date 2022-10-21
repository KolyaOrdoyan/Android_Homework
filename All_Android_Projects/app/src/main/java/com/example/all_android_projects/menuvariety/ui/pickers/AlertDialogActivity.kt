package com.example.all_android_projects.menuvariety.ui.pickers

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.all_android_projects.R

class AlertDialogActivity : AppCompatActivity() {

    private lateinit var answerTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        answerTextView = findViewById(R.id.alertDialog_answer_textView)

        myAlertDialog()
    }

    private fun myAlertDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Question")
        val message = builder.setMessage("This is true ?")
        builder.setNegativeButton("no", DialogInterface.OnClickListener { dialog, i ->
            answerTextView.text = "no"
        })
        builder.setPositiveButton("yes", DialogInterface.OnClickListener { dialogInterface, i ->
            answerTextView.text = "yes"
        })
        builder.show()
    }
}