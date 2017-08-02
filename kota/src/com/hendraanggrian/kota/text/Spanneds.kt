@file:JvmName("Spanneds")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.Spanned

@JvmOverloads
@Suppress("UNCHECKED_CAST")
inline fun <T> Spanned.getAllSpans(type: Class<T> = Any::class.java as Class<T>): Array<T> = getSpans(0, length, type)