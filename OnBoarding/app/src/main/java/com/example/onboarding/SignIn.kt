package com.example.onboarding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.ProcessBuilder.Redirect.to


class SignIn:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_in)
        val clickForSignUp = findViewById<TextView>(R.id.txtSignUp)
        val actionClickForSignUp = Intent(this, SignUp::class.java)
        clickForSignUp.setOnClickListener(){
            startActivity(actionClickForSignUp)
        }

        val toProfile = findViewById<Button>(R.id.LoginToFrofile)
        toProfile.setOnClickListener(){
            clickLogIn()
        }


    }
    private fun clickLogIn(){
        val editEmail = findViewById<EditText>(R.id.editTextTextEmailAddressForLogIn)
        val editPassword = findViewById<EditText>(R.id.editTextTextPasswordLogIn)
        if( editEmail.text.toString() == "username@gmail.com" &&  editPassword.text.toString() == "123456"){
            startActivity(Intent(this, Profile::class.java))
        }
        else{
            Toast.makeText(this, "Login Failed!!!", Toast.LENGTH_SHORT).show()
        }

}
}

