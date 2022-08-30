package com.android.testcomposeapp.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.android.testcomposeapp.domain.model.BusinessData
import com.android.testcomposeapp.ui.component.BusinessesComponent

@Composable
fun HomeScreen(category: String = "", viewModel: HomeViewModel = hiltViewModel()) {
    val state = viewModel.businessesState.collectAsState().value
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        when {
            state.isLoading -> CircularProgressIndicator()
            state.errorMessage != null -> {
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = state.errorMessage)
                    Button(onClick = { viewModel.searchBusinesses(category) }) {
                        Text(text = "Retry")
                    }
                }
            }
            state.data?.businesses?.isNotEmpty() == true -> {
                viewModel.savedLists.add(BusinessData(category,state.data.businesses))
                LazyColumn(content = {
                    items(state.data.businesses) {
                        BusinessesComponent(businesses = it)
                    }
                })
            }
        }
    }
}
