package com.example.all_android_projects.registormenu

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.R
import com.example.all_android_projects.registormenu.ui.LogInActivity
import com.example.all_android_projects.registormenu.ui.SignUpActivity

class WelcomePageActivity : AppCompatActivity() {

    private lateinit var logInButton: AppCompatButton
    private lateinit var signUpButton: AppCompatButton
    private lateinit var emailLogInTextView: TextView

    private val getContent: ActivityResultLauncher<Intent> =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == LogInActivity.REQUEST_CODE_LOGIN) {
                val username = result.data?.getStringExtra(LogInActivity.USERNAME)
                val password = result.data?.getStringExtra(LogInActivity.PASSWORD)
                val dialog = Dialog(this@WelcomePageActivity)
                dialog.apply {
                    setContentView(R.layout.dialog_log_in)
                    emailLogInTextView = findViewById(R.id.welcome_page_dialog_textView)
                    emailLogInTextView.text = "username: $username \npassword: $password"
                }.show()
            }
        }

    private val getSignUpParameters: ActivityResultLauncher<Intent> =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == LogInActivity.REQUEST_CODE_SIGNUP) {
                val username = result.data?.getStringExtra(LogInActivity.USERNAME)
                val password = result.data?.getStringExtra(LogInActivity.PASSWORD)
                val confirm = result.data?.getStringExtra(LogInActivity.CONFIRM)
                val name = result.data?.getStringExtra(LogInActivity.NAME)
                val dialog = Dialog(this@WelcomePageActivity)
                dialog.apply {
                    setContentView(R.layout.dialog_log_in)
                    emailLogInTextView = findViewById(R.id.welcome_page_dialog_textView)
                    emailLogInTextView.text = "Username: $username \nPassword: $password \nConfirm: $confirm \nName: $name"
                }.show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        logInButton = findViewById(R.id.welcome_page_button_log)
        signUpButton = findViewById(R.id.welcome_page_button_sign)

        logInButton.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java)
            getContent.launch(intent)
        }

        signUpButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            getSignUpParameters.launch(intent)
        }
    }
}