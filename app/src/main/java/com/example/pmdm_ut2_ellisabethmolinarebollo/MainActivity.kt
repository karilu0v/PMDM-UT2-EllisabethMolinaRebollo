package com.example.pmdm_ut2_ellisabethmolinarebollo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pmdm_ut2_ellisabethmolinarebollo.ui.theme.PMDMUT2EllisabethMolinaRebolloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PMDMUT2EllisabethMolinaRebolloTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaActividades()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PMDMUT2EllisabethMolinaRebolloTheme {
        Greeting("Android")
    }
}

@Composable
fun Titulo(texto: String) {
    Text(text = texto)
}

@Composable
fun ActividadItem(
    nombre: String,
    categoria: String,
    modalidad: String
) {
    Column( //coloca sus hijos en forma de columna
        modifier = Modifier.padding(16.dp) //espacio alrededor
    ) {
        Image(
            painter = painterResource(R.drawable.ic_cookie), //que es lo que tiene que dibujar
            contentDescription = "Imagen de la actividad", //describe el contenido
            modifier = Modifier.size(120.dp) //modifica el aspecto
        )
        Text(text = nombre)
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) { //coloca a sus hijos de forma horizontal
            Text(text = categoria)
            Text(text = modalidad)
        }

        Button(
            onClick = {
                println("Botón pulsado")
            }
        ) {
            Text("Ver detalle")
        }
    }
}

@Composable
fun PantallaActividades() {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp) //spacedBy mete espacio entre los elementos
    )
    {
        ActividadItem(
            nombre = "Taller de Android",
            categoria = "Tecnología",
            modalidad = "Presencial"
        )
        ActividadItem(
            nombre = "Taller de Kotlin",
            categoria = "Tecnología",
            modalidad = "Presencial"
        )
        ActividadItem(
            nombre = "Taller deportivo",
            categoria = "Deporte",
            modalidad = "Presencial"
        )
    }
}
