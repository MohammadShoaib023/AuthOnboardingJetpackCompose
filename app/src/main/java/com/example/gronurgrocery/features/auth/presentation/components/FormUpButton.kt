package com.example.gronurgrocery.features.auth.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gronurgrocery.R
import com.example.gronurgrocery.features.ui.theme.GronurGroceryTheme

@Composable
fun FormUpButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(28.dp))
            .size(56.dp)
            .background(Color(0xFFF8F8F8))
            .clickable { onClick() }
    ) {
        Icon(
            painter = painterResource(id = R.drawable.arrow_left),
            contentDescription = "up button",
            modifier = Modifier
                .align(Alignment.Center)
        )
    }
}


@Preview
@Composable
private fun PreviewFormUpButton() {
    GronurGroceryTheme {
        FormUpButton(
            onClick = {}
        )
    }
}