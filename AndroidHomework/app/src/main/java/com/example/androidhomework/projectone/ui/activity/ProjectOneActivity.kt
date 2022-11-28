package com.example.androidhomework.projectone.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidhomework.R
import com.example.androidhomework.projectone.ui.fragments.StartPageFragment

class ProjectOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_one)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout_project_one,StartPageFragment.newInstance()).commit()
    }
}