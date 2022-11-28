package com.example.androidhomework.projectone.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidhomework.R
import com.example.androidhomework.projectone.ui.adapter.StartPageAdapter

class StartPageFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var allAdapter: StartPageAdapter

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val viewModel = ViewModelProvider(this)[ProjectOneViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_start_page_project_one, container, false)

        recyclerView = view.findViewById(R.id.recycler_view_start_page_pr_one)
        allAdapter = StartPageAdapter()

        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = allAdapter
        }


        viewModel.getGuardianData().observe(viewLifecycleOwner) {
            allAdapter.apiList = it.response.results.toMutableList()
            allAdapter.notifyDataSetChanged()
        }

        viewModel.getMyInfo()

        return view
    }

    companion object {
        fun newInstance() = StartPageFragment()
    }
}

