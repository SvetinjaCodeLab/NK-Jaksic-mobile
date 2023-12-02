package data.remote.dataSource

import data.model.Player

interface RemoteDataSource {
    suspend fun getAllPlayers(): List<Player>
}
