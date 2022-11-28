package com.example.fragment_communication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pro=findViewById<ProgressBar>(R.id.progresss)
        val thread:Thread= Thread(Runnable {
            for(i in 1..10){
                pro.progress=i;
                Thread.sleep(500)
        }
        })
    }
}