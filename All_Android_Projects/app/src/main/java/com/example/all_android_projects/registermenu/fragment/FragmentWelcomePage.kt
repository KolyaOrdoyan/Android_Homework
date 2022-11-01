package com.example.all_android_projects.registermenu.fragment

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.all_android_projects.R
import com.example.all_android_projects.registermenu.data.DataModel
import kotlinx.android.synthetic.main.fragment_welcome_page.view.*


class FragmentWelcomePage : Fragment() {

    private val dataModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        dataModel.dataFromLogIn.observe(activity as LifecycleOwner) {
            val dialog = context?.let { it1 -> Dialog(it1) }
            dialog?.apply {
                setContentView(R.layout.dialog_log_in)
                val dialogText: TextView = findViewById(R.id.welcome_page_dialog_textView)
                dialogText.text = it
            }?.show()
        }

        val logInButton: AppCompatButton = view.welcome_page_button_log
        logInButton.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_welcome_page, FragmentLogIn.newInstance()).commit()
        }

        dataModel.dataFromSignUp.observe(activity as LifecycleOwner) {
            val dialog = context?.let { it1 -> Dialog(it1) }
            dialog?.apply {
                setContentView(R.layout.dialog_log_in)
                val dialogText: TextView = findViewById(R.id.welcome_page_dialog_textView)
                dialogText.text = it
            }?.show()
        }

        val signUpButton: AppCompatButton = view.welcome_page_button_sign
        signUpButton.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_welcome_page, FragmentSignUp.newInstance()).commit()
        }
    }

    companion object {
        fun newInstance() = FragmentWelcomePage()
    }

}