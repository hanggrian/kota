@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.os.Build

const val VERSION_BASE: Int = Build.VERSION_CODES.BASE
const val VERSION_BASE_1_1: Int = Build.VERSION_CODES.BASE_1_1
const val VERSION_CUPCAKE: Int = Build.VERSION_CODES.CUPCAKE
const val VERSION_DONUT: Int = Build.VERSION_CODES.DONUT
const val VERSION_ECLAIR: Int = Build.VERSION_CODES.ECLAIR
const val VERSION_ECLAIR_0_1: Int = Build.VERSION_CODES.ECLAIR_0_1
const val VERSION_ECLAIR_MR1: Int = Build.VERSION_CODES.ECLAIR_MR1
const val VERSION_FROYO: Int = Build.VERSION_CODES.FROYO
const val VERSION_GINGERBREAD: Int = Build.VERSION_CODES.GINGERBREAD
const val VERSION_GINGERBREAD_MR1: Int = Build.VERSION_CODES.GINGERBREAD_MR1
const val VERSION_HONEYCOMB: Int = Build.VERSION_CODES.HONEYCOMB
const val VERSION_HONEYCOMB_MR1: Int = Build.VERSION_CODES.HONEYCOMB_MR1
const val VERSION_HONEYCOMB_MR2: Int = Build.VERSION_CODES.HONEYCOMB_MR2
const val VERSION_ICE_CREAM_SANDWICH: Int = Build.VERSION_CODES.ICE_CREAM_SANDWICH
const val VERSION_ICE_CREAM_SANDWICH_MR1: Int = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1
const val VERSION_JELLY_BEAN: Int = Build.VERSION_CODES.JELLY_BEAN
const val VERSION_JELLY_BEAN_MR1: Int = Build.VERSION_CODES.JELLY_BEAN_MR1
const val VERSION_JELLY_BEAN_MR2: Int = Build.VERSION_CODES.JELLY_BEAN_MR2
const val VERSION_KITKAT: Int = Build.VERSION_CODES.KITKAT
const val VERSION_KITKAT_WATCH: Int = Build.VERSION_CODES.KITKAT_WATCH
const val VERSION_LOLLIPOP: Int = Build.VERSION_CODES.LOLLIPOP
const val VERSION_LOLLIPOP_MR1: Int = Build.VERSION_CODES.LOLLIPOP_MR1
const val VERSION_M: Int = Build.VERSION_CODES.M
const val VERSION_N: Int = Build.VERSION_CODES.N
const val VERSION_N_MR1: Int = Build.VERSION_CODES.N_MR1
const val VERSION_O: Int = Build.VERSION_CODES.O

/** Returns true if current sdk version is at least [version]. */
inline fun isAtLeast(version: Int): Boolean = Build.VERSION.SDK_INT >= version

/** Execute [block] if current sdk version is at least [version]. */
inline fun runIfAtLeast(version: Int, block: () -> Unit) =
        if (isAtLeast(version)) block()
        else Unit

/** Execute [block] if current sdk version is at least [version], [fallback] otherwise. */
inline fun runIfAtLeast(version: Int, block: () -> Unit, fallback: () -> Unit) =
        if (isAtLeast(version)) block()
        else fallback()

/** Return [block] if current sdk version is at least [version], null otherwise. */
inline fun <T, R> T.getIfAtLeast(version: Int, block: T.() -> R): R? =
        if (isAtLeast(version)) block()
        else null

/** Return [block] if current sdk version is at least [version], [fallback] otherwise. */
inline fun <T, R> T.getIfAtLeast(version: Int, block: T.() -> R, fallback: T.() -> R): R =
        if (isAtLeast(version)) block()
        else fallback(this)