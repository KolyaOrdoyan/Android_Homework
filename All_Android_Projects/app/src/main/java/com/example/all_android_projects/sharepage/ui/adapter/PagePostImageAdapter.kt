package com.example.all_android_projects.sharepage.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.all_android_projects.R
import com.example.all_android_projects.sharepage.data.PostEnumImage

class PagePostImageAdapter : RecyclerView.Adapter<PagePostImageAdapter.ViewHolder>() {

    private val items = PostEnumImage.values()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagePostImageAdapter.ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.post_page_text_image, parent, false)
        )


    override fun onBindViewHolder(holder: PagePostImageAdapter.ViewHolder, position: Int) =
        holder.bind(items[position])


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var textViewStatus: TextView
        private var imageViewPost: ImageView



        init {
            textViewStatus = itemView.findViewById(R.id.Status_TextView)
            imageViewPost = itemView.findViewById(R.id.imageView_post)

        }

        fun bind(status: PostEnumImage) {
            textViewStatus.text = status.post
            Glide.with(itemView.context)
                .load(status.image)
                .centerCrop()
                .into(imageViewPost)
        }

    }

    override fun getItemCount(): Int = items.size

}