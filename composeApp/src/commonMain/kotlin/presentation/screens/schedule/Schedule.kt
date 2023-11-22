package presentation.screens.schedule

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class Schedule : Screen {
    @Composable
    override fun Content() {
        ScheduleScreen(viewModel = ScheduleScreenViewModel())
    }
}