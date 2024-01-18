package com.example.gentingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class Login : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var loginButton: Button
    lateinit var klikSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Menemukan view menggunakan findViewById
        email = findViewById(R.id.input_email)
        password = findViewById(R.id.input_password)
        loginButton = findViewById(R.id.loginButton)
        klikSignUp = findViewById(R.id.klik_signup)

        loginButton.setOnClickListener(View.OnClickListener {
            if (email.text.toString() != null && password.text.toString() != null) {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })


        klikSignUp.setOnClickListener(View.OnClickListener {
            Intent (this, SignUp::class.java).also {
                startActivity(it)
            }
        })



    }
}



