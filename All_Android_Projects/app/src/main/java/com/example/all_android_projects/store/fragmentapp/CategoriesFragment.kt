package com.example.all_android_projects.store.fragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.all_android_projects.R
import kotlinx.android.synthetic.main.fragment_categoris.*

class CategoriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categoris, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        categories_text_view.text = "hello from categories "
    }

    companion object {
        fun newInstance() = CategoriesFragment()
    }
}