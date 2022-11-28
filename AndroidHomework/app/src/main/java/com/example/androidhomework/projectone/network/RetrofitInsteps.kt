package com.example.androidhomework.projectone.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInsteps {
    val retrofit: API = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(API.BASE_URL)
        .build()
        .create(API::class.java)
}