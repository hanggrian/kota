@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableString.valueOf
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE

/** Returns a new [SpannableString] from source or the source itself if it is already an instance of [SpannableString]. */
inline fun CharSequence.toSpannable(): Spannable = valueOf(this)

@JvmOverloads
inline fun Spannable.span(
        regex: Regex,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable {
    val matcher = regex.toPattern().matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        spanRange(start, end, *spans, flags = flags)
    }
    return this
}

@JvmOverloads
inline fun Spannable.span(
        regex: String,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable = span(regex.toRegex(), *spans, flags = flags)

@JvmOverloads
inline fun Spannable.spanFirst(
        regex: Regex,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable {
    val matcher = regex.toPattern().matcher(this)
    matcher.find()
    val start = matcher.start()
    val end = matcher.end()
    spanRange(start, end, *spans, flags = flags)
    return this
}

@JvmOverloads
inline fun Spannable.spanFirst(
        regex: String,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable = spanFirst(regex.toRegex(), *spans, flags = flags)

@JvmOverloads
inline fun Spannable.spanRange(
        start: Int,
        end: Int,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable {
    for (span in spans) setSpan(span(substring(start, end)), start, end, flags)
    return this
}

@JvmOverloads
inline fun Spannable.spanRange(
        range: IntRange,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable {
    for (span in spans) setSpan(span(substring(range.start, range.endInclusive + 1)), range.start, range.endInclusive + 1, flags)
    return this
}

@JvmOverloads
inline fun Spannable.spanBefore(
        delimiter: Char,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable {
    val index = indexOf(delimiter)
    return spanRange(0, index, *spans, flags = flags)
}

@JvmOverloads
inline fun Spannable.spanBefore(
        delimiter: String,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable {
    val index = indexOf(delimiter)
    return spanRange(0, index, *spans, flags = flags)
}

@JvmOverloads
inline fun Spannable.spanAfter(
        delimiter: Char,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable {
    val index = indexOf(delimiter)
    return spanRange(index, length, *spans, flags = flags)
}

@JvmOverloads
inline fun Spannable.spanAfter(
        delimiter: String,
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable {
    val index = indexOf(delimiter)
    return spanRange(index, length, *spans, flags = flags)
}

@JvmOverloads
inline fun Spannable.spanAll(
        vararg spans: (s: String) -> Any,
        flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): Spannable = spanRange(0, length, *spans, flags = flags)

/** Remove [spans] from this text. */
inline fun Spannable.removeSpans(vararg spans: Any) {
    for (span in spans) removeSpan(span)
}

/** Clear all spans from this text. */
inline fun Spannable.clearSpans() = removeSpans(*spans)