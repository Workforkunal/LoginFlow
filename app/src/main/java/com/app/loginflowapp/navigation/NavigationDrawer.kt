package com.app.loginflowapp.navigation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.loginflowapp.data.NavigationItem

@Composable
fun NavigationDrawer(
    navigationDrawerItems: List<NavigationItem>
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(navigationDrawerItems) {
            NavigationItemRow(item = it)
        }
    }
}

@Composable
fun NavigationItemRow(
    item: NavigationItem
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 16.dp)
    ) {

        Icon(
            imageVector = item.icon,
            contentDescription = item.description
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = item.title,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        )
    }
}