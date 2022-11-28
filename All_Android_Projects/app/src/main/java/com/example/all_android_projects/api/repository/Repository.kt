package com.example.all_android_projects.api.repository

import com.example.all_android_projects.api.model.ApiData
import com.example.all_android_projects.api.network.RetrofitInsteps
import retrofit2.Response

class Repository {

    suspend fun getInfo(): Response<ApiData> {
        return RetrofitInsteps.api.getData()
    }
}