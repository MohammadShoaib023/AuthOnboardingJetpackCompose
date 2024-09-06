package com.example.gronurgrocery.features.starting.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.gronurgrocery.R

sealed class OnboardingPage(
    @DrawableRes val imageRes: Int,
    val title: String,
    val description: String
) {
    object First: OnboardingPage(
        imageRes = R.drawable.onboarding_strawberry,
        title = "Welcome to Grocery Shop",
        description = "Embark on a culinary journey with fresh ingredients brought right to your kitchen."
    )
    object Second: OnboardingPage(
        imageRes = R.drawable.onboarding_garlic,
        title = "Introducing Shop Ease",
        description = "Effortless and convenient shopping made simple – shop for groceries anytime, anywhere"
    )
    object Third: OnboardingPage(
        imageRes = R.drawable.onboarding_fruits,
        title = "Your Daily Grocery Partner",
        description = "Explore a smarter way to shop for groceries with personalized recommendations"
    )
}