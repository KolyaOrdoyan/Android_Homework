package com.example.all_android_projects.api.ui.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.all_android_projects.api.model.ApiData
import com.example.all_android_projects.api.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class ApiViewModel : ViewModel() {
    var repo = Repository()
    val myInfoList: MutableLiveData<Response<ApiData>> = MutableLiveData()

    fun getMyInfo() {
        viewModelScope.launch {
            myInfoList.value = repo.getInfo()
        }
    }
}