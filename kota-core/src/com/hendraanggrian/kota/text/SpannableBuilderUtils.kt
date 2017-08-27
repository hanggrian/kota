@file:JvmName("SpannableBuilderUtils")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.SpannableStringBuilder
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
import com.hendraanggrian.kota.annotation.SpanFlags

inline fun spannableBuilderOf(s: CharSequence): SpannableStringBuilder = SpannableStringBuilder.valueOf(s)

@JvmOverloads inline fun SpannableStringBuilder.append(
        text: CharSequence,
        vararg spans: Any,
        @SpanFlags flags: Int = SPAN_EXCLUSIVE_EXCLUSIVE
): SpannableStringBuilder {
    append(text)
    val end = length
    val start = end - text.length
    spans.forEach { setSpan(it, start, end, flags) }
    return this
}