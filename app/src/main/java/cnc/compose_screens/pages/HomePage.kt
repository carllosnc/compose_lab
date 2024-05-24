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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
          ListItem(
            modifier = Modifier.clickable(
              onClick = { navController.navigate(Routes.MATERIAL_SCREEN) }
            ),
            headlineContent = {
              Text("Material Components")
            },
            leadingContent = {
              FilledIconButton(onClick = { /*TODO*/ }) {
                Icon(
                  imageVector = Icons.Outlined.Android,
                  contentDescription = "Back",
                )
              }
            },
          )
        }
      }
    },
  )
}