package presentation.screens.news

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class NewsScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(NewsState())
    val uiState = _uiState.asStateFlow()
}
