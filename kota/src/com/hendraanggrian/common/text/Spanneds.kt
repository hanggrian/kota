@file:JvmName("Spanneds")
@file:Suppress("NOTHING_TO_INLINE")

package com.hendraanggrian.common.text

import android.text.Spanned
import android.text.SpannedString

inline fun CharSequence.toSpanned(): Spanned = SpannedString.valueOf(this)

/**
 * Get all spans instance of [type] from text start to text end.
 */
@Suppress("UNCHECKED_CAST")
@JvmOverloads inline fun <T> Spanned.getSpans(
        type: Class<T> = Any::class.java as Class<T>
): Array<T> = getSpans(0, length, type)