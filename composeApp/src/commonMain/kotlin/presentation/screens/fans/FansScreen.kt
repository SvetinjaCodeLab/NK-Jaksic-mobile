package presentation.screens.fans

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun FansScreen(viewModel: FansScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    FansScreenContent(
        uiState = uiState,
        coroutineScope = coroutineScope
    )
}
