package presentation.screens.results

import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun ResultsScreen(viewModel: ResultsScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    ResultScreenContent(
        uiState = uiState,
        scaffoldState = scaffoldState,
        coroutineScope = coroutineScope
    )
}
