package me.lucasleon.urlscrapper.services

import it.skrape.core.htmlDocument
import it.skrape.fetcher.*
import me.lucasleon.urlscrapper.model.dtos.ScrapeResult
import org.springframework.stereotype.Service

@Service
class ScrapperService {
    suspend fun scrapeUrl(urlToScrape: String): ScrapeResult {
        return skrape(AsyncFetcher) {
            request {
                url = urlToScrape
            }

            extractIt {
                htmlDocument {
                    it.html = html
                }
            }
        }
    }
}