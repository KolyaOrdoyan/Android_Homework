package com.example.all_android_projects.store.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.store.data.AppsInformationEnum

class TopChartsGameAdapter  : RecyclerView.Adapter<TopChartsGameAdapter.ViewHolder>() {
    private val items = AppsInformationEnum.values()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.top_charts_recycler_view, parent, false)
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var appName: TextView
        var category: TextView
        var rating: TextView
        var position: TextView

        fun bind(apps: AppsInformationEnum) {
            position.text = apps.appPosition
            appName.text = apps.gameName
            category.text = apps.gameCategory
            rating.text = apps.gameRating
        }

        init {
            appName = itemView.findViewById(R.id.app_name_text_view)
            category = itemView.findViewById(R.id.category_text_view)
            rating = itemView.findViewById(R.id.rating_text_view)
            position = itemView.findViewById(R.id.app_position_text_view)
        }
    }

}