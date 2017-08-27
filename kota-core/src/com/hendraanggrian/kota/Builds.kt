@file:JvmName("Builds")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.os.Build

inline fun runIfMinSdk(
        minSdk: Int,
        crossinline block: () -> Unit,
        crossinline fallback: () -> Unit
) {
    if (Build.VERSION.SDK_INT >= minSdk) {
        block()
    } else {
        fallback()
    }
}

inline fun runIfMinSdk(
        minSdk: Int,
        crossinline block: () -> Unit
) {
    if (Build.VERSION.SDK_INT >= minSdk) {
        block()
    }
}

inline fun <T, R> T.getIfMinSdk(
        minSdk: Int,
        crossinline block: T.() -> R
): R? {
    return if (Build.VERSION.SDK_INT >= minSdk) {
        block()
    } else {
        null
    }
}

inline fun <T, R> T.getIfMinSdk(
        minSdk: Int,
        crossinline block: T.() -> R,
        crossinline fallback: T.() -> R
): R {
    return if (Build.VERSION.SDK_INT >= minSdk) {
        block()
    } else {
        fallback(this)
    }
}