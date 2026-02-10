package org.fangga.cmm_library_template_test.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Sample App",
    ) {
        App()
    }
}
