package com.example.all_android_projects.country

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.country.date.CountryEnum
import com.example.all_android_projects.country.ui.MyCustomAdapter

class Capital : AppCompatActivity(), MyCustomAdapter.OnCountryItemClickListener {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@Capital)
            adapter = MyCustomAdapter(this@Capital)

        }
    }

    fun <T : RecyclerView.ViewHolder> T.listen(event: (position: Int, type: Int) -> Unit): T {
        itemView.setOnClickListener {
            event.invoke(adapterPosition, itemViewType)
        }
        return this
    }

    override fun onCountryItemClicked(countryEnum: CountryEnum) {
        // TODO:   start activity and send country Enum with bundles
    }

}