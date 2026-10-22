package com.example.gamedex.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.gamedex.ui.screens.catalog.CatalogScreen
import com.example.gamedex.ui.screens.detail.DetailScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = CatalogRoute,
        modifier = modifier
    ) {
        composable<CatalogRoute> {
            CatalogScreen(
                onGameClick = { gameId -> navController.navigate(DetailRoute(id = gameId)) }
            )
        }

        composable<DetailRoute> { backStackEntry ->
            val route: DetailRoute = backStackEntry.toRoute()
            DetailScreen(
                gameId = route.id,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
