package com.example.uberfacs

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_painelmotorista.*

class PainelMotoristaActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contexto: Context = this

        btncadastrardiasmotorista.setOnClickListener {
            val int = Intent(contexto,CadastrardiasMotoristaActivity::class.java)
            startActivity(int)
        }

        val contexto1: Context = this

        btncadastrarlocal.setOnClickListener{
            val int2 = Intent(contexto1,CadastrarLocalActivity::class.java)
            startActivity(int2)
        }

        val contexto2: Context = this

        btnsairmotorista.setOnClickListener{
            val int3 = Intent(contexto2,MainActivity::class.java)
            startActivity(int3)
        }
    }
}