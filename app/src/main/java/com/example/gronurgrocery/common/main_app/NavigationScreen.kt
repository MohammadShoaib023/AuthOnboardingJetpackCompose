package com.example.gronurgrocery.common.main_app

sealed class NavigationScreen(val route: String) {
    object Splash : NavigationScreen("splash_screen")
    object Onboarding : NavigationScreen("onboarding_screen")
    object Register : NavigationScreen("register_screen")
    object Login : NavigationScreen("login_screen")
}