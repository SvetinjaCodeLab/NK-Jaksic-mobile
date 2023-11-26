package presentation.screens.results

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun ResultsScreen(viewModel: ResultsScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    ResultScreenContent(
        uiState = uiState,
        coroutineScope = coroutineScope
    )
}
