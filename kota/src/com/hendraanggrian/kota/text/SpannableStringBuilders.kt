@file:JvmName("SpannableStringBuilders")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.SpannableStringBuilder
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
import com.hendraanggrian.kota.annotation.SpanFlags

inline fun CharSequence.toSpannableStringBuilder() = SpannableStringBuilder.valueOf(this)!!

inline fun SpannableStringBuilder.append(text: CharSequence, vararg spans: Any) = append(text, *spans, flags = SPAN_EXCLUSIVE_EXCLUSIVE)

inline fun SpannableStringBuilder.append(text: CharSequence, vararg spans: Any, @SpanFlags flags: Int): SpannableStringBuilder {
    append(text)
    val end = length
    val start = end - text.length
    spans.forEach {
        setSpan(it, start, end, flags)
    }
    return this
}