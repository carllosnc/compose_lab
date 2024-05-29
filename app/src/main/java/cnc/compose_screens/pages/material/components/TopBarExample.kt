package cnc.compose_screens.pages.material.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarExample(
   openDrawer: () -> Unit,
) {
   TopAppBar(
      navigationIcon = {
         IconButton(onClick = {
            openDrawer()
         }) {
            Icon(
               imageVector = Icons.Default.Menu,
               contentDescription = "Back",
            )
         }
      },
      actions = {
         TopBarActionsExample()
      },
      title = {
         Text(
            "Compose Screens",
            fontSize = 20.sp
         )
      }
   )
}