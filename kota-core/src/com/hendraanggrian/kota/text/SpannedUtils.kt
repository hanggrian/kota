@file:JvmName("SpannedUtils")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.Spanned
import android.text.SpannedString

inline fun spannedOf(s: CharSequence): Spanned = SpannedString.valueOf(s)

/**
 * Get all spans instance of [type] from text start to text end.
 */
inline fun <T> Spanned.getSpans(type: Class<T>): Array<T> = getSpans(0, length, type)