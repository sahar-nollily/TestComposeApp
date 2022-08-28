package com.android.testcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.android.mujaz.ui.theme.colors.mujazColor
import com.android.testcomposeapp.ui.bottomnav.NavigationGraph
import com.android.testcomposeapp.ui.component.TabLayout
import com.android.testcomposeapp.ui.theme.TestComposeAppTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.mujazColor.backgroundColor1
                ) {
//                    NavigationGraph()
                    TabLayout()
                }
            }

        }
    }
}