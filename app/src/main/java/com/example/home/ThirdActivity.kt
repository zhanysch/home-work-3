package com.example.home

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)



        val textview= findViewById<TextView>(R.id.textView)
        val kurs = findViewById<TextView>(R.id.kurs)


        val data = intent.getStringExtra("fromlogin")

        val data2 = intent.getBooleanExtra("ettext",false)

        textView.text=data

        if (data2) { kurs.text = "from Login"

        } else {kurs.text= "from Registration"

        }




        Toast.makeText(applicationContext, data, Toast.LENGTH_LONG).show()




















    }
}