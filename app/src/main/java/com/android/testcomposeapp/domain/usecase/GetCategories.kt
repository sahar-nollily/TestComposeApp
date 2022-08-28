package com.android.testcomposeapp.domain.usecase

import com.android.testcomposeapp.core.BaseUseCase
import com.android.testcomposeapp.data.datasource.api.model.CategoriesResponseContainer
import com.android.testcomposeapp.domain.repository.BusinessesRepository

class GetCategories(
    private val businessesRepository: BusinessesRepository
) : BaseUseCase<CategoriesResponseContainer>() {

    suspend fun invoke() {
        setState { businessesRepository.getCategories() }
    }
}
