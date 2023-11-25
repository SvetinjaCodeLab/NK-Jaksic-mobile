package presentation.screens.home

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

object Home : Screen {
    @Composable
    override fun Content() {
        HomeScreen(viewModel = HomeScreenViewModel())
    }
}