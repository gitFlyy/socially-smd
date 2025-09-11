package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val homeButton = findViewById<ImageView>(R.id.homeButton)
        homeButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        val favoritesButton = findViewById<ImageView>(R.id.favoritesButton)
        favoritesButton.setOnClickListener {
            val intent = Intent(this, notifications::class.java)
            startActivity(intent)
        }

        val profileButton = findViewById<ImageView>(R.id.profileButton)
        profileButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val searchIcon = findViewById<ImageView>(R.id.searchIcon)
        searchIcon.setOnClickListener {
            val intent = Intent(this, searchResult::class.java)
            startActivity(intent)
        }
    }
}