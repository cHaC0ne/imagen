package com.example.imagen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val samurai2=findViewById<ImageView>(R.id.ivSamurai)

        Glide.with(this).load("http://loremflickr.com/320/240").into(samurai2)

    }
}