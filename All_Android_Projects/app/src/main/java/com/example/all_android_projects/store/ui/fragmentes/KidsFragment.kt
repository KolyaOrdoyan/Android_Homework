package com.example.all_android_projects.store.ui.fragmentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.store.StoreActivity
import com.example.all_android_projects.store.ui.adapter.AllFragmentAdapter
import kotlinx.android.synthetic.main.fragment_kids.view.*


class KidsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_kids, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerViewForYou = view.recyclerView_new_apps_for_kids
        val recyclerViewOfflineGames = view.recyclerView_offline_apps
        val allAdapter = AllFragmentAdapter()

        horizontalRecyclerView(recyclerViewForYou, allAdapter)
        horizontalRecyclerView(recyclerViewOfflineGames, allAdapter)

    }

    private fun horizontalRecyclerView(
        recyclerView: RecyclerView, allAdapter: AllFragmentAdapter
    ) {
        when (StoreActivity.T) {
            1 -> {
                recyclerView.apply {
                    layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
                    allAdapter.viewTypee = 5
                    adapter = allAdapter
                }
            }
            2 -> {
                recyclerView.apply {
                    layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
                    allAdapter.viewTypee = 4
                    adapter = allAdapter
                }
            }
        }
    }

    companion object {
        fun newInstance() = TopChartsAppFragment()
    }
}