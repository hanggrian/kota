@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.SpannableStringBuilder
import android.text.SpannableStringBuilder.valueOf
import android.text.Spanned
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE

/** Returns a new [SpannableStringBuilder] from [source] or the [source] itself if it is already an instance of [SpannableStringBuilder]. */
inline fun CharSequence.toSpannableBuilder(): SpannableStringBuilder = valueOf(this)

inline operator fun Spanned.plus(other: Char): SpannableStringBuilder = toSpannableBuilder().append(other)
inline operator fun Spanned.plus(other: CharSequence): SpannableStringBuilder = toSpannableBuilder().append(other)

/** Append text with [spans] applied. */
inline fun SpannableStringBuilder.append(flags: Int, text: CharSequence, vararg spans: Any): SpannableStringBuilder {
    append(text)
    val end = length
    val start = end - text.length
    spans.forEach { setSpan(it, start, end, flags) }
    return this
}

/** Append text with [spans] applied using default flags. */
inline fun SpannableStringBuilder.append(text: CharSequence, vararg spans: Any): SpannableStringBuilder =
        append(SPAN_EXCLUSIVE_EXCLUSIVE, text, *spans)