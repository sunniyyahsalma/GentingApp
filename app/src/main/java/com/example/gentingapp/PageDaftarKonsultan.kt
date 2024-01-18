package com.example.gentingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class PageDaftarKonsultan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_daftar_konsultan)

        val profile_konsultan = findViewById<FrameLayout>(R.id.profile_konsultan)

        profile_konsultan.setOnClickListener {
            Intent (this, PageProfilDanBookingKonsultan::class.java).also {
                startActivity(it)
            }
        }

        val profile_konsultan1 = findViewById<FrameLayout>(R.id.profile_konsultan1)

        profile_konsultan1.setOnClickListener {
            Intent(this, PageProfilDanBookingKonsultan::class.java).also {
                startActivity(it)
            }
        }

        val profile_konsultan2 = findViewById<FrameLayout>(R.id.profile_konsultan2)

        profile_konsultan2.setOnClickListener {
            Intent (this, PageProfilDanBookingKonsultan::class.java).also {
                startActivity(it)
            }
        }

        val profile_konsultan3 = findViewById<FrameLayout>(R.id.profile_konsultan3)

        profile_konsultan3.setOnClickListener {
            Intent (this, PageProfilDanBookingKonsultan::class.java).also {
                startActivity(it)
            }
        }



    }
}