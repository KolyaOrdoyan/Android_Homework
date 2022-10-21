package com.example.all_android_projects.menuvariety.ui.pickers

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.R
import java.text.SimpleDateFormat
import java.util.*

class DataPickerActivity : AppCompatActivity() {

    private lateinit var textViewData: TextView
    private lateinit var buttonCreateData: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_picker)

        textViewData = findViewById(R.id.data_picker_data_textView)
        buttonCreateData = findViewById(R.id.data_picker_create_data_button)

        val myCalendar = Calendar.getInstance()

        val datePicker = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateLabel(myCalendar)
        }
        buttonCreateData.setOnClickListener {
            DatePickerDialog(this,datePicker,myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
            myCalendar.get(Calendar.DAY_OF_MONTH)).show()
        }
    }

    private fun updateLabel(myCalendar: Calendar) {
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.UK)
        textViewData.text = sdf.format(myCalendar.time)
    }
}