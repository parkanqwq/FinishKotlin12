package com.kalabukhov.app.finishkotlin12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //findViewById<TextView>(R.id.textView).text = BuildConfig.BUILD_TYPE
        Toast.makeText(applicationContext, "paid", Toast.LENGTH_SHORT).show()

    }
}