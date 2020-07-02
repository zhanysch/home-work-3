package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    val trueinputname ="maks"
    val truepass= "12345"



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
            val passText = pass.text.toString()


            if (text== trueinputname && passText == truepass  ) {

                Toast.makeText(applicationContext, "data is correct", Toast.LENGTH_LONG ).show()
            }

            else {
                Toast.makeText(applicationContext, "data is not correct", Toast.LENGTH_LONG ).show()

            }




            val intent = Intent(applicationContext,ThirdActivity::class.java)

            intent.putExtra("fromlogin",text)
            intent.putExtra("ettext", true)




            startActivity(intent)

        }

    }
}