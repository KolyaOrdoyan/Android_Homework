package com.example.all_android_projects.store.fragmentgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.all_android_projects.R
import com.example.all_android_projects.store.adapter.TopChartsGameAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.fragment_top_charts.view.*
import kotlinx.android.synthetic.main.fragment_top_charts.view.top_charts_top_free_button
import kotlinx.android.synthetic.main.fragment_top_charts_game.view.*

class TopChartGameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_top_charts_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.recyclerView_top_charts_game
        recyclerView.apply {
            layoutManager = context?.let { it1 -> LinearLayoutManager(it1) }
            adapter = TopChartsGameAdapter()
        }

        val topFreeButton = view.top_charts_top_free_button
        topFreeButton.setOnClickListener {
            val vi: View = layoutInflater.inflate(R.layout.buttom_sheet, null)
            val dialog = context?.let { it1 -> BottomSheetDialog(it1) }
            dialog?.setContentView(vi)
            dialog?.show()
        }

//        val topFree: TextView = view.findViewById(R.id.button_sheet_top_free)
//        topFree.setOnClickListener {
//            topFree.text = "you pressed the button"
//        }
    }

    companion object {
        fun newInstance() = TopChartGameFragment()
    }
}