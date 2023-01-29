package com.example.onboarding

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUp:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)
        val clickForLogIn = findViewById<TextView>(R.id.txtLogIn)
        val actionClickForLogIn = Intent(this, SignIn::class.java)
        clickForLogIn.setOnClickListener(){
            startActivity(actionClickForLogIn)
        }

    }
}