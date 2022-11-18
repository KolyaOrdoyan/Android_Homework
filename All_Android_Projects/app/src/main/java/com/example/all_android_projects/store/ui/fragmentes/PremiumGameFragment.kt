package com.example.all_android_projects.store.ui.fragmentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.store.ui.adapter.AllFragmentAdapter
import kotlinx.android.synthetic.main.fragment_premium_game.view.*

class PremiumGameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_premium_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerViewForYou = view.recyclerView_premium_games_for_you
        val recyclerViewOfflineGames = view.recyclerView_premium_offline_games
        val recyclerViewCasualGames = view.recyclerView_premium_casual_games
        val allAdapter = AllFragmentAdapter()

        horizontalRecyclerView(recyclerViewForYou, allAdapter)
        horizontalRecyclerView(recyclerViewOfflineGames, allAdapter)
        horizontalRecyclerView(recyclerViewCasualGames,allAdapter)

    }

    private fun horizontalRecyclerView(
        recyclerView: RecyclerView,
        customAdapter: AllFragmentAdapter
    ) {
        recyclerView.apply {
            layoutManager =
                LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
            customAdapter.viewTypee = 3
            adapter = customAdapter
        }
    }

    companion object {
        fun newInstance() = PremiumGameFragment()
    }
}