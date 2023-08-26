package com.example.cobauiandroid2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GreetingText(
    name: String,
    modifier: Modifier = Modifier
) {
    Text(text = "GOOD MORNING, $name",
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun PreviewGreetingText() {
    GreetingText(name = "Arya Bramaputra")
}
