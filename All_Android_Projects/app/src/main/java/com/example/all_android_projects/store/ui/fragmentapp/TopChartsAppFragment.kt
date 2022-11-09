package com.example.all_android_projects.store.ui.fragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.all_android_projects.R
import com.example.all_android_projects.store.ui.adapter.AllTopChartsAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.buttom_sheet.view.*
import kotlinx.android.synthetic.main.fragment_top_charts.view.*

class TopChartsAppFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_top_charts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.recyclerView_top_charts
        val allAdapter = AllTopChartsAdapter()

        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            allAdapter.viewTypee = 1
            adapter = allAdapter
        }

        val topFreeButton = view.top_charts_top_free_button
        topFreeButton.setOnClickListener {
            val buttonSheet: View = layoutInflater.inflate(R.layout.buttom_sheet, null)
            val dialog = BottomSheetDialog(requireContext())
            dialog.setContentView(buttonSheet)
            dialog.show()
            val topFree = buttonSheet.button_sheet_top_free
            topFree.setOnClickListener {
                alertDialog("This is top free apps")
            }
            val topGrossing = buttonSheet.button_sheet_top_grossing
            topGrossing.setOnClickListener {
                alertDialog("This is top grossing apps")
            }
            val topPaid = buttonSheet.button_sheet_top_paid
            topPaid.setOnClickListener {
                alertDialog("This is top paid apps")
            }
        }

        val categoryButton = view.top_charts_category_button
        categoryButton.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.store_frame_layout, CategoryFragment.newInstance()).commit()
        }

    }

    companion object { fun newInstance() = TopChartsAppFragment() }

    private fun alertDialog(message: String) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Question")
        builder.setMessage(message)
        builder.show()
    }
}