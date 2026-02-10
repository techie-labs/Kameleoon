package org.fangga.cmm_library_template_test.library

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
