package presentation.screens.stadium

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class StadiumScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(StadiumState())
    val uiState = _uiState.asStateFlow()
}
