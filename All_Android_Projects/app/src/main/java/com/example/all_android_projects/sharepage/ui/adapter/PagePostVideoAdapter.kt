package com.example.all_android_projects.sharepage.ui.adapter

import android.app.Dialog
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

class PagePostVideoAdapter : RecyclerView.Adapter<PagePostVideoAdapter.ViewHolder>() {

    private val items = PostEnumVideo.values()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagePostVideoAdapter.ViewHolder = ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.post_page_text_video, parent, false)
        )


    override fun onBindViewHolder(holder: PagePostVideoAdapter.ViewHolder, position: Int) =
        holder.bind(items[position])


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var textViewStatus: TextView
        private var videoViewPost: VideoView
        private var textViewLike: TextView
        private var textViewLikeCount: TextView
        private var comment: TextView
        private var commentCount: TextView
        private var count: Int = 0

        private val mediaController = MediaController(itemView.context)

        init {
            textViewStatus = itemView.findViewById(R.id.Status_TextView)
            videoViewPost = itemView.findViewById(R.id.VideoView_post)
            textViewLike = itemView.findViewById(R.id.TextView_like)
            textViewLikeCount = itemView.findViewById(R.id.TextView_Like_Count)
            comment = itemView.findViewById(R.id.TextView_comment)
            commentCount = itemView.findViewById(R.id.TextView_comment_Count)

            mediaController.setAnchorView(videoViewPost)
        }

        fun bind(status: PostEnumVideo) {
            textViewStatus.text = status.post
            val onLineUri: Uri = Uri.parse(status.videoUrl)
            videoViewPost.setVideoURI(onLineUri)

            textViewLike.setOnClickListener {
                count += 1
                textViewLikeCount.text = count.toString()
            }

            comment.setOnClickListener {
                val builder = Dialog(itemView.context)
                builder.apply {
                    count += 1
                    commentCount.text = count.toString()
                    setContentView(R.layout.add_comment_page)
                    builder.show()
                }
            }
        }
    }

    override fun getItemCount(): Int = items.size

}