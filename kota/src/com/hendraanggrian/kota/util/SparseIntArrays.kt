package com.hendraanggrian.kota.util

import android.util.SparseIntArray

fun SparseIntArray.hasKey(key: Int): Boolean = indexOfKey(key) > -1

fun SparseIntArray.hasValue(value: Int): Boolean = indexOfValue(value) > -1