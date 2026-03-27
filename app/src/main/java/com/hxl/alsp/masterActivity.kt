package com.hxl.alsp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class masterActivity : AppCompatActivity() {
    var handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_master)
        handler.postDelayed(Runnable{
            startActivity(Intent(applicationContext,MainActivity::class.java))
            finish()
        },1000)

    }
}