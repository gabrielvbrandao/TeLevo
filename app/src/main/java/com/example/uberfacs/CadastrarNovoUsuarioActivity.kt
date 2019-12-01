package com.example.uberfacs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastrar_novo_usuario.*

class CadastrarNovoUsuarioActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_novo_usuario)

        btn_cadastrar_carona.setOnClickListener{
            //Pegando o valor digitado pelo usuario
            val nome = txt_nome_carona
        }
    }
}