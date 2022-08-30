package com.android.testcomposeapp.ui.component

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.*
import androidx.hilt.navigation.compose.hiltViewModel
import com.android.mujaz.ui.theme.colors.mujazColor
import com.android.testcomposeapp.data.datasource.api.model.Categories
import com.android.testcomposeapp.ui.home.HomeScreen
import com.android.testcomposeapp.ui.home.HomeViewModel
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@ExperimentalPagerApi
@Composable
fun TabLayout(viewModel: HomeViewModel = hiltViewModel()) {
    val state = viewModel.categoriesState.collectAsState().value
    var currentCategory = remember { "" }
    val category = remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        when {
            state.isLoading -> CircularProgressIndicator()
            state.errorMessage != null -> Text(text = state.errorMessage)
            state.data?.categories?.size != 0 -> {
                val pagerState = rememberPagerState(pageCount = state.data?.categories?.size ?: 0)
                Column(
                    modifier = Modifier.background(Color.White)
                ) {
                    state.data?.categories?.let {
                        val list = it.subList(0, 10)
                        Tabs(pagerState = pagerState, list)
                        HorizontalPager(state = pagerState) { page ->
                            currentCategory = it[page].alias.toString()
                            HomeScreen(category.value)
                        }
                    }
                }
            }
        }
    }

    LaunchedEffect(currentCategory) {
        if (currentCategory.isNotBlank()) {
            category.value = currentCategory
            viewModel.searchBusinesses(category.value)
        }
    }
}

@ExperimentalPagerApi
@Composable
fun Tabs(pagerState: PagerState, list: List<Categories>) {
    val scope = rememberCoroutineScope()

    ScrollableTabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = MaterialTheme.mujazColor.backgroundColor1,
        contentColor = MaterialTheme.mujazColor.textColor1,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 2.dp,
                color = MaterialTheme.mujazColor.identity
            )
        }
    ) {
        list.forEachIndexed { index, categories ->
            Tab(
                text = {
                    Text(
                        categories.title ?: "wrong",
                        color = if (pagerState.currentPage == index)
                            MaterialTheme.mujazColor.identity
                        else
                            MaterialTheme.mujazColor.textColor1
                    )
                },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            )
        }
    }
}