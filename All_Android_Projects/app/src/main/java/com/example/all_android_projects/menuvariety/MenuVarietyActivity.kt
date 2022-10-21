package com.example.all_android_projects.menuvariety

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.all_android_projects.R
import com.example.all_android_projects.menuvariety.ui.menues.ContextMenuActivity
import com.example.all_android_projects.menuvariety.ui.menues.OptionsMenuActivity
import com.example.all_android_projects.menuvariety.ui.menues.PopupMenuActivity
import com.example.all_android_projects.menuvariety.ui.pickers.AlertDialogActivity
import com.example.all_android_projects.menuvariety.ui.pickers.DataPickerActivity
import com.example.all_android_projects.menuvariety.ui.pickers.TimePickerActivity

class MenuVarietyActivity : AppCompatActivity() {

    private lateinit var buttonAlertDialog: AppCompatButton
    private lateinit var buttonDatePicker: AppCompatButton
    private lateinit var buttonTimePicker: AppCompatButton
    private lateinit var buttonOptionsMenu: AppCompatButton
    private lateinit var buttonContextMenu: AppCompatButton
    private lateinit var buttonPopupMenu: AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_variety)

        buttonAlertDialog = findViewById(R.id.menu_variety_alert_dialog)
        buttonDatePicker = findViewById(R.id.menu_variety_date_picker)
        buttonTimePicker = findViewById(R.id.menu_variety_time_picker)
        buttonOptionsMenu = findViewById(R.id.menu_variety_options_menu)
        buttonContextMenu = findViewById(R.id.menu_variety_context_menu)
        buttonPopupMenu = findViewById(R.id.menu_variety_popup_menu)

        click()
    }

    private fun click() {
        buttonAlertDialog.setOnClickListener {
            val intent = Intent(this, AlertDialogActivity::class.java)
            startActivity(intent)
        }
        buttonDatePicker.setOnClickListener {
            val intent = Intent(this, DataPickerActivity::class.java)
            startActivity(intent)
        }
        buttonTimePicker.setOnClickListener {
            val intent = Intent(this, TimePickerActivity::class.java)
            startActivity(intent)
        }
        buttonOptionsMenu.setOnClickListener {
            val intent = Intent(this, OptionsMenuActivity::class.java)
            startActivity(intent)
        }
        buttonContextMenu.setOnClickListener {
            val intent = Intent(this, ContextMenuActivity::class.java)
            startActivity(intent)
        }
        buttonPopupMenu.setOnClickListener {
            val intent = Intent(this, PopupMenuActivity::class.java)
            startActivity(intent)
        }
    }
}