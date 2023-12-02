package domain.repository

import data.model.Player

interface TeamRepository {
    suspend fun getAllPlayers(): List<Player>
}