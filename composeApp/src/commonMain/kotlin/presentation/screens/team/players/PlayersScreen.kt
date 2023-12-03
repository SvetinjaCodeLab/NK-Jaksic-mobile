package presentation.screens.team.players

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

@Composable
fun PlayersScreen(viewModel: PlayersScreenViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()
    val navigator = LocalNavigator.currentOrThrow
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    PlayersScreenContent(
        uiState = uiState,
        coroutineScope = coroutineScope,
        navigator = navigator,
        drawerState = drawerState
    )
}
