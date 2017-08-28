@file:JvmName("Builds")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.os.Build

inline fun isAtLeast(version: Int): Boolean = Build.VERSION.SDK_INT >= version

inline fun runIfAtLeast(version: Int, block: () -> Unit, fallback: () -> Unit) = when {
    isAtLeast(version) -> block()
    else -> fallback()
}

inline fun runIfAtLeast(version: Int, block: () -> Unit) {
    when {
        isAtLeast(version) -> block()
    }
}

inline fun <T, R> T.getIfAtLeast(version: Int, block: T.() -> R): R? = when {
    isAtLeast(version) -> block()
    else -> null
}

inline fun <T, R> T.getIfAtLeast(version: Int, block: T.() -> R, fallback: T.() -> R): R = when {
    isAtLeast(version) -> block()
    else -> fallback(this)
}