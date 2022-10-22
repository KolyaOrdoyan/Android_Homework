package com.example.all_android_projects.menuvariety.ui.menues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.all_android_projects.R

class OptionsMenuActivity : AppCompatActivity() {

    private lateinit var textTextView: TextView
    private lateinit var imageImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_menu)

        textTextView = findViewById(R.id.options_menu_textView)
        imageImageView = findViewById(R.id.options_menu_imageView)


        Glide.with(this)
            .load("https://cdn.milenio.com/uploads/media/2022/10/13/hasbulla-instagram.jpg")
            .centerCrop()
            .into(imageImageView)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_delete -> {
                Glide.with(this)
                    .load("https://i.gifer.com/origin/e1/e1a0362291858704234da89172062e65.gif")
                    .centerCrop()
                    .into(imageImageView)
                textTextView.text = "Way you delete my"
            }
            R.id.nav_favourite -> {
                Glide.with(this)
                    .load("https://cdn.vox-cdn.com/thumbor/XuOai8xYrOVJpxwa8gx6-R_ccvc=/0x0:4888x3309/1200x800/filters:focal(1920x1249:2702x2031)/cdn.vox-cdn.com/uploads/chorus_image/image/71491188/1350241729.0.jpg")
                    .centerCrop()
                    .into(imageImageView)
                textTextView.text = "You are my favorite \n I like you"}
            R.id.nav_settings ->Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}