@file:JvmName("SpannableStringBuilders")
@file:Suppress("NOTHING_TO_INLINE")

package com.hendraanggrian.common.text

import android.text.SpannableStringBuilder
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
import com.hendraanggrian.common.annotation.SpanFlags

inline fun CharSequence.toSpannableBuilder(): SpannableStringBuilder = SpannableStringBuilder.valueOf(this)

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