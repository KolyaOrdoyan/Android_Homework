package com.example.all_android_projects.sharepage.ui.adapter

import android.app.Dialog
import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.all_android_projects.R
import com.example.all_android_projects.sharepage.data.PostAllParameters

class AllShowPageAdapter : RecyclerView.Adapter<AllShowPageAdapter.BaseViewHolder>() {
    var viewTypee: Int = 0
    private lateinit var context: Context
    private lateinit var layoutInflater: LayoutInflater

    private val items = PostAllParameters.values()

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
        layoutInflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewTypee) {
        0 -> ImageViewHolder(layoutInflater.inflate(R.layout.post_page_text_image, parent, false))
        2 -> UrlViewHolder(layoutInflater.inflate(R.layout.post_page_text_image_url, parent, false))
        1 -> VideoViewHolder(layoutInflater.inflate(R.layout.post_page_text_video, parent, false))
        else -> throw IllegalArgumentException("undefined viewType")
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) =
        holder.bind(items[position])

    override fun getItemCount() = items.size

    abstract inner class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        abstract fun bind(status: PostAllParameters)
        abstract fun likeClick(view: View, likeCountView: TextView): TextView
        abstract fun commentClick(view: View, commentCountView: TextView)
    }

    inner class ImageViewHolder(itemView: View) : BaseViewHolder(itemView) {

        private var textViewStatus: TextView
        private var textViewLike: TextView
        private var textViewLikeCount: TextView
        private var comment: TextView
        private var imageViewPost: ImageView
        private var countComment: Int = 0
        private var commentCountTextView: TextView

        init {
            textViewStatus = itemView.findViewById(R.id.Status_TextView)
            imageViewPost = itemView.findViewById(R.id.imageView_post)
            textViewLike = itemView.findViewById(R.id.TextView_like)
            textViewLikeCount = itemView.findViewById(R.id.TextView_Like_Count)
            comment = itemView.findViewById(R.id.TextView_comment)
            commentCountTextView = itemView.findViewById(R.id.TextView_comment_Count)

        }

        override fun likeClick(view: View, likeCountView: TextView): TextView {
            var count = 0
            textViewLike.setOnClickListener {
                count += 1
                textViewLikeCount.text = count.toString()
            }
            return textViewLikeCount
        }

        override fun commentClick(view: View, commentCountView: TextView) {
            comment.setOnClickListener {
                val builder = Dialog(itemView.context)
                builder.apply {
                    countComment += 1
                    commentCountTextView.text = countComment.toString()
                    setContentView(R.layout.add_comment_page)
                    builder.show()
                }
            }
        }

        override fun bind(status: PostAllParameters) {
            textViewStatus.text = status.status.substring(0, 46)
            textViewStatus.setOnClickListener {
                textViewStatus.text = status.status
            }

            Glide.with(itemView.context)
                .load(status.image)
                .centerCrop()
                .into(imageViewPost)

            imageViewPost.setOnClickListener {
                val builder = Dialog(itemView.context)
                builder.apply {
                    setTitle(status.status)
                    setContentView(R.layout.show_news_image)
                    builder.show()
                }

                Glide.with(itemView.context).load(status.image).centerCrop()
                    .into(builder.findViewById(R.id.news_image))
            }
//            textViewLike.setOnClickListener {
//                countLike += 1
//                textViewLikeCount.text = countLike.toString()
//            }
        }
    }

    inner class VideoViewHolder(itemView: View) : BaseViewHolder(itemView) {

        private var textViewStatus: TextView
        private var textViewLike: TextView
        private var textViewLikeCount: TextView
        private var comment: TextView
        private var imageViewPost: ImageView
        private var countComment: Int = 0
        private var commentCountTextView: TextView
        private var videoViewPost: VideoView

        private val mediaController = MediaController(itemView.context)

        init {
            textViewStatus = itemView.findViewById(R.id.Status_TextView)
            imageViewPost = itemView.findViewById(R.id.imageView_post)
            textViewLike = itemView.findViewById(R.id.TextView_like)
            textViewLikeCount = itemView.findViewById(R.id.TextView_Like_Count)
            comment = itemView.findViewById(R.id.TextView_comment)
            commentCountTextView = itemView.findViewById(R.id.TextView_comment_Count)
            videoViewPost = itemView.findViewById(R.id.VideoView_post)

            mediaController.setAnchorView(videoViewPost)
        }


        override fun bind(status: PostAllParameters) {
            textViewStatus.text = status.status
            val onLineUri: Uri = Uri.parse(status.videoUrl)
            videoViewPost.setVideoURI(onLineUri)
        }

        override fun likeClick(view: View, likeCountView: TextView): TextView {
            var count = 0
            textViewLike.setOnClickListener {
                count += 1
                textViewLikeCount.text = count.toString()
            }
            return textViewLikeCount
        }

        override fun commentClick(view: View, commentCountView: TextView) {
            comment.setOnClickListener {
                val builder = Dialog(itemView.context)
                builder.apply {
                    countComment += 1
                    commentCountTextView.text = countComment.toString()
                    setContentView(R.layout.add_comment_page)
                    builder.show()
                }
            }
        }

    }

    inner class UrlViewHolder(itemView: View) : BaseViewHolder(itemView) {

        private var textViewStatus: TextView
        private var textViewLike: TextView
        private var textViewLikeCount: TextView
        private var comment: TextView
        private var imageViewPost: ImageView
        private var countComment: Int = 0
        private var commentCountTextView: TextView
        private var webViewUrl: WebView
        private var textUrlTextView: TextView

        init {
            textViewStatus = itemView.findViewById(R.id.Status_TextView)
            imageViewPost = itemView.findViewById(R.id.imageView_post)
            textViewLike = itemView.findViewById(R.id.TextView_like)
            textViewLikeCount = itemView.findViewById(R.id.TextView_Like_Count)
            comment = itemView.findViewById(R.id.TextView_comment)
            textUrlTextView = itemView.findViewById(R.id.text_url)
            commentCountTextView = itemView.findViewById(R.id.TextView_comment_Count)
            webViewUrl = itemView.findViewById(R.id.webView_URL)

        }

        override fun bind(status: PostAllParameters) {
            textViewStatus.text = status.status.substring(0, 46)
            textViewStatus.setOnClickListener {
                textViewStatus.text = status.status
            }

            Glide.with(itemView.context)
                .load(status.image)
                .centerCrop()
                .into(imageViewPost)

            textUrlTextView.text = status.vebViewUrl

            textUrlTextView.setOnClickListener {
                webViewUrl.loadUrl(status.vebViewUrl)
            }

//            likeClick(textViewLike, textViewLikeCount)

//            textViewLike.setOnClickListener {
//                count += 1
//                textViewLikeCount.text = count.toString()
//            }

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
        }

        override fun likeClick(view: View, likeCountView: TextView): TextView {
            var count = 0
            textViewLike.setOnClickListener {
                count += 1
                textViewLikeCount.text = count.toString()
            }
            return textViewLike
        }

        override fun commentClick(view: View, commentCountView: TextView) {
            comment.setOnClickListener {
                val builder = Dialog(itemView.context)
                builder.apply {
                    countComment += 1
                    commentCountTextView.text = countComment.toString()
                    setContentView(R.layout.add_comment_page)
                    builder.show()
                }
            }
        }
    }
}