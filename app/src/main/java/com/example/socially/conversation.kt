package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class conversation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversation)

        val backButton = findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener {
            val intent = Intent(this, directMessages::class.java)
            startActivity(intent)
        }

        val cameraButton = findViewById<ImageView>(R.id.camera_button)
        cameraButton.setOnClickListener {
            val intent = Intent(this, camera::class.java)
            startActivity(intent)
        }
    }
}