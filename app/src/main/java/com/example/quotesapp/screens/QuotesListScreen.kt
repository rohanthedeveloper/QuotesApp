package com.example.quotesapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.quotesapp.lists.friendshipQuotes
import com.example.quotesapp.lists.historicalQuotes
import com.example.quotesapp.lists.loveQuotes
import com.example.quotesapp.lists.motivationalQuotes
import com.example.quotesapp.lists.spiritualQuotes
import com.example.quotesapp.navigation.QuoteScreens


@Composable
fun QuotesListScreen(modifier: Modifier = Modifier   , navController: NavController , QuoteType : String?) {
    var quoteList: List<String> = motivationalQuotes
    when(QuoteType){
        "Motivation Quotes" -> {quoteList  = motivationalQuotes}
        "Friendship Quotes" -> {quoteList = friendshipQuotes}
        "Love Quotes" -> {quoteList = loveQuotes}
        "Historical Quotes" -> {quoteList = historicalQuotes}
        "Spiritual Quotes" -> {quoteList = spiritualQuotes}

    }
        Column(modifier = Modifier.fillMaxSize() , verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(16.dp))
Surface {


    Box(contentAlignment = Alignment.Center) {
        Text(
            text = QuoteType.toString(),
            style = MaterialTheme.typography.labelSmall
        )
    }
}
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {
                this.items(quoteList){ item ->
                    QuoteCard(quote = item , navController = navController)
                }
            }
        }
    }

//@Preview
@Composable
fun trial() {
    Box(contentAlignment = Alignment.Center) {
        Text(
            text = "Friendship Quotes",
            fontSize = 32.sp,
            style = MaterialTheme.typography.labelSmall
        )
    }
}

@Preview
@Composable
fun QuoteCard(modifier : Modifier = Modifier , quote : String = "The only way to do great work is to love what you do. — Steve Jobs" , navController: NavController = rememberNavController()) {
    Card(
        modifier = Modifier
            .padding(top = 16.dp, bottom = 16.dp, start = 32.dp, end = 32.dp)
            .fillMaxWidth()
            .height(150.dp)
            .clickable { navController.navigate(QuoteScreens.DisplayScreen.name + "/$quote") }, elevation = CardDefaults.cardElevation(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(25.dp)
        ) {
            Text(
                text = quote,
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

        }
    }
}

