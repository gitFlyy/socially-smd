package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class you : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitiy_you)

        val followingButton = findViewById<TextView>(R.id.tab_following)
        followingButton.setOnClickListener {
            val intent = Intent(this, notifications::class.java)
            startActivity(intent)
        }

        val homeButton = findViewById<ImageView>(R.id.nav_home)
        homeButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        val cameraButton = findViewById<ImageView>(R.id.nav_add)
        cameraButton.setOnClickListener {
            val intent = Intent(this, camera::class.java)
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
    }
}