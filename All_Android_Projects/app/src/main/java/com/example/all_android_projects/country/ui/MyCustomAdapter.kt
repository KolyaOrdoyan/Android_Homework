package com.example.all_android_projects.country.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.country.date.CountryEnum

class MyCustomAdapter(val countryItemClickListener: OnCountryItemClickListener): RecyclerView.Adapter<MyCustomAdapter.ViewHolder>() {

    private val items = CountryEnum.values()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_country_information_page, parent,false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private  var capital: TextView
        private  var independenceDay: TextView
        private  var information: TextView

        fun bind(country: CountryEnum) {


            capital.text = country.capital
            independenceDay.text = country.independenceDay
            information.text = country.information
        }

        init {
            capital = itemView.findViewById(R.id.country_name)
            independenceDay = itemView.findViewById(R.id.independenceDay)
            information = itemView.findViewById(R.id.information_text)


            itemView.setOnClickListener {
                val currentItem = items[absoluteAdapterPosition]
                countryItemClickListener.onCountryItemClicked(currentItem)
            }
        }


    }

    interface OnCountryItemClickListener {
        fun onCountryItemClicked(countryEnum: CountryEnum)
    }
}