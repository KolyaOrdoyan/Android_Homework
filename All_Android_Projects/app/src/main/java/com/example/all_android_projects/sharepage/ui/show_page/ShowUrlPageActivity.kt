package com.example.all_android_projects.sharepage.ui.show_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.sharepage.ui.adapter.AllPageAdapter

class ShowUrlPageActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_page)

        val allAdapter = AllPageAdapter()

        recyclerView = findViewById(R.id.show_image_page_recycleView)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@ShowUrlPageActivity)
            allAdapter.viewTypee = 2
            adapter = allAdapter

        }
    }
}