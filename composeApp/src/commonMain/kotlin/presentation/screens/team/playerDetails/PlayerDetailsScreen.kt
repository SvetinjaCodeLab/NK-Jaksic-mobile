package presentation.screens.team.playerDetails

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import data.model.Player

@Composable
fun PlayerDetailsScreen(player: Player) {
    val navigator = LocalNavigator.currentOrThrow

    PlayerDetailsScreenContent(
        player = player,
        navigator = navigator
    )
}