package cnc.compose_screens.pages.examples

//noinspection SuspiciousImport
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import cnc.compose_screens.services.NotificationManager

@Composable
fun LocalNotificationPage(
   navController: NavController = rememberNavController()
) {
   val context = LocalContext.current
   val notificationManager = NotificationManager(context)

   Scaffold() { innerPadding ->
      Column(
         modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally
      ) {
         Button(onClick = {
            notificationManager.showNotification(
               title = "Notification title",
               content = "Notification content"
            )
         }) {
            Text("Working with local notification here!")
         }
      }
   }
}
