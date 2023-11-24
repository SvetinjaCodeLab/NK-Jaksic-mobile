package presentation.composables.drawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.AccountBox
import androidx.compose.material.icons.twotone.ArrowBack
import androidx.compose.material.icons.twotone.Build
import androidx.compose.material.icons.twotone.Done
import androidx.compose.material.icons.twotone.Face
import androidx.compose.material.icons.twotone.Home
import androidx.compose.material.icons.twotone.Info
import androidx.compose.material.icons.twotone.Send
import androidx.compose.material.icons.twotone.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen

@Composable
fun DrawerContent(
    modifier: Modifier = Modifier,
    clickedScreen: Screen,
    onItemClick: (clickedScreen: Screen) -> Unit
) {
    Column {
        DrawerHeader(
            name = "NK Jakšić",
            email = "Jakšić 1, 34308"
        )
        DrawerItem(
            text = "Home",
            icon = Icons.TwoTone.Home,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "News",
            icon = Icons.TwoTone.Info,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Results",
            icon = Icons.TwoTone.AccountBox,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Schedule",
            icon = Icons.TwoTone.Settings,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Table",
            icon = Icons.TwoTone.Face,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Team",
            icon = Icons.TwoTone.Done,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Fans",
            icon = Icons.TwoTone.Face,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Stadium",
            icon = Icons.TwoTone.Build,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Selling",
            icon = Icons.TwoTone.Send,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Feedback",
            icon = Icons.TwoTone.Info,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
        Spacer(modifier = Modifier.weight(1f))
        DrawerItem(
            text = "Logout",
            icon = Icons.TwoTone.ArrowBack,
            clickedScreen = clickedScreen,
            onItemClick = onItemClick
        )
    }
}