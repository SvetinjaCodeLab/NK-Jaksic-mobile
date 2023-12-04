package data.model

import kotlinx.serialization.Serializable

@Serializable
data class Article(
    val playerId: Long? = null,
    val firstName: String? = null,
    val lastName: String? = null,
    val dateOfBirth: String? = null,
    val position: String? = null,
    val jerseyNumber: Int? = null,
    val playedGames: Int? = null,
    val playedMinutes: Int? = null,
    val goals: Int? = null,
    val yellowCards: Int? = null,
    val redCards: Int? = null,
    val photoUrl: String? = null,
    val playerDescription: String? = null
)
