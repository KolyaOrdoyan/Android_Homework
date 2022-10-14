package com.example.all_android_projects.sharepage.ui.show_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.sharepage.ui.adapter.PagePostVideoAdapter

class ShowVideoPageActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_video_page)

        recyclerView = findViewById(R.id.show_video_page_recycleView)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@ShowVideoPageActivity)
            adapter = PagePostVideoAdapter()

        }
    }
}