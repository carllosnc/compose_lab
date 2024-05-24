package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AcUnit
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldExample() {
  var outlinedText by rememberSaveable { mutableStateOf("") }
  var filledText by rememberSaveable { mutableStateOf("") }

  Column(
    modifier = Modifier
      .fillMaxWidth()
      .padding(
        start = 20.dp,
        end = 20.dp
      ),
    verticalArrangement = Arrangement.spacedBy(
      space = 20.dp
    )
  ) {
    OutlinedTextField(
      supportingText = {
        Text("Supporting text - Reference site about Lorem Ipsum, giving information on its origins, as well as a random")
      },
      leadingIcon = {
        Icon(
          imageVector = Icons.Outlined.Lock,
          contentDescription = "Search",
        )
      },
      modifier = Modifier.fillMaxWidth(),
      value = outlinedText,
      onValueChange = { outlinedText = it },
      label = { Text("Outlined TextField") },
      singleLine = true
    )
    TextField(
      supportingText = {
        Text("Supporting text - Reference site about Lorem Ipsum, giving information on its origins, as well as a random")
      },
      leadingIcon = {
        Icon(
          imageVector = Icons.Outlined.AcUnit,
          contentDescription = "Search",
        )
      },
      modifier = Modifier
        .fillMaxWidth(),
      value = filledText,
      onValueChange = { filledText = it },
      label = { Text("Filled TextField") },
      singleLine = true
    )
  }
}