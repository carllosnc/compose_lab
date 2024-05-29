package cnc.compose_screens.pages.reactivity.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@SuppressLint("UnrememberedMutableState")
@Composable
fun DerivedStateExample() {

   var count by remember { mutableIntStateOf(0) }

   val color: State<Color> = derivedStateOf {
      when (count) {
         in 1..5 -> Color(0xFF117C11)
         in 6..10 -> Color(0xFFA80B4E)
         in 11..15 -> Color(0xFF004AB9)
         else -> Color.Black
      }
   }

   Column(
      verticalArrangement = Arrangement.spacedBy(5.dp),
      modifier = Modifier.fillMaxWidth().padding(
         horizontal = 20.dp,
      ),
   ) {
      Text("Derived State")
      Row(
         horizontalArrangement = Arrangement.spacedBy(16.dp),
      ) {
         Button(
            colors = ButtonDefaults.buttonColors(
               containerColor = color.value,
            ),
            modifier = Modifier
               .weight(1f),
            onClick = { count++ }
         ) {
            Text("Increment $count")
         }
         Button(
            colors = ButtonDefaults.buttonColors(
               containerColor = color.value,
            ),
            modifier = Modifier
               .weight(1f),
            onClick = { count-- }
         ) {
            Text("Decrement $count")
         }
      }
   }
}
