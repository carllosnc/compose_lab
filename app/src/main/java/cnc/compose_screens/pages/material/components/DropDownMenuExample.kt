package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AcUnit
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownMenuExample() {
   var expanded by remember { mutableStateOf(false) }
   var selectedOptionText by remember { mutableStateOf("Select an option") }
   val options = listOf("Option 1", "Option 2", "Option 3")

   Box(
      modifier = Modifier
         .fillMaxWidth()
         .padding(
            start = 20.dp,
            end = 20.dp
         )
   ) {
      ExposedDropdownMenuBox(
         expanded = expanded,
         onExpandedChange = { expanded = !expanded }
      ) {
         TextField(
            readOnly = true,
            value = selectedOptionText,
            onValueChange = {},
            label = { Text("Dropdown Menu") },
            leadingIcon = {
               Icon(
                  imageVector = Icons.Outlined.AcUnit,
                  contentDescription = "Search",
               )
            },
            trailingIcon = {
               ExposedDropdownMenuDefaults.TrailingIcon(
                  expanded = expanded
               )
            },
            modifier = Modifier
               .menuAnchor()
               .fillMaxWidth()
         )
         ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
         ) {
            options.forEach { selectionOption ->
               DropdownMenuItem(
                  onClick = {
                     selectedOptionText = selectionOption
                     expanded = false
                  },
                  text = { Text(text = selectionOption) }
               )
            }
         }
      }
   }
}
