package com.example.all_android_projects.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.example.all_android_projects.R
import com.example.all_android_projects.store.fragment.StoreFragment

class StoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.store_frame_layout, StoreFragment.newInstance()).commit()
    }
}