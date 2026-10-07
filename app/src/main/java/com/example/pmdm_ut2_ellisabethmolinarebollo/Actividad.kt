package com.example.pmdm_ut2_ellisabethmolinarebollo

data class Actividad(
    val id: Int,
    val nombre: String,
    val categoria: String,
    val descripcion: String,
    val imagen: Int,
    val modalidad: String = "Presencial"
)

val actividadesEjemplo = listOf(
    Actividad(
        id = 1,
        nombre = "Taller de Android",
        categoria = "Tecnología",
        descripcion = "Construye tu primera aplicación con Compose.",
        imagen = R.drawable.ic_cookie
    ),
    Actividad(
        id = 2,
        nombre = "Ruta de senderismo",
        categoria = "Deporte",
        descripcion = "Recorre una ruta sencilla en grupo.",
        imagen = R.drawable.ic_cookie
    ),
    Actividad(
        id = 3,
        nombre = "Fotografía con el móvil",
        categoria = "Arte",
        descripcion = "Practica encuadres y composición.",
        imagen = R.drawable.ic_cookie
    ),
    Actividad(
        id = 4,
        nombre = "Modelado 3D",
        categoria = "Arte",
        descripcion = "Modela entornos en 3D.",
        imagen = R.drawable.ic_cookie
    ),
    Actividad(
        id = 5,
        nombre = "Ilustración digital",
        categoria = "Arte",
        descripcion = "Aprende a dibujar en digital.",
        imagen = R.drawable.ic_cookie
    ),
    Actividad(
        id = 6,
        nombre = "Texturizado modelos 3D",
        categoria = "Arte",
        descripcion = "Aprende a texturizar modelos 3D.",
        imagen = R.drawable.ic_cookie
    )
)