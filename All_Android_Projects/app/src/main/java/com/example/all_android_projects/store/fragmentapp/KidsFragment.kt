package com.example.all_android_projects.store.fragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.all_android_projects.R
import com.example.all_android_projects.store.adapter.TopChartsAdapter
import kotlinx.android.synthetic.main.fragment_kids.*
import kotlinx.android.synthetic.main.fragment_kids.view.*
import kotlinx.android.synthetic.main.fragment_top_charts.view.*


class KidsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_kids, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.recyclerView_kids
        recyclerView.apply {
            layoutManager = context?.let { it1 -> LinearLayoutManager(it1) }
            adapter = TopChartsAdapter()
        }

//        val kidsImage: ImageView = view.findViewById(R.id.kids_image_view)
//        Glide.with(View(context))
//            .load("https://png.pngtree.com/element_our/20190601/ourmid/pngtree-children-jump-up-and-play-png-free-map-image_1336730.jpg")
//            .centerCrop()
//            .into(kidsImage)
    }

    companion object {
        fun newInstance() = TopChartsFragment()
    }
}