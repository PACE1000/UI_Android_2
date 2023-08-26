package com.example.cobauiandroid2.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cobauiandroid2.Option

@Composable
fun OptionChips(
    options: List<Option>
){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
        modifier = Modifier.fillMaxWidth()
    ){
        items(options.size){
            index -> val option = options[index]
            BoxOption(option = option)
        }
    }
}

@Composable
fun BoxOption(option: Option){
    Box(modifier = Modifier.clip(RoundedCornerShape(5.dp))){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.padding(10.dp)
        ) {
            Icon(
                imageVector = option.IconId,
                contentDescription = null,
                tint = Purple40,
                modifier = Modifier.size(30.dp))
            Text(
                text = option.title,
                fontWeight = FontWeight.Bold,
                fontSize = 10.sp)
        }
    }
}

@Preview
@Composable
fun PreviewBoxOption(){
    CobaUIAndroid2Theme {
        OptionChips(options = listOf(
            Option(title = "Yoga", IconId = Icons.Default.Person),
            Option("Diet Chart", IconId=Icons.Default.FavoriteBorder),
            Option(title = "Meditation", IconId=Icons.Default.Warning),
            Option(title="Exercise", IconId=Icons.Default.ThumbUp)
        ))
    }
}