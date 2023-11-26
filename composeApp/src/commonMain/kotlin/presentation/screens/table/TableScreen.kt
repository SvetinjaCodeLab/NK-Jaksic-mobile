package presentation.screens.table

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun TableScreen(viewModel: TableScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    TableScreenContent(
        uiState = uiState,
        coroutineScope = coroutineScope
    )
}
