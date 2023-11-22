package presentation.screens.home

import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun HomeScreen(viewModel: HomeScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    HomeScreenContent(
        uiState = uiState,
        scaffoldState = scaffoldState,
        coroutineScope = coroutineScope
    )
}
