package com.accenture.covidassessment.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class RegionCasesInfo(
    val population: Long,
    val confirmed: Long,
    val deaths: Long,
    val continent: String?,
)
