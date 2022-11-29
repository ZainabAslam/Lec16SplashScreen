package com.example.lec16splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent=getIntent()
        val name=intent.getStringExtra("Name")
        val age=intent.getIntExtra("Age", 0)
        textView8.text="Hello"+name
        textView9.text="Your age is "+age

    }
}