package com.hendraanggrian.kota.util

import android.annotation.TargetApi
import android.support.annotation.RequiresApi
import android.util.LongSparseArray

@RequiresApi(16)
@TargetApi(16)
fun <E> LongSparseArray<E>.hasKey(key: Long): Boolean = indexOfKey(key) > -1

@RequiresApi(16)
@TargetApi(16)
fun <E> LongSparseArray<E>.hasValue(value: E): Boolean = indexOfValue(value) > -1

fun <E> android.support.v4.util.LongSparseArray<E>.hasKey(key: Long): Boolean = indexOfKey(key) > -1

fun <E> android.support.v4.util.LongSparseArray<E>.hasValue(value: E): Boolean = indexOfValue(value) > -1