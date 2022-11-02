package com.example.all_android_projects.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.example.all_android_projects.R
import com.example.all_android_projects.store.fragmentapp.AppFragment
import com.example.all_android_projects.store.fragmentgame.GameFragment

class StoreActivity : AppCompatActivity() {

    private lateinit var gameLayout: LinearLayout
    private lateinit var appLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.store_frame_layout, AppFragment.newInstance()).commit()

        gameLayout = findViewById(R.id.store_liner_layout_game_pad)
        appLayout = findViewById(R.id.store_liner_layout_apps)

        gameLayout.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.store_frame_layout, GameFragment.newInstance()).commit()
        }
        appLayout.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.store_frame_layout, AppFragment.newInstance()).commit()
        }

    }

}