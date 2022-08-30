package com.android.testcomposeapp.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.testcomposeapp.core.Constants.TAG
import com.android.testcomposeapp.data.datasource.api.model.SearchResponseContainer
import com.android.testcomposeapp.domain.model.BusinessData
import com.android.testcomposeapp.domain.usecase.GetBusinesses
import com.android.testcomposeapp.domain.usecase.GetCategories
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getBusinesses: GetBusinesses,
    private val getCategories: GetCategories
) : ViewModel() {

    private val _businessesState = getBusinesses.state
    val businessesState = _businessesState.asStateFlow()
    val categoriesState = getCategories.state
    val savedLists = mutableListOf<BusinessData>()

    init {
        getCategories()
    }

    fun searchBusinesses(category: String) = viewModelScope.launch {
        val currentCategory = savedLists.filter {
            it.name == category
        }
        if (currentCategory.isEmpty()) {
            getBusinesses.invoke(category)
            Log.d(TAG, "searchBusinesses: if $category")
        } else {
            _businessesState.value = businessesState.value.copy(
                data = SearchResponseContainer(currentCategory.first().list),
                isLoading = false,
                errorMessage = null
            )
            Log.d(TAG, "searchBusinesses: else $category")

        }
    }

    private fun getCategories() = viewModelScope.launch {
        getCategories.invoke()
    }
}
