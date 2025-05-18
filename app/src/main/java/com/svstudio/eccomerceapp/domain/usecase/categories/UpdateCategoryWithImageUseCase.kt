package com.svstudio.eccomerceapp.domain.usecase.categories

import com.svstudio.eccomerceapp.domain.model.Category
import com.svstudio.eccomerceapp.domain.repository.CategoriesRepository
import java.io.File

class UpdateCategoryWithImageUseCase (private  val repository: CategoriesRepository) {
    suspend operator fun  invoke(id:String,category: Category,file: File) = repository.updateWithImage(id,category,file)
}