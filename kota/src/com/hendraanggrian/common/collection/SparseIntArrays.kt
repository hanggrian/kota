@file:JvmName("SparseIntArray")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.collection

import android.util.SparseIntArray

inline fun SparseIntArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1

inline fun SparseIntArray.containsValue(value: Int): Boolean = indexOfValue(value) > -1