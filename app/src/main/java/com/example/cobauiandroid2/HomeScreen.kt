package com.example.cobauiandroid2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cobauiandroid2.ui.theme.CobaUIAndroid2Theme
import com.example.cobauiandroid2.ui.theme.OptionChips

@Composable
fun HomeScreen(){
    Box(modifier = Modifier.background(Color.White).fillMaxSize()){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            CornerBar(
                modifier = Modifier
                    .padding(start=350.dp,top = 10.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))
            GreetingText(name = "Arya Bramaputra",
                modifier = Modifier.padding(start=20.dp))
            Spacer(modifier = Modifier.height(15.dp))
            OptionChips(options = listOf(
                Option(title = "Yoga", IconId = Icons.Default.Person),
                Option("Diet Chart", IconId= Icons.Default.FavoriteBorder),
                Option(title = "Meditation", IconId= Icons.Default.Warning),
                Option(title="Exercise", IconId= Icons.Default.ThumbUp)

            ))

        }
        BottomBar(Chips = listOf(
            BottomBarChip(title="Today", IconId = Icons.Default.DateRange),
            BottomBarChip(title="Exercise", IconId = Icons.Default.Face),
            BottomBarChip(title="Settings", IconId=Icons.Default.Settings)
        ), modifier = Modifier.align(Alignment.BottomCenter))
    }

}



@Preview(showBackground=true)
@Composable
fun PreviewHomeScreen(){
    CobaUIAndroid2Theme {
        HomeScreen()
    }
}