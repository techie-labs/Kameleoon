package org.fangga.cmm_library_template_test.library

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.RELEASE}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
