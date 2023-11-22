package presentation.screens.news

import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.CoroutineScope

@Composable
fun NewsScreenContent(
    uiState: NewsState,
    scaffoldState: ScaffoldState,
    coroutineScope: CoroutineScope
) {
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = { Text("News Screen") },
                backgroundColor = Color.LightGray
            )
        },
        content = {}
    )
}