package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class directMessages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direct_messages)

        val backButton = findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        val chatJoshuaButton = findViewById<ImageView>(R.id.joshua_chat)
        chatJoshuaButton.setOnClickListener {
            val intent = Intent(this, conversation::class.java)
            startActivity(intent)
        }

        val cameraButton = findViewById<ImageView>(R.id.cameraButtonBottom)
        cameraButton.setOnClickListener {
            val intent = Intent(this, camera::class.java)
            startActivity(intent)
        }
    }
}