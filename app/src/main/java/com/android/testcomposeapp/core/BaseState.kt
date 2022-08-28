package com.android.testcomposeapp.core

data class BaseState<T>(
    val data: T? = null,
    val errorMessage: String? = null,
    val isLoading: Boolean = false,
)
