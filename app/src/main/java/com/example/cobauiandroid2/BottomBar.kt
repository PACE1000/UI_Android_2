package com.example.cobauiandroid2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cobauiandroid2.ui.theme.CobaUIAndroid2Theme
import com.example.cobauiandroid2.ui.theme.Purple40

@Composable
fun BottomBar(Chips: List<BottomBarChip>, modifier:Modifier = Modifier){
    Box(modifier = modifier.fillMaxWidth()){
        LazyRow(modifier = Modifier.fillMaxWidth().padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween){
            items(Chips.size){
                    index -> val chip = Chips[index]
                BottomBarChips(chip = chip)
            }
        }
    }
}

@Composable
fun BottomBarChips(chip: BottomBarChip){
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(15.dp)
    ) {
        Icon(imageVector = chip.IconId, contentDescription = null,
            modifier = Modifier.size(10.dp), tint = Purple40)
        Text(text = chip.title,color = Purple40)
    }
}

@Preview
@Composable
fun PreviewBottomBar(){
    CobaUIAndroid2Theme {
        BottomBar(Chips = listOf(
            BottomBarChip(title="Today", IconId = Icons.Default.DateRange),
            BottomBarChip(title="Exercise", IconId = Icons.Default.Face),
            BottomBarChip(title="Settings", IconId=Icons.Default.Settings)
        ))
    }
}