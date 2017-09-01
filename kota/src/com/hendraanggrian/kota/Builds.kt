@file:JvmName("Builds")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.os.Build

inline val VERSION_BASE: Int get() = Build.VERSION_CODES.BASE
inline val VERSION_BASE_1_1: Int get() = Build.VERSION_CODES.BASE_1_1
inline val VERSION_CUPCAKE: Int get() = Build.VERSION_CODES.CUPCAKE
inline val VERSION_CUR_DEVELOPMENT: Int get() = Build.VERSION_CODES.CUR_DEVELOPMENT
inline val VERSION_DONUT: Int get() = Build.VERSION_CODES.DONUT
inline val VERSION_ECLAIR: Int get() = Build.VERSION_CODES.ECLAIR
inline val VERSION_ECLAIR_0_1: Int get() = Build.VERSION_CODES.ECLAIR_0_1
inline val VERSION_ECLAIR_MR1: Int get() = Build.VERSION_CODES.ECLAIR_MR1
inline val VERSION_FROYO: Int get() = Build.VERSION_CODES.FROYO
inline val VERSION_GINGERBREAD: Int get() = Build.VERSION_CODES.GINGERBREAD
inline val VERSION_GINGERBREAD_MR1: Int get() = Build.VERSION_CODES.GINGERBREAD_MR1
inline val VERSION_HONEYCOMB: Int get() = Build.VERSION_CODES.HONEYCOMB
inline val VERSION_HONEYCOMB_MR1: Int get() = Build.VERSION_CODES.HONEYCOMB_MR1
inline val VERSION_HONEYCOMB_MR2: Int get() = Build.VERSION_CODES.HONEYCOMB_MR2
inline val VERSION_ICE_CREAM_SANDWICH: Int get() = Build.VERSION_CODES.ICE_CREAM_SANDWICH
inline val VERSION_ICE_CREAM_SANDWICH_MR1: Int get() = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1
inline val VERSION_JELLY_BEAN: Int get() = Build.VERSION_CODES.JELLY_BEAN
inline val VERSION_JELLY_BEAN_MR1: Int get() = Build.VERSION_CODES.JELLY_BEAN_MR1
inline val VERSION_JELLY_BEAN_MR2: Int get() = Build.VERSION_CODES.JELLY_BEAN_MR2
inline val VERSION_KITKAT: Int get() = Build.VERSION_CODES.KITKAT
inline val VERSION_KITKAT_WATCH: Int get() = Build.VERSION_CODES.KITKAT_WATCH
inline val VERSION_LOLLIPOP: Int get() = Build.VERSION_CODES.LOLLIPOP
inline val VERSION_LOLLIPOP_MR1: Int get() = Build.VERSION_CODES.LOLLIPOP_MR1
inline val VERSION_M: Int get() = Build.VERSION_CODES.M
inline val VERSION_N: Int get() = Build.VERSION_CODES.N
inline val VERSION_N_MR1: Int get() = Build.VERSION_CODES.N_MR1
inline val VERSION_O: Int get() = Build.VERSION_CODES.O

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