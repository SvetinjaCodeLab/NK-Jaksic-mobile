package presentation.screens.team.playerDetails

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import data.model.Player
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun PlayerDetailsInformation(player: Player) {
    Column(modifier = Modifier.padding(8.dp)) {
        Row {
            player.photoUrl?.let {
                KamelImage(
                    asyncPainterResource(it),
                    contentDescription = null,
                    modifier = Modifier.size(125.dp),
                    contentScale = ContentScale.FillBounds
                )
            }
            PlayerSpecificInformation(
                modifier = Modifier.padding(horizontal = 8.dp),
                player = player
            )
        }
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        player.playerDescription?.let {
            Text(it)
        }
    }
}