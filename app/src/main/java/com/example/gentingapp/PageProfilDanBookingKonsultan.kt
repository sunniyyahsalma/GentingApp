package com.example.gentingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class PageProfilDanBookingKonsultan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_profil_dan_booking_konsultan)


        val bookNow = findViewById<Button>(R.id.book_now)

        bookNow.setOnClickListener {
            Intent (this, Payment::class.java).also {
                startActivity(it)
            }
        }


    }
}