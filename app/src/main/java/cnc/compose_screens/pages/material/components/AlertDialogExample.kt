package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleAlertDialog(
   show: Boolean,
   onDismiss: () -> Unit,
   onConfirm: () -> Unit,
) {
   if (show) {
      AlertDialog(
         onDismissRequest = onDismiss,
         confirmButton = {
            TextButton(onClick = onConfirm) {
               Text("Confirm")
            }
         },
         dismissButton = {
            TextButton(onClick = onDismiss) {
               Text("Dismiss")
            }
         },
         title = {
            Text("Alert Dialog")
         },
         text = {
            Text("This is an alert dialog.")
         }
      )
   }
}

@Composable
fun AlertDialogExample() {
   var showDialog by remember { mutableStateOf(false) }

   Box(
      modifier = Modifier
         .fillMaxSize()
         .padding(
            start = 16.dp,
            end = 16.dp,
         )
   ) {
      Button(
         modifier = Modifier
            .fillMaxSize(),
         onClick = {
            showDialog = true
         }
      ) {
         Icon(
            imageVector = Icons.Outlined.Add,
            contentDescription = "Add",
         )
         Text("Show Alert Dialog")
      }

      SimpleAlertDialog(
         show = showDialog,
         onDismiss = {
            showDialog = false
         },
         onConfirm = {
            showDialog = false
         }
      )
   }
}