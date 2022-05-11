package com.accenture.covidassessment.services

import com.accenture.covidassessment.api.Covid19api
import com.accenture.covidassessment.dto.RegionCombinedInfo
import org.springframework.stereotype.Service

const val API_GLOBAL = "Global"
const val API_ALL = "All"
const val WEBVIEW_CONTINENT_UNKNOWN = "Unknown"

@Service
class Covid19Service(
    val covid19api: Covid19api
) {
    fun getCombinedInfo(): List<RegionCombinedInfo> {
        val cases = covid19api.cases()
        val vaccines = covid19api.vaccines()
        return cases.mapNotNull {
            val country = it.key
            if (country == API_GLOBAL) return@mapNotNull null
            val countryInfo = it.value[API_ALL] ?: return@mapNotNull null
            val vaccinesInfo = vaccines[country]?.get(API_ALL)
            val peopleVaccinated = vaccinesInfo?.people_vaccinated ?: 0
            RegionCombinedInfo(
                country = country,
                population = countryInfo.population,
                deaths = countryInfo.deaths,
                continent = countryInfo.continent ?: WEBVIEW_CONTINENT_UNKNOWN,
                people_vaccinated = peopleVaccinated,
                correlation_between_died_and_vaccinated =
                if (peopleVaccinated != 0L)
                    countryInfo.deaths.toDouble() / peopleVaccinated
                else
                    null
            )
        }
    }

}