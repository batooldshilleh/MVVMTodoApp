package com.example.mvvmtodoapp.util

sealed class UiEvent {
    data object PopBackStack: UiEvent()
    data class NavigateTo(val route: String): UiEvent()
    data class ShowSnackbar(
        val message: String,
        val action: String? = null,
        ): UiEvent()
}