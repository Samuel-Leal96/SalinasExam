package com.example.examplesalinas.data.model

data class ResponseStarWars2Model(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)

data class Result(
    val birth_year: String,
    val created: String,
    val edited: String,
    val eye_color: String,
    val films: List<String>,
    val gender: String,
    val hair_color: String,
    val height: String,
    val homeworld: String,
    val mass: String,
    val name: String,
    val skin_color: String,
    val species: List<String>,
    val starships: List<String>,
    val url: String,
    val vehicles: List<String>
)