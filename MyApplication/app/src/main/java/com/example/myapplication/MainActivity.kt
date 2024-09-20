package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var tvRes:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tvRes=findViewById(R.id.tvRes)
    }
    fun calcular(view : View){
        var boton=view as Button
        var textoBoton=boton.text.toString()
        var concatenar=tvRes?.text.toString()+textoBoton
        var mostrar=quitarcerosIzquierda(concatenar)
        if(textoBoton=="="){
            var resultado=0.0
        }

    }

    fun quitarcerosIzquierda(str : String):String{
        var i=0
        while(i<str.length && str[i]=='0')1++
        val sb=StringBuffer(str)
        sb.replace(0,i,"")
        return sb.toString()
    }


}