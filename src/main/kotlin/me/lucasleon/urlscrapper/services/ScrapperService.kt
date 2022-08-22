package me.lucasleon.urlscrapper.services

import it.skrape.core.htmlDocument
import it.skrape.fetcher.HttpFetcher
import it.skrape.fetcher.extractItBlocking
import it.skrape.fetcher.skrape
import me.lucasleon.urlscrapper.model.dtos.ScrapeResult
import org.springframework.stereotype.Service

@Service
class ScrapperService {
    fun scrapeUrl(urlToScrape: String): ScrapeResult {
        return skrape(HttpFetcher) {
            request {
                url = urlToScrape
            }

            extractItBlocking {
                htmlDocument {
                    it.html = html
                }
            }
        }
    }
}