@file:JvmName("SparseIntArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collection

import android.util.SparseIntArray

inline fun sparseIntArrayOf(vararg elements: Int): SparseIntArray = SparseIntArray().apply {
    var i = 0
    for (element in elements) append(i++, element)
}

inline fun SparseIntArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1
inline fun SparseIntArray.containsAllKeys(keys: Collection<Int>): Boolean = keys.all { containsKey(it) }

inline fun SparseIntArray.containsValue(value: Int): Boolean = indexOfValue(value) > -1
inline fun SparseIntArray.containsAllValues(values: Collection<Int>): Boolean = values.all { containsValue(it) }

inline fun SparseIntArray.forEach(action: (Int) -> Unit) {
    for (i in 0 until size()) action(get(i))
}

inline fun SparseIntArray.forEachIndexed(action: (Int, Int) -> Unit) {
    for (i in 0 until size()) action(i, get(i))
}