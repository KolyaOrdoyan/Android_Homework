package com.example.all_android_projects.registormenu.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.R
import com.example.all_android_projects.registormenu.WelcomePageActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var signUpButton: AppCompatButton
    private lateinit var emailEditText: EditText
    private lateinit var passwordEdithText: EditText
    private lateinit var confirmPassEdithText: EditText
    private lateinit var nameEdithText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signUpButton = findViewById(R.id.sign_up_button)
        emailEditText = findViewById(R.id.sign_up_page_email_editText)
        passwordEdithText = findViewById(R.id.sign_up_page_password_editText)
        confirmPassEdithText = findViewById(R.id.sign_up_page_confirm_pass_edithText)
        nameEdithText = findViewById(R.id.sign_up_page_name_or_pseudo_edithText)


        signUpButton.setOnClickListener {
            val intent = Intent(this, WelcomePageActivity::class.java)
            intent.apply {
                putExtra(LogInActivity.USERNAME, emailEditText.text.toString())
                putExtra(LogInActivity.PASSWORD, passwordEdithText.text.toString())
                putExtra(LogInActivity.CONFIRM, confirmPassEdithText.text.toString())
                putExtra(LogInActivity.NAME, nameEdithText.text.toString())
            }
            setResult(LogInActivity.REQUEST_CODE_SIGNUP, intent)
            finish()
        }
    }
}