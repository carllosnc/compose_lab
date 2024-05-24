package cnc.compose_screens.pages.material

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import cnc.compose_screens.pages.material.components.BottomBarExample
import cnc.compose_screens.pages.material.components.ButtonsExample
import cnc.compose_screens.pages.material.components.CardExample
import cnc.compose_screens.pages.material.components.DrawerContentExample
import cnc.compose_screens.pages.material.components.FloatingButtonExample
import cnc.compose_screens.pages.material.components.IconButtonsExample
import cnc.compose_screens.pages.material.components.ListItemExample
import cnc.compose_screens.pages.material.components.LoadingIndicatorsExample
import cnc.compose_screens.pages.material.components.TextExample
import cnc.compose_screens.pages.material.components.TextFieldExample
import cnc.compose_screens.pages.material.components.TopBarExample
import kotlinx.coroutines.launch

@Composable
@Preview(
  showBackground = true,
  showSystemUi = true,
  device = androidx.compose.ui.tooling.preview.Devices.PIXEL,
)
fun MaterialPage(
        navController: NavController = rememberNavController()
) {
  val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
  val scope = rememberCoroutineScope()

  fun openDrawer() {
    scope.launch {
      drawerState.open()
    }
  }

  ModalNavigationDrawer(
    drawerState = drawerState,
    modifier = Modifier.background(
      color = Color.Red
    ),
    drawerContent = {
      ModalDrawerSheet {
        DrawerContentExample()
      }
    },
  ) {
    Scaffold(
      floatingActionButton = {
        FloatingButtonExample()
      },
      topBar = {
        TopBarExample(
          openDrawer = { openDrawer() }
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
            verticalArrangement = Arrangement.spacedBy(
              space = 20.dp
            ),
            modifier = Modifier
              .padding(
                bottom = 120.dp
              )
              .fillMaxSize()
          ) {
            TextExample()
            HorizontalDivider()
            ButtonsExample()
            HorizontalDivider()
            IconButtonsExample()
            HorizontalDivider()
            TextFieldExample()
            HorizontalDivider()
            ListItemExample()
            HorizontalDivider()
            CardExample()
            HorizontalDivider()
            LoadingIndicatorsExample()
            HorizontalDivider()
          }
        }
      },
      bottomBar = {
        BottomBarExample()
      }
    )
  }
}

