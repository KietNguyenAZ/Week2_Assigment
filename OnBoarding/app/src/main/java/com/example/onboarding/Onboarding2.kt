package com.example.onboarding

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding2)
        val button = findViewById<ImageButton>(R.id.movescreen1)
        button.setOnClickListener(){
            setContentView(R.layout.onboarding3)
        }

    }
}