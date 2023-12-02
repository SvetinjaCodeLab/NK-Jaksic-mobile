package presentation.screens.team

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import data.remote.api.NKJaksicApi
import data.remote.dataSource.RemoteDataSourceImpl
import data.repository.TeamRepositoryImpl
import domain.usecase.GetAllPlayersUseCase

class Team : Screen {
    @Composable
    override fun Content() {
        TeamScreen(
            viewModel = TeamScreenViewModel(
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