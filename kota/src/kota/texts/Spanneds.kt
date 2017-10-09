@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.texts

import android.text.Spanned
import android.text.SpannedString

/** Returns a new [SpannedString] from [source] or the [source] itself if it is already an instance of [SpannedString]. */
inline fun CharSequence.toSpanned(): Spanned = SpannedString.valueOf(this)

/** Get all spans that are instance of [type]. */
inline fun <T> Spanned.getSpans(type: Class<T>): Array<T> = getSpans(0, length, type)

/** Get all spans attached from this text. */
inline val Spanned.spans: Array<*> get() = getSpans(Any::class.java)