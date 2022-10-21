package com.example.all_android_projects.menuvariety.ui.pickers

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.R
import java.util.Calendar

class TimePickerActivity : AppCompatActivity() {

    private lateinit var textViewTime: TextView
    private lateinit var buttonCreateTime: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        textViewTime = findViewById(R.id.time_picker_time_textView)
        buttonCreateTime = findViewById(R.id.time_picker_create_time_button)


        buttonCreateTime.setOnClickListener {
            val currentTime = Calendar.getInstance()
            val hour = currentTime.get(Calendar.HOUR_OF_DAY)
            val minute = currentTime.get(Calendar.MINUTE)

            TimePickerDialog(this, { _, hour, minute -> textViewTime.text = "$hour:$minute" }, hour, minute, false).show()
        }
    }
}