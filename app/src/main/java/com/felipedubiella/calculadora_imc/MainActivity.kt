package com.felipedubiella.calculadora_imc

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.felipedubiella.calculadora_imc.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {

            val height : Float = binding.edtHeight.text.toString().toFloat()
            val weight : Float = binding.edtWeight.text.toString().toFloat()

            val heightQ2 = height * height
            val result = weight/heightQ2

            println("Seu IMC é: " + result)

        }



    }
}