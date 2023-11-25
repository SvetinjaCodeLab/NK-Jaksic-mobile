package presentation.composables.drawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun ClubDrawerDetails(
    modifier: Modifier = Modifier,
    name: String,
    address: String
) {
    Column(modifier = modifier.padding(start = 16.dp)) {
        Text(
            text = name.trim(),
            style = MaterialTheme.typography.h6,
            overflow = TextOverflow.Ellipsis
        )

        Text(
            text = address,
            style = MaterialTheme.typography.h6,
            color = Color.Gray
        )
    }
}