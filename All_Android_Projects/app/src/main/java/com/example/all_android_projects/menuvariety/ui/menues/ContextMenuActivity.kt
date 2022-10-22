package com.example.all_android_projects.menuvariety.ui.menues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.example.all_android_projects.DashBoardActivity
import com.example.all_android_projects.R
import com.example.all_android_projects.calculator.CalculatorActivity
import com.example.all_android_projects.menuvariety.MenuVarietyActivity

class ContextMenuActivity : AppCompatActivity() {

    private lateinit var longClickTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        longClickTextView = findViewById(R.id.context_menu_longClick_textView)
        registerForContextMenu(longClickTextView)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
        menu?.setHeaderTitle("choice")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.context_menu_back_menu -> {
                val intent = Intent(this, MenuVarietyActivity::class.java)
                startActivity(intent)
            }
            R.id.context_menu_back_main_menu -> {
                val intent = Intent(this, DashBoardActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onContextItemSelected(item)
    }
}