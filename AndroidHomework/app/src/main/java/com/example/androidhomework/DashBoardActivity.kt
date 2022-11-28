package com.example.androidhomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.androidhomework.projectone.ui.activity.ProjectOneActivity

class DashBoardActivity : AppCompatActivity() {

    private lateinit var projectOne: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        projectOne = findViewById(R.id.project_one_button)

        projectOne.setOnClickListener {
            val intent = Intent(this, ProjectOneActivity::class.java)
            startActivity(intent)
        }
    }
}