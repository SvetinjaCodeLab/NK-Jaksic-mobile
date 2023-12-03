package presentation.screens.team.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import data.model.Player

@Composable
fun PlayersList(playersList: List<Player>) {
    LazyColumn {
        items(count = playersList.size) { index ->
            PlayerCard(playersList[index])
        }
    }
}
