package com.accenture.covidassessment.webview

import com.accenture.covidassessment.dto.ContinentCombinedInfo
import com.accenture.covidassessment.dto.RegionCombinedInfo
import com.accenture.covidassessment.services.Covid19Service
import com.vaadin.flow.component.grid.ColumnTextAlign
import com.vaadin.flow.component.grid.Grid
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.H3
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route

@PageTitle("Covid19: correlation coefficients between the percentage of people that died and got vaccinated")
@Route
class MainView(
    private val covid19Service: Covid19Service,
) : VerticalLayout() {

    private val covidInfoGrid = Grid(RegionCombinedInfo::class.java, false)
    private val covidInfoGridByContinent = Grid(ContinentCombinedInfo::class.java, false)

    init {
        run {
            add(H2("This webpage shows calculated correlation coefficients between the percentage of people that died and got vaccinated of COVID-19 given a continent or all available countries using the API as described on: https://github.com/M-Media-Group/Covid-19-API"))

            val info: List<RegionCombinedInfo>

            try {
                info = covid19Service.getCombinedInfo()
            } catch (e: Exception) {
                add(Paragraph("Sorry, information is temporary unavailable due to API unavailability"))
                add(Paragraph("Technical error information: ${e.message}"))
                return@run
            }

            val population = info.sumOf { it.population }
            val vaccinated = info.sumOf { it.people_vaccinated }
            val deaths = info.sumOf { it.deaths }
            add(Label("Population of the world: $population"))
            add(Label("Vaccinated against covid-19: $vaccinated"))
            add(Label("Deaths due to covid-19: $deaths"))
            val correlation_between_died_and_vaccinated = deaths.toDouble() / vaccinated
            add(Label("Correlation between died and vaccinated: $correlation_between_died_and_vaccinated"))

            add(H3("Information by continents"))
            add(covidInfoGridByContinent)
            setupCovidInfoGridByContinent()
            listContinentInfo(info)

            add(H3("Information by all available countries"))
            add(covidInfoGrid)
            setupCovidInfoGrid()
            listCovidInfo(info)
        }
    }

    private fun setupCovidInfoGridByContinent() {
        covidInfoGridByContinent.addColumn(ContinentCombinedInfo::continent)
            .setHeader("Continent")
            .apply {
                textAlign = ColumnTextAlign.START
                isAutoWidth = true
            }
        covidInfoGridByContinent.addColumn(ContinentCombinedInfo::correlation_between_died_and_vaccinated)
            .setHeader("Correlation between died and vaccinated")
            .apply {
                textAlign = ColumnTextAlign.END
                isAutoWidth = true
            }
        covidInfoGridByContinent.addColumn(ContinentCombinedInfo::population)
            .setHeader("Population")
            .apply {
                textAlign = ColumnTextAlign.END
                isAutoWidth = true
            }
        covidInfoGridByContinent.addColumn(ContinentCombinedInfo::deaths)
            .setHeader("Deaths")
            .apply {
                textAlign = ColumnTextAlign.END
                isAutoWidth = true
            }
        covidInfoGridByContinent.addColumn(ContinentCombinedInfo::people_vaccinated)
            .setHeader("People vaccinated")
            .apply {
                textAlign = ColumnTextAlign.END
                isAutoWidth = true
            }
    }

    private fun setupCovidInfoGrid() {
        covidInfoGrid.addColumn(RegionCombinedInfo::country)
            .setHeader("Country")
            .apply {
                textAlign = ColumnTextAlign.START
                isAutoWidth = true
            }
        covidInfoGrid.addColumn(RegionCombinedInfo::continent)
            .setHeader("Continent")
            .apply {
                textAlign = ColumnTextAlign.START
                isAutoWidth = true
            }
        covidInfoGrid.addColumn(RegionCombinedInfo::correlation_between_died_and_vaccinated)
            .setHeader("Correlation between died and vaccinated")
            .apply {
                textAlign = ColumnTextAlign.END
                isAutoWidth = true
            }
        covidInfoGrid.addColumn(RegionCombinedInfo::population)
            .setHeader("Population")
            .apply {
                textAlign = ColumnTextAlign.END
                isAutoWidth = true
            }
        covidInfoGrid.addColumn(RegionCombinedInfo::deaths)
            .setHeader("Deaths")
            .apply {
                textAlign = ColumnTextAlign.END
                isAutoWidth = true
            }
        covidInfoGrid.addColumn(RegionCombinedInfo::people_vaccinated)
            .setHeader("People vaccinated")
            .apply {
                textAlign = ColumnTextAlign.END
                isAutoWidth = true
            }
    }

    private fun listContinentInfo(info: List<RegionCombinedInfo>) {
        val vaccinatedByContinent = info.groupingBy { it.continent }.fold(0L) { acc, elem -> acc + elem.people_vaccinated }
        val deathsByContinent = info.groupingBy { it.continent }.fold(0L) { acc, elem -> acc + elem.deaths }
        val populationByContinent = info.groupingBy { it.continent }.fold(0L) { acc, elem -> acc + elem.population }
        val coeffByContinent = deathsByContinent.mapValues { deaths ->
            vaccinatedByContinent[deaths.key]
                ?.takeIf { it != 0L }
                ?.let { vaccinated ->
                    deaths.value.toDouble() / vaccinated
                }
                ?.let { it.toString() }
                ?: "Unknown"
        }
        val continentInfo = coeffByContinent.map { coeff ->
            ContinentCombinedInfo(
                continent = coeff.key,
                population = populationByContinent[coeff.key]!!,
                deaths = deathsByContinent[coeff.key]!!,
                people_vaccinated = vaccinatedByContinent[coeff.key]!!,
                correlation_between_died_and_vaccinated = coeff.value
            )
        }
        covidInfoGridByContinent.setItems(continentInfo)
    }

    private fun listCovidInfo(info: List<RegionCombinedInfo>) {
        covidInfoGrid.setItems(info)
    }

}