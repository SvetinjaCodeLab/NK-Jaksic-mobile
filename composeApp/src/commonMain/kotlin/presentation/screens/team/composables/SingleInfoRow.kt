package presentation.screens.team.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SingleInfoRow(label: String, value: String) {
    Row {
        Text(
            text = label,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = value,
            fontSize = 18.sp,
            fontWeight = FontWeight.Light
        )
    }
}