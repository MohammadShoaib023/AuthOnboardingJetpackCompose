package com.example.gronurgrocery.features.auth.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gronurgrocery.features.ui.theme.GronurGroceryTheme

@Composable
fun FormText(
    titleText: String,
    descriptionText: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = titleText,
            style = MaterialTheme.typography.titleSmall,
            textAlign = TextAlign.Start,
            color = Color(0xFF19253D),
            modifier = Modifier
                .padding(bottom = 12.dp)
        )
        Text(
            text = descriptionText,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Start,
            color = Color(0xFF96A4B2)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PreviewFormText() {
    GronurGroceryTheme {
        FormText(
            titleText = "Register Now",
            descriptionText = "Sign up with your email and password to continue",
            modifier = Modifier.padding(12.dp)
        )
    }
}