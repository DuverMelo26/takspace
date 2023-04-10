package com.devcodemakers.taskspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.devcodemakers.taskspace.ui.login.ui.LoginViewModel
import com.devcodemakers.taskspace.ui.login.ui.loginScreen
import com.devcodemakers.taskspace.ui.theme.TaskspaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskspaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    loginScreen(LoginViewModel())
                }
            }
        }
    }
}