package com.example.all_android_projects.api.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_android_projects.R
import com.example.all_android_projects.api.ui.fragment.ApiFragment

class ApiMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.api_frame_layout, ApiFragment.newInstance()).commit()

    }

}

