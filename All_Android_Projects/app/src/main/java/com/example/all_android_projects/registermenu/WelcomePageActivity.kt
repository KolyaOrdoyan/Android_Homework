package com.example.all_android_projects.registermenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_android_projects.R
import com.example.all_android_projects.registermenu.fragment.FragmentWelcomePage

class WelcomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_welcome_page, FragmentWelcomePage.newInstance()).commit()

    }
}