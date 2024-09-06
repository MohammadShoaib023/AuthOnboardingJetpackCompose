package com.example.gronurgrocery.features.auth.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gronurgrocery.R
import com.example.gronurgrocery.features.ui.theme.GronurGroceryTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormTextField(
    label: String,
    @DrawableRes iconDrawable: Int,
    fieldValue: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    onFocusChanged: (FocusState) -> Unit = {/* TODO: Remove this default lambda */}
) {
        TextField(
            value = fieldValue,
            onValueChange = { onValueChange(it) },
            placeholder = {
                Row {
                    Icon(
                        painter = painterResource(id = iconDrawable),
                        contentDescription = "email",
                        tint = Color(0xFF96A4B2)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = label,
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Start,
                        color = Color(0xFF96A4B2)
                    )
                }
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = modifier
                .clip(RoundedCornerShape(30.dp))
                .height(60.dp)
                .background(Color(0xFFF8F8F8))
                .onFocusChanged { onFocusChanged(it) }
        )
}

@Preview
@Composable
private fun PreviewFormTextField() {
    GronurGroceryTheme {
        FormTextField(
            label = "Email Address",
            iconDrawable = R.drawable.sms,
            fieldValue = "",
            onValueChange = {},
            onFocusChanged = {}
        )
    }
}