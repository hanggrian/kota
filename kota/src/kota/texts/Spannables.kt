@file:JvmMultifileClass
@file:JvmName("SpansKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.texts

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned

/** Returns a new [SpannableString] from [source] or the [source] itself if it is already an instance of [SpannableString]. */
inline fun CharSequence.toSpannable(): Spannable = SpannableString.valueOf(this)

/** Set [spans] from [start] to [end]. */
@JvmOverloads
inline fun Spannable.setSpans(start: Int, end: Int, vararg spans: Any, flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) = spans.forEach { setSpan(it, start, end, flags) }

/** Set [spans] to entire text. */
@JvmOverloads
inline fun Spannable.setSpans(vararg spans: Any, flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) = setSpans(0, length, *spans, flags)

/** Find substrings with [regex] and set [spans] to each of them. */
@JvmOverloads
inline fun Spannable.putSpans(regex: Regex, vararg spans: () -> Any, flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) {
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