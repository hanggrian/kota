@file:JvmName("LongSparseArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collection

import android.annotation.TargetApi
import android.support.annotation.RequiresApi
import android.util.LongSparseArray

@TargetApi(16)
@RequiresApi(16)
inline fun <E> longSparseArrayOf(vararg elements: E): LongSparseArray<E> = LongSparseArray<E>().apply {
    var i = 0L
    for (element in elements) append(i++, element)
}

@TargetApi(16)
@RequiresApi(16)
inline fun <E> LongSparseArray<E>.containsKey(key: Long): Boolean = indexOfKey(key) > -1

@TargetApi(16)
@RequiresApi(16)
inline fun <E> LongSparseArray<E>.containsAllKeys(keys: Collection<Long>): Boolean = keys.all { containsKey(it) }

@TargetApi(16)
@RequiresApi(16)
inline fun <E> LongSparseArray<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1

@TargetApi(16)
@RequiresApi(16)
inline fun <E> LongSparseArray<E>.containsAllValues(values: Collection<E>): Boolean = values.all { containsValue(it) }

@TargetApi(16)
@RequiresApi(16)
inline fun <E> LongSparseArray<E>.forEach(action: (E?) -> Unit) {
    for (i in 0 until size()) action(get(i.toLong()))
}

@TargetApi(16)
@RequiresApi(16)
inline fun <E> LongSparseArray<E>.forEachIndexed(action: (Long, E?) -> Unit) {
    for (i in 0 until size()) i.toLong().let { action(it, get(it)) }
}