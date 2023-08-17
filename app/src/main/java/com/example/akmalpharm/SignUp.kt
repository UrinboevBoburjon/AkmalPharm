package com.example.akmalpharm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signUp = findViewById<Button>(R.id.SignUp)

        signUp.setOnClickListener(){
            val intent = Intent(this@SignUp,MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}