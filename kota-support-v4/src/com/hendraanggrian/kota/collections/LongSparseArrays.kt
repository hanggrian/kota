@file:JvmName("SupportLongSparseArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collections

import android.support.v4.util.LongSparseArray

/** Returns a sparse array with matching position of array input. */
inline fun <E> supportLongSparseArrayOf(vararg elements: E): LongSparseArray<E> = LongSparseArray<E>().apply {
    var i = 0L
    for (element in elements) append(i++, element)
}

/** Returns a sparse array with defined position and element from Kotlin pair. */
inline fun <E> supportLongSparseArrayOf(vararg pairs: Pair<Long, E?>): LongSparseArray<E> = LongSparseArray<E>().apply {
    for ((key, value) in pairs) append(key, value)
}

inline fun <E> LongSparseArray<E>.containsKey(key: Long): Boolean = indexOfKey(key) > -1

inline fun <E> LongSparseArray<E>.containsAllKeys(keys: Collection<Long>): Boolean = keys.all { containsKey(it) }

inline fun <E> LongSparseArray<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1

inline fun <E> LongSparseArray<E>.containsAllValues(values: Collection<E>): Boolean = values.all { containsValue(it) }

inline fun <E> LongSparseArray<E>.forEach(action: (E?) -> Unit) {
    for (i in 0 until size()) action(get(i.toLong()))
}

inline fun <E> LongSparseArray<E>.forEachIndexed(action: (Long, E?) -> Unit) {
    for (i in 0 until size()) i.toLong().let { action(it, get(it)) }
}