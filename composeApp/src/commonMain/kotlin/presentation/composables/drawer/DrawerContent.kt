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
import presentation.screens.team.Team

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
            text = "Home",
            icon = Icons.TwoTone.Home,
            screen = Home,
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "News",
            icon = Icons.TwoTone.Info,
            screen = News(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Results",
            icon = Icons.TwoTone.AccountBox,
            screen = Results(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Schedule",
            icon = Icons.TwoTone.Settings,
            screen = Schedule(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Table",
            icon = Icons.TwoTone.Face,
            screen = Table(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Team",
            icon = Icons.TwoTone.Done,
            screen = Team(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Fans",
            icon = Icons.TwoTone.Face,
            screen = Fans(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Stadium",
            icon = Icons.TwoTone.Build,
            screen = Stadium(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Selling",
            icon = Icons.TwoTone.Send,
            screen = Selling(),
            onItemClick = onItemClick
        )
        DrawerItem(
            text = "Feedback",
            icon = Icons.TwoTone.Info,
            screen = Feedback(),
            onItemClick = onItemClick
        )
        Spacer(modifier = Modifier.weight(1f))
        DrawerItem(
            text = "Logout",
            icon = Icons.TwoTone.ArrowBack,
            screen = Team(),
            onItemClick = onItemClick
        )
    }
}