package presentation.screens.home

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class Home : Screen {
    @Composable
    override fun Content() {
        HomeScreen(viewModel = HomeScreenViewModel())
    }
}