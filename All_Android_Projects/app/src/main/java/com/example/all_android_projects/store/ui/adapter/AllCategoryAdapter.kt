package com.example.all_android_projects.store.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.store.model.CategoriesNameEnum

class AllCategoryAdapter : RecyclerView.Adapter<AllCategoryAdapter.BaseViewHolder>() {
    var viewTypee: Int = 0
    private lateinit var context: Context
    private lateinit var layoutInflater: LayoutInflater

    private val items = CategoriesNameEnum.values()

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
        layoutInflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewTypee) {
        1 -> CategoryApp(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.category_view, parent, false)
        )
        2 -> CategoryGame(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.category_view, parent, false)
        )
        else -> throw IllegalArgumentException("undefined viewType")
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) =
        holder.bind(items[position])

    override fun getItemCount(): Int = items.size


    abstract inner class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        abstract fun bind(category: CategoriesNameEnum)
    }

    inner class CategoryApp(itemView: View) : BaseViewHolder(itemView) {
        var appsCategoryName: TextView

        override fun bind(category: CategoriesNameEnum) {
            appsCategoryName.text = category.categoryNameApp
        }

        init {
            appsCategoryName = itemView.findViewById(R.id.category_name_text_view)
        }
    }

    inner class CategoryGame(itemView: View) : BaseViewHolder(itemView) {
        var appsCategoryName: TextView

        override fun bind(category: CategoriesNameEnum) {
            appsCategoryName.text = category.categoryNameGame
        }

        init {
            appsCategoryName = itemView.findViewById(R.id.category_name_text_view)
        }
    }
}