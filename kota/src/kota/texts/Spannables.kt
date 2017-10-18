@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.texts

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE

/** Returns a new [SpannableString] from [source] or the [source] itself if it is already an instance of [SpannableString]. */
inline fun spannableOf(source: CharSequence, flags: Int, vararg spans: Any): Spannable = SpannableString.valueOf(source).apply { setSpans(flags, *spans) }

inline fun spannableOf(source: CharSequence, vararg spans: Any): Spannable = SpannableString.valueOf(source).apply { setSpans(*spans) }

/** Set [spans] from [start] to [end]. */
inline fun Spannable.setSpans(flags: Int, start: Int, end: Int, vararg spans: Any) = spans.forEach { setSpan(it, start, end, flags) }

/** Set [spans] from [start] to [end] using default flags. */
inline fun Spannable.setSpans(start: Int, end: Int, vararg spans: Any) = setSpans(SPAN_EXCLUSIVE_EXCLUSIVE, start, end, *spans)

/** Set [spans] to entire text. */
inline fun Spannable.setSpans(flags: Int, vararg spans: Any) = setSpans(0, length, *spans, flags)

/** Set [spans] to entire text using default flags. */
inline fun Spannable.setSpans(vararg spans: Any) = setSpans(SPAN_EXCLUSIVE_EXCLUSIVE, *spans)

/** Find substrings with [regex] and set [spans] to each of them. */
inline fun Spannable.putSpans(flags: Int, regex: Regex, vararg spans: () -> Any) {
    val matcher = regex.toPattern().matcher(this)
    while (matcher.find()) {
        spans.forEach {
            setSpan(it(), matcher.start(), matcher.end(), flags)
        }
    }
}

/** Find substrings with [regex] and set [spans] to each of them using default flags. */
inline fun Spannable.putSpans(regex: Regex, vararg spans: () -> Any) = putSpans(SPAN_EXCLUSIVE_EXCLUSIVE, regex, *spans)

/** Remove [spans] from this text. */
inline fun Spannable.removeSpans(vararg spans: Any) = spans.forEach { removeSpan(it) }

/** Clear all spans from this text. */
inline fun Spannable.clearSpans() = removeSpans(spans)