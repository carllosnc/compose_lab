package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Blender
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.WorkspacePremium
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun IconButtonsExample() {
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
    IconButton(onClick = { /*TODO*/ }) {
      Icon(
        imageVector = Icons.Default.Translate,
        contentDescription = "Back",
      )
    }
    FilledIconButton(onClick = { /*TODO*/ }) {
      Icon(
        imageVector = Icons.Default.Search,
        contentDescription = "Back",
      )
    }
    OutlinedIconButton(onClick = { /*TODO*/ }) {
      Icon(
        imageVector = Icons.Default.WorkspacePremium,
        contentDescription = "Back",
      )
    }
    FilledTonalIconButton(onClick = { /*TODO*/ }) {
      Icon(
        imageVector = Icons.Default.Blender,
        contentDescription = "Back",
      )
    }
  }
}