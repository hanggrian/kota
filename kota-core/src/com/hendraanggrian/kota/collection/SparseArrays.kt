@file:JvmName("SparseArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collection

import android.annotation.TargetApi
import android.support.annotation.RequiresApi
import android.support.v4.util.SparseArrayCompat
import android.util.*

inline fun <E> SparseArray<E>.containsKey(key: Int): Boolean = indexOfKey(key) > -1
inline fun <E> SparseArray<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1

inline fun <E> SparseArrayCompat<E>.containsKey(key: Int): Boolean = indexOfKey(key) > -1
inline fun <E> SparseArrayCompat<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1

inline fun SparseBooleanArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1
inline fun SparseBooleanArray.containsValue(value: Boolean): Boolean = indexOfValue(value) > -1

inline fun SparseIntArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1
inline fun SparseIntArray.containsValue(value: Int): Boolean = indexOfValue(value) > -1

@TargetApi(18)
@RequiresApi(18)
inline fun SparseLongArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1

@TargetApi(18)
@RequiresApi(18)
inline fun SparseLongArray.containsValue(value: Long): Boolean = indexOfValue(value) > -1

@TargetApi(16)
@RequiresApi(16)
inline fun <E> LongSparseArray<E>.containsKey(key: Long): Boolean = indexOfKey(key) > -1

@TargetApi(16)
@RequiresApi(16)
inline fun <E> LongSparseArray<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1

inline fun <E> android.support.v4.util.LongSparseArray<E>.containsKey(key: Long): Boolean = indexOfKey(key) > -1
inline fun <E> android.support.v4.util.LongSparseArray<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1