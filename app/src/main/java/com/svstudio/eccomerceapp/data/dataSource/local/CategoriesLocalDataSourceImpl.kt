package com.svstudio.eccomerceapp.data.dataSource.local

import com.svstudio.eccomerceapp.data.dataSource.local.dao.CategoriesDao
import com.svstudio.eccomerceapp.data.dataSource.local.entity.CategoryEntity
import kotlinx.coroutines.flow.Flow

class CategoriesLocalDataSourceImpl(private val categoriesDao: CategoriesDao): CategoriesLocalDataSource {
    override suspend fun create(category: CategoryEntity)=categoriesDao.insert(category)
    override suspend fun insertAll(categories: List<CategoryEntity>) = categoriesDao.insertAll(categories)

    override fun getCategories(): Flow<List<CategoryEntity>>  = categoriesDao.getCategories()

    override suspend fun update(
        id: String,
        name: String,
        description: String,
        image: String
    ) = categoriesDao.update(id,name,description,image)

    override suspend fun delete(id: String) = categoriesDao.delete(id)
}