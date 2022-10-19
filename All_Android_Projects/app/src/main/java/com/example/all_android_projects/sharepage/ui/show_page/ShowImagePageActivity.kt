package com.example.all_android_projects.sharepage.ui.show_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.sharepage.ui.adapter.AllPageAdapter

class ShowImagePageActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_page)

        recyclerView = findViewById(R.id.show_image_page_recycleView)
        val allAdapter = AllPageAdapter()

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@ShowImagePageActivity)
            allAdapter.viewTypee = 0
            adapter = allAdapter

        }
    }
}