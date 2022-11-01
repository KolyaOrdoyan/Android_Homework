package com.example.all_android_projects.registermenu.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel() {

    val dataFromLogIn: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val dataFromSignUp: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

}