package com.android.testcomposeapp.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.testcomposeapp.core.Constants.TAG
import com.android.testcomposeapp.data.datasource.api.model.Businesses
import com.android.testcomposeapp.domain.usecase.GetBusinesses
import com.android.testcomposeapp.domain.usecase.GetCategories
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getBusinesses: GetBusinesses,
    private val getCategories: GetCategories
) : ViewModel() {

    val businessesState = getBusinesses.state
    val categoriesState = getCategories.state
    var businessesList: MutableList<Pair<String, List<Businesses>>> = mutableListOf()
    val list = mutableListOf<Businesses>()

    fun searchBusinesses(category: String) = viewModelScope.launch {
        Log.d(TAG, "searchBusinesses: $category")
        if (businessesList.isEmpty()) {
            Log.d(TAG, "searchBusinesses: invoke")
            getBusinesses.invoke(category)
        } else {
            businessesList.map {
                if (it.first == category || it.first.isBlank()) {
                    Log.d(TAG, "searchBusinesses: if")
                    return@map
                } else {
                    Log.d(TAG, "searchBusinesses: else")
                    getBusinesses.invoke(category)
                }
            }
        }
    }

    fun controlData(category: String, list: List<Businesses>) = viewModelScope.launch {
        businessesList.forEach {
            Log.d(TAG, "controlData: $it")
            if (it.first == category) {
                this@HomeViewModel.list.clear()
                this@HomeViewModel.list.addAll(it.second)
                Log.d(TAG, "controlData: if $category")
                return@forEach
            } else {
                businessesList.add(Pair(category, list))
                this@HomeViewModel.list.clear()
                this@HomeViewModel.list.addAll(list)
                Log.d(TAG, "controlData: else $category")

            }
        }
    }

    fun getCategories() = viewModelScope.launch {
        getCategories.invoke()
    }
}
