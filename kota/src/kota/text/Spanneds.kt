@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.Spanned
import android.text.SpannedString

/** Returns a new [SpannedString] from [source] or the [source] itself if it is already an instance of [SpannedString]. */
inline fun CharSequence.toSpanned(): Spanned = SpannedString.valueOf(this)

/** Get all spans that are instance of [type]. */
inline fun <reified T> Spanned.getSpans(type: Class<T>): Array<out T> = getSpans(0, length, type)

/** Get all spans attached from this text. */
inline val Spanned.spans: Array<out Any> get() = getSpans(Any::class.java)