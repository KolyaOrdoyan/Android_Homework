package com.example.all_android_projects.sharepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.R
import com.example.all_android_projects.sharepage.ui.show_page.ShowImagePageActivity
import com.example.all_android_projects.sharepage.ui.show_page.ShowUrlPageActivity
import com.example.all_android_projects.sharepage.ui.show_page.ShowVideoPageActivity
import kotlinx.android.synthetic.main.activity_choose_type.*

class ChooseTypeActivity : AppCompatActivity() {

    private lateinit var nextPageButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_type)

        nextPageButton = findViewById(R.id.proceed_Button)

        click()
    }

    private fun click() {
        nextPageButton.setOnClickListener {
            if (radioButtonImage.isChecked) {
                val intent = Intent(this, ShowImagePageActivity::class.java)
                startActivity(intent)
            } else if (radioButtonVideo.isChecked) {
                val intent = Intent(this, ShowVideoPageActivity::class.java)
                startActivity(intent)
            } else if (radioButtonUrl.isChecked) {
                val intent = Intent(this, ShowUrlPageActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Choose one of these ", Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }

}


