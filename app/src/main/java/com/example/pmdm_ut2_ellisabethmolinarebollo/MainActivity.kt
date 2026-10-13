package com.example.pmdm_ut2_ellisabethmolinarebollo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pmdm_ut2_ellisabethmolinarebollo.model.actividadesEjemplo
import com.example.pmdm_ut2_ellisabethmolinarebollo.ui.theme.PMDMUT2EllisabethMolinaRebolloTheme
import com.example.pmdm_ut2_ellisabethmolinarebollo.view.PantallaActividades
import com.example.pmdm_ut2_ellisabethmolinarebollo.view.PantallaDetalle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PMDMUT2EllisabethMolinaRebolloTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaDetalle(
                        modifier = Modifier.padding(innerPadding),
                        actividad = actividadesEjemplo[0],
                        onInscribirse = {
                            println("Inscribirse")
                        }
                    )

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

