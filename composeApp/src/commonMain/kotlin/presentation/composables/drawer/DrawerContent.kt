package presentation.composables.drawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import cafe.adriel.voyager.core.screen.Screen
import presentation.screens.fans.Fans
import presentation.screens.feedback.Feedback
import presentation.screens.home.Home
import presentation.screens.news.News
import presentation.screens.results.Results
import presentation.screens.schedule.Schedule
import presentation.screens.selling.Selling
import presentation.screens.stadium.Stadium
import presentation.screens.table.Table
import presentation.screens.team.players.Players

@Composable
fun DrawerContent(
    modifier: Modifier = Modifier,
    onItemClick: (clickedScreen: Screen) -> Unit
) {
    Column {
        DrawerHeader(
            name = "NK Jakšić",
            email = "Jakšić 1, 34308"
        )
        DrawerItem(
            text = "Početna",
            icon = Icons.TwoTone.Home,
            screen = Home,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Vijesti",
            icon = Icons.TwoTone.Info,
            screen = News(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Rezultati",
            icon = Icons.TwoTone.AccountBox,
            screen = Results(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Raspored",
            icon = Icons.TwoTone.Settings,
            screen = Schedule(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Tablica",
            icon = Icons.TwoTone.Face,
            screen = Table(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Ekipa",
            icon = Icons.TwoTone.Done,
            screen = Players(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Navijači",
            icon = Icons.TwoTone.Face,
            screen = Fans(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Stadion",
            icon = Icons.TwoTone.Build,
            screen = Stadium(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Prodaja",
            icon = Icons.TwoTone.Send,
            screen = Selling(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Povratna informacija",
            icon = Icons.TwoTone.Info,
            screen = Feedback(),
            onItemClick = onItemClick
        )
        Spacer(modifier = Modifier.weight(1f))
        DrawerItem(
            text = "Logout",
            icon = Icons.TwoTone.ArrowBack,
            screen = Players(),
            onItemClick = onItemClick
        )
    }
}