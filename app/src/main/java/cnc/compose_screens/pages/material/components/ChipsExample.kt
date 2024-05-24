package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.AdsClick
import androidx.compose.material.icons.filled.Api
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ElevatedSuggestionChip
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AssistChipsExample() {
  FlowRow(
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    modifier = Modifier
      .fillMaxWidth()
      .padding(
        start = 20.dp,
        end = 20.dp
      ),
  ) {
    AssistChip(
      onClick = { /*TODO*/ }, label = {
        Icon(
          modifier = Modifier
            .width(18.dp)
            .height(18.dp),
          imageVector = Icons.Default.Favorite,
          contentDescription = "Favorite",
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("Assist Chip")
      }
    )

    ElevatedAssistChip(
      onClick = { /*TODO*/ }, label = {
        Icon(
          modifier = Modifier
            .width(18.dp)
            .height(18.dp),
          imageVector = Icons.Default.Favorite,
          contentDescription = "Favorite",
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("Elevated Assist Chip")
      }
    )
  }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SuggestionChipsExample() {
  FlowRow(
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    modifier = Modifier
      .fillMaxWidth()
      .padding(
        start = 20.dp,
        end = 20.dp
      ),
  ) {
    SuggestionChip(onClick = { /*TODO*/ }, label = {
      Icon(
        modifier = Modifier
          .width(18.dp)
          .height(18.dp),
        imageVector = Icons.Default.Favorite,
        contentDescription = "Favorite",
      )
      Spacer(modifier = Modifier.width(8.dp))
      Text("Suggestion Chip")
    })

    ElevatedSuggestionChip(onClick = { /*TODO*/ }, label = {
      Icon(
        modifier = Modifier
          .width(18.dp)
          .height(18.dp),
        imageVector = Icons.Default.Favorite,
        contentDescription = "Favorite",
      )
      Spacer(modifier = Modifier.width(8.dp))
      Text("Suggestion Chip")
    })
  }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FilterChipsExample() {
  var selectedFilter by remember { mutableStateOf("First") }

  FlowRow(
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    modifier = Modifier
      .fillMaxWidth()
      .padding(
        start = 20.dp,
        end = 20.dp
      ),
  ) {
    FilterChip(
      selected = selectedFilter == "First",
      onClick = {
                selectedFilter = "First"
      },
      label = {
        Icon(
          modifier = Modifier
            .width(18.dp)
            .height(18.dp),
          imageVector = Icons.Default.AcUnit,
          contentDescription = "Favorite",
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("First")
      }
    )

    FilterChip(
      selected = selectedFilter == "Second",
      onClick = {
                selectedFilter = "Second"
      },
      label = {
        Icon(
          modifier = Modifier
            .width(18.dp)
            .height(18.dp),
          imageVector = Icons.Default.AdsClick,
          contentDescription = "Favorite",
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("Second")
      }
    )

    FilterChip(
      selected = selectedFilter == "Third",
      onClick = {
                selectedFilter = "Third"
      },
      label = {
        Icon(
          modifier = Modifier
            .width(18.dp)
            .height(18.dp),
          imageVector = Icons.Default.Api,
          contentDescription = "Favorite",
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("Third")
      }
    )
  }
}