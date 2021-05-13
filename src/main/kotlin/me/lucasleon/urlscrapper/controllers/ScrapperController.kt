package me.lucasleon.urlscrapper.controllers

import me.lucasleon.urlscrapper.services.ScrapperService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ScrapperController(private val scrapperService: ScrapperService) {

    @GetMapping
    fun scrapeUrl(@RequestParam url: String): String {
        return scrapperService.scrapeUrl(url)
    }
}