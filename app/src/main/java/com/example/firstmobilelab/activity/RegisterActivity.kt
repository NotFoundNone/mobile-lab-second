package com.example.firstmobilelab.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstmobilelab.R
import com.example.firstmobilelab.activity.model.User

class RegisterActivity : AppCompatActivity() {

    // Объявление переменных для элементов интерфейса
    private lateinit var loginEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val loginEditText: EditText = findViewById(R.id.login)
        val emailEditText: EditText = findViewById(R.id.email)
        val passwordEditText: EditText = findViewById(R.id.password)
        val registerButton: Button = findViewById(R.id.registerButton)

        registerButton.setOnClickListener {
            val login = loginEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            val user = User(login, email, password)

            val intent = Intent(this@RegisterActivity, SignInActivity::class.java)
            intent.putExtra("USER", user)
            startActivity(intent)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("RegisterActivity", "RegisterActivity onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RegisterActivity", "RegisterActivity onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("RegisterActivity", "RegisterActivity onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("RegisterActivity", "RegisterActivity onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("RegisterActivity", "RegisterActivity onDestroy called")
    }
}
