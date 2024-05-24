package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoadingIndicatorsExample() {
  Row(
    horizontalArrangement = Arrangement.spacedBy(50.dp),
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .fillMaxWidth()
      .padding(
        start = 20.dp,
        end = 20.dp
      ),
  ) {
    CircularProgressIndicator(
      modifier = Modifier
        .width(40.dp)
        .height(40.dp),
      strokeWidth = 4.dp,
      color = MaterialTheme.colorScheme.secondaryContainer,
      trackColor = MaterialTheme.colorScheme.primary,
    )

    LinearProgressIndicator(
      modifier = Modifier.weight(1f),
      color = MaterialTheme.colorScheme.secondaryContainer,
      trackColor = MaterialTheme.colorScheme.primary,
    )
  }
}