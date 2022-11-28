package com.example.androidhomework.projectone.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidhomework.R

class StartPageAdapter :
    RecyclerView.Adapter<StartPageAdapter.BaseViewHolder>() {

     var apiList = mutableListOf<com.example.androidhomework.projectone.data.Result>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_project_one_start_page, parent, false)
        return BaseViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.line_one_text_view_start_page).text = apiList[position].type
        holder.itemView.findViewById<TextView>(R.id.line_two_text_view_start_page).text = apiList[position].webPublicationDate
        holder.itemView.findViewById<TextView>(R.id.line_three_text_view_start_page).text = apiList[position].pillarId
    }

    override fun getItemCount() = apiList.size

    class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view)

}