package presentation.screens.feedback

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun FeedbackScreen(viewModel: FeedbackScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    FeedbackScreenContent(
        uiState = uiState,
        coroutineScope = coroutineScope
    )
}
