package com.example.musicplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var start: Button? = null
    lateinit var stop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start = findViewById(R.id.btn_start)

        stop = findViewById<View>(R.id.btn_stop) as Button

        start!!.setOnClickListener(this)
        stop!!.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {

        // TODO 2 Change this logic
        if (p0 == start) {
            startService(Intent(this, NewService::class.java))
        } else if (p0 == stop) {
            stopService(Intent(this, NewService::class.java))
        }


    }


}


