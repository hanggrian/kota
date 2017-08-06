@file:JvmName("SparseArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collection

import android.support.v4.util.SparseArrayCompat
import android.util.SparseArray

inline fun <E> SparseArray<E>.containsKey(key: Int) = indexOfKey(key) > -1

inline fun <E> SparseArray<E>.containsValue(value: E) = indexOfValue(value) > -1

inline fun <E> SparseArrayCompat<E>.containsKey(key: Int) = indexOfKey(key) > -1

inline fun <E> SparseArrayCompat<E>.containsValue(value: E) = indexOfValue(value) > -1