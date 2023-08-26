package com.example.cobauiandroid2

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.cobauiandroid2.ui.theme.CobaUIAndroid2Theme

@Composable
fun CornerBar(modifier:Modifier = Modifier){
    Icon(imageVector = Icons.Default.Menu,
        contentDescription ="Menu",
        tint = Color.White,
        modifier = modifier.clip(CircleShape)
            .background(Color.Red))
}


@Preview(showBackground=true)
@Composable
fun PreviewCornerBar(){
    CobaUIAndroid2Theme {
        CornerBar()
    }
}