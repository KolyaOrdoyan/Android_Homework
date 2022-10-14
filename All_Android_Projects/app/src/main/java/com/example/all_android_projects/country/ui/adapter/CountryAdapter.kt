package com.example.all_android_projects.country.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.all_android_projects.R
import com.example.all_android_projects.country.ui.ClassForFunctions
import com.example.all_android_projects.country.data.CountryEnum

class CountryAdapter() : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    private val items = CountryEnum.values()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_country_information_page, parent, false)
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var countryFlagImage: ImageView
        var capital: TextView
        var independenceDay: TextView
        var information: TextView

        fun bind(country: CountryEnum) {

            Glide.with(itemView.context)
                .load(country.imageUrl)
                .centerCrop()
                .into(countryFlagImage)
            capital.text = country.capital
            independenceDay.text = country.independenceDay
            information.text = country.information
        }

        init {
            countryFlagImage = itemView.findViewById(R.id.country_flag_image)
            capital = itemView.findViewById(R.id.country_name)
            independenceDay = itemView.findViewById(R.id.independenceDay)
            information = itemView.findViewById(R.id.information_text)


            countryFlagImage.setOnClickListener {
                var continuePage = ClassForFunctions()
                continuePage.goToImagePage(itemView, position)
            }

            itemView.setOnLongClickListener(View.OnLongClickListener() {
                var continuePage = ClassForFunctions()
                continuePage.goToPage(itemView, position)
                return@OnLongClickListener true
            })
        }
    }

    companion object {
        const val COUNTRY_NAME = "country name"
        const val FLAG = "flag"
        const val INDEPENDENCE_DAY = "independence day"
        const val INFORMATION = "information"
        const val FLAG_PAGE = "flag page"
    }

}