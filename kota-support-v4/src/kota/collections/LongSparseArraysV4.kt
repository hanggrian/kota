@file:JvmMultifileClass
@file:JvmName("SparseArraysV4Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.support.v4.util.LongSparseArray
import java.util.*

/** Transform current map to sparse array. */
inline fun <E> Map<Long, E>.toSupportLongSparseArray(): LongSparseArray<E> = LongSparseArray<E>().apply {
    for (key in keys) append(key, get(key))
}

/** Returns an empty sparse array. */
inline fun <E> supportLongSparseArrayOf(): LongSparseArray<E> = LongSparseArray()

/** Returns a sparse array with matching position of array input. */
inline fun <E> supportLongSparseArrayOf(vararg elements: E): LongSparseArray<E> = LongSparseArray<E>().apply {
    var i = 0L
    for (element in elements) append(i++, element)
}

/** Returns a sparse array with defined position and element from Kotlin pair. */
inline fun <E> supportLongSparseArrayOf(vararg pairs: Pair<Long, E?>): LongSparseArray<E> = LongSparseArray<E>().apply {
    for ((key, value) in pairs) append(key, value)
}

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
inline operator fun <E> LongSparseArray<E>.get(index: Long): E = get(index)!!

inline fun <E> LongSparseArray<E>.containsKey(key: Long): Boolean = indexOfKey(key) > -1
inline fun <E> LongSparseArray<E>.containsAllKeys(keys: Collection<Long>): Boolean = keys.all { containsKey(it) }

inline fun <E> LongSparseArray<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1
inline fun <E> LongSparseArray<E>.containsAllValues(values: Collection<E>): Boolean = values.all { containsValue(it) }

inline fun <E> LongSparseArray<E>.forEach(action: (E) -> Unit) {
    val size = size()
    for (i in 0 until size) {
        if (size != size()) throw ConcurrentModificationException()
        action(valueAt(i))
    }
}

inline fun <E> LongSparseArray<E>.forEachIndexed(action: (Long, E) -> Unit) {
    val size = size()
    for (i in 0 until size) {
        if (size != size()) throw ConcurrentModificationException()
        action(keyAt(i), valueAt(i))
    }
}