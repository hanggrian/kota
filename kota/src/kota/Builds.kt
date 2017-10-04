@file:JvmName("BuildsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.os.Build

val VERSION_BASE: Int get() = Build.VERSION_CODES.BASE
val VERSION_BASE_1_1: Int get() = Build.VERSION_CODES.BASE_1_1
val VERSION_CUPCAKE: Int get() = Build.VERSION_CODES.CUPCAKE
val VERSION_DONUT: Int get() = Build.VERSION_CODES.DONUT
val VERSION_ECLAIR: Int get() = Build.VERSION_CODES.ECLAIR
val VERSION_ECLAIR_0_1: Int get() = Build.VERSION_CODES.ECLAIR_0_1
val VERSION_ECLAIR_MR1: Int get() = Build.VERSION_CODES.ECLAIR_MR1
val VERSION_FROYO: Int get() = Build.VERSION_CODES.FROYO
val VERSION_GINGERBREAD: Int get() = Build.VERSION_CODES.GINGERBREAD
val VERSION_GINGERBREAD_MR1: Int get() = Build.VERSION_CODES.GINGERBREAD_MR1
val VERSION_HONEYCOMB: Int get() = Build.VERSION_CODES.HONEYCOMB
val VERSION_HONEYCOMB_MR1: Int get() = Build.VERSION_CODES.HONEYCOMB_MR1
val VERSION_HONEYCOMB_MR2: Int get() = Build.VERSION_CODES.HONEYCOMB_MR2
val VERSION_ICE_CREAM_SANDWICH: Int get() = Build.VERSION_CODES.ICE_CREAM_SANDWICH
val VERSION_ICE_CREAM_SANDWICH_MR1: Int get() = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1
val VERSION_JELLY_BEAN: Int get() = Build.VERSION_CODES.JELLY_BEAN
val VERSION_JELLY_BEAN_MR1: Int get() = Build.VERSION_CODES.JELLY_BEAN_MR1
val VERSION_JELLY_BEAN_MR2: Int get() = Build.VERSION_CODES.JELLY_BEAN_MR2
val VERSION_KITKAT: Int get() = Build.VERSION_CODES.KITKAT
val VERSION_KITKAT_WATCH: Int get() = Build.VERSION_CODES.KITKAT_WATCH
val VERSION_LOLLIPOP: Int get() = Build.VERSION_CODES.LOLLIPOP
val VERSION_LOLLIPOP_MR1: Int get() = Build.VERSION_CODES.LOLLIPOP_MR1
val VERSION_M: Int get() = Build.VERSION_CODES.M
val VERSION_N: Int get() = Build.VERSION_CODES.N
val VERSION_N_MR1: Int get() = Build.VERSION_CODES.N_MR1
val VERSION_O: Int get() = Build.VERSION_CODES.O

/** Returns true if current sdk version is at least [version]. */
inline fun isAtLeast(version: Int): Boolean = Build.VERSION.SDK_INT >= version

/** Execute [block] if current sdk version is at least [version]. */
inline fun runIfAtLeast(version: Int, block: () -> Unit) {
    if (isAtLeast(version)) block()
}

/** Execute [block] if current sdk version is at least [version], [fallback] otherwise. */
inline fun runIfAtLeast(version: Int, block: () -> Unit, fallback: () -> Unit) {
    if (isAtLeast(version)) block()
    else fallback()
}

/** Return [block] if current sdk version is at least [version], null otherwise. */
inline fun <T, R> T.getIfAtLeast(version: Int, block: T.() -> R): R? {
    return if (isAtLeast(version)) block()
    else null
}

/** Return [block] if current sdk version is at least [version], [fallback] otherwise. */
inline fun <T, R> T.getIfAtLeast(version: Int, block: T.() -> R, fallback: T.() -> R): R {
    return if (isAtLeast(version)) block()
    else fallback(this)
}