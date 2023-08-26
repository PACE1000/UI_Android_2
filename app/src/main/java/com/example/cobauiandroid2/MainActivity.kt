package com.example.cobauiandroid2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cobauiandroid2.ui.theme.CobaUIAndroid2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CobaUIAndroid2Theme {
                // A surface container using the 'background' color from the theme
                HomeScreen()
            }
        }
    }
}

