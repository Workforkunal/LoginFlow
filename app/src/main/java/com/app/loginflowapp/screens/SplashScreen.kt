package com.app.loginflowapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.app.loginflowapp.R
import com.app.loginflowapp.navigation.Routes
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavHostController
) {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (image) = createRefs()
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .constrainAs(image) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(200.dp)

        )
    }

    LaunchedEffect(true) {
        delay(3000)

        if (FirebaseAuth.getInstance().currentUser != null)
            navController.navigate(Routes.HomeScreen.routes) {
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }
        else
            navController.navigate(Routes.RegisterScreen.routes) {
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashPreview() {
    SplashScreen(navController = rememberNavController())
}