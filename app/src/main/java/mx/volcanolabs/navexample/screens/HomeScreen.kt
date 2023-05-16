import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen(
    onNavigateToSongs: () -> Unit,
    onNavigateToFavourites: () -> Unit,
    onNavigateToSearch: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = onNavigateToSongs) {
            Text("Go To Songs")
        }
        Button(onClick = onNavigateToFavourites) {
            Text("Go To Favourites")
        }
        Button(onClick = onNavigateToSearch) {
            Text("Search Song")
        }
    }
}