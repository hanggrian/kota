@file:JvmName("SparseArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.util

import android.support.v4.util.SparseArrayCompat
import android.util.SparseArray

inline fun <E> SparseArray<E>.hasKey(key: Int) = indexOfKey(key) > -1

inline fun <E> SparseArray<E>.hasValue(value: E) = indexOfValue(value) > -1

inline fun <E> SparseArrayCompat<E>.hasKey(key: Int) = indexOfKey(key) > -1

inline fun <E> SparseArrayCompat<E>.hasValue(value: E) = indexOfValue(value) > -1