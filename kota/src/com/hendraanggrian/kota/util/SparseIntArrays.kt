@file:JvmName("SparseIntArray")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.util

import android.util.SparseIntArray

inline fun SparseIntArray.hasKey(key: Int) = indexOfKey(key) > -1

inline fun SparseIntArray.hasValue(value: Int) = indexOfValue(value) > -1