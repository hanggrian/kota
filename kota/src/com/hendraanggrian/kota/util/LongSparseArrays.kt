@file:JvmName("LongSparseArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.util

import android.annotation.TargetApi
import android.support.annotation.RequiresApi
import android.util.LongSparseArray

@RequiresApi(16)
@TargetApi(16)
inline fun <E> LongSparseArray<E>.hasKey(key: Long) = indexOfKey(key) > -1

@RequiresApi(16)
@TargetApi(16)
inline fun <E> LongSparseArray<E>.hasValue(value: E) = indexOfValue(value) > -1

inline fun <E> android.support.v4.util.LongSparseArray<E>.hasKey(key: Long) = indexOfKey(key) > -1

inline fun <E> android.support.v4.util.LongSparseArray<E>.hasValue(value: E) = indexOfValue(value) > -1