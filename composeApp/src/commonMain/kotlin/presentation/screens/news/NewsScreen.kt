package presentation.screens.news

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun NewsScreen(viewModel: NewsScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    NewsScreenContent(
        uiState = uiState,
        coroutineScope = coroutineScope
    )
}
