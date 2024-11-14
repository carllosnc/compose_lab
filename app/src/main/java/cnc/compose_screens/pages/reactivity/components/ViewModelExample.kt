package cnc.compose_screens.pages.reactivity.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewModel : ViewModel() {
   private val _count = MutableStateFlow(0)

   val count: StateFlow<Int> = _count.asStateFlow()

   fun incrementCount() {
      _count.value++
   }

   fun decrementCount() {
      _count.value--
   }
}

@Composable
fun ViewModelExample() {
   val viewModel: CounterViewModel = viewModel()

   Box(
      modifier = Modifier.padding(
         horizontal = 20.dp,
      ),
   ) {
      Column(
         verticalArrangement = Arrangement.spacedBy(5.dp),
         modifier = Modifier.fillMaxSize(),
      ) {
         Text("View Model example")

         Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically,
         ) {
            Button(
               modifier = Modifier.weight(1f),
               onClick = { viewModel.incrementCount() }
            ) {
               Text("Increment")
            }
            Text("${viewModel.count.collectAsState().value}")
            Button(
               modifier = Modifier.weight(1f),
               onClick = { viewModel.decrementCount() }
            ) {
               Text("Decrement")
            }
         }
      }
   }
}
