package cnc.compose_screens.pages.examples

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Image
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import cnc.compose_screens.R

@Composable
private fun Header() {
   Column(
      modifier = Modifier
         .fillMaxWidth(),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.spacedBy(20.dp)
   ) {
      Image(
         modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .clip(RoundedCornerShape(200.dp)),
         contentDescription = "Photo",
         painter = painterResource(id = R.drawable._5),
         contentScale = ContentScale.Crop
      )
      Column(
         horizontalAlignment = Alignment.CenterHorizontally
      ) {
         Text(
            text = "Cindy",
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            fontSize = 50.sp
         )
         Text(
            text = "+55 84999189823",
            textAlign = TextAlign.Center,
            color = Color.DarkGray
         )
      }

      Row(
         modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
         horizontalArrangement = Arrangement.SpaceEvenly
      ) {
         ActionButton("Call", "Call", Icons.Outlined.Phone)
         ActionButton("Chat", "Chat", Icons.Outlined.ChatBubbleOutline)
         ActionButton("Video", "Video", Icons.Outlined.VideoCall)
      }
   }
}

@Composable
private fun ActionButton(
   title: String,
   description: String,
   icon: ImageVector
) {
   Column(
      horizontalAlignment = Alignment.CenterHorizontally
   ) {
      FilledIconButton(onClick = {}) {
         Icon(icon, description)
      }
      Text(title)
   }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar(navController: NavController) {
   CenterAlignedTopAppBar(
      title = {
         Text(
            text = "Phone",
            textAlign = TextAlign.Center
         )
      },
      actions = {
         IconButton(onClick = {}) {
            Icon(Icons.Rounded.MoreVert, "More")
         }
      },
      navigationIcon = {
         IconButton(
            onClick = {
               navController.popBackStack()
            }
         ) {
            Icon(Icons.Rounded.ArrowBack, contentDescription = "Back")
         }
      }
   )
}

@Composable
private fun Actions() {
   Column(
      modifier = Modifier.fillMaxHeight()
   ) {
      Text(
         "More actions".uppercase(),
         textAlign = TextAlign.Start,
         fontWeight = FontWeight.Bold,
         letterSpacing = 1.8.sp,
         fontSize = 12.sp,
         modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
      )
      ListItem(
         leadingContent = { Icon(Icons.Rounded.Image, contentDescription = "View media") },
         headlineContent = { Text("View media") },
      )
      ListItem(
         leadingContent = { Icon(Icons.Rounded.Search, contentDescription = "View media") },
         headlineContent = { Text("Search in conversation") },
      )
      ListItem(
         leadingContent = { Icon(Icons.Rounded.Notifications, contentDescription = "View media") },
         headlineContent = { Text("Notifications") },
      )
   }
}

@Composable
fun PhoneProfilePage(
   navController: NavController = rememberNavController()
) {
   Scaffold(
      topBar = { TopBar(navController) }
   ) { innerPadding ->
      Column(
         modifier = Modifier.padding(innerPadding),
         verticalArrangement = Arrangement.spacedBy(20.dp)
      ) {
         Header()
         HorizontalDivider()
         Actions()
      }
   }
}