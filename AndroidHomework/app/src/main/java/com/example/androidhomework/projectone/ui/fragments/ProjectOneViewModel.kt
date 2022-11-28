package com.example.androidhomework.projectone.ui.fragments

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidhomework.projectone.data.Guardian
import com.example.androidhomework.projectone.network.RetrofitInsteps
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProjectOneViewModel: ViewModel() {
    val myInfoList = MutableLiveData<Guardian>()

    fun getGuardianData(): LiveData<Guardian> = myInfoList

    fun getMyInfo(){

        val retrofitt = RetrofitInsteps.retrofit.getData("test")

        retrofitt.enqueue(object : Callback<Guardian> {
            override fun onResponse(
                call: Call<Guardian>,
                response: Response<Guardian>
            ) {
                myInfoList.postValue(response.body())
            }

            override fun onFailure(call: Call<Guardian>, t: Throwable) {
                Log.d("StartPageFragment","onFailure: " + t.message)
            }
        })

    }
}