package presentation.screens.stadium

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class Stadium : Screen {
    @Composable
    override fun Content() {
        StadiumScreen(viewModel = StadiumScreenViewModel())
    }
}