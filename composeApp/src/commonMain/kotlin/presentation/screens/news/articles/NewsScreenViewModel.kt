package presentation.screens.news.articles

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import domain.usecase.GetAllArticlesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NewsScreenViewModel(private val getAllArticlesUseCase: GetAllArticlesUseCase) : ViewModel() {
    private val _uiState = MutableStateFlow(NewsState())
    val uiState = _uiState.asStateFlow()

    init {
        getAllArticles()
    }

    private fun getAllArticles() {
        viewModelScope.launch {
            _uiState.update { it.copy(articlesList = getAllArticlesUseCase.invoke()) }
        }
    }
}
