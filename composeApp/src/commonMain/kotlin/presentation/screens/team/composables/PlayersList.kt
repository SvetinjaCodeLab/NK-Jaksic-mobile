package presentation.screens.team.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import data.model.Player
import presentation.screens.team.playerDetails.PlayerDetails

@Composable
fun PlayersList(
    playersList: List<Player>,
    navigator: Navigator
) {
    LazyColumn {
        items(count = playersList.size) { index ->
            PlayerCard(
                player = playersList[index],
                onItemClick = { player ->
                    navigator.push(PlayerDetails(player))
                }
            )
        }
    }
}
