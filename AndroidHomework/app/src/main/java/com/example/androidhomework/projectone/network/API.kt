package com.example.androidhomework.projectone.network

import com.example.androidhomework.projectone.data.Guardian
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface API {

    @GET("search")
    fun getData(@Query("api-key") apiKey: String): Call<Guardian>

    companion object{
        const val BASE_URL = "https://content.guardianapis.com/"
    }
}
