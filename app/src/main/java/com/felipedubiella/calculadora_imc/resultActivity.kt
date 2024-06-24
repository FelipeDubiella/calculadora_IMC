package com.felipedubiella.calculadora_imc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.felipedubiella.calculadora_imc.databinding.ActivityMainBinding
import com.felipedubiella.calculadora_imc.databinding.ActivityResultBinding

const val keyResultIMC = "resultActivityKeyIMC"

class resultActivity : AppCompatActivity() {
    private val binding by lazy { ActivityResultBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val result = intent.getFloatExtra(keyResultIMC, 0f)

        val tvResult = binding.tvResult
        val tvClassification = binding.tvClassification

        tvResult.text = result.toString()

        val classification: String = if ( result <= 18.5f){
            "MAGREZA"
        } else if (result > 18.5f && result <= 24.9f){
            "NORMAL"
        } else if (result >25f && result <= 29.9f){
            "SOBREPESO"
        } else if (result > 30f && result <= 39.9f){
            "OBESIDADE"
        } else{
            "OBESIDADE GRAVE "
        }

        tvClassification.text = classification.toString()

    }
}