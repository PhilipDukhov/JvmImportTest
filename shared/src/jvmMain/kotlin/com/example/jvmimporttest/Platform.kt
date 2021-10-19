package com.example.jvmimporttest

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

fun Platform.jvmMethod() = platform + "123"