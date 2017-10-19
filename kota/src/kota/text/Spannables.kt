@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE

/** Returns a new [SpannableString] from [source] or the [source] itself if it is already an instance of [SpannableString]. */
inline fun CharSequence.toSpannable(): Spannable = SpannableString.valueOf(this)

inline fun Spannable.span(regex: Regex, flags: Int, vararg spans: () -> Any): Spannable {
    val matcher = regex.toPattern().matcher(this)
    while (matcher.find()) {
        for (span in spans) setSpan(span, matcher.start(), matcher.end(), flags)
    }
    return this
}

inline fun Spannable.span(regex: Regex, vararg spans: () -> Any): Spannable =
        span(regex, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanFirst(regex: Regex, flags: Int, vararg spans: () -> Any): Spannable {
    val matcher = regex.toPattern().matcher(this)
    matcher.find()
    for (span in spans) setSpan(span, matcher.start(), matcher.end(), flags)
    return this
}

inline fun Spannable.spanFirst(regex: Regex, vararg spans: () -> Any): Spannable =
        spanFirst(regex, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanRange(start: Int, end: Int, flags: Int, vararg spans: Any): Spannable {
    for (span in spans) setSpan(span, start, end, flags)
    return this
}

inline fun Spannable.spanRange(start: Int, end: Int, vararg spans: Any): Spannable =
        spanRange(start, end, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanRange(range: IntRange, flags: Int, vararg spans: Any): Spannable {
    for (span in spans) setSpan(span, range.start, range.endInclusive + 1, flags)
    return this
}

inline fun Spannable.spanRange(range: IntRange, vararg spans: Any): Spannable =
        spanRange(range, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanBefore(delimiter: Char, flags: Int, vararg spans: () -> Any): Spannable {
    val index = indexOf(delimiter)
    return spanRange(0, index, flags, *spans)
}

inline fun Spannable.spanBefore(delimiter: Char, vararg spans: () -> Any): Spannable =
        spanBefore(delimiter, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanBefore(delimiter: String, flags: Int, vararg spans: () -> Any): Spannable {
    val index = indexOf(delimiter)
    return spanRange(0, index, flags, *spans)
}

inline fun Spannable.spanBefore(delimiter: String, vararg spans: () -> Any): Spannable =
        spanBefore(delimiter, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanAfter(delimiter: Char, flags: Int, vararg spans: () -> Any): Spannable {
    val index = indexOf(delimiter)
    return spanRange(index, length, flags, *spans)
}

inline fun Spannable.spanAfter(delimiter: Char, vararg spans: () -> Any): Spannable =
        spanAfter(delimiter, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanAfter(delimiter: String, flags: Int, vararg spans: () -> Any): Spannable {
    val index = indexOf(delimiter)
    return spanRange(index, length, flags, *spans)
}

inline fun Spannable.spanAfter(delimiter: String, vararg spans: () -> Any): Spannable =
        spanAfter(delimiter, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanAll(flags: Int, vararg spans: Any): Spannable =
        spanRange(0, length, flags, *spans)

inline fun Spannable.spanAll(vararg spans: Any): Spannable =
        spanAll(SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

/** Remove [spans] from this text. */
inline fun Spannable.removeSpans(vararg spans: Any) {
    for (span in spans) removeSpan(span)
}

/** Clear all spans from this text. */
inline fun Spannable.clearSpans() = removeSpans(spans)