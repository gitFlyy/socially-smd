package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class notifications : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

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

        val profileButton = findViewById<ImageView>(R.id.nav_profile)
        profileButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val tabYouButton = findViewById<TextView>(R.id.tab_you)
        tabYouButton.setOnClickListener {
            val intent = Intent(this, you::class.java)
            startActivity(intent)
        }
    }
}