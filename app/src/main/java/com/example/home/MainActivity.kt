package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val registr =findViewById<Button>(R.id.registr)

        registr.setOnClickListener {

            val intent = Intent(applicationContext,Registration::class.java)

            startActivity(intent)



        }




        val login = findViewById<Button>(R.id.log)
        val inputName = findViewById<EditText>(R.id.inputName)
        val pass = findViewById<EditText>(R.id.pass)

        login.setOnClickListener {
            val text = inputName.text.toString()


            val intent = Intent(applicationContext,ThirdActivity::class.java)

            intent.putExtra("fromlogin",text)
            intent.putExtra("ettext", true)




            startActivity(intent)

        }

    }
}