package com.svstudio.eccomerceapp.presentation.scree_auth.roles.componets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import com.svstudio.eccomerceapp.domain.model.Rol
import com.svstudio.eccomerceapp.presentation.navigation.Graph
import com.svstudio.eccomerceapp.presentation.navigation.screen.auth.AuthScreen

@Composable
fun RolesItem(rol: Rol, navController: NavHostController){
    Column (modifier = Modifier.clickable{

     navController.navigate(route = rol.route){
         popUpTo(route = Graph.ROLES){inclusive = true}
     }
    }){
        Spacer(modifier = Modifier.height(20.dp))
        AsyncImage(
            modifier = Modifier.height(150.dp)
                .width(150.dp),
            model = rol.image,
            contentDescription = "User"
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text( text =  rol.name,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp
        )
    }

}