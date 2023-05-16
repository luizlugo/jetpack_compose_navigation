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
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToSongs = {
                    navController.navigate(Screen.Songs.route)
                },
                onNavigateToFavourites = {
                    navController.navigate(Screen.Favourites.route)
                },
                onNavigateToSearch = {
                    navController.navigate(Screen.Search.route)
                }
            )
        }
        composable(Screen.Songs.route) {
            SongsScreen()
        }
        composable(Screen.Favourites.route) {
            FavouritesScreen()
        }
        composable(Screen.Search.route) {
            SearchScreen(
                onNavigateToSongs = {
                    navController.navigate(Screen.Songs.route) {
                        popUpTo(Screen.Home.route)
                    }
                }
            )
        }
    }
}

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Songs: Screen("songs")
    object Favourites: Screen("favourites")
    object Search: Screen("search")
}