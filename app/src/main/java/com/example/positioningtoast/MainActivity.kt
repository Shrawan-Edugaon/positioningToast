package com.example.positioningtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bTop = findViewById<Button>(R.id.btn1) as Button
        val bCenter = findViewById<Button>(R.id.btn2) as Button
        val bBottom = findViewById<Button>(R.id.btn3) as Button
        val bLeft = findViewById<Button>(R.id.btn4) as Button
        val bRight = findViewById<Button>(R.id.btn5) as Button
        val bTopLeft = findViewById<Button>(R.id.btn6) as Button

        bTop.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity,"Toast:Gravity.TOP",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,0)
            toast.show()
        }
        bCenter.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity,"Toast:Gravity.CENTER",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()
        }
        bBottom.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity,"Toast:Gravity.BOTTOM",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM,0,0)
            toast.show()
        }
        bLeft.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity,"Toast:Gravity.LEFT",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.LEFT,0,0)
            toast.show()
        }
        bRight.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity,"Toast:Gravity.RIGHT",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.RIGHT,0,0)
            toast.show()
        }
        bTopLeft.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity,"Toast:Gravity.TOPLEFT",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP or Gravity.LEFT,0,0)
            toast.show()

        }
    }
}