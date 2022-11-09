package com.example.all_android_projects.store.ui.fragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.all_android_projects.R
import com.example.all_android_projects.store.ui.adapter.AllCategoryAdapter
import kotlinx.android.synthetic.main.fragment_categoris.view.*

class CategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categoris, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.category_recycler_view
        val allAdapter = AllCategoryAdapter()

        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            allAdapter.viewTypee = 1
            adapter = allAdapter
        }
    }

    companion object {
        fun newInstance() = CategoryFragment()
    }
}