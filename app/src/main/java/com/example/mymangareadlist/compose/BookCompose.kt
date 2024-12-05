package com.example.mymangareadlist.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BookCompose (){
    Column {
        Text("Olá mundo")
        Text("Alcatra R$29,90")
    }
}

@Composable
@Preview(showBackground = true)
fun BookComposePreview(){
    BookCompose()
}