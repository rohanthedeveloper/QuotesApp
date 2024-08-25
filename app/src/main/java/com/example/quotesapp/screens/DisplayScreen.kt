package com.example.quotesapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.ui.theme.AbrilFatface


@Composable
fun DisplayScreen(modifier : Modifier = Modifier , Quote : String?) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center) {
            Card(modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(300.dp) , elevation = CardDefaults.cardElevation(16.dp)) {
                Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center) {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = Quote.toString(),
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
    }
}
@Preview
@Composable
fun preview() {
    DisplayScreen(Quote =  "The only way to do great work is to love what you do. — Steve Jobs")
}