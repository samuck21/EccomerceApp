package com.svstudio.eccomerceapp.presentation.scree_auth.profile.componets

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProfileContent(paddingValues: PaddingValues){
    Text(
        modifier =  Modifier.padding(paddingValues=paddingValues),
        text = " Profile Screen"
    )
}