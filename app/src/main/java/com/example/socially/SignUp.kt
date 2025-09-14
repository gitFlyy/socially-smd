package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class signUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signUpButton = findViewById<Button>(R.id.createAcc)

        signUpButton.setOnClickListener {
            val intent = Intent(this, switchAccounts::class.java)
            startActivity(intent)
        }

        val cameraButton = findViewById<ImageView>(R.id.profileImage)
        cameraButton.setOnClickListener {
            val intent = Intent(this, camera::class.java)
            startActivity(intent)
        }
    }
}