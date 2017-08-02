@file:JvmName("SparseBooleanArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.util

import android.util.SparseBooleanArray

inline fun SparseBooleanArray.hasKey(key: Int) = indexOfKey(key) > -1

inline fun SparseBooleanArray.hasValue(value: Boolean) = indexOfValue(value) > -1