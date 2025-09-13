package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val searchButton = findViewById<ImageView>(R.id.searchButton)
        searchButton.setOnClickListener {
            val intent = Intent(this, search::class.java)
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

        val cameraButton = findViewById<ImageView>(R.id.addButton)
        cameraButton.setOnClickListener {
            val intent = Intent(this, camera::class.java)
            startActivity(intent)
        }

        val cameraButton2 = findViewById<ImageView>(R.id.cameraIcon)
        cameraButton2.setOnClickListener {
            val intent = Intent(this, camera::class.java)
            startActivity(intent)
        }

        val headerShareButton = findViewById<ImageView>(R.id.headerShareIcon)
        headerShareButton.setOnClickListener {
            val intent = Intent(this, directMessages::class.java)
            startActivity(intent)
        }

        val storyButton1 = findViewById<ImageView>(R.id.karenneStoryAvatar)
        storyButton1.setOnClickListener {
            val intent = Intent(this, story::class.java)
            startActivity(intent)
        }

        val storyButton2 = findViewById<ImageView>(R.id.zackjohnStoryAvatar)
        storyButton2.setOnClickListener {
            val intent = Intent(this, story::class.java)
            startActivity(intent)
        }

        val storyButton3 = findViewById<ImageView>(R.id.kieronStoryAvatar)
        storyButton3.setOnClickListener {
            val intent = Intent(this, story::class.java)
            startActivity(intent)
        }

        val storyButton4 = findViewById<ImageView>(R.id.craigStoryAvatar)
        storyButton4.setOnClickListener {
            val intent = Intent(this, story::class.java)
            startActivity(intent)
        }

        val postAvatar = findViewById<ImageView>(R.id.postUserAvatar)
        postAvatar.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

    }
}