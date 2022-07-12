package com.billyfrndz.fitnessapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        val splashHandler = Handler(Looper.getMainLooper())
        splashHandler.postDelayed({
            val moveSplashToMain = Intent(this, MainActivity::class.java)
            startActivity(moveSplashToMain)
            finish()
        },3000)
    }
}