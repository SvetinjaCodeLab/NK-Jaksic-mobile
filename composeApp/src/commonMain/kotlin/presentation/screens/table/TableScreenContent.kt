package presentation.screens.table

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import presentation.composables.drawer.DrawerContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TableScreenContent(
    uiState: TableState,
    coroutineScope: CoroutineScope,
    navigator: Navigator,
    drawerState: DrawerState
) {
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent { clickedScreen ->
                    navigator.push(clickedScreen)
                }
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Tablica") },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(0xFF6e9ee0),
                        titleContentColor = Color.White
                    ),
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Table screen menu icon",
                                tint = Color.White
                            )
                        }
                    }
                )
            },
            content = {}
        )
    }
}