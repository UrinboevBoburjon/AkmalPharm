package com.example.akmalpharm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignIn : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signIn = findViewById<Button>(R.id.SignIn)

        signIn.setOnClickListener(){
            val intent = Intent(this@SignIn,SignUp::class.java)
            startActivity(intent)
            finish()
        }
    }
}