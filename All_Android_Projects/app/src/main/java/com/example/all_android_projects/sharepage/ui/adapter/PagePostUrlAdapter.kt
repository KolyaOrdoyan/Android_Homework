package com.example.all_android_projects.sharepage.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.all_android_projects.R
import com.example.all_android_projects.sharepage.data.PostEnumUrl

class PagePostUrlAdapter : RecyclerView.Adapter<PagePostUrlAdapter.ViewHolder>() {

    private val items = PostEnumUrl.values()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagePostUrlAdapter.ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.post_page_text_image_url, parent, false)
        )

    override fun onBindViewHolder(holder: PagePostUrlAdapter.ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var textViewStatus: TextView
        private var textUrlTextView: TextView
        private var imageViewPost: ImageView
        private var webViewUrl: WebView

        init {
            textViewStatus = itemView.findViewById(R.id.Status_TextView)
            textUrlTextView = itemView.findViewById(R.id.text_url)
            imageViewPost = itemView.findViewById(R.id.imageView_post)
            webViewUrl = itemView.findViewById(R.id.webView_URL)
        }

        fun bind(status: PostEnumUrl) {
            textViewStatus.text = status.post
            Glide.with(itemView.context)
                .load(status.image)
                .centerCrop()
                .into(imageViewPost)
            textUrlTextView.text = status.vebViewUrl
            textUrlTextView.setOnClickListener{
                webViewUrl.loadUrl(status.vebViewUrl)
            }
//            webViewUrl.setOnClickListener {
//
//            }
        }

    }

    override fun getItemCount(): Int = items.size


}