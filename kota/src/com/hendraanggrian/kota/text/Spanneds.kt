package com.hendraanggrian.kota.text

import android.text.Spanned

fun Spanned.getAllSpans(): Array<*> = getAllSpans(Any::class.java)

fun <T> Spanned.getAllSpans(type: Class<T>): Array<T> = getSpans(0, length, type)