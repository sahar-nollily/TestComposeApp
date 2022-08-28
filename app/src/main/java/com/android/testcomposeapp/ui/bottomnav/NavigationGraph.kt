package com.android.testcomposeapp.ui.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.android.mujaz.ui.theme.colors.mujazColor
import com.android.testcomposeapp.ui.favourite.FavouriteScreen
import com.android.testcomposeapp.ui.home.HomeScreen
import com.android.testcomposeapp.ui.profile.ProfileScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationGraph() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) }
    ) {

        NavHost(navController = navController, startDestination = BottomNavItem.Home.screenRoute) {
            composable(BottomNavItem.Home.screenRoute) {
                HomeScreen()
            }

            composable(BottomNavItem.Profile.screenRoute) {
                ProfileScreen()
            }

            composable(BottomNavItem.Favourite.screenRoute) {
                FavouriteScreen()
            }


        }    }
}

@Composable
fun BottomNavigation(navController: NavController) {
    val items = listOf(
        BottomNavItem.Profile,
        BottomNavItem.Home,
        BottomNavItem.Favourite
    )
    BottomNavigation(
        backgroundColor = MaterialTheme.mujazColor.backgroundColor1
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 9.sp
                    )
                },
                selectedContentColor = MaterialTheme.mujazColor.identity,
                unselectedContentColor = MaterialTheme.mujazColor.textColor3,
                alwaysShowLabel = true,
                selected = currentRoute == item.screenRoute,
                onClick = {
                    navController.navigate(item.screenRoute) {

                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
