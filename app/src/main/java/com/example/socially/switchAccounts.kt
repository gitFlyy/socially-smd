package com.example.socially

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class switchAccounts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_accounts)

        val signUpButton = findViewById<Button>(R.id.signup)
        val logInButton = findViewById<Button>(R.id.LoginButton)

        signUpButton.setOnClickListener {
            val intent = Intent(this, signUp::class.java)
            startActivity(intent)
        }

        logInButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}