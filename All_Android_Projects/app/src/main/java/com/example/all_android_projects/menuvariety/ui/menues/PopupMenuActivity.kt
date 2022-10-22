package com.example.all_android_projects.menuvariety.ui.menues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide
import com.example.all_android_projects.R

class PopupMenuActivity : AppCompatActivity() {

    private lateinit var popupMenuImageView: ImageView
    private lateinit var popupMenuButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_menu)

        popupMenuButton = findViewById(R.id.popup_menu_button)
        popupMenuImageView = findViewById(R.id.popup_menu_imageView)
        registerForContextMenu(popupMenuButton)

        Glide.with(this)
            .load("https://www.meme-arsenal.com/memes/20d600dd79c74b47a39ec029235fa3a1.jpg")
            .centerCrop()
            .into(popupMenuImageView)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.popup_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.popup_menu_image1 -> {
                Glide.with(this)
                    .load("https://n1s1.hsmedia.ru/a1/ec/ec/a1ececc48afd3c0c498fdbd47ba45dbe/728x542_1_f5b22481fc08917ff7584d523f52ed21@1000x745_0xac120003_3944844451633381523.jpeg")
                    .centerCrop()
                    .into(popupMenuImageView)
            }
            R.id.popup_menu_image2 -> {
                Glide.with(this)
                    .load("https://daily-motor.ru/wp-content/uploads/2022/04/9cef02fc84b44b545de632dda897d7d4-flying-car-weird-cars.jpg")
                    .centerCrop()
                    .into(popupMenuImageView)
            }
            R.id.popup_menu_image3 -> {
                Glide.with(this)
                    .load("https://st2.depositphotos.com/1053646/6104/i/450/depositphotos_61040615-stock-photo-dubai-downtown-night-scene.jpg")
                    .centerCrop()
                    .into(popupMenuImageView)
            }
        }
        return super.onContextItemSelected(item)
    }
}
