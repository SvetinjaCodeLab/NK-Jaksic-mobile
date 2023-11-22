package presentation.screens.results

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class Results : Screen {
    @Composable
    override fun Content() {
        ResultsScreen(viewModel = ResultsScreenViewModel())
    }
}