package com.example.all_android_projects.store.ui.fragmentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.all_android_projects.R
import com.example.all_android_projects.store.ui.adapter.TopChartsViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_game.view.*

class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val viewPager: ViewPager = view.game_view_pager
        val table: TabLayout = view.game_fragment_table

        val adapter = TopChartsViewPagerAdapter(parentFragmentManager)
        adapter.addFragment(TopChartsAppFragment(), "top charts")
        adapter.addFragment(KidsFragment(), "Kids")
        adapter.addFragment(PremiumGameFragment(), "Premium")
        adapter.addFragment(CategoryFragment(),"Category")



        viewPager.adapter = adapter
        table.setupWithViewPager(viewPager)
    }

    companion object {
        fun newInstance() = GameFragment()
    }
}