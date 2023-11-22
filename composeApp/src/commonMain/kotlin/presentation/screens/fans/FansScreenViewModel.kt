package presentation.screens.fans

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FansScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(FansState())
    val uiState = _uiState.asStateFlow()
}
