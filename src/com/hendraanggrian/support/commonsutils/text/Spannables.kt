package com.hendraanggrian.support.commonsutils.text

import android.text.Spannable
import android.text.Spanned
import com.hendraanggrian.support.commonsutils.annotation.SpanFlags
import java.util.regex.Pattern

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

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
fun <T : Spannable> T.removeSpans(vararg spans: Any): T {
    spans.forEach {
        removeSpan(it)
    }
    return this
}

/**
 * Find substring in this Spannable and set multiple spans to it.
 */
@JvmOverloads
fun <T : Spannable> T.putSpans(substring: String, vararg spans: () -> Any, @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE): T {
    for (start in toString().listOccurrences(substring)) {
        val end = start + substring.length
        spans.forEach {
            setSpan(it.invoke(), start, end, flags)
        }
    }
    return this
}

/**
 * Find substring with regex pattern in this Spannable and set multiple spans to it.
 */
@JvmOverloads
fun <T : Spannable> T.putSpansAll(regex: String, vararg spans: () -> Any, @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE): T {
    val matcher = Pattern.compile(regex).matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        spans.forEach {
            setSpan(it.invoke(), start, end, flags)
        }
    }
    return this
}

@JvmOverloads
fun <T : Spannable> T.putSpansAll(regex: Pattern, vararg spans: () -> Any, @SpanFlags flags: Int = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE): T {
    val matcher = regex.matcher(this)
    while (matcher.find()) {
        val start = matcher.start()
        val end = matcher.end()
        spans.forEach {
            setSpan(it.invoke(), start, end, flags)
        }
    }
    return this
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