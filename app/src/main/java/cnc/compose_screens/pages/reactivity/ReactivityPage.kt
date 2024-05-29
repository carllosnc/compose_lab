package cnc.compose_screens.pages.reactivity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import cnc.compose_screens.pages.reactivity.components.DerivedStateExample
import cnc.compose_screens.pages.reactivity.components.MutableStateExample
import cnc.compose_screens.pages.reactivity.components.SharingStateExample
import cnc.compose_screens.pages.reactivity.components.SideEffectsExample

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReactivityPage(
   navController: NavController = rememberNavController()
) {
   Scaffold(
      topBar = {
         TopAppBar(
            title = {
               Text("Reactivity")
            }
         )
      },
      content = { innerPadding ->
         Box(
            modifier = Modifier
               .fillMaxSize()
               .padding(innerPadding),
            contentAlignment = Alignment.TopCenter,
         ) {
            Column(
               verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
               MutableStateExample()
               HorizontalDivider()
               SharingStateExample()
               HorizontalDivider()
               DerivedStateExample()
               HorizontalDivider()
               SideEffectsExample()
               HorizontalDivider()
            }
         }
      }
   )
}
