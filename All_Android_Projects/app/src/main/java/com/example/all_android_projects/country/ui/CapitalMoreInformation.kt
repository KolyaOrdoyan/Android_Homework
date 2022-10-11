package com.example.all_android_projects.country.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.all_android_projects.R
import com.example.all_android_projects.country.date.CountryEnum

class CapitalMoreInformation : AppCompatActivity() {

    private val items = CountryEnum.values()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital_more_information)
    }
}