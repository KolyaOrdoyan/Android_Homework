package com.example.all_android_projects.sharepage.ui.adapter

import android.app.Dialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.all_android_projects.R
import com.example.all_android_projects.sharepage.data.PostEnumImage

class PagePostImageAdapter : RecyclerView.Adapter<PagePostImageAdapter.ViewHolder>() {

    private val items = PostEnumImage.values()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagePostImageAdapter.ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_page_text_image, parent, false)
        )

    override fun onBindViewHolder(holder: PagePostImageAdapter.ViewHolder, position: Int) =
        holder.bind(items[position])

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var textViewStatus: TextView
        private var textViewLike: TextView
        private var textViewLikeCount: TextView
        private var statusLongTextView: TextView
        private var comment: TextView
        private var commentCount: TextView
        private var imageViewPost: ImageView
        private var count: Int = 0

        init {
            textViewStatus = itemView.findViewById(R.id.Status_TextView)
            imageViewPost = itemView.findViewById(R.id.imageView_post)
            textViewLike = itemView.findViewById(R.id.TextView_like)
            textViewLikeCount = itemView.findViewById(R.id.TextView_Like_Count)
            statusLongTextView = itemView.findViewById(R.id.Status_long_TextView)
            comment = itemView.findViewById(R.id.TextView_comment)
            commentCount = itemView.findViewById(R.id.TextView_comment_Count)

        }

        fun bind(status: PostEnumImage) {
            textViewStatus.text = status.post
            textViewStatus.setOnClickListener {
                textViewStatus.text = ""
                statusLongTextView.text = status.post
            }

            Glide.with(itemView.context)
                .load(status.image)
                .centerCrop()
                .into(imageViewPost)

            imageViewPost.setOnClickListener {
                val builder = Dialog(itemView.context)
                builder.apply {
                    setTitle(status.image)
                    setContentView(R.layout.show_news_image)
                    builder.show()
                }
                Glide.with(itemView.context).load(status.image).centerCrop()
                    .into(builder.findViewById(R.id.news_image))
            }

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