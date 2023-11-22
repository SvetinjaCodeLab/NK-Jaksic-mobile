package presentation.screens.fans

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class Fans : Screen {
    @Composable
    override fun Content() {
        FansScreen(viewModel = FansScreenViewModel())
    }
}