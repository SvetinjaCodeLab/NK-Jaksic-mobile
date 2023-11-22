package presentation.screens.team

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

object Team : Screen {
    @Composable
    override fun Content() {
        TeamScreen(viewModel = TeamScreenViewModel())
    }
}