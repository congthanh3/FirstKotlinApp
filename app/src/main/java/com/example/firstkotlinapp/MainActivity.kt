package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.hello_button)
        button.setOnClickListener{
            Log.v("hello ","sitr")
            Toast.makeText(this,"Hello from the other side", Toast.LENGTH_SHORT).show()
        }


    }

}