package com.example.quotesapp.navigation

import java.lang.IllegalArgumentException

enum class QuoteScreens {
    HomeScreen ,
    QuotesListScreen,
    DisplayScreen;

    companion object {
        fun fromRoute(route : String?) : QuoteScreens
                = when(route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            QuotesListScreen.name -> QuotesListScreen
            DisplayScreen.name -> DisplayScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("route $route not found")
        }
    }
}