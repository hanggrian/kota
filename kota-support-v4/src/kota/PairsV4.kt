@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

/** Converts Android support's pair to Kotlin's. */
inline fun <K, V> android.support.v4.util.Pair<K, V>.toKotlinPair(): Pair<K, V> = Pair(first!!, second!!)

/** Converts Kotlin's pair to Android support's. */
inline fun <K, V> Pair<K, V>.toFXPair(): android.support.v4.util.Pair<K, V> = android.support.v4.util.Pair(first, second)