package com.svstudio.eccomerceapp.presentation.scree_auth.admin.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun AdminHomeScreen(navController: NavHostController){
    Scaffold { paddingValues ->
        Text(
            modifier = Modifier.padding(paddingValues= paddingValues),
            text = "Admin HomeScreen"
        )

    }
}