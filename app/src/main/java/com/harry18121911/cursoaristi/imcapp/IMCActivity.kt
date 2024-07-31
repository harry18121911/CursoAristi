package com.harry18121911.cursoaristi.imcapp

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.harry18121911.cursoaristi.R

class IMCActivity : AppCompatActivity() {
    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false

    private var currentWeight:Int = 20

    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var tvHeight:TextView
    private lateinit var rsHeight:RangeSlider
    private lateinit var btnMinusWeight:FloatingActionButton
    private lateinit var btnPlusWeight:FloatingActionButton
    private lateinit var tvWeight:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcactivity)
        initComponents()
        initListeners()
        initUI()
    }

    private fun initComponents(){
        viewMale= findViewById(R.id.viewMale)
        viewFemale= findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        btnMinusWeight = findViewById(R.id.btnMinusWeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        tvWeight = findViewById(R.id.tvWeight)
    }

    private fun initListeners(){
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }

        rsHeight.addOnChangeListener{ _, value, _->
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            tvHeight.text = "$result cm"
        }

        btnPlusWeight.setOnClickListener{
            currentWeight += 1
            setWeight()
        }

        btnMinusWeight.setOnClickListener {
            currentWeight -= 1
            setWeight()
        }
    }

    private fun setWeight(){
        tvWeight.text = currentWeight.toString()
    }

    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor( isSelectedComponent: Boolean) : Int{
        val colorReference = if (isSelectedComponent){
            R.color.deep_sky_blue
        }else{
            R.color.slate_blue
        }
       return ContextCompat.getColor(this, colorReference)

    }

    private fun initUI(){
        setGenderColor()
    }

}

