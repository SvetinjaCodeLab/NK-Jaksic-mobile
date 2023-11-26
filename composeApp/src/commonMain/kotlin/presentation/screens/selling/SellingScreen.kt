package presentation.screens.selling

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun SellingScreen(viewModel: SellingScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    SellingScreenContent(
        uiState = uiState,
        coroutineScope = coroutineScope
    )
}
