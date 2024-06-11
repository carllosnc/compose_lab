package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardExample() {
   Column(
      verticalArrangement = Arrangement.spacedBy(
         space = 10.dp
      ),
      modifier = Modifier
        .padding(
          start = 20.dp,
          end = 20.dp
        )
        .fillMaxWidth(),
   ) {
      Card(
         modifier = Modifier
           .fillMaxWidth()
           .clickable(onClick = { /*TODO*/ }),
         shape = RoundedCornerShape(10.dp),
         onClick = { /*TODO*/ }
      ) {
         Column(
            modifier = Modifier
               .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
         ) {
            Text(
               text = "Card Example",
               fontSize = 16.sp,
               fontWeight = FontWeight.Bold
            )
            Text(
               text = "Reference site about Lorem Ipsum, giving information on its origins, as well as a random ipsum generator.",
               fontSize = 14.sp,
            )
         }
      }

      OutlinedCard(
         modifier = Modifier
           .fillMaxWidth()
           .clickable(onClick = { /*TODO*/ }),
         shape = RoundedCornerShape(10.dp),
         onClick = { /*TODO*/ },
         colors = CardDefaults.outlinedCardColors(
            containerColor = Color(0xFFF5F5F5),
            contentColor = Color.Black
         )
      ) {
         Column(
            modifier = Modifier
               .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
         ) {
            Text(
               text = "Card Example",
               fontSize = 16.sp,
               fontWeight = FontWeight.Bold
            )
            Text(
               text = "Reference site about Lorem Ipsum, giving information on its origins, as well as a random ipsum generator.",
               fontSize = 14.sp,
            )
         }
      }
   }
}