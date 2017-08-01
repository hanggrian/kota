package com.hendraanggrian.kota.text

import android.text.Spanned

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

fun Spanned.getAllSpans(): Array<*> = getAllSpans(Any::class.java)

fun <T> Spanned.getAllSpans(type: Class<T>): Array<T> = getSpans(0, length, type)