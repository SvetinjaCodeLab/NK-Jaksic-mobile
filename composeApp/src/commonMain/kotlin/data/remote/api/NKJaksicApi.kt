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
    private val httpClient = HttpClient {
        defaultRequest {
            url("http://10.0.2.2:8080/")
        }
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    suspend fun getAllPlayers(): List<Player> = httpClient.get("players").body()
}