@file:JvmName("SpannableUtils")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.support.v4.util.Pair
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import com.hendraanggrian.kota.annotation.SpanFlags
import java.util.regex.Pattern

inline fun spannableOf(s: CharSequence): Spannable = SpannableString.valueOf(s)

/**
 * Set spans from start to end with certain flag.
 */
@JvmOverloads inline fun Spannable.setSpans(
        vararg spans: Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE,
        start: Int = 0,
        end: Int = length
): Unit = spans.forEach { setSpan(it, start, end, flags) }

/**
 * Find substring in this Spannable and set multiple spans to it.
 */
@JvmOverloads inline fun Spannable.putSpans(
        substring: String,
        vararg spans: () -> Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
): Unit = toString().listOccurrences(substring).forEach {
    val start = it
    val end = it + substring.length
    spans.forEach { setSpan(it.invoke(), start, end, flags) }
}

/**
 * Find substring with regex pattern in this Spannable and set multiple spans to it.
 */
@JvmOverloads inline fun Spannable.putSpansAll(
        regex: String,
        vararg spans: () -> Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
): Unit = putSpansAll(Pattern.compile(regex), *spans, flags = flags)

@JvmOverloads inline fun Spannable.putSpansAll(
        regex: Pattern,
        vararg spans: () -> Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
): Unit {
    val matcher = regex.matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        spans.forEach { setSpan(it.invoke(), start, end, flags) }
    }
}

inline fun Spannable.removeSpans(vararg spans: Any): Unit = spans.forEach { removeSpan(it) }

inline fun <T> Spannable.removeSpans(type: Class<T>): Unit = getSpans(type).forEach { removeSpan(it) }

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