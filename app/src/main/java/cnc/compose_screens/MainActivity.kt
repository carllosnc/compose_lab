package cnc.compose_screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cnc.compose_screens.pages.HomePage
import cnc.compose_screens.pages.material.MaterialPage
import cnc.compose_screens.settings.Routes
import cnc.compose_screens.ui.theme.Compose_screensTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {

      val navController = rememberNavController()

      Compose_screensTheme(
        dynamicColor = false
      ) {
        NavHost(
          navController = navController,
          startDestination = Routes.HOME,
          enterTransition = {
            slideIntoContainer(
              AnimatedContentTransitionScope.SlideDirection.Start,
              tween( 200)
            )
          },
          exitTransition = {
            slideOutOfContainer(
              AnimatedContentTransitionScope.SlideDirection.Start,
              tween( 200)
            )
          },
          popEnterTransition = {
            slideIntoContainer(
              AnimatedContentTransitionScope.SlideDirection.End,
              tween( 200)
            )
          },
          popExitTransition = {
            slideOutOfContainer(
              AnimatedContentTransitionScope.SlideDirection.End,
              tween( 200)
            )
          }
        ) {
          composable(Routes.HOME) {
            HomePage(
              navController = navController
            )
          }
          composable(Routes.MATERIAL_SCREEN) {
            MaterialPage(
              navController = navController
            )
          }
        }
      }
    }
  }
}
