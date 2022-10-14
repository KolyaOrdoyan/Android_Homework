package com.example.all_android_projects.sharepage.ui.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.sharepage.data.PostEnumVideo

class PagePostVideoAdapter: RecyclerView.Adapter<PagePostVideoAdapter.ViewHolder>() {

    private val items = PostEnumVideo.values()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagePostVideoAdapter.ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.post_page_text_video, parent, false)
        )


    override fun onBindViewHolder(holder: PagePostVideoAdapter.ViewHolder, position: Int) = holder.bind(items[position])


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var textViewStatus: TextView
        private var videoViewPost: VideoView

        private val mediaController = MediaController(itemView.context)


        init {
            textViewStatus = itemView.findViewById(R.id.Status_TextView)
            videoViewPost = itemView.findViewById(R.id.VideoView_post)

            mediaController.setAnchorView(videoViewPost)
        }

        fun bind(status: PostEnumVideo) {
            textViewStatus.text = status.post
            val onLineUri : Uri = Uri.parse(status.videoUrl)
            videoViewPost.setVideoURI(onLineUri)

        }

    }

    override fun getItemCount(): Int = items.size

}