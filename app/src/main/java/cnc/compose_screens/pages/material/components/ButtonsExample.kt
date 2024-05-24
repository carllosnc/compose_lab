package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ButtonsExample() {
  FlowRow(
    modifier = Modifier
      .fillMaxWidth()
      .padding(
        start = 20.dp,
        end = 20.dp
      ),
    horizontalArrangement = Arrangement.spacedBy(
      space = 5.dp
    )
  ) {
    Button(onClick = { /*TODO*/ }) {
      Text("Button")
    }
    FilledTonalButton(onClick = { /*TODO*/ }) {
      Text("Filled Tonal Button")
    }
    OutlinedButton(onClick = { /*TODO*/ }) {
      Text("Outlined Button")
    }
    TextButton(onClick = { /*TODO*/ }) {
      Text("Text Button")
    }
    Button(onClick = { /*TODO*/ }) {
      Icon(
        imageVector = Icons.Default.Add,
        contentDescription = "Add",
      )
      Text("Button")
    }
    FilledTonalButton(onClick = { /*TODO*/ }) {
      Icon(
        imageVector = Icons.Default.Star,
        contentDescription = "Add",
      )
      Spacer(modifier = Modifier.width(8.dp))
      Text("Filled Tonal Button")
    }
    OutlinedButton(onClick = { /*TODO*/ }) {
      Text("Outlined Button")
      Spacer(modifier = Modifier.width(8.dp))
      Icon(
        imageVector = Icons.Default.Add,
        contentDescription = "Add",
      )
    }
    TextButton(onClick = { /*TODO*/ }) {
      Icon(
        imageVector = Icons.Default.Favorite,
        contentDescription = "Add",
      )
      Spacer(modifier = Modifier.width(8.dp))
      Text("Text Button")
      Spacer(modifier = Modifier.width(8.dp))
      Icon(
        imageVector = Icons.Default.Favorite,
        contentDescription = "Add",
      )
    }
    Button(
      modifier = Modifier
        .fillMaxWidth(),
      onClick = { /*TODO*/ }
    ) {
      Text("Button")
    }
  }
}