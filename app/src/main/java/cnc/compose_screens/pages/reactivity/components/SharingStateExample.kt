package cnc.compose_screens.pages.reactivity.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SharingStateExample() {
   val count = remember { mutableIntStateOf(0) }

   Column(
      verticalArrangement = Arrangement.spacedBy(5.dp),
      modifier = Modifier.padding(
         horizontal = 20.dp,
      ),
   ) {
      Text("Sharing state: hosting")

      Row(
         modifier = Modifier
            .fillMaxWidth(),
         verticalAlignment = Alignment.CenterVertically,
         horizontalArrangement = Arrangement.spacedBy(10.dp),
      ) {
         IncrementButton(count)
         Text(text = count.intValue.toString())
         DecrementButton(count)
      }
   }
}

@Composable
fun IncrementButton(
   count: MutableState<Int>,
) {
   Button(
      onClick = {
         count.value++
      },
   ) {
      Text("+ Increment: ${count.value}")
   }
}

@Composable
fun DecrementButton(
   count: MutableState<Int>,
) {
   Button(
      onClick = {
         count.value--
      },
   ) {
      Text("- Decrement: ${count.value}")
   }
}
