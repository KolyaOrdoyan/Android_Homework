package com.example.all_android_projects.api.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_projects.R
import com.example.all_android_projects.api.ui.adapter.ApiAdapter


class ApiFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var allAdapter: ApiAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val viewModel = ViewModelProvider(this)[ApiViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_api, container, false)
        recyclerView = view.findViewById(R.id.postsRecyclerView)
        allAdapter = ApiAdapter()
        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = allAdapter
        }
        viewModel.getMyInfo()
        viewModel.myInfoList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { allAdapter.setList(it) }
        }
        return view
    }

    companion object {
        fun newInstance() = ApiFragment()
    }
}