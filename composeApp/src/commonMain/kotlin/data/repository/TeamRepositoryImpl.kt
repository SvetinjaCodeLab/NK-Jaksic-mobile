package data.repository

import data.model.Player
import data.remote.dataSource.RemoteDataSource
import domain.repository.TeamRepository

class TeamRepositoryImpl(private val remoteDataSource: RemoteDataSource) : TeamRepository {
    override suspend fun getAllPlayers(): List<Player> = remoteDataSource.getAllPlayers()
}