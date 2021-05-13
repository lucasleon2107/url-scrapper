package me.lucasleon.urlscrapper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class UrlScrapperApplication

fun main(args: Array<String>) {
    runApplication<UrlScrapperApplication>(*args)
}
