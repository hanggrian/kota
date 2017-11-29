@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableString.valueOf
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE

/** Returns a new [SpannableString] from [source] or the [source] itself if it is already an instance of [SpannableString]. */
inline fun CharSequence.toSpannable(): Spannable = valueOf(this)

inline fun Spannable.span(
        regex: Regex,
        flags: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable {
    val matcher = regex.toPattern().matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        for (span in spans) setSpan(span(substring(start, end)), start, end, flags)
    }
    return this
}

inline fun Spannable.span(
        regex: Regex,
        vararg spans: (s: CharSequence) -> Any
): Spannable = span(regex, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanFirst(
        regex: Regex,
        flags: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable {
    val matcher = regex.toPattern().matcher(this)
    matcher.find()
    val start = matcher.start()
    val end = matcher.end()
    for (span in spans) setSpan(span(substring(start, end)), start, end, flags)
    return this
}

inline fun Spannable.spanFirst(
        regex: Regex,
        vararg spans: (s: CharSequence) -> Any
): Spannable = spanFirst(regex, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanRange(
        start: Int,
        end: Int,
        flags: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable {
    for (span in spans) setSpan(span(substring(start, end)), start, end, flags)
    return this
}

inline fun Spannable.spanRange(
        start: Int,
        end: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable = spanRange(start, end, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanRange(
        range: IntRange,
        flags: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable {
    for (span in spans) setSpan(span(substring(range.start, range.endInclusive + 1)), range.start, range.endInclusive + 1, flags)
    return this
}

inline fun Spannable.spanRange(
        range: IntRange,
        vararg spans: (s: CharSequence) -> Any
): Spannable = spanRange(range, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanBefore(
        delimiter: Char,
        flags: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable {
    val index = indexOf(delimiter)
    return spanRange(0, index, flags, *spans)
}

inline fun Spannable.spanBefore(
        delimiter: Char,
        vararg spans: (s: CharSequence) -> Any
): Spannable = spanBefore(delimiter, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanBefore(
        delimiter: String,
        flags: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable {
    val index = indexOf(delimiter)
    return spanRange(0, index, flags, *spans)
}

inline fun Spannable.spanBefore(
        delimiter: String,
        vararg spans: (s: CharSequence) -> Any
): Spannable = spanBefore(delimiter, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanAfter(
        delimiter: Char,
        flags: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable {
    val index = indexOf(delimiter)
    return spanRange(index, length, flags, *spans)
}

inline fun Spannable.spanAfter(
        delimiter: Char,
        vararg spans: (s: CharSequence) -> Any
): Spannable = spanAfter(delimiter, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanAfter(
        delimiter: String,
        flags: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable {
    val index = indexOf(delimiter)
    return spanRange(index, length, flags, *spans)
}

inline fun Spannable.spanAfter(
        delimiter: String,
        vararg spans: (s: CharSequence) -> Any
): Spannable = spanAfter(delimiter, SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

inline fun Spannable.spanAll(
        flags: Int,
        vararg spans: (s: CharSequence) -> Any
): Spannable = spanRange(0, length, flags, *spans)

inline fun Spannable.spanAll(
        vararg spans: (s: CharSequence) -> Any
): Spannable = spanAll(SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

/** Remove [spans] from this text. */
inline fun Spannable.despan(vararg spans: Any): Spannable {
    for (span in spans) removeSpan(span)
    return this
}

/** Clear all spans from this text. */
inline fun Spannable.despanAll(): Spannable = despan(*spans)