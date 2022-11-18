package com.example.all_android_projects.store.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.store.model.AppsInformationEnum

class AllFragmentAdapter : RecyclerView.Adapter<AllFragmentAdapter.BaseViewHolder>() {

    var viewTypee: Int = 0
    private lateinit var context: Context
    private lateinit var layoutInflater: LayoutInflater

    private val items = AppsInformationEnum.values()

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
        layoutInflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewTypee) {
        1 -> TopChartsApp(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.top_charts_recycler_view, parent, false)
        )
        2 -> TopChartsGame(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.top_charts_recycler_view, parent, false)
        )
        3 -> PremiumGame(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.kids_page, parent, false)
        )
        4 -> KidsApp(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.kids_page, parent, false)
        )
        5 -> KidsGame(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.kids_page, parent, false)
        )
        6 -> CategoryApp(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.category_view, parent, false)
        )
        7 -> CategoryGame(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.category_view, parent, false)
        )
        else -> throw IllegalArgumentException("undefined viewType")
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) =
        holder.bind(items[position])

    override fun getItemCount(): Int = items.size


    abstract inner class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        abstract fun bind(apps: AppsInformationEnum)
    }

    inner class TopChartsApp(itemView: View) : BaseViewHolder(itemView) {
        var appName: TextView
        var category: TextView
        var rating: TextView
        var position: TextView

        override fun bind(apps: AppsInformationEnum) {
            position.text = apps.appPosition
            appName.text = apps.appName
            category.text = apps.appCategory
            rating.text = apps.appRating
        }

        init {
            appName = itemView.findViewById(R.id.app_name_text_view)
            category = itemView.findViewById(R.id.category_text_view)
            rating = itemView.findViewById(R.id.rating_text_view)
            position = itemView.findViewById(R.id.app_position_text_view)
        }
    }

    inner class TopChartsGame(itemView: View) : BaseViewHolder(itemView) {
        private var appName: TextView
        private var categories: TextView
        private var rating: TextView
        private var position: TextView

        override fun bind(apps: AppsInformationEnum) {
            position.text = apps.appPosition
            appName.text = apps.gameName
            categories.text = apps.gameCategory
            rating.text = apps.gameRating
        }

        init {
            appName = itemView.findViewById(R.id.app_name_text_view)
            categories = itemView.findViewById(R.id.category_text_view)
            rating = itemView.findViewById(R.id.rating_text_view)
            position = itemView.findViewById(R.id.app_position_text_view)
        }
    }

    inner class PremiumGame(itemView: View) : BaseViewHolder(itemView) {
        private var appName: TextView
        private var rating: TextView

        override fun bind(apps: AppsInformationEnum) {
            appName.text = apps.premiumGameName
            rating.text = apps.premiumGameRating
        }

        init {
            appName = itemView.findViewById(R.id.app_name_text_view)
            rating = itemView.findViewById(R.id.app_rating_text_view)
        }
    }

    inner class KidsApp(itemView: View) : BaseViewHolder(itemView) {
        private var appName: TextView
        private var rating: TextView

        override fun bind(apps: AppsInformationEnum) {
            appName.text = apps.appName
            rating.text = apps.appRating
        }

        init {
            appName = itemView.findViewById(R.id.app_name_text_view)
            rating = itemView.findViewById(R.id.app_rating_text_view)
        }
    }

    inner class KidsGame(itemView: View) : AllFragmentAdapter.BaseViewHolder(itemView) {
        private var appName: TextView
        private var rating: TextView
        override fun bind(apps: AppsInformationEnum) {
            appName.text = apps.gameName
            rating.text = apps.gameRating
        }

        init {
            appName = itemView.findViewById(R.id.app_name_text_view)
            rating = itemView.findViewById(R.id.app_rating_text_view)
        }
    }

    inner class CategoryApp(itemView: View) : AllFragmentAdapter.BaseViewHolder(itemView) {
        var appsCategoryName: TextView

        override fun bind(apps: AppsInformationEnum) {
            appsCategoryName.text = apps.categoryNameApp
        }

        init {
            appsCategoryName = itemView.findViewById(R.id.category_name_text_view)
        }
    }

    inner class CategoryGame(itemView: View) : AllFragmentAdapter.BaseViewHolder(itemView) {
        var appsCategoryName: TextView

        override fun bind(apps: AppsInformationEnum) {
            appsCategoryName.text = apps.categoryNameGame
        }

        init {
            appsCategoryName = itemView.findViewById(R.id.category_name_text_view)
        }
    }

}


