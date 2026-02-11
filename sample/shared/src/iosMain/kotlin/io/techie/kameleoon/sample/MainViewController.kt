package io.techie.kameleoon.sample

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

object IOSApp {
    fun createViewController(): UIViewController = ComposeUIViewController { App() }
}
