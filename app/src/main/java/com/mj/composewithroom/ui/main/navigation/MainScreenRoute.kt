package com.mj.composewithroom.ui.main.navigation

sealed class MainScreenRoute (val route: String) {
    object HomeScreen : MainScreenRoute("HomeScreen")
}