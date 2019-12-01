package com.example.uberfacs

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_painel.*
import kotlinx.android.synthetic.main.activity_painelmotorista.*

class PainelCaronaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contexto: Context = this

        btncadastrardias.setOnClickListener{
            val int = Intent(contexto, CadastrardiasActivity::class.java)
            startActivity(int)
        }

        btncaronacampus.setOnClickListener{
            val int2 = Intent(contexto, EncontrarMotoristaActivity::class.java)
            startActivity(int2)
        }

        btncaronaregiao.setOnClickListener{
            val int2 = Intent(contexto,EncontrarMotoristaActivity::class.java)
            startActivity(int2)
        }

        btnsairpainelaluno.setOnClickListener{
            val mainPage = Intent(contexto,MainActivity::class.java)
            startActivity(mainPage)
        }
    }
}