plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    wasmJs {
        compilerOptions {
            moduleName.set("kameleoon-sample")
        }
        browser {
            commonWebpackConfig {
                outputFileName = "kameleoon-sample.js"
            }
        }
        binaries.executable()
    }
    sourceSets {
        wasmJsMain.dependencies {
            implementation(projects.sample.shared)
            implementation(libs.compose.ui)
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.material3)
            implementation(libs.compose.components.resources)
        }
    }
}
