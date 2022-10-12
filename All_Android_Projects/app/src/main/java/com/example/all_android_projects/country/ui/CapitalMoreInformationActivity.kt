package com.example.all_android_projects.country.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.all_android_projects.R

class CapitalMoreInformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital_more_information)

        val imageView = findViewById<ImageView>(R.id.country_flag_more_infomation_page)
        val countryName = findViewById<TextView>(R.id.country_name_more_infomation_page)
        val independenceDay = findViewById<TextView>(R.id.independence_day_more_infomation_page)
        val information = findViewById<TextView>(R.id.country_more_information)

        Glide.with(this).load(intent.getStringExtra("flag")).centerCrop().into(imageView)
        countryName.text = intent.getStringExtra("country name")
        independenceDay.text = intent.getStringExtra("independence day")
        information.text = intent.getStringExtra("information")

    }

}