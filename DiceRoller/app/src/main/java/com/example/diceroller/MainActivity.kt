package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's roll!"

        // ao ser clicado, o botão fará...
        rollButton.setOnClickListener {
            // O Toast exibe uma mensagem na tela por um curto período de tempo
            // MainActivity é uma subclasse de Context, por isso usamos o this como parâmetro
            // O Context permite obter informações sobre o estado atual do sistema Android
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}