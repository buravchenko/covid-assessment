package com.accenture.covidassessment.services

import com.accenture.covidassessment.api.Covid19api
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("mock")
class Covid19ServiceTest(
    @Autowired
    val covid19Service: Covid19Service,
    @Autowired
    val covid19api: Covid19api,
) {
    @Test
    fun `getCombinedInfo combines data properly`() {
        val combinedData = covid19Service.getCombinedInfo()
        val vaccines = covid19api.vaccines()
        val vaccinatedFromCombinedData = combinedData.sumOf { it.people_vaccinated }
        val vaccinatedFromApi = vaccines.asSequence().sumOf { it.value[API_ALL]?.people_vaccinated ?: 0 }
        assertThat(vaccinatedFromCombinedData, equalTo(vaccinatedFromApi))
    }
}