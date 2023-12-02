package data.remote.api

import data.model.Player
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.get
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.logger.Level
import org.koin.core.logger.Logger
import org.lighthousegames.logging.logging

class NKJaksicApi {
    companion object {
        val log = logging()
    }

    private val httpClient = HttpClient {
        // defaultRequest {
        //     host = "https://10.0.2.2:8080/"
        //     url { protocol = URLProtocol.HTTPS }
        // }
        install(ContentNegotiation) {
            json(Json {
                // ignoreUnknownKeys = true
                // useAlternativeNames = false
            })
        }
    }

    suspend fun getAllPlayers(): List<Player> {
        try {
            return httpClient.get("http://10.0.2.2:8080/players").body()
        } catch (exception: Exception) {
            log.d { "Error message: ${exception.message}" }
        }
        return emptyList()
    }
}