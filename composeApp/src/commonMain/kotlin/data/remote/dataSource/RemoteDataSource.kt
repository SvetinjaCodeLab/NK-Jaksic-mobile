package data.remote.dataSource

import data.model.Article
import data.model.Player

interface RemoteDataSource {
    suspend fun getAllPlayers(): List<Player>
    suspend fun getAllArticles(): List<Article>
}
