package cnc.compose_screens.services

//noinspection SuspiciousImport
import android.R
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat

class NotificationManager(private val context: Context) {
   private val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE)
      as NotificationManager

   companion object {
      const val CHANNEL_ID = "local_notifications"
      const val CHANNEL_NAME = "Local Notifications"
      const val NOTIFICATION_ID = 1
   }

   init {
      createNotificationChannel()
   }

   private fun createNotificationChannel() {
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
         val channel = NotificationChannel(
            CHANNEL_ID,
            CHANNEL_NAME,
            NotificationManager.IMPORTANCE_DEFAULT
         ).apply {
            description = "Channel for local notifications"
            enableLights(true)
            enableVibration(true)
         }
         notificationManager.createNotificationChannel(channel)
      }
   }

   fun showNotification(
      title: String,
      content: String,
      icon: Int = R.drawable.ic_notification_overlay
   ) {
      val notification = NotificationCompat.Builder(context, CHANNEL_ID)
         .setContentTitle(title)
         .setContentText(content)
         .setSmallIcon(icon)
         .setAutoCancel(true)
         .setPriority(NotificationCompat.PRIORITY_DEFAULT)
         .build()

      notificationManager.notify(NOTIFICATION_ID, notification)
   }
}