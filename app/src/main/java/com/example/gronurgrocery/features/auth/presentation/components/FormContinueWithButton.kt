package com.example.gronurgrocery.features.auth.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.gronurgrocery.R
import com.example.gronurgrocery.common.components.CustomButton
import com.example.gronurgrocery.features.ui.theme.GronurGroceryTheme

@Composable
fun FormContinueWithButton(
    text: String,
    @DrawableRes iconRes: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    CustomButton(
        text = text,
        textColor = Color(0xFF96A4B2),
        backgroundColor = Color(0xFFF8F8F8),
        iconRes = iconRes,
        weight = FontWeight.Normal,
        onClick = { onClick() },
        modifier = modifier
    )
}

@Preview
@Composable
private fun PreviewFormContinueWithButton() {
    GronurGroceryTheme {
        FormContinueWithButton(
            text = "Continue with Google",
            iconRes = R.drawable.google,
            onClick = {}
        )
    }
}