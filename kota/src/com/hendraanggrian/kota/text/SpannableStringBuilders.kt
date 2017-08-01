package com.hendraanggrian.kota.text

import android.text.SpannableStringBuilder
import android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
import com.hendraanggrian.kota.annotation.SpanFlags

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

fun CharSequence.toSpannableStringBuilder(): SpannableStringBuilder = SpannableStringBuilder.valueOf(this)

fun SpannableStringBuilder.append(text: CharSequence, vararg spans: Any): SpannableStringBuilder = append(text, *spans, flags = SPAN_EXCLUSIVE_EXCLUSIVE)

fun SpannableStringBuilder.append(text: CharSequence, vararg spans: Any, @SpanFlags flags: Int): SpannableStringBuilder {
    append(text)
    val end = length
    val start = end - text.length
    spans.forEach {
        setSpan(it, start, end, flags)
    }
    return this
}