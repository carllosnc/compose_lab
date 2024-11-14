package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextExample() {
   Column(
      modifier = Modifier
         .fillMaxWidth()
         .padding(
            start = 20.dp,
            end = 20.dp
         ),
      verticalArrangement = Arrangement.spacedBy(
         space = 2.dp
      )
   ) {
      Text(
         "Example of text",
         fontSize = 30.sp,
         fontWeight = FontWeight.Light
      )
      Text(
         "Example of text",
         fontSize = 25.sp,
         fontWeight = FontWeight.Medium,
         color = Color.Red
      )
      Text(
         "Example of text",
         fontSize = 20.sp,
         fontWeight = FontWeight.Black,
         color = Color.Blue
      )
   }
}