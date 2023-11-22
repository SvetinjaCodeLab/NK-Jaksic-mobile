package presentation.screens.feedback

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class Feedback : Screen {
    @Composable
    override fun Content() {
        FeedbackScreen(viewModel = FeedbackScreenViewModel())
    }
}