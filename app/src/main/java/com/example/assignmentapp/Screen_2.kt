package com.example.assignmentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class Screen_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val andCard = findViewById<CardView>(R.id.androidCard)
        val webCard = findViewById<CardView>(R.id.webCard)
        val iosCard = findViewById<CardView>(R.id.iosCard)
        val mlCard = findViewById<CardView>(R.id.machineCard)
        val aiCard = findViewById<CardView>(R.id.aiCard)
        val gptCard = findViewById<CardView>(R.id.chatGptCard)
        val helpButton = findViewById<TextView>(R.id.needHelpButton)



        andCard.setOnClickListener {
            intent= Intent(this,AndroidScreen::class.java)
            startActivity(intent)
        }
        webCard.setOnClickListener {
            intent= Intent(this,WebScreen::class.java)
            startActivity(intent)
        }
        iosCard.setOnClickListener {
            intent= Intent(this,IosScreen::class.java)
            startActivity(intent)
        }
        mlCard.setOnClickListener {
            intent= Intent(this,MlScreen::class.java)
            startActivity(intent)
        }
        aiCard.setOnClickListener {
            intent= Intent(this,AiScreen::class.java)
            startActivity(intent)
        }
        gptCard.setOnClickListener {
            intent=Intent(this,ChatGptScreen::class.java)
            startActivity(intent)
        }
        helpButton.setOnClickListener {
            intent=Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:7814570407"))
            startActivity(intent)
        }
    }
}