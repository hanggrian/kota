@file:JvmName("SparseIntArray")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.util

import android.util.SparseIntArray

inline fun SparseIntArray.containsKey(key: Int) = indexOfKey(key) > -1

inline fun SparseIntArray.containsValue(value: Int) = indexOfValue(value) > -1