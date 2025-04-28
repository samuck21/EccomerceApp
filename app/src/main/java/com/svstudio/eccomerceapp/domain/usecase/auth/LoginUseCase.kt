package com.svstudio.eccomerceapp.domain.usecase.auth

import com.svstudio.eccomerceapp.domain.repository.AuthRepository

class LoginUseCase (private val  repository: AuthRepository) {
    suspend operator fun invoke(email: String,password: String) = repository.login(email,password)
}