package presentation.screens.feedback

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FeedbackScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(FeedbackState())
    val uiState = _uiState.asStateFlow()
}
