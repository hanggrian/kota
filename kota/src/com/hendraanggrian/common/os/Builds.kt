@file:JvmName("Builds")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.os

import android.os.Build

inline fun runIfMinSdk(
        minSdk: Int,
        noinline block: () -> Unit,
        noinline fallback: () -> Unit
): Unit {
    if (Build.VERSION.SDK_INT >= minSdk) {
        block()
    } else {
        fallback()
    }
}

inline fun runIfMinSdk(
        minSdk: Int,
        noinline block: () -> Unit
): Unit {
    if (Build.VERSION.SDK_INT >= minSdk) {
        block()
    }
}

inline fun <T, R> T.getIfMinSdk(
        minSdk: Int,
        noinline block: T.() -> R
): R? {
    if (Build.VERSION.SDK_INT >= minSdk) {
        return block()
    } else {
        return null
    }
}

inline fun <T, R> T.getIfMinSdk(
        minSdk: Int,
        noinline block: T.() -> R,
        noinline fallback: T.() -> R
): R {
    if (Build.VERSION.SDK_INT >= minSdk) {
        return block()
    } else {
        return fallback(this)
    }
}