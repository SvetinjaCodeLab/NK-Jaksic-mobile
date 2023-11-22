package presentation.screens.table

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class TableScreenViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(TableState())
    val uiState = _uiState.asStateFlow()
}
