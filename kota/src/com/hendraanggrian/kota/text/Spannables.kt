@file:JvmName("Spannables")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.Spannable
import android.text.Spanned
import com.hendraanggrian.kota.annotation.SpanFlags
import java.util.regex.Pattern

/**
 * Set spans from start to end with certain flag.
 */
@JvmOverloads inline fun Spannable.setSpans(
        vararg spans: Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE,
        start: Int = 0,
        end: Int = length
): Unit = spans.forEach {
    setSpan(it, start, end, flags)
}

/**
 * Remove multiple spans in this Spannable.
 */
inline fun Spannable.removeSpans(
        vararg spans: Any
): Unit = spans.forEach {
    removeSpan(it)
}

@Suppress("UNCHECKED_CAST")
@JvmOverloads inline fun <T> Spannable.removeAllSpans(
        type: Class<T> = Any::class.java as Class<T>
): Unit = getAllSpans(type).forEach {
    removeSpan(it)
}

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
    spans.forEach {
        setSpan(it.invoke(), start, end, flags)
    }
}

/**
 * Find substring with regex pattern in this Spannable and set multiple spans to it.
 */
@JvmOverloads inline fun Spannable.putSpansAll(
        regex: String,
        vararg spans: () -> Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
): Unit {
    val matcher = Pattern.compile(regex).matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        spans.forEach {
            setSpan(it.invoke(), start, end, flags)
        }
    }
}

@JvmOverloads inline fun Spannable.putSpansAll(
        regex: Pattern,
        vararg spans: () -> Any,
        @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
): Unit {
    val matcher = regex.matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        spans.forEach {
            setSpan(it.invoke(), start, end, flags)
        }
    }
}

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