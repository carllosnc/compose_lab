package cnc.compose_screens.pages.material.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomBarExample() {
   NavigationBar {
      NavigationBarItem(
         icon = {
            Icon(
               imageVector = Icons.Outlined.Home,
               contentDescription = "Home",
            )
         },
         label = { Text("Home") },
         selected = true,
         onClick = { /*TODO*/ }
      )

      NavigationBarItem(
         icon = {
            Icon(
               imageVector = Icons.Outlined.Search,
               contentDescription = "Search",
            )
         },
         label = { Text("Search") },
         selected = false,
         onClick = { /*TODO*/ }
      )

      NavigationBarItem(
         icon = {
            Icon(
               imageVector = Icons.Outlined.Settings,
               contentDescription = "Settings",
            )
         },
         label = { Text("Settings") },
         selected = false,
         onClick = { /*TODO*/ }
      )

      NavigationBarItem(
         icon = {
            BadgedBox(badge = {
               Badge {
                  Text("10")
               }
            }) {
               Icon(
                  imageVector = Icons.Outlined.ShoppingCart,
                  contentDescription = "Products",
               )
            }
         },
         label = { Text("Products") },
         selected = false,
         onClick = { /*TODO*/ }
      )
   }
}