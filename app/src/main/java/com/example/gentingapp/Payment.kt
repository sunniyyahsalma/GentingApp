package com.example.gentingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


        val confirmPayment = findViewById<Button>(R.id.confirm_button)

        confirmPayment.setOnClickListener {
            Intent (this, RoomChat::class.java).also {
                startActivity(it)
            }
        }

    }
}