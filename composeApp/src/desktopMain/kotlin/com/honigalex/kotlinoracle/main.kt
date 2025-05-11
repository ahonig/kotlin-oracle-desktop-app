package com.honigalex.kotlinoracle

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kotlin-oracle-desktop-app",
    ) {
        App()
    }
}