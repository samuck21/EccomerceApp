package com.svstudio.eccomerceapp.domain.repository

import com.svstudio.eccomerceapp.domain.model.Category
import com.svstudio.eccomerceapp.domain.until.Resource
import kotlinx.coroutines.flow.Flow
import java.io.File

interface CategoriesRepository {
    suspend fun create(category: Category,file: File): Resource<Category>
    fun getCategories(): Flow<Resource<List<Category>>>
    suspend fun update(id: String,category: Category): Resource<Category>
    suspend fun updateWithImage(id: String,category: Category,file: File): Resource<Category>
    suspend fun delete(id: String): Resource<Unit>
}