@file:JvmName("SparseBooleanArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collection

import android.util.SparseBooleanArray

inline fun sparseBooleanArrayOf(vararg elements: Boolean): SparseBooleanArray = SparseBooleanArray().apply {
    var i = 0
    for (element in elements) append(i++, element)
}

inline fun SparseBooleanArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1
inline fun SparseBooleanArray.containsAllKeys(keys: Collection<Int>): Boolean = keys.all { containsKey(it) }

inline fun SparseBooleanArray.containsValue(value: Boolean): Boolean = indexOfValue(value) > -1
inline fun SparseBooleanArray.containsAllValues(values: Collection<Boolean>): Boolean = values.all { containsValue(it) }

inline fun SparseBooleanArray.forEach(action: (Boolean) -> Unit) {
    for (i in 0 until size()) action(get(i))
}

inline fun SparseBooleanArray.forEachIndexed(action: (Int, Boolean) -> Unit) {
    for (i in 0 until size()) action(i, get(i))
}