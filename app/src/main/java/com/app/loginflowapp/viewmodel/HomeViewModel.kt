package com.app.loginflowapp.viewmodel

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.lifecycle.ViewModel
import com.app.loginflowapp.data.NavigationItem

class HomeViewModel : ViewModel() {

    val navigationItemsList = listOf(
        NavigationItem(
            title = "Home",
            icon = Icons.Filled.Home,
            description = "Home Screen",
            itemId = "homeScreen"
        ),
        NavigationItem(
            title = "Settings",
            icon = Icons.Filled.Settings,
            description = "Settings",
            itemId = "settings"
        ),
        NavigationItem(
            title = "Favorite",
            icon = Icons.Filled.Favorite,
            description = "Favorite",
            itemId = "favorite"
        ),


        )
}