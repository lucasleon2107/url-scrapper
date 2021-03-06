package me.lucasleon.urlscrapper.services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class ScrapperServiceTest {

    @Autowired
    lateinit var scrapperService: ScrapperService

    @Test
    fun `should scrape url` () {
        assertNotNull(scrapperService.scrapeUrl("https://www.google.com"))
    }
}