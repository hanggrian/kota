@file:JvmName("Spans")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.*
import com.hendraanggrian.kota.annotation.SpanFlags
import java.util.regex.Pattern

inline fun spannedOf(s: CharSequence): Spanned = SpannedString.valueOf(s)
inline fun spannableOf(s: CharSequence): Spannable = SpannableString.valueOf(s)
inline fun spannableBuilderOf(s: CharSequence): SpannableStringBuilder = SpannableStringBuilder.valueOf(s)

inline fun <T> Spanned.getSpans(type: Class<T>): Array<T> = getSpans(0, length, type)

@JvmOverloads inline fun Spannable.setSpans(
        vararg spans: Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE,
        start: Int = 0,
        end: Int = length
) = spans.forEach { setSpan(it, start, end, flags) }

@JvmOverloads inline fun Spannable.putSpans(
        substring: String,
        vararg spans: () -> Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
) = toString().listOccurrences(substring).forEach {
    val start = it
    val end = it + substring.length
    spans.forEach { setSpan(it.invoke(), start, end, flags) }
}

@JvmOverloads inline fun Spannable.putSpansAll(
        regex: String,
        vararg spans: () -> Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
) = putSpansAll(Pattern.compile(regex), *spans, flags = flags)

@JvmOverloads inline fun Spannable.putSpansAll(
        regex: Pattern,
        vararg spans: () -> Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
) {
    val matcher = regex.matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        spans.forEach { setSpan(it.invoke(), start, end, flags) }
    }
}

inline fun Spannable.removeSpans(vararg spans: Any) = spans.forEach { removeSpan(it) }

inline fun <T> Spannable.removeSpans(type: Class<T>) = getSpans(type).forEach { removeSpan(it) }

inline fun String.listOccurrences(substring: String): MutableList<Int> {
    val lastIndexes = ArrayList<Int>()
    var lastIndex = 0
    while (lastIndex != -1) {
        lastIndex = indexOf(substring, lastIndex)
        if (lastIndex != -1) {
            lastIndexes.add(lastIndex)
            lastIndex += substring.length
        }
    }
    return lastIndexes
}

inline fun String.formatSpannable(vararg args: Pair<Any, Array<out Any>>): SpannableString {
    val list = listOccurrences("%")
    for (start in listOccurrences("%%")) {
        list.remove(Integer.valueOf(start))
        list.remove(Integer.valueOf(start + 1))
    }
    if (list.size != args.size) {
        throw IllegalArgumentException("Expected argument " + list.size + ", was " + args.size)
    }
    val builder = SpannableStringBuilder()
    var remaining = this
    var lastIndex = 0
    for (i in args.indices) {
        val subformat = substring(lastIndex, list[i] + 2)
        lastIndex = list[i] + 2
        remaining = remaining.substring(subformat.length)
        builder.append(subformat.substring(0, subformat.length - 2))
        val arg = args[i]
        if (arg.second.isNotEmpty()) {
            builder.append(String.format(subformat.substring(subformat.length - 2), arg.first), spans = *arg.second, flags = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        } else {
            builder.append(String.format(subformat.substring(subformat.length - 2), arg.first))
        }
    }
    builder.append(remaining)
    return spannableOf(builder) as SpannableString
}

@JvmOverloads inline fun SpannableStringBuilder.append(
        text: CharSequence,
        vararg spans: Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
): SpannableStringBuilder {
    append(text)
    val end = length
    val start = end - text.length
    spans.forEach { setSpan(it, start, end, flags) }
    return this
}