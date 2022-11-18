package com.example.all_android_projects.store

import android.app.Service
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import com.example.all_android_projects.R
import com.example.all_android_projects.store.ui.fragmentes.AppFragment
import com.example.all_android_projects.store.ui.fragmentes.GameFragment

class StoreActivity : AppCompatActivity() {

    private lateinit var gameLayout: LinearLayout
    private lateinit var appLayout: LinearLayout

    var context = this
    private var connectivity: ConnectivityManager? = null
    private var info: NetworkInfo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.store_frame_layout, AppFragment.newInstance()).commit()

        gameLayout = findViewById(R.id.store_liner_layout_game_pad)
        appLayout = findViewById(R.id.store_liner_layout_apps)

        gameLayout.setOnClickListener {
            connectivity =
                context.getSystemService(Service.CONNECTIVITY_SERVICE) as ConnectivityManager

            if (connectivity != null) {
                info = connectivity!!.activeNetworkInfo

                if (info != null) {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.store_frame_layout, GameFragment.newInstance()).commit()
                    T = 1
                } else {
                    Toast.makeText(context, "check internet connect", Toast.LENGTH_SHORT).show()
                }
            }

        }

        appLayout.setOnClickListener {
            connectivity =
                context.getSystemService(Service.CONNECTIVITY_SERVICE) as ConnectivityManager

            if (connectivity != null) {
                info = connectivity!!.activeNetworkInfo

                if (info != null) {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.store_frame_layout, AppFragment.newInstance()).commit()
                    T = 2
                } else {
                    Toast.makeText(context, "check internet connect", Toast.LENGTH_SHORT).show()
                }
            }

        }

    }

    companion object{
        var T : Int = 0
    }

}