package com.example.all_android_projects.api.network

import com.example.all_android_projects.api.model.ApiData
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
   suspend fun getData(): Response<ApiData>

}