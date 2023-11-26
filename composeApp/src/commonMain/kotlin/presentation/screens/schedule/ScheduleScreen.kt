package presentation.screens.schedule

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun ScheduleScreen(viewModel: ScheduleScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    ScheduleScreenContent(
        uiState = uiState,
        coroutineScope = coroutineScope
    )
}
