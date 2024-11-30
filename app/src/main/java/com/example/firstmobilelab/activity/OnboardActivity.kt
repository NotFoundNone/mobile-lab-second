package com.example.firstmobilelab.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.firstmobilelab.R

class OnboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        val nextButton = findViewById<Button>(R.id.next_button)

        nextButton.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("OnboardActivity", "OnboardActivity onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnboardActivity", "OnboardActivity onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnboardActivity", "OnboardActivity onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OnboardActivity", "OnboardActivity onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnboardActivity", "OnboardActivity onDestroy called")
    }
}
