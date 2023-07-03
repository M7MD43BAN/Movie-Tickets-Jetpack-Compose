package com.shaban.movietickets

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.shaban.movietickets.ui.theme.MovieTicketsTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieTicketsApp() {
    MovieTicketsTheme {
        Scaffold {

        }
    }
}