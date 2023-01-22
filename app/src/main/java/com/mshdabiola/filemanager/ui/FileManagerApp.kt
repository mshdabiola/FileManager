package com.mshdabiola.filemanager.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.theme.FileManagerAppTheme
import com.mshdabiola.filemanager.navigation.FileManagerAppNavHost

@Composable
fun FileManagerApp(
    windowSizeClass: WindowSizeClass,
    noteAppState: FileManagerAppState = rememberSkeletonAppState(windowSizeClass = windowSizeClass)
) {
    FileManagerAppTheme {
        FileManagerAppNavHost(navController = noteAppState.navHostController)
    }
}