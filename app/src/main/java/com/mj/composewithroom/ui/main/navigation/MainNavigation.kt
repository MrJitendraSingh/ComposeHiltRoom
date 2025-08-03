package com.mj.composewithroom.ui.main.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mj.composewithroom.ui.main.add.AddVehicleScreen
import com.mj.composewithroom.ui.main.home.HomeScreen

@Composable
fun MainNavigation (navController: NavHostController = rememberNavController()) {

    NavHost(navController = navController, startDestination = MainScreenRoute.HomeScreen.route,
        enterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(300)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(300)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(300)
            )

        },
        popExitTransition = {
            slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(300)
            )
        }
    ) {
        composable(MainScreenRoute.HomeScreen.route) { HomeScreen(navController) }
        composable(MainScreenRoute.AddVehicleScreen.route) { AddVehicleScreen(navController) }
    }

}