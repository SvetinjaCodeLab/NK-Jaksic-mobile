package presentation.composables.drawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
            style = MaterialTheme.typography.bodyLarge,
            overflow = TextOverflow.Ellipsis
        )

        Text(
            text = address,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
    }
}