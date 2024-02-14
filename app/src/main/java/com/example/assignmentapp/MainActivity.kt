package com.example.assignmentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val goBtn  = findViewById<Button>(R.id.letsgo_btn)

        goBtn.setOnClickListener {
            intent=Intent(this,Screen_2::class.java)
            startActivity(intent)
            finish()
        }
    }

}