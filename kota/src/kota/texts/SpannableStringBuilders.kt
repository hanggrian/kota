@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.texts

import android.text.SpannableStringBuilder
import android.text.Spanned

/** Returns a new [SpannableStringBuilder] from [source] or the [source] itself if it is already an instance of [SpannableStringBuilder]. */
inline fun CharSequence.toSpannableBuilder(): SpannableStringBuilder = SpannableStringBuilder.valueOf(this)

/** Append text with [spans] applied. */
@JvmOverloads
inline fun SpannableStringBuilder.append(text: CharSequence, vararg spans: Any, flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE): SpannableStringBuilder {
    append(text)
    val end = length
    val start = end - text.length
    spans.forEach { setSpan(it, start, end, flags) }
    return this
}