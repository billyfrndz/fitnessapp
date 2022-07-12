package com.billyfrndz.fitnessapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backbutton = findViewById<ImageButton>(R.id.backday_icon)
        backbutton.setOnClickListener(){
            val mv2listback = Intent(this, backlist::class.java)
            startActivity(mv2listback)
        }

        val chestbutton = findViewById<ImageButton>(R.id.chestday_icon)
        chestbutton.setOnClickListener(){
            val mv2listchest = Intent(this, chestlist::class.java)
            startActivity(mv2listchest)
        }

        val shoudlerbutton = findViewById<ImageButton>(R.id.shoulderday_icon)
        shoudlerbutton.setOnClickListener(){
            val mv2listshoulder = Intent(this, shoulderlist::class.java)
            startActivity(mv2listshoulder)
        }
    }
}