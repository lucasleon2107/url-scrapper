package me.lucasleon.urlscrapper.services

import it.skrape.core.htmlDocument
import it.skrape.fetcher.HttpFetcher
import it.skrape.fetcher.expectBlocking
import it.skrape.fetcher.skrape
import org.springframework.stereotype.Service

@Service
class ScrapperService {
    fun scrapeUrl(urlToScrape: String): String {
        var htmlString = ""

        skrape(HttpFetcher) {
            request {
                url = urlToScrape
            }

            expectBlocking {
                htmlDocument {
                    htmlString = html
                }
            }
        }

        return htmlString
    }
}