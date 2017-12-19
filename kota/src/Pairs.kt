@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

/** Converts Android's pair to Kotlin's. */
inline fun <K, V> android.util.Pair<K, V>.toKotlinPair(): Pair<K, V> = Pair(first, second)

/** Converts Kotlin's pair to Android's. */
inline fun <K, V> Pair<K, V>.toFXPair(): android.util.Pair<K, V> = android.util.Pair(first, second)