@file:JvmName("Spanneds")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.Spanned

inline fun Spanned.getAllSpans() = getAllSpans(Any::class.java)

inline fun <T> Spanned.getAllSpans(type: Class<T>): Array<T> = getSpans(0, length, type)