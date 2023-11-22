package presentation.screens.news

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class News : Screen {
    @Composable
    override fun Content() {
        NewsScreen(viewModel = NewsScreenViewModel())
    }
}