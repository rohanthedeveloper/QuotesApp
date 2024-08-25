package com.example.quotesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.quotesapp.R
import com.example.quotesapp.lists.quoteTypes
import com.example.quotesapp.navigation.QuoteScreens



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(content: Unit, navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(modifier = Modifier.padding(top = 70.dp),
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically , horizontalArrangement = Arrangement.Center) {
                    Image(painter = painterResource(id = R.drawable.quotes), contentDescription = null , modifier = Modifier.size(44.dp), contentScale = ContentScale.Crop)
                        Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "QuotesApp",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.displayLarge
                    )
                }
                        },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = Color.Black
                )
            )
        },
        content = { paddingValues ->
            Column(modifier = Modifier
                .padding(paddingValues)
                .padding(bottom = 20.dp)) {
                HomeScreenContent(navController = navController)
            }
        }
    )
}


@Composable
fun HomeScreenContent(modifier: Modifier = Modifier ,
                      QuotesList : List<String> = quoteTypes , navController: NavController) {
    LazyColumn(modifier = Modifier.padding(top = 64.dp)) {
        items(items = QuotesList) {
            itemCard(quoteItem = it , navController )
        }
    }

}
    @Composable
    fun itemCard(quoteItem: String , navController: NavController , modifier: Modifier = Modifier) {
        Card(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 0.dp, bottom = 32.dp)
                .fillMaxWidth()
                .height(90.dp)
                .clickable { navController.navigate(QuoteScreens.QuotesListScreen.name + "/$quoteItem") }
               , elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(25.dp)
            ) {
                Text(
                    text = quoteItem,
                    style = MaterialTheme.typography.displayMedium
                )

            }
        }
    }


