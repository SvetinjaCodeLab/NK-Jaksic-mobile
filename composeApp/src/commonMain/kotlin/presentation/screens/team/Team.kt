package presentation.screens.team

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class Team : Screen {
    @Composable
    override fun Content() {
        TeamScreen(viewModel = TeamScreenViewModel())
    }
}