package com.android.testcomposeapp.ui.home

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.android.testcomposeapp.ui.component.BusinessesComponent

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun HomeScreen(category: String = "", viewModel: HomeViewModel = hiltViewModel()) {

    LaunchedEffect(Unit){
        viewModel.searchBusinesses(category)
    }

    val state = viewModel.businessesState.collectAsState().value
    Box(
        modifier = Modifier.fillMaxSize()
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
                viewModel.controlData(category, state.data.businesses)
                LazyColumn(content = {
                    items(viewModel.list) {
                        BusinessesComponent(businesses = it)
                    }
                })
            }
        }
    }
}
