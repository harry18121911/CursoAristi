package com.harry18121911.cursoaristi.imcapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.harry18121911.cursoaristi.R
import com.harry18121911.cursoaristi.imcapp.IMCActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {
    private lateinit var  tvResult: TextView
    private lateinit var tvIMC:TextView
    private lateinit var tvDescription:TextView
    private lateinit var  btnRecalculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initListeners()
        initUI(result)
    }

    private fun initListeners(){
        btnRecalculate.setOnClickListener {
            navigateUpTo(intent)
        }
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when (result){
            in 0.00..18.50 -> {//BAJO PESO
                tvResult.text = getString(R.string.lowWeight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.cold))
                tvDescription.text = getString(R.string.lowDescription)
            }
            in 18.51 .. 24.99 ->{//PESO NORMAL
                tvResult.text = getString(R.string.normalWeight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.lawn_green))
                tvDescription.text = getString(R.string.normalDescription)
            }
            in 25.00.. 29.99 ->{//SOBREPESO
                tvResult.text = getString(R.string.chubbyWeight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.cold))
                tvDescription.text = getString(R.string.chubbyDescription)
            }

            in 30.00 .. 99.99 ->{//OBESIDAD
                tvResult.text = getString(R.string.obesityWeight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.red))
                tvDescription.text = getString(R.string.obesityDescriptrion)
            }
           else -> {//ERROR
                tvIMC.text = getString(R.string.error)
                tvResult.text =  getString(R.string.error)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.red))
                tvDescription.text =  getString(R.string.error)
            }
        }
    }

    private fun initComponents(){
        tvIMC = findViewById(R.id.tvIMC)
        tvResult= findViewById(R.id.tvResult)
        tvDescription= findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }


}