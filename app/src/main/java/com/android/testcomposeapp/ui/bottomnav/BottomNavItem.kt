package com.android.testcomposeapp.ui.bottomnav

import com.android.testcomposeapp.R

sealed class BottomNavItem(
    val title: String,
    val icon: Int,
    val screenRoute: String
){

    object Home: BottomNavItem("Home", R.drawable.ic_home, "home")
    object Profile: BottomNavItem("Profile", R.drawable.ic_account, "profile")
    object Favourite: BottomNavItem("Favourite", R.drawable.ic_like, "favourite")
}
