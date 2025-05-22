package com.svstudio.eccomerceapp.presentation.scree_auth.admin.products.update

data class AdminProductUpdateState(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val idCategory: String = "",
    val image1: String = "",
    val image2: String = "",
    val price: Double= 0.0,
    val imagesToUpdate: MutableList<Int> = mutableListOf(),

)
