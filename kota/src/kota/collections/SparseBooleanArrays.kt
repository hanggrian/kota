@file:JvmMultifileClass
@file:JvmName("SparseArraysKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.util.SparseBooleanArray
import java.util.*

/** Transform current map to sparse array. */
inline fun Map<Int, Boolean>.toSparseBooleanArray(): SparseBooleanArray = SparseBooleanArray().apply {
    for (key in keys) append(key, get(key))
}

/** Returns an empty sparse array. */
inline fun sparseBooleanArrayOf(): SparseBooleanArray = SparseBooleanArray()

/** Returns a sparse array with matching position of array input. */
inline fun sparseBooleanArrayOf(vararg elements: Boolean): SparseBooleanArray = SparseBooleanArray().apply {
    var i = 0
    for (element in elements) append(i++, element)
}

/** Returns a sparse array with defined position and element from Kotlin pair. */
inline fun sparseBooleanArrayOf(vararg pairs: Pair<Int, Boolean>): SparseBooleanArray = SparseBooleanArray().apply {
    for ((key, value) in pairs) append(key, value)
}

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
inline operator fun SparseBooleanArray.get(index: Int): Boolean = get(index)

inline fun SparseBooleanArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1
inline fun SparseBooleanArray.containsAllKeys(keys: Collection<Int>): Boolean = keys.all { containsKey(it) }

inline fun SparseBooleanArray.containsValue(value: Boolean): Boolean = indexOfValue(value) > -1
inline fun SparseBooleanArray.containsAllValues(values: Collection<Boolean>): Boolean = values.all { containsValue(it) }

inline fun SparseBooleanArray.forEach(action: (Boolean) -> Unit) {
    val size = size()
    for (i in 0 until size) {
        if (size != size()) throw ConcurrentModificationException()
        action(valueAt(i))
    }
}

inline fun SparseBooleanArray.forEachIndexed(action: (Int, Boolean) -> Unit) {
    val size = size()
    for (i in 0 until size) {
        if (size != size()) throw ConcurrentModificationException()
        action(keyAt(i), valueAt(i))
    }
}