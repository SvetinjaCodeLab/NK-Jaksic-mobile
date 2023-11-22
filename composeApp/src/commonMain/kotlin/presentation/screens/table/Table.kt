package presentation.screens.table

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class Table : Screen {
    @Composable
    override fun Content() {
        TableScreen(viewModel = TableScreenViewModel())
    }
}