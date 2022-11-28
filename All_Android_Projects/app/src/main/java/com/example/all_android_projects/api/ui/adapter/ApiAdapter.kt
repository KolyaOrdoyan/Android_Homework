package com.example.all_android_projects.api.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.api.model.ApiData
import com.example.all_android_projects.api.model.ApiDataItem
import kotlinx.android.synthetic.main.api_page.view.*

class ApiAdapter : RecyclerView.Adapter<ApiAdapter.PostViewHolder>() {

    var listApi = emptyList<ApiDataItem>()

    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.api_page, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.itemView.idTextView.text = listApi[position].ccy
        holder.itemView.titleTextView.text = listApi[position].buy
        holder.itemView.bodyTextView.text = listApi[position].sale
    }

    override fun getItemCount() = listApi.size


    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: ApiData) {
        listApi = list
        notifyDataSetChanged()
    }
}