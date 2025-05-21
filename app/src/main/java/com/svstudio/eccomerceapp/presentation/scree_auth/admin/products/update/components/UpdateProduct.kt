package com.svstudio.eccomerceapp.presentation.scree_auth.admin.products.update.components

import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.svstudio.eccomerceapp.domain.until.Resource
import com.svstudio.eccomerceapp.presentation.scree_auth.admin.products.create.AdminProductCreateViewModel
import com.svstudio.eccomerceapp.presentation.scree_auth.admin.products.update.AdminProductUpdateViewModel

@Composable
fun UpdateProduct(vm: AdminProductUpdateViewModel = hiltViewModel()) {

    when(val response = vm.productResponse) {
        Resource.Loading -> {
          //  ProgressBar()
        }
        is Resource.Success -> {
            // 401 TOKEN
            Log.d("UpdateUser", "Data: ${response.data}")

            Toast.makeText(LocalContext.current, "Los datos se han creado correctamete", Toast.LENGTH_LONG).show()
        }
        is Resource.Failure -> {
            Toast.makeText(LocalContext.current, response.message, Toast.LENGTH_LONG).show()
        }
        else -> {
            if (response != null) {
                Toast.makeText(LocalContext.current, "Hubo error desconocido", Toast.LENGTH_LONG).show()
            }
        }
    }

}