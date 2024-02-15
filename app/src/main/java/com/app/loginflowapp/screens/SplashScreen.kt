package com.app.loginflowapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo"
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Login Flow",
            style = TextStyle(
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Serif
            )
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