package com.example.home

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class Registration: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.regist)



        val five = findViewById<Button>(R.id.five)

        val three = findViewById<EditText>(R.id.three)
        val  four = findViewById<EditText>(R.id.four)
        five.setOnClickListener {

            val text = three.text.toString()


            val intent = Intent(applicationContext,ThirdActivity::class.java)

            intent.putExtra("fromlogin",text)
            intent.putExtra("ettext", false)


            startActivity(intent)
        }


    }





}