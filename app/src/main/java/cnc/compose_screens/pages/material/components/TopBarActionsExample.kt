package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun TopBarActionsExample() {
  Row(
    verticalAlignment = Alignment.CenterVertically,
  ) {

    IconButton(onClick = {}) {
      Icon(
        imageVector = Icons.Default.Translate,
        contentDescription = "Back",
      )
    }
    IconButton(onClick = { /*TODO*/ }) {
      Icon(
        imageVector = Icons.Default.Search,
        contentDescription = "Back",
      )
    }
    IconButton(onClick = { /*TODO*/ }) {
      Icon(
        imageVector = Icons.Default.Add,
        contentDescription = "Back",
      )
    }
  }
}