package com.example.gronurgrocery.features.auth.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gronurgrocery.features.ui.theme.GronurGroceryTheme

@Composable
fun FormDivider(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .weight(2f)
        ) {
            HorizontalDivider(
                color = Color(0xFFD9D9D9),
                modifier = Modifier
                    .width(108.dp)
                    .background(Color(0xFFD9D9D9))
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .weight(3f)
        ) {
            Text(
                text = "Or continue with",
                modifier = Modifier
            )
        }

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .weight(2f)
        ) {
            HorizontalDivider(
                color = Color(0xFFD9D9D9),
                modifier = Modifier
                    .width(108.dp)
            )
        }

    }
}

@Preview(showSystemUi = true)
@Composable
private fun PreviewFormDivider() {
    GronurGroceryTheme {
        FormDivider(
            modifier = Modifier.padding(12.dp)
        )
    }
}
