package presentation.screens.team.players

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import data.remote.api.NKJaksicApi
import data.remote.dataSource.RemoteDataSourceImpl
import data.repository.TeamRepositoryImpl
import domain.usecase.GetAllPlayersUseCase

class Players : Screen {
    @Composable
    override fun Content() {
        PlayersScreen(
            viewModel = PlayersScreenViewModel(
                getAllPlayersUseCase = GetAllPlayersUseCase(
                    teamRepository = TeamRepositoryImpl(
                        remoteDataSource = RemoteDataSourceImpl(
                            nkJaksicApi = NKJaksicApi()
                        )
                    )
                )
            )
        )
    }
}