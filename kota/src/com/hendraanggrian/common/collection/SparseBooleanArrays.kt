@file:JvmName("SparseBooleanArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.collection

import android.util.SparseBooleanArray

inline fun SparseBooleanArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1

inline fun SparseBooleanArray.containsValue(value: Boolean): Boolean = indexOfValue(value) > -1