package com.example.all_android_projects.registermenu.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.activityViewModels
import com.example.all_android_projects.R
import com.example.all_android_projects.registermenu.data.DataModel
import kotlinx.android.synthetic.main.fragment_log_in.view.*

class FragmentLogIn : Fragment() {
    private val dataModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_log_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val logInButton: AppCompatButton = view.log_in_page_button
        val username: EditText = view.findViewById(R.id.log_in_page_email_editText)
        val password: EditText = view.findViewById(R.id.log_in_page_password_editText)
        logInButton.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_welcome_page, FragmentWelcomePage.newInstance()).commit()
            dataModel.dataFromLogIn.value =
                "username: ${username.text} \npassword: ${password.text}"
        }
    }

    companion object {
        fun newInstance() = FragmentLogIn()
        const val CODE = 2
    }
}