package com.example.composetutorial

//Importando as bibliotecas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview



// bloco de conteúdo e chame a função de composição
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent {
                // a função Text que é definida pela biblioteca de IU
                // do Compose mostra um identificador de texto na tela.
                Text("Hello world!")
            }
        }
    }


// Define se a funcao e composta
@Composable
// testa se a funcao e composta e recebe um nome
// e o usa para configurar o elemento de texto.
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}

// Permite visualizar as funções de composição no Android Studio
// sem precisar criar e instalar o app em um emulador ou dispositivo Android.
// Por esse motivo, não é possível visualizar a função MessageCard diretamente
// Em vez disso, crie uma segunda função nomeada como PreviewMessageCard
// que chama MessageCard com um parâmetro adequado

@Preview(showBackground = true)
// a anotacao previw tenque vir primeiro doq a notacao Composable
@Composable
    fun PreviewMessageCard() {
        MessageCard("Android")
    }

