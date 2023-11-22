package presentation.screens.team

import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun TeamScreen(viewModel: TeamScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    TeamScreenContent(
        uiState = uiState,
        scaffoldState = scaffoldState,
        coroutineScope = coroutineScope
    )
}
