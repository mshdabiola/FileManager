package com.mshdabiola.filemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.mshdabiola.designsystem.theme.FileManagerAppTheme
import com.mshdabiola.filemanager.ui.FileManagerApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            WindowCompat.setDecorFitsSystemWindows(window, false)
            FileManagerAppTheme() {
                // A surface container using the 'background' color from the theme
                FileManagerApp(windowSizeClass = calculateWindowSizeClass(activity = this))
            }
        }
    }
}
