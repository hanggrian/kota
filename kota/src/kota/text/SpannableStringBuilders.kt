@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.SpannableStringBuilder
import android.text.SpannableStringBuilder.valueOf
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE

/** Returns a new [SpannableStringBuilder] from source or the source itself if it is already an instance of [SpannableStringBuilder]. */
inline fun CharSequence.toSpannableBuilder(): SpannableStringBuilder = valueOf(this)

/** Append text with [spans] applied. */
@JvmOverloads
inline fun SpannableStringBuilder.append(
        text: CharSequence,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): SpannableStringBuilder {
    append(text)
    val end = length
    val start = end - text.length
    spanRange(start, end, *spans, flags = flags)
    return this
}