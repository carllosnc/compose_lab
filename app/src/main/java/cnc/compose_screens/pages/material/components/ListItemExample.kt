package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBalanceWallet
import androidx.compose.material.icons.outlined.AirportShuttle
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ListItemExample() {
   Column(
      modifier = Modifier
         .fillMaxWidth(),
   ) {
      ListItem(
         modifier = Modifier
           .fillMaxWidth()
           .clickable(onClick = { /*TODO*/ }),
         headlineContent = {
            Text("List item Example")
         },
         overlineContent = {
            Text("Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.")
         },
         leadingContent = {
            FilledIconButton(onClick = { /*TODO*/ }) {
               Icon(
                  imageVector = Icons.Outlined.AccountBalanceWallet,
                  contentDescription = "Back",
               )
            }
         },
      )

      ListItem(
         modifier = Modifier
           .fillMaxWidth()
           .clickable(onClick = { /*TODO*/ }),
         headlineContent = {
            Text("List item Example")
         },
         supportingContent = {
            Text("Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator.")
         },
         leadingContent = {
            OutlinedIconButton(onClick = { /*TODO*/ }) {
               Icon(
                  imageVector = Icons.Outlined.AirportShuttle,
                  contentDescription = "Back",
               )
            }
         },
      )
   }
}