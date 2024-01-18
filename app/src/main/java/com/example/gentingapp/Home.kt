package com.example.gentingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Home : AppCompatActivity() {

    lateinit var konsultasi: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        konsultasi = findViewById(R.id.icon_konsultasi)

        konsultasi.setOnClickListener(View.OnClickListener {
            Intent (this, PageDaftarKonsultan::class.java).also {
                startActivity(it)
            }
        })



    }
}