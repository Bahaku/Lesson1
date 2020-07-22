package com.example.lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnoak = findViewById<Button>(R.id.oak)
        val btnBirch = findViewById<Button>(R.id.birch)
        val btnSpruce = findViewById<Button>(R.id.spruce)

        val oak = Oak()
        val birch = Birch()
        val spruce = Spruce()

        btnoak.setOnClickListener {
            oak.toGrow(this)

        }
        btnBirch.setOnClickListener {
            birch.toGrow(this)

        }
        btnSpruce.setOnClickListener {
            spruce.toGrow(this)

        }
    }
}