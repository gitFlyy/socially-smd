package com.example.socially

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.LoginButton)

        loginButton.setOnClickListener {
            val intent = Intent(this, switchAccounts::class.java)
            startActivity(intent)
        }

        val signUpButton = findViewById<Button>(R.id.signup)

        signUpButton.setOnClickListener {
            val intent = Intent(this, signUp::class.java)
            startActivity(intent)
        }
    }
}