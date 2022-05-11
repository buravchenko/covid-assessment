package com.accenture.covidassessment.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class RegionVaccinesInfo(
    val people_vaccinated: Long,
)
