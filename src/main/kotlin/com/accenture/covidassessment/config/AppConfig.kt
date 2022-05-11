package com.accenture.covidassessment.config

import com.github.benmanes.caffeine.cache.Caffeine
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cache.caffeine.CaffeineCacheManager
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(AppProps::class)
@EnableFeignClients(basePackages = ["com.accenture.covidassessment.clients"])
@EnableCaching
class AppConfig(
    val appProps: AppProps,
) {
    @Bean
    fun caffeineConfig(): Caffeine<Any, Any> {
        return Caffeine.newBuilder().expireAfterWrite(appProps.covidCacheTtl)
    }

    @Bean
    fun covid19cache(caffeine: Caffeine<Any, Any>): CaffeineCacheManager {
        return CaffeineCacheManager().apply {
            setCaffeine(caffeine)
        }
    }
}