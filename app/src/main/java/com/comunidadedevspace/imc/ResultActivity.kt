package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val IMC = intent.getFloatExtra("IMC", 0.0f)

        val result_textview = findViewById<TextView>(R.id.result)
        val classification_textview = findViewById<TextView>(R.id.classification)
        result_textview.text = IMC.toString()
        val classification: String = if (IMC < 18.50) {
            "Underweight"
        }
        else if (IMC >= 18.50 && IMC <= 25.00) {
            "Normal"
        }
        else if (IMC >= 25.00 && IMC <= 30.00) {
            "Overweight"
        }
        else if (IMC >= 30.00 && IMC <= 40.00) {
            "Obesity"
        }
        else {
            "Severe obesity"
        }

        classification_textview.text = classification.toString()

    }
}
