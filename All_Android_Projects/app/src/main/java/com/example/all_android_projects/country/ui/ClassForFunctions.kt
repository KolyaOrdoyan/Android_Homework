package com.example.all_android_projects.country.ui

import android.content.Intent
import android.view.View
import com.example.all_android_projects.country.data.CountryEnum
import com.example.all_android_projects.country.ui.next_pages.CapitalMoreInformationActivity
import com.example.all_android_projects.country.ui.adapter.CountryAdapter
import com.example.all_android_projects.country.ui.next_pages.CountryFlagPageActivity

class ClassForFunctions {

    private val items = CountryEnum.values()

    fun goToPage(itemView: View, position: Int, ){
        val intent = Intent(itemView.context, CapitalMoreInformationActivity::class.java)
        intent.apply {
            putExtra(CountryAdapter.FLAG, items[position].imageUrl)
            putExtra(CountryAdapter.COUNTRY_NAME, items[position].capital)
            putExtra(CountryAdapter.INDEPENDENCE_DAY, items[position].independenceDay)
            putExtra(CountryAdapter.INFORMATION, items[position].moreInformation)
        }
        itemView.context.startActivity(intent)
    }


    
    fun goToImagePage(itemView: View, position: Int) {
        val intent = Intent(itemView.context, CountryFlagPageActivity::class.java)
        intent.apply {
            putExtra(CountryAdapter.FLAG_PAGE, items[position].imageUrl)
        }
        itemView.context.startActivity(intent)
    }
}