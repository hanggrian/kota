@file:JvmName("SparseLongArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collection

import android.annotation.TargetApi
import android.support.annotation.RequiresApi
import android.util.SparseLongArray

@TargetApi(18)
@RequiresApi(18)
inline fun sparseLongArrayOf(vararg elements: Long): SparseLongArray = SparseLongArray().apply {
    var i = 0
    for (element in elements) append(i++, element)
}

@TargetApi(18)
@RequiresApi(18)
inline fun SparseLongArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1

@TargetApi(18)
@RequiresApi(18)
inline fun SparseLongArray.containsAllKeys(keys: Collection<Int>): Boolean = keys.all { containsKey(it) }

@TargetApi(18)
@RequiresApi(18)
inline fun SparseLongArray.containsValue(value: Long): Boolean = indexOfValue(value) > -1

@TargetApi(18)
@RequiresApi(18)
inline fun SparseLongArray.containsValue(values: Collection<Long>): Boolean = values.all { containsValue(it) }

@TargetApi(18)
@RequiresApi(18)
inline fun SparseLongArray.forEach(action: (Long) -> Unit) {
    for (i in 0 until size()) action(get(i))
}

@TargetApi(18)
@RequiresApi(18)
inline fun SparseLongArray.forEachIndexed(action: (Int, Long) -> Unit) {
    for (i in 0 until size()) action(i, get(i))
}