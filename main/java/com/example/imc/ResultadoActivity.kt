package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_resultado2.*
import kotlin.math.roundToInt

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)

        val imc = intent.getParcelableExtra<IMC>("value")
        titleDensidadeCorporal.text = imc.nome.toString()

        if (imc.calcular() == "Saúdavel"){
            textViewHeaderDensidadeCorporal.text = "Parabens, vc esta " + imc.calcular()
        }  else{
            textViewHeaderDensidadeCorporal.text = "Cuide-se, vc esta em " + imc.calcular()
        }
        textViewResultadoDensidadeCorporal.text = "Seu IMC " + ((imc.imc * 100.0).roundToInt() / 100.0).toString()
        textViewAltura.text = "Sua altura " + imc.altura.toString() + " cm"
        textViewPeso.text = "Seu Peso " + imc.peso.toString() + " Kg"
    }
}