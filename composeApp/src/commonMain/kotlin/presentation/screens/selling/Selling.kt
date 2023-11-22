package presentation.screens.selling

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class Selling : Screen {
    @Composable
    override fun Content() {
        SellingScreen(viewModel = SellingScreenViewModel())
    }
}