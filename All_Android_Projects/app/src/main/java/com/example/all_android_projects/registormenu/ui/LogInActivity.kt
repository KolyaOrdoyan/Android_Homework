package com.example.all_android_projects.registormenu.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.R
import com.example.all_android_projects.registormenu.WelcomePageActivity

class LogInActivity : AppCompatActivity() {

    private lateinit var logButton: AppCompatButton
    private lateinit var usernameEdithText: EditText
    private lateinit var passwordEdithText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        logButton = findViewById(R.id.log_in_page_button)
        usernameEdithText = findViewById(R.id.sign_up_page_email_editText)
        passwordEdithText = findViewById(R.id.sign_up_page_password_editText)

        val username = usernameEdithText.text
        val password = passwordEdithText.text

        logButton.setOnClickListener {
            val intent = Intent(this, WelcomePageActivity::class.java)
            intent.apply {
                putExtra(USERNAME, username.toString())
                putExtra(PASSWORD, password.toString())
            }
            setResult(REQUEST_CODE_LOGIN, intent)
            finish()
        }
    }

    companion object {
        const val REQUEST_CODE_LOGIN = 1
        const val REQUEST_CODE_SIGNUP = 2
        const val USERNAME = "username"
        const val PASSWORD = "password"
        const val CONFIRM = "confirm"
        const val NAME = "name"
    }
}