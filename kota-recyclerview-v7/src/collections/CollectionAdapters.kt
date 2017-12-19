@file:JvmMultifileClass
@file:JvmName("CollectionAdaptersKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.v7.widget.RecyclerView

inline fun <E> MutableCollection<E>.add(element: E, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): Boolean {
    val success = add(element)
    if (success) adapter.notifyItemInserted(size - 1)
    return success
}

inline fun <E> MutableCollection<E>.remove(element: E, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): Boolean {
    val index = indexOf(element)
    val success = remove(element)
    if (success) adapter.notifyItemRemoved(index)
    return success
}

inline fun <E> MutableCollection<E>.addAll(elements: Collection<E>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): Boolean {
    val start = size + 1
    val success = addAll(elements)
    if (success) adapter.notifyItemRangeInserted(start, elements.size)
    return success
}

inline fun <E> MutableCollection<E>.removeAll(elements: Collection<E>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): Boolean {
    val items = elements.map { indexOf(it) }
    val success = removeAll(elements)
    if (success) items.forEach { adapter.notifyItemRemoved(it) }
    return success
}

inline fun <E> MutableCollection<E>.retainAll(elements: Collection<E>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): Boolean {
    val success = retainAll(elements)
    if (success) adapter.notifyDataSetChanged()
    return success
}

inline fun <E> MutableCollection<E>.clear(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    val size = size
    clear()
    adapter.notifyItemRangeRemoved(0, size)
}