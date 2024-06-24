package com.felipedubiella.calculadora_imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.felipedubiella.calculadora_imc.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {


            val heightStr: String = binding.edtHeight.text.toString()
            val weightStr: String = binding.edtWeight.text.toString()

            if (weightStr == "" || heightStr == "") {

                Snackbar
                    .make(
                        binding.edtHeight,
                        "Fill all the fields",
                        Snackbar.LENGTH_LONG
                    ).show()

            } else {
                val weight = weightStr.toFloat()
                val height = heightStr.toFloat()

                val heightQ2 = height * height
                val result = weight / heightQ2

                //Navegar para proxima tela
                //Criar o layout para proxima tela
                //Passar dados para próxima tela

                //Intent - Classe do proprio android

                val intent = Intent (this,resultActivity::class.java)
                intent.putExtra(keyResultIMC, result)
                startActivity(intent)

                println("Seu IMC é: " + result)

            }


        }
    }
}
