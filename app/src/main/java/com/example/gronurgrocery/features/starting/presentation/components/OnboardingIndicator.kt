package com.example.gronurgrocery.features.starting.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gronurgrocery.features.ui.theme.GronurGroceryTheme

@Composable
fun Indicator(
    pageInd: Int,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
    ) {
        IndicatorPoint(
            modifier = Modifier
                .width(if (pageInd == 1) 33.dp else 6.dp)
        )
        Spacer(modifier = Modifier.width(6.dp))
        IndicatorPoint(
            modifier = Modifier
                .width(if (pageInd == 2) 33.dp else 6.dp)
        )
        Spacer(modifier = Modifier.width(6.dp))
        IndicatorPoint(
            modifier = Modifier
                .width(if (pageInd == 3) 33.dp else 6.dp)
        )
    }
}

@Composable
private fun IndicatorPoint(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(3.dp))
            .background(Color.White)
            .height(6.dp)
    ) {

    }
}

@Preview
@Composable
private fun IndicatorPreview() {
    GronurGroceryTheme {
        Indicator(1)
    }
}