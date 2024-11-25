package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //retrieve components from the user input in activity_main.xml
        //create a variable and get the input

        val inputheight = findViewById<TextInputEditText>(R.id.heightEditText)
        val inputweight = findViewById<TextInputEditText>(R.id.weightEditText)

        val btncalculate = findViewById<Button>(R.id.button_calculate)

        btncalculate.setOnClickListener {
            val height = inputheight.text
            val weight = inputweight.text

            println(weight)
            println(height)

        }
    }
}
