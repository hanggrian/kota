@file:JvmName("Builds")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.os

import android.os.Build

inline fun runIfMinSdk(
        minSdk: Int,
        block: () -> Unit,
        fallback: () -> Unit
): Unit {
    if (Build.VERSION.SDK_INT >= minSdk) {
        block()
    } else {
        fallback()
    }
}

inline fun runIfMinSdk(
        minSdk: Int,
        block: () -> Unit
): Unit {
    if (Build.VERSION.SDK_INT >= minSdk) {
        block()
    }
}

inline fun <T, R> T.getIfMinSdk(
        minSdk: Int,
        block: T.() -> R
): R? {
    if (Build.VERSION.SDK_INT >= minSdk) {
        return block()
    } else {
        return null
    }
}

inline fun <T, R> T.getIfMinSdk(
        minSdk: Int,
        block: T.() -> R,
        fallback: T.() -> R
): R {
    if (Build.VERSION.SDK_INT >= minSdk) {
        return block()
    } else {
        return fallback(this)
    }
}