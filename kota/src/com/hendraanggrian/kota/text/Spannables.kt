package com.hendraanggrian.kota.text

import android.text.Spannable
import android.text.Spanned
import com.hendraanggrian.kota.annotation.SpanFlags
import java.util.regex.Pattern

/**
 * Set spans from start to end with certain flag.
 */
@JvmOverloads
fun Spannable.setSpans(vararg spans: Any, @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE, start: Int = 0, end: Int = length) {
    spans.forEach {
        setSpan(it, start, end, flags)
    }
}

/**
 * Remove multiple spans in this Spannable.
 */
fun Spannable.removeSpans(vararg spans: Any) {
    spans.forEach {
        removeSpan(it)
    }
}

fun <T> Spannable.removeAllSpans(type: Class<T>) {
    removeSpans(getAllSpans(type))
}

fun <T> Spannable.removeAllSpans() {
    removeSpans(getAllSpans())
}

/**
 * Find substring in this Spannable and set multiple spans to it.
 */
@JvmOverloads
fun Spannable.putSpans(substring: String, vararg spans: () -> Any, @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) {
    for (start in toString().listOccurrences(substring)) {
        val end = start + substring.length
        spans.forEach {
            setSpan(it.invoke(), start, end, flags)
        }
    }
}

/**
 * Find substring with regex pattern in this Spannable and set multiple spans to it.
 */
@JvmOverloads
fun Spannable.putSpansAll(regex: String, vararg spans: () -> Any, @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) {
    val matcher = Pattern.compile(regex).matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        spans.forEach {
            setSpan(it.invoke(), start, end, flags)
        }
    }
}

@JvmOverloads
fun Spannable.putSpansAll(regex: Pattern, vararg spans: () -> Any, @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) {
    val matcher = regex.matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        spans.forEach {
            setSpan(it.invoke(), start, end, flags)
        }
    }
}

internal fun String.listOccurrences(substring: String): MutableList<Int> {
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