package com.example.lec16splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun savebutton(view: View) {
        val name=textView4.text.toString()
        val age=textView5.text.toString().toInt()

        val intent=Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("Name", name)
        intent.putExtra("Age", age)
        startActivity(intent)
    }
}