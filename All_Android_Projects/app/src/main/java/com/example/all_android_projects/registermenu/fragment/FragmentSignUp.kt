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
import kotlinx.android.synthetic.main.fragment_sign_up.view.*

class FragmentSignUp : Fragment() {
    private val dataModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val signUpButton: AppCompatButton = view.sign_up_button
        val username: EditText = view.findViewById(R.id.sign_up_page_email_editText)
        val password: EditText = view.findViewById(R.id.sign_up_page_password_editText)
        val confirm: EditText = view.findViewById(R.id.sign_up_page_confirm_pass_edithText)
        val name: EditText = view.findViewById(R.id.sign_up_page_name_or_pseudo_edithText)

        signUpButton.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_welcome_page, FragmentWelcomePage.newInstance()).commit()
            dataModel.dataFromSignUp.value =
                "username: ${username.text} \npassword: ${password.text}" +
                        " \nConfirm: ${confirm.text} \nName: ${name.text}"

        }
    }

    companion object {
        fun newInstance() = FragmentSignUp()
        const val CODE = 1
    }
}