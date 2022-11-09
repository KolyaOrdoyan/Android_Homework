package com.example.all_android_projects.store.ui.fragmentgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.store.ui.adapter.AllTopChartsAdapter
import kotlinx.android.synthetic.main.fragment_kids_game.view.*

class KidsGameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_kids_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerViewForYou = view.recyclerView_for_you
        val recyclerViewOfflineGames = view.recyclerView_offline_games_kids
        val allAdapter = AllTopChartsAdapter()

        horizontalRecyclerView(recyclerViewForYou, allAdapter)
        horizontalRecyclerView(recyclerViewOfflineGames, allAdapter)

    }

    private fun horizontalRecyclerView(
        recyclerView: RecyclerView,
        allAdapter: AllTopChartsAdapter
    ) {
        recyclerView.apply {
            layoutManager =
                LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
            allAdapter.viewTypee = 3
            adapter = allAdapter
        }
    }

    companion object {
        fun newInstance() = KidsGameFragment()
    }
}