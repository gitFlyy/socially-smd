package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val homeButton = findViewById<ImageView>(R.id.nav_home)
        homeButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        val searchButton = findViewById<ImageView>(R.id.nav_search)
        searchButton.setOnClickListener {
            val intent = Intent(this, search::class.java)
            startActivity(intent)
        }

        val cameraButton = findViewById<ImageView>(R.id.nav_add)
        cameraButton.setOnClickListener {
            val intent = Intent(this, camera::class.java)
            startActivity(intent)
        }

        val favoritesButton = findViewById<ImageView>(R.id.nav_heart)
        favoritesButton.setOnClickListener {
            val intent = Intent(this, notifications::class.java)
            startActivity(intent)
        }

        val editProfileButton = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.edit_profile_btn)
        editProfileButton.setOnClickListener {
            val intent = Intent(this, editProfile::class.java)
            startActivity(intent)
        }
    }
}