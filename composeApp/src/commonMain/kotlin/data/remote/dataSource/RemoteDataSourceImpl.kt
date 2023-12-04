package data.remote.dataSource

import data.model.Article
import data.model.Player
import data.remote.api.NKJaksicApi
import org.lighthousegames.logging.logging

class RemoteDataSourceImpl(private val nkJaksicApi: NKJaksicApi) : RemoteDataSource {
    override suspend fun getAllPlayers(): List<Player> = nkJaksicApi.getAllPlayers()
    override suspend fun getAllArticles(): List<Article> = nkJaksicApi.getAllArticles()
}
