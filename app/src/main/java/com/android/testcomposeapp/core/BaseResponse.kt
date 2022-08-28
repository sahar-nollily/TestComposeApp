package com.android.testcomposeapp.core

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

abstract class BaseResponse {

    private val commonErrorMessage = "Something went wrong"

    fun <T : Any> handleApiResponse(call: suspend () -> Response<T>) =
        flow {
            emit(Resource.Loading())
            kotlinx.coroutines.delay(5000)
            try {
                val response = call()
                if (response.isSuccessful) {
                    emit(Resource.Success(response.body()))
                } else {
                    emit(
                        Resource.Error(
                            errorMessage = response.errorBody()?.string() ?: commonErrorMessage
                        )
                    )
                }
            } catch (e: HttpException) {
                emit(Resource.Error(errorMessage = e.message ?: commonErrorMessage))
            } catch (e: IOException) {
                emit(Resource.Error(errorMessage = "Please check your network connection"))
            } catch (e: Exception) {
                emit(Resource.Error(errorMessage = commonErrorMessage))
            }

        }.flowOn(Dispatchers.IO)
}