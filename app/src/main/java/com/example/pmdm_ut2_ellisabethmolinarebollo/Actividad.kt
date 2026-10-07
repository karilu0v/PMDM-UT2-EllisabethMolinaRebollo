package com.example.pmdm_ut2_ellisabethmolinarebollo

data class Actividad(
    val id: Int,
    val nombre: String,
    val categoria: String,
    val descripcion: String,
    val imagen: Int,
    val modalidad: String = "Presencial"
)