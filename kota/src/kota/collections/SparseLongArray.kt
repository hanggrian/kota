@file:JvmMultifileClass
@file:JvmName("SparseArraysKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.support.annotation.RequiresApi
import android.util.SparseLongArray
import java.util.*

/** Returns an empty sparse array. */
@RequiresApi(18) inline fun sparseLongArrayOf(): SparseLongArray = SparseLongArray()

/** Returns a sparse array with matching position of array input. */
@RequiresApi(18) inline fun sparseLongArrayOf(vararg elements: Long): SparseLongArray = SparseLongArray().apply {
    var i = 0
    for (element in elements) append(i++, element)
}

/** Returns a sparse array with defined position and element from Kotlin pair. */
@RequiresApi(18) inline fun sparseLongArrayOf(vararg pairs: Pair<Int, Long>): SparseLongArray = SparseLongArray().apply {
    for ((key, value) in pairs) append(key, value)
}

@RequiresApi(18) inline fun SparseLongArray.containsKey(key: Int): Boolean = indexOfKey(key) > -1
@RequiresApi(18) inline fun SparseLongArray.containsAllKeys(keys: Collection<Int>): Boolean = keys.all { containsKey(it) }

@RequiresApi(18) inline fun SparseLongArray.containsValue(value: Long): Boolean = indexOfValue(value) > -1
@RequiresApi(18) inline fun SparseLongArray.containsValue(values: Collection<Long>): Boolean = values.all { containsValue(it) }

@RequiresApi(18) inline fun SparseLongArray.forEach(action: (Long) -> Unit) {
    val size = size()
    for (i in 0 until size) {
        if (size != size()) throw ConcurrentModificationException()
        action(valueAt(i))
    }
}

@RequiresApi(18) inline fun SparseLongArray.forEachIndexed(action: (Int, Long) -> Unit) {
    val size = size()
    for (i in 0 until size) {
        if (size != size()) throw ConcurrentModificationException()
        action(keyAt(i), valueAt(i))
    }
}