package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cnc.compose_screens.R

@Composable
fun ImageExample() {
   Column(
      verticalArrangement = spacedBy(
         space = 5.dp
      ),
   ) {
      Row(
         horizontalArrangement = spacedBy(
            space = 5.dp
         )
      ) {
         Image(
            modifier = Modifier
               .weight(1f)
               .height(200.dp),
            contentDescription = "Image",
            painter = painterResource(id = R.drawable._1),
            contentScale = ContentScale.Crop
         )
         Image(
            modifier = Modifier
               .weight(1f)
               .height(200.dp),
            contentDescription = "Image",
            painter = painterResource(id = R.drawable._2),
            contentScale = ContentScale.Crop
         )
      }

      Row(
         horizontalArrangement = spacedBy(
            space = 5.dp
         )
      ) {
         Image(
            modifier = Modifier
               .weight(1f)
               .height(200.dp),
            contentDescription = "Image",
            painter = painterResource(id = R.drawable._3),
            contentScale = ContentScale.Crop
         )
         Image(
            modifier = Modifier
               .weight(1f)
               .height(200.dp),
            contentDescription = "Image",
            painter = painterResource(id = R.drawable._4),
            contentScale = ContentScale.Crop
         )
      }
   }
}
