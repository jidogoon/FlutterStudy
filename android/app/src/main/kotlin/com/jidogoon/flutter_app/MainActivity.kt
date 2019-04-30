package com.jidogoon.flutter_app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.jidogoon.flutter_app.R

class MainActivity: Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val button = findViewById(R.id.btnSecond) as Button
    button.setOnClickListener {
      val intent = Intent(this, SecondActivity::class.java)
      startActivity(intent)
    }
  }
}
