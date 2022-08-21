package me.lucasleon.urlscrapper.controllers

import me.lucasleon.urlscrapper.model.dtos.ScrapeResult
import me.lucasleon.urlscrapper.services.ScrapperService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
class ScrapperController(private val scrapperService: ScrapperService) {

    @GetMapping
    suspend fun scrapeUrl(@RequestParam url: String): ScrapeResult {
        return scrapperService.scrapeUrl(url)
    }
}