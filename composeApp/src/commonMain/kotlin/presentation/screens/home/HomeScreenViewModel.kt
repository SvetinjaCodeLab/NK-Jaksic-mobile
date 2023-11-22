package presentation.screens.home

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HomeState())
    val uiState = _uiState.asStateFlow()
}
