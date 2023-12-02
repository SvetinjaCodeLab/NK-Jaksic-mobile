package presentation.screens.team

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import domain.usecase.GetAllPlayersUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class TeamScreenViewModel(private val getAllPlayersUseCase: GetAllPlayersUseCase) : ViewModel() {
    private val _uiState = MutableStateFlow(TeamState())
    val uiState = _uiState.asStateFlow()

    private fun getAllPlayers() {
        viewModelScope.launch {
            _uiState.update { it.copy(playersList = getAllPlayersUseCase.invoke()) }
        }
    }

    init {
        getAllPlayers()
    }

}
