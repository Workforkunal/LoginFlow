package com.app.loginflowapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.loginflowapp.screens.HomeScreen
import com.app.loginflowapp.screens.LoginScreen
import com.app.loginflowapp.screens.RegisterScreen
import com.app.loginflowapp.screens.SplashScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.SplashScreen.routes
    ){

        composable(Routes.SplashScreen.routes){
            SplashScreen(navController)
        }
        composable(Routes.HomeScreen.routes){
            HomeScreen(navController, navigationIconClicked = {})
        }
        composable(Routes.LoginScreen.routes){
            LoginScreen(navController)
        }
        composable(Routes.RegisterScreen.routes){
            RegisterScreen(navController)
        }
    }


}