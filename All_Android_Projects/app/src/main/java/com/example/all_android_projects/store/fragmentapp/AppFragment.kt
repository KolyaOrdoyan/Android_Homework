package com.example.all_android_projects.store.fragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.all_android_projects.R
import com.example.all_android_projects.store.adapter.TopChartsViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_app.view.*

class AppFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_app, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val viewPager: ViewPager = view.app_view_pager
        val table: TabLayout = view.app_fragment_table

        val adapter = TopChartsViewPagerAdapter(parentFragmentManager)
        adapter.addFragment(TopChartsFragment(), "top charts")
        adapter.addFragment(KidsFragment(), "Kids")
        adapter.addFragment(CategoriesFragment(), "Categories")

        viewPager.adapter = adapter
        table.setupWithViewPager(viewPager)
    }

    companion object {
        fun newInstance() = AppFragment()
    }
}