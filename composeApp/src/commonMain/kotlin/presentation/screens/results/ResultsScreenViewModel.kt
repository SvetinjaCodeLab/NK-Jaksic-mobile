package presentation.screens.results

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ResultsScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(ResultsState())
    val uiState = _uiState.asStateFlow()
}
