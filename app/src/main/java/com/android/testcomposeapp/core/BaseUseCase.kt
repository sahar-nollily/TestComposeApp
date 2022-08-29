package com.android.testcomposeapp.core

import kotlinx.coroutines.flow.*

open class BaseUseCase<T: Any> {

    val state = MutableStateFlow<BaseState<T>>(BaseState())

    protected suspend fun setState(newState: () -> Flow<Resource<T>>) {
         newState().collect {
             state.value = when(it) {
                 is Resource.Loading -> BaseState(isLoading = true)
                 is Resource.Success -> BaseState(data = it.data)
                 is Resource.Error -> BaseState(errorMessage = it.errorMessage ?: "")
             }
        }
    }


}