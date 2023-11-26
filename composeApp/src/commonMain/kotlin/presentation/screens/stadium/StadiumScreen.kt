package presentation.screens.stadium

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun StadiumScreen(viewModel: StadiumScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    StadiumScreenContent(
        uiState = uiState,
        coroutineScope = coroutineScope
    )
}
