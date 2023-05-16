package mx.volcanolabs.navexample.navigation

import HomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.volcanolabs.navexample.screens.FavouritesScreen
import mx.volcanolabs.navexample.screens.SearchScreen
import mx.volcanolabs.navexample.screens.SongsScreen

@Composable
fun MainNavigation(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onNavigateToSongs = {
                    navController.navigate("songs")
                },
                onNavigateToFavourites = {
                    navController.navigate("favourites")
                },
                onNavigateToSearch = {
                    navController.navigate("search")
                }
            )
        }
        composable("songs") {
            SongsScreen()
        }
        composable("favourites") {
            FavouritesScreen()
        }
        composable("search") {
            SearchScreen()
        }
    }
}