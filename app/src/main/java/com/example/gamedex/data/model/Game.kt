package com.example.gamedex.data.model

data class Game(
    val id: Int,
    val title: String,
    val category: String,
    val imageUrl: String,
    val description: String,
    val releaseYear: Int,
    val developer: String,
    val rating: Double,
    val platforms: List<String>
)
