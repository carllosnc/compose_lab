package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DrawerContentExample() {
   Column(
      verticalArrangement = Arrangement.spacedBy(2.dp),
      modifier = Modifier
         .padding(20.dp)
   ) {
      NavigationDrawerItem(
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

      NavigationDrawerItem(
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

      NavigationDrawerItem(
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

      NavigationDrawerItem(
         icon = {
            BadgedBox(
               badge = {
                  Badge(
                     modifier = Modifier
                       .width(10.dp)
                       .height(10.dp),
                  ) {
                  }
               }
            ) {
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