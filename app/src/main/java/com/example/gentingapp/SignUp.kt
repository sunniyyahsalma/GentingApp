package com.example.gentingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignUp : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var confpassword: EditText
    lateinit var signUpButton: Button
    lateinit var klikLogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Menemukan view menggunakan findViewById
        name = findViewById(R.id.input_name)
        email = findViewById(R.id.input_email)
        password = findViewById(R.id.input_password)
        confpassword = findViewById(R.id.input_confirm_password)
        signUpButton = findViewById(R.id.signUpButton)
        klikLogin = findViewById(R.id.klik_login)

        signUpButton.setOnClickListener(View.OnClickListener {
            if (name.text.toString() != null && email.text.toString() != null && password.text.toString() != null && confpassword.text.toString() != null) {
                val intent = Intent(this, PageDaftarKonsultan::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })


        //activity next belum bener
        klikLogin.setOnClickListener(View.OnClickListener {
            Intent (this, Login::class.java).also {
                startActivity(it)
            }
        })





    }
}