package com.android.testcomposeapp.core

import kotlinx.coroutines.flow.*

open class BaseUseCase<T: Any> {

    private val _state = MutableStateFlow<BaseState<T>>(BaseState())
    val state = _state.asStateFlow()

    protected suspend fun setState(newState: () -> Flow<Resource<T>>) {
         newState().collect {
             _state.value = when(it) {
                 is Resource.Loading -> BaseState(isLoading = true)
                 is Resource.Success -> BaseState(data = it.data)
                 is Resource.Error -> BaseState(errorMessage = it.errorMessage ?: "")
             }
        }
    }


}