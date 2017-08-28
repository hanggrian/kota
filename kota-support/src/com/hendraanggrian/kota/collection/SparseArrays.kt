@file:JvmName("SupportSparseArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collection

import android.support.v4.util.SparseArrayCompat

inline fun <E> supportSparseArrayOf(vararg elements: E): SparseArrayCompat<E> = SparseArrayCompat<E>().apply {
    var i = 0
    for (element in elements) append(i++, element)
}

inline fun <E> SparseArrayCompat<E>.containsKey(key: Int): Boolean = indexOfKey(key) > -1
inline fun <E> SparseArrayCompat<E>.containsAllKeys(keys: Collection<Int>): Boolean = keys.all { containsKey(it) }

inline fun <E> SparseArrayCompat<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1
inline fun <E> SparseArrayCompat<E>.containsAllValue(values: Collection<E>): Boolean = values.all { containsValue(it) }

inline fun <E> SparseArrayCompat<E>.forEach(action: (E?) -> Unit) {
    for (i in 0 until size()) action(get(i))
}

inline fun <E> SparseArrayCompat<E>.forEachIndexed(action: (Int, E) -> Unit) {
    for (i in 0 until size()) action(i, get(i))
}