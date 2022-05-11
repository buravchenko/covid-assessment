package com.accenture.covidassessment.dto

data class ContinentCombinedInfo(
    val continent: String,
    val population: Long,
    val deaths: Long,
    val people_vaccinated: Long,
    val correlation_between_died_and_vaccinated: String,
)