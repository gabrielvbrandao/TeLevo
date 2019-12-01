package com.example.uberfacs

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_novo_usuario.setOnClickListener {
            val intent = Intent(this, CadastrarNovoUsuarioActivity::class.java)
            startActivity(intent)
        }
    }
}
