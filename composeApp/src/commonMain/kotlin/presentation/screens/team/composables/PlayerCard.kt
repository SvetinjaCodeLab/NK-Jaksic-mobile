package presentation.screens.team.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.model.Player
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun PlayerCard(player: Player) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        modifier = Modifier.fillMaxWidth().padding(8.dp)
    ) {
        Row {
            player.photoUrl?.let {
                KamelImage(
                    asyncPainterResource(it),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column {
                Text(
                    text = "${player.firstName} ${player.lastName}",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Pozicija: ${player.position}",
                    modifier = Modifier.padding(start = 8.dp),
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = "Broj dresa: ${player.jerseyNumber}",
                    modifier = Modifier.padding(start = 8.dp),
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}
