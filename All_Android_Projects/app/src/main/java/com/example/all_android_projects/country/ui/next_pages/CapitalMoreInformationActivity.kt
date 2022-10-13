package com.example.all_android_projects.country.ui.next_pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.all_android_projects.R
import com.example.all_android_projects.country.ui.adapter.CountryAdapter.Companion.COUNTRY_NAME
import com.example.all_android_projects.country.ui.adapter.CountryAdapter.Companion.FLAG
import com.example.all_android_projects.country.ui.adapter.CountryAdapter.Companion.INDEPENDENCE_DAY
import com.example.all_android_projects.country.ui.adapter.CountryAdapter.Companion.INFORMATION

class CapitalMoreInformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital_more_information)

        val imageView = findViewById<ImageView>(R.id.country_flag_more_infomation_page)
        val countryName = findViewById<TextView>(R.id.country_name_more_infomation_page)
        val independenceDay = findViewById<TextView>(R.id.independence_day_more_infomation_page)
        val information = findViewById<TextView>(R.id.country_more_information)

        Glide.with(this).load(intent.getStringExtra(FLAG)).centerCrop().into(imageView)
        countryName.text = intent.getStringExtra(COUNTRY_NAME)
        independenceDay.text = intent.getStringExtra(INDEPENDENCE_DAY)
        information.text = intent.getStringExtra(INFORMATION)

    }

}