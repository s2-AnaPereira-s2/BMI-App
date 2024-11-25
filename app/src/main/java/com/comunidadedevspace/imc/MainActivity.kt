package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

            val heighttxt: String = inputheight.text.toString()
            val weighttxt: String = inputweight.text.toString()

            if (heighttxt.isEmpty() || weighttxt.isEmpty()){
                Snackbar
                    .make(btncalculate, "Please enter your Height and Weight", Snackbar.LENGTH_SHORT)
                    .show()
            }

            else {

                val height: Float = inputheight.text.toString().toFloat()
                val weight: Float = inputweight.text.toString().toFloat()

                val height2 = height * (height)
                val IMC = weight / height2

                if (IMC < 18.5) {
                    println("Underweight")
                }
                if (IMC >= 18.5 && IMC <= 24.9) {
                    println("Normal")
                }
                if (IMC >= 25.0 && IMC <= 29.9) {
                    println("Overweight")
                }
                if (IMC >= 30.0 && IMC <= 39.9) {
                    println("Obesity")
                }
                if (IMC >= 40.0) {
                    println("Severe obesity")
                }
            }
        }
    }
}
