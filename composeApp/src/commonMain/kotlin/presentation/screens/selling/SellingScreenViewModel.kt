package presentation.screens.selling

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SellingScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(SellingState())
    val uiState = _uiState.asStateFlow()
}
