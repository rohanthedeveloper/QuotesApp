package com.example.quotesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.quotesapp.screens.DisplayScreen
import com.example.quotesapp.screens.HomeScreen
import com.example.quotesapp.screens.HomeScreenContent
import com.example.quotesapp.screens.QuotesListScreen

@Composable
fun QuoteNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = QuoteScreens.HomeScreen.name){
        composable(QuoteScreens.HomeScreen.name ){
            HomeScreen(content = HomeScreenContent(navController = navController), navController = navController)
        }
        composable(QuoteScreens.QuotesListScreen.name + "/{QuoteType}" , arguments = listOf(navArgument(name = "QuoteType"){type = NavType.StringType})){
            backStackEntry ->
            QuotesListScreen(navController = navController ,
                QuoteType = backStackEntry.arguments?.getString("QuoteType")
            )
        }
        composable(QuoteScreens.DisplayScreen.name + "/{Quote}" , arguments = listOf(navArgument(name = "Quote"){type = NavType.StringType})){
            backStackEntry ->
            DisplayScreen(Quote = backStackEntry.arguments?.getString("Quote"))
        }
    }
}