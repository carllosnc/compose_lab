package cnc.compose_screens.pages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Android
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material.icons.outlined.TouchApp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import cnc.compose_screens.settings.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
   navController: NavController
) {
   Scaffold(
      topBar = {
         TopAppBar(
            title = {
               Text("Compose Lab")
            }
         )
      },
      content = { innerPadding ->
         Box(
            modifier = Modifier
              .verticalScroll(rememberScrollState())
              .padding(innerPadding)
              .fillMaxSize()
         ) {
            Column(
               modifier = Modifier
                  .fillMaxSize()
            ) {
               MenuItem(
                  onClick = { navController.navigate(Routes.MATERIAL_SCREEN) },
                  text = "Material Components",
                  icon = Icons.Outlined.Android
               )
               MenuItem(
                  onClick = { navController.navigate(Routes.REACTIVITY_SCREEN) },
                  text = "Reactivity",
                  icon = Icons.Outlined.TouchApp
               )
            }
         }
      },
   )
}

@Composable
fun MenuItem(
   onClick: () -> Unit,
   text: String,
   icon: ImageVector = Icons.Outlined.Android
) {
   ListItem(
      modifier = Modifier.clickable(onClick = onClick),
      headlineContent = {
         Text(text)
      },
      leadingContent = {
         FilledIconButton(onClick = { /*TODO*/ }) {
            Icon(
               imageVector = icon,
               contentDescription = "Back",
            )
         }
      },
      trailingContent = {
         Icon(
            imageVector = Icons.Outlined.ChevronRight,
            contentDescription = "Back",
         )
      }
   )
}

