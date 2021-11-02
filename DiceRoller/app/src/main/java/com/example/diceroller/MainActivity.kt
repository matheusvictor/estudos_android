package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

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

            // Chama função para "rolar" o dado
            rollDice()
        }
    }

    // Função que exibe um número aleatório, gerado ao clicar o botão
    private fun rollDice() {

        // Gerando número aleatório e armazena na variável imutável randomNumber
        // A função nextInt irá gerar um número entre 0 e 5, por isso soma-se 1
        val randomNumber = Random.nextInt(6) + 1

        // drawableDice irá guardar o valor que receber da expressão when
        val drawableDice = when (randomNumber){
            // A expressão when irá variar a imagem do dado a ser mostrado de acordo com o número
            // aleatório que foi gerado
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // A imagem inicial será o dado com número 1
        val diceImage : ImageView = findViewById(R.id.dice_image)
        // A imagem do dado irá mudar de acordo com o valor que foi obtido na expressão when
        diceImage.setImageResource(drawableDice)
    }
}