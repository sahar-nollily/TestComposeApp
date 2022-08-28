package com.android.testcomposeapp.domain.usecase

import com.android.testcomposeapp.core.BaseUseCase
import com.android.testcomposeapp.data.datasource.api.model.SearchResponseContainer
import com.android.testcomposeapp.domain.repository.BusinessesRepository

class GetBusinesses(
    private val businessesRepository: BusinessesRepository
) : BaseUseCase<SearchResponseContainer>() {

    suspend fun invoke(category: String? = null) {
        setState { businessesRepository.searchBusinesses(category) }
    }
}
