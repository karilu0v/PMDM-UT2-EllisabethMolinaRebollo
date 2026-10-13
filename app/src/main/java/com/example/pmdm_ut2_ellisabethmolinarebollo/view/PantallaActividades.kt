package com.example.pmdm_ut2_ellisabethmolinarebollo.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pmdm_ut2_ellisabethmolinarebollo.model.Actividad
import com.example.pmdm_ut2_ellisabethmolinarebollo.model.actividadesEjemplo
import com.example.pmdm_ut2_ellisabethmolinarebollo.view.components.ActividadItem


@Composable
fun PantallaActividades(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        items(actividadesEjemplo) { actividad -> //parecido al foreach
            ActividadItem(actividad = actividad)
        }
    }
}