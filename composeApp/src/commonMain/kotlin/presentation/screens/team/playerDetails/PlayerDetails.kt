package presentation.screens.team.playerDetails

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import data.model.Player

data class PlayerDetails(val player: Player) : Screen {
    @Composable
    override fun Content() {
        PlayerDetailsScreen(player = player)
    }
}