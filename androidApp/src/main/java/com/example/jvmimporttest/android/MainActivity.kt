package com.example.jvmimporttest.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jvmimporttest.Greeting
import android.widget.TextView
import com.example.jvmimporttest.Platform
import com.example.jvmimporttest.jvmMethod

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = Platform().jvmMethod()
    }
}
