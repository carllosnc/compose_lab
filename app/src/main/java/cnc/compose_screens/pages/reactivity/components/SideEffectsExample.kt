package cnc.compose_screens.pages.reactivity.components

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun SideEffectsExample() {
   val context = LocalContext.current
   var count by remember { mutableIntStateOf(0) }

   LaunchedEffect(count) {
      when (count) {
         5 -> {
            Toast.makeText(
               context,
               "Side effect: count is 5",
               Toast.LENGTH_SHORT
            ).show()
         }

         10 -> {
            Toast.makeText(
               context,
               "Side effect: count is 10",
               Toast.LENGTH_SHORT
            ).show()
         }

         15 -> {
            Toast.makeText(
               context,
               "Side effect: count is 15",
               Toast.LENGTH_SHORT
            ).show()
         }
      }
   }

   Column(
      verticalArrangement = Arrangement.spacedBy(5.dp),
      modifier = Modifier
         .fillMaxWidth()
         .padding(
            horizontal = 20.dp,
         ),
   ) {
      Text("Side Effects")

      Row(
         horizontalArrangement = Arrangement.spacedBy(16.dp),
         verticalAlignment = Alignment.CenterVertically,
      ) {
         Button(
            onClick = { count++ },
            modifier = Modifier.weight(1f),
         ) {
            Text("Increment")
         }
         Text("$count")
         Button(
            onClick = { count-- },
            modifier = Modifier.weight(1f)
         ) {
            Text("Decrement")
         }
      }
   }
}
