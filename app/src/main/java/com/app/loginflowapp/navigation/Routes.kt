package com.app.loginflowapp.navigation

sealed class Routes(val routes: String){

    data object HomeScreen: Routes("home_screen")
    data object SplashScreen: Routes("splash_screen")
    data object LoginScreen: Routes("login_screen")
    data object RegisterScreen: Routes("register_screen")
}