package data.remote.dataSource

import data.model.Player
import data.remote.api.NKJaksicApi
import org.lighthousegames.logging.logging

class RemoteDataSourceImpl(private val nkJaksicApi: NKJaksicApi) : RemoteDataSource {
    override suspend fun getAllPlayers(): List<Player> {
        logging("Player________ ${nkJaksicApi.getAllPlayers()}")
        return nkJaksicApi.getAllPlayers()
    }
}
