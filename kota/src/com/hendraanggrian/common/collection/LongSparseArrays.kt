@file:JvmName("LongSparseArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.collection

import android.annotation.TargetApi
import android.support.annotation.RequiresApi
import android.util.LongSparseArray

@RequiresApi(16)
@TargetApi(16)
inline fun <E> LongSparseArray<E>.containsKey(key: Long): Boolean = indexOfKey(key) > -1

@RequiresApi(16)
@TargetApi(16)
inline fun <E> LongSparseArray<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1

inline fun <E> android.support.v4.util.LongSparseArray<E>.containsKey(key: Long): Boolean = indexOfKey(key) > -1

inline fun <E> android.support.v4.util.LongSparseArray<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1