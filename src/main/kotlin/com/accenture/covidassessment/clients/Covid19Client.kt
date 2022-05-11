package com.accenture.covidassessment.clients

import com.accenture.covidassessment.api.Covid19api
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.context.annotation.Profile

@FeignClient(value = "covid19api", url = "\${app.covid-api-url}")
@Profile("!mock")
interface Covid19Client: Covid19api