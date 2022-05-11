package com.accenture.covidassessment.api

import com.accenture.covidassessment.dto.RegionCasesInfo
import com.accenture.covidassessment.dto.RegionVaccinesInfo
import org.springframework.cache.annotation.Cacheable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

interface Covid19api {
    @GetMapping("/cases")
    @Cacheable(cacheNames = ["covid-cases"], key = "", cacheManager = "covid19cache")
    fun cases(
        @RequestParam
        country: String? = null,
        @RequestParam
        ab: String? = null,
        @RequestParam
        continent: String? = null,
    ): Map<String, Map<String, RegionCasesInfo>>

    @GetMapping("/vaccines")
    @Cacheable(cacheNames = ["covid-vaccines"], key = "", cacheManager = "covid19cache")
    fun vaccines(
        @RequestParam
        country: String? = null,
        @RequestParam
        ab: String? = null,
        @RequestParam
        continent: String? = null,
    ): Map<String, Map<String, RegionVaccinesInfo>>
}


