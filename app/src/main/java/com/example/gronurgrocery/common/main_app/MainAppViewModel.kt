package com.example.gronurgrocery.common.main_app

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gronurgrocery.common.domain.use_cases.ReadOnboardingStateUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainAppViewModel @Inject constructor(
    private val readOnboardingStateUseCase: ReadOnboardingStateUseCase
) : ViewModel() {

    private var _onboardingState: MutableState<Boolean> = mutableStateOf(false)
    val onboardingState : State<Boolean> = _onboardingState

    init {
        getOnboardingState()
    }

    private fun getOnboardingState() {
        viewModelScope.launch {
            readOnboardingStateUseCase().collect { state ->
                _onboardingState.value = state
            }
        }
    }
}