package com.mshdabiola.filemanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.mshdabiola.mainscreen.mainNavigationRoute
import com.mshdabiola.mainscreen.mainScreen


@Composable
fun FileManagerAppNavHost(
    navController: NavHostController,
    startDestination: String= mainNavigationRoute
) {
    NavHost(navController = navController,startDestination=startDestination ){
        mainScreen()
    }
}