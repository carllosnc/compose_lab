package cnc.compose_screens.pages.reactivity.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MutableStateExample() {
   var count by remember { mutableIntStateOf(0) }

   Column(
      verticalArrangement = Arrangement.spacedBy(5.dp),
      modifier = Modifier.padding(
         horizontal = 20.dp,
      ),
   ) {
      Text("Mutable state")
      Row(
         horizontalArrangement = Arrangement.spacedBy(10.dp),
         verticalAlignment = Alignment.CenterVertically,
      ) {
         Button(
            modifier = Modifier.weight(1f),
            onClick = {
               count++
            },
         ) {
            Text("+ Increment")
         }
         Text(text = count.toString())
         Button(
            modifier = Modifier.weight(1f),
            onClick = {
               count--
            },
         ) {
            Text("- Decrement")
         }
      }
   }
}
