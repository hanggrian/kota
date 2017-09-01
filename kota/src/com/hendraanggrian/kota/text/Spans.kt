@file:JvmName("Spans")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.*

/** Returns a new [SpannedString] from [source] or the [source] itself if it is already an instance of [SpannedString]. */
inline fun spannedOf(source: CharSequence): Spanned = SpannedString.valueOf(source)

/** Returns a new [SpannableString] from [source] or the [source] itself if it is already an instance of [SpannableString]. */
inline fun spannableOf(source: CharSequence): Spannable = SpannableString.valueOf(source)

/** Returns a new [SpannableStringBuilder] from [source] or the [source] itself if it is already an instance of [SpannableStringBuilder]. */
inline fun spannableBuilderOf(source: CharSequence): SpannableStringBuilder = SpannableStringBuilder.valueOf(source)

/** Get all spans attached from this text. */
inline val Spanned.spans: Array<*> get() = getSpans(Any::class.java)

/** Get all spans that are instance of [type]. */
inline fun <T> Spanned.getSpans(type: Class<T>): Array<T> = getSpans(0, length, type)

/** Set [spans] from [start] to [end]. */
@JvmOverloads inline fun Spannable.setSpans(start: Int, end: Int, vararg spans: Any, flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) = spans.forEach { setSpan(it, start, end, flags) }

/** Set [spans] to entire text. */
@JvmOverloads inline fun Spannable.setSpans(vararg spans: Any, flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) = setSpans(0, length, *spans, flags)

/** Find substrings with [regex] and set [spans] to each of them. */
@JvmOverloads inline fun Spannable.putSpans(regex: Regex, vararg spans: () -> Any, flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) {
    val matcher = regex.toPattern().matcher(this)
    while (matcher.find()) {
        spans.forEach {
            setSpan(it(), matcher.start(), matcher.end(), flags)
        }
    }
}

/** Remove [spans] from this text. */
inline fun Spannable.removeSpans(vararg spans: Any) = spans.forEach { removeSpan(it) }

/** Clear all spans from this text. */
inline fun Spannable.clearSpans() = removeSpans(spans)

/** Append text with [spans] applied. */
@JvmOverloads inline fun SpannableStringBuilder.append(
        text: CharSequence,
        vararg spans: Any,
        flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
): SpannableStringBuilder {
    append(text)
    val end = length
    val start = end - text.length
    spans.forEach { setSpan(it, start, end, flags) }
    return this
}