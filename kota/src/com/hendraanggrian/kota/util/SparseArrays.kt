package com.hendraanggrian.kota.util

import android.support.v4.util.SparseArrayCompat
import android.util.SparseArray

fun <E> SparseArray<E>.hasKey(key: Int): Boolean = indexOfKey(key) > -1

fun <E> SparseArray<E>.hasValue(value: E): Boolean = indexOfValue(value) > -1

fun <E> SparseArrayCompat<E>.hasKey(key: Int): Boolean = indexOfKey(key) > -1

fun <E> SparseArrayCompat<E>.hasValue(value: E): Boolean = indexOfValue(value) > -1