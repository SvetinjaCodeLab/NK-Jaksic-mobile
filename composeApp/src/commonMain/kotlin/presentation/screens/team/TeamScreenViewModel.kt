package presentation.screens.team

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class TeamScreenViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(TeamState())
    val uiState = _uiState.asStateFlow()
}
