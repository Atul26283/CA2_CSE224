package com.example.atul_ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val radioButton1 = findViewById<RadioButton>(R.id.radio_1)
        val radioButton2 = findViewById<RadioButton>(R.id.radio_2)

        val checkBox1 = findViewById<CheckBox>(R.id.checkBox_1)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox_2)

        radioButton1.setOnClickListener(){
            Toast.makeText(this,"Selected : " + radioButton1.text , Toast.LENGTH_SHORT).show();
        }
        radioButton2.setOnClickListener(){
            Toast.makeText(this,"Selected : " + radioButton2.text , Toast.LENGTH_SHORT).show();
        }
        checkBox1.setOnClickListener(){
            Toast.makeText(this,"Selected : " + checkBox1.text , Toast.LENGTH_SHORT).show();
        }
        checkBox2.setOnClickListener(){
            Toast.makeText(this,"Selected : " + checkBox2.text , Toast.LENGTH_SHORT).show();
        }
    }
}