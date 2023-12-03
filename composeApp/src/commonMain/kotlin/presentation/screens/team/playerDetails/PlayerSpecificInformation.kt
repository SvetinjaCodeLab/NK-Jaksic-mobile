package presentation.screens.team.playerDetails

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.model.Player
import presentation.screens.team.composables.SingleInfoRow

@Composable
fun PlayerSpecificInformation(
    modifier: Modifier = Modifier,
    player: Player
) {
    Column(modifier = modifier) {
        SingleInfoRow(label = "Ime: ", value = "${player.firstName} ${player.lastName}")
        SingleInfoRow(label = "Datum rođenja: ", value = "${player.dateOfBirth}")
        SingleInfoRow(label = "Pozicija: ", value = "${player.position}")
        SingleInfoRow(label = "Broj dresa: ", value = "${player.jerseyNumber}")
        SingleInfoRow(label = "Odigrane utakmice: ", value = "${player.playedGames}")
        SingleInfoRow(label = "Odigrane minute: ", value = "${player.playedMinutes}")
        SingleInfoRow(label = "Golovi: ", value = "${player.goals}")
        SingleInfoRow(label = "Žuti kartoni: ", value = "${player.yellowCards}")
        SingleInfoRow(label = "Crveni kartoni: ", value = "${player.redCards}")
    }
}