@file:JvmName("SparseBooleanArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collection

import android.util.SparseBooleanArray

inline fun SparseBooleanArray.containsKey(key: Int) = indexOfKey(key) > -1

inline fun SparseBooleanArray.containsValue(value: Boolean) = indexOfValue(value) > -1