package com.example.all_android_projects.country.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.all_android_projects.R

class CountryFlagPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.country_flag_page)

        val imageView = findViewById<ImageView>(R.id.country_only_flag_page)

        Glide.with(this).load(intent.getStringExtra("flag page")).centerCrop().into(imageView)

    }

}