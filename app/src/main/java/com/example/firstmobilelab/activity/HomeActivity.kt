package com.example.firstmobilelab.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstmobilelab.ChatAdapter
import com.example.firstmobilelab.R
import com.example.mobilelab.Chat

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Устанавливаем разметку активности
        setContentView(R.layout.activity_home)

        val login = intent.getStringExtra("LOGIN")
        val loginTextView = findViewById<TextView>(R.id.loginTextView)
        loginTextView.text = login

        val chatList = listOf(
            Chat("Андрей", "12:30 PM", "Привет, как дела?"),
            Chat("Марина", "12:32 PM", "Занята на работе."),
            Chat("Сергей", "12:45 PM", "Поговорим позже."),
            Chat("Ольга", "1:00 PM", "Привет, давно не виделись!"),
            Chat("Виктор", "1:15 PM", "Когда встречаемся?")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.chat_list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ChatAdapter(chatList)
    }
}
