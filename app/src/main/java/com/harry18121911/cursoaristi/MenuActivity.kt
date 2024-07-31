package com.harry18121911.cursoaristi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.harry18121911.cursoaristi.imcapp.IMCActivity
import com.harry18121911.cursoaristi.primeraApp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<AppCompatButton>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<AppCompatButton>(R.id.btnIMCApp)
        btnSaludApp.setOnClickListener { navigateToSaludApp()}
        btnIMCApp.setOnClickListener { navigateIMCApp()}
    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateIMCApp(){
        val intent = Intent(this, IMCActivity::class.java )
        startActivity(intent)
    }

}
