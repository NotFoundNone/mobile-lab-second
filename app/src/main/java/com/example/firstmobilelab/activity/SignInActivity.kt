package com.example.firstmobilelab.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firstmobilelab.R
import com.example.firstmobilelab.activity.model.User

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val user = intent.getParcelableExtra<User>("USER")

        val emailEditText: TextView = findViewById(R.id.email)
        val passwordEditText: TextView = findViewById(R.id.password)
        val signInButton: Button = findViewById(R.id.signInButton)
        val registerLink: TextView = findViewById(R.id.registerLink)

        user?.let {
            emailEditText.setText(it.login)
            passwordEditText.setText(it.password)
        }
        signInButton.setOnClickListener {
            val loginInput = emailEditText.text.toString()
            val passwordInput = passwordEditText.text.toString()

//            val loginInput = findViewById<EditText>(R.id.email).text.toString()
//            val passwordInput = findViewById<EditText>(R.id.password).text.toString()

            if ((loginInput == "Dema" || loginInput == "Nikita") && passwordInput == "123456") {
                Log.d("SignInActivity", "Auth success!")

                // Переход к ChatListActivity, передаем логин пользователя
                val intent = Intent(this@SignInActivity, HomeActivity::class.java)
                intent.putExtra("LOGIN", loginInput)
                startActivity(intent)
                finish()
            } else {
                Log.d("SignInActivity", "Auth failed!")
                Toast.makeText(this, "Неверные данные", Toast.LENGTH_SHORT).show()
            }
        }

        registerLink.setOnClickListener {
            val intent = Intent(this@SignInActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("SignInActivity", "SignInActivity onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SignInActivity", "SignInActivity onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SignInActivity", "SignInActivity onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SignInActivity", "SignInActivity onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SignInActivity", "SignInActivity onDestroy called")
    }
}

