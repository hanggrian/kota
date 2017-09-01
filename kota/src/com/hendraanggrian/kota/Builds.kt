@file:JvmName("BuildsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.os.Build

const val VERSION_BASE: Int = 1
const val VERSION_BASE_1_1: Int = 2
const val VERSION_CUPCAKE: Int = 3
const val VERSION_DONUT: Int = 4
const val VERSION_ECLAIR: Int = 5
const val VERSION_ECLAIR_0_1: Int = 6
const val VERSION_ECLAIR_MR1: Int = 7
const val VERSION_FROYO: Int = 8
const val VERSION_GINGERBREAD: Int = 9
const val VERSION_GINGERBREAD_MR1: Int = 10
const val VERSION_HONEYCOMB: Int = 11
const val VERSION_HONEYCOMB_MR1: Int = 12
const val VERSION_HONEYCOMB_MR2: Int = 13
const val VERSION_ICE_CREAM_SANDWICH: Int = 14
const val VERSION_ICE_CREAM_SANDWICH_MR1: Int = 15
const val VERSION_JELLY_BEAN: Int = 16
const val VERSION_JELLY_BEAN_MR1: Int = 17
const val VERSION_JELLY_BEAN_MR2: Int = 18
const val VERSION_KITKAT: Int = 19
const val VERSION_KITKAT_WATCH: Int = 20
const val VERSION_LOLLIPOP: Int = 21
const val VERSION_LOLLIPOP_MR1: Int = 22
const val VERSION_M: Int = 23
const val VERSION_N: Int = 24
const val VERSION_N_MR1: Int = 25
const val VERSION_O: Int = 26

/** Returns true if current sdk version is at least [version]. */
inline fun isAtLeast(version: Int): Boolean = Build.VERSION.SDK_INT >= version

/** Execute [block] if current sdk version is at least [version]. */
inline fun runIfAtLeast(version: Int, block: () -> Unit) {
    when {
        isAtLeast(version) -> block()
    }
}

/** Execute [block] if current sdk version is at least [version], [fallback] otherwise. */
inline fun runIfAtLeast(version: Int, block: () -> Unit, fallback: () -> Unit) {
    when {
        isAtLeast(version) -> block()
        else -> fallback()
    }
}

/** Return [block] if current sdk version is at least [version], null otherwise. */
inline fun <T, R> T.getIfAtLeast(version: Int, block: T.() -> R): R? {
    return when {
        isAtLeast(version) -> block()
        else -> null
    }
}

/** Return [block] if current sdk version is at least [version], [fallback] otherwise. */
inline fun <T, R> T.getIfAtLeast(version: Int, block: T.() -> R, fallback: T.() -> R): R {
    return when {
        isAtLeast(version) -> block()
        else -> fallback(this)
    }
}