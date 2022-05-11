package com.accenture.covidassessment.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import java.time.Duration

@ConstructorBinding
@ConfigurationProperties("app")
data class AppProps(
    val covidApiUrl: String,
    val covidCacheTtl: Duration,
)
