package com.example.uberfacs

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contextoAtual: Context = this

        val btnLoginNovoUsuario = findViewById<Button>(R.id.btn_novo_usuario)

        btnLoginNovoUsuario.setOnClickListener {
            val intent = Intent(contextoAtual
                ,CadastrardiasMotoristaActivity::class.java)
            startActivity(intent)
        }
    }
}
