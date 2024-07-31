package com.harry18121911.cursoaristi.primeraApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.harry18121911.cursoaristi.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnPulsame = findViewById<Button>(R.id.btnPulsame)
        val editBtn = findViewById<AppCompatEditText>(R.id.editButton)
        btnPulsame.setOnClickListener {
            val name = editBtn.text.toString()
            if (name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }

        }
    }
    }