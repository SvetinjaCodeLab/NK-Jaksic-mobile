package presentation.composables.drawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun DrawerHeader(
    modifier: Modifier = Modifier,
    name: String,
    email: String
) {
    Column(modifier = modifier.fillMaxWidth().padding(vertical = 16.dp)) {
        KamelImage(
            asyncPainterResource(data = "https://upload.wikimedia.org/wikipedia/hr/3/38/NK_Jak%C5%A1i%C4%87_grb.jpg"),
            modifier = Modifier.size(150.dp),
            contentScale = ContentScale.Crop,
            contentDescription = "Navigation drawer club logo."
        )
        Spacer(modifier = Modifier.height(height = 8.dp))
        ClubDrawerDetails(
            name = name,
            address = email
        )

        Spacer(modifier = Modifier.height(height = 16.dp))
        Divider(
            modifier = Modifier.padding(horizontal = 16.dp),
            color = Color.LightGray,
            thickness = 1.dp
        )
    }
}