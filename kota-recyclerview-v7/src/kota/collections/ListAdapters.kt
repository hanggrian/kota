@file:JvmMultifileClass
@file:JvmName("RecyclerViewAdapters")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.support.v7.widget.RecyclerView

inline fun <T> MutableList<T>.add(element: T, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    add(element)
    adapter.notifyItemInserted(size - 1)
}

inline fun <T> MutableList<T>.remove(element: T, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    val index = indexOf(element)
    remove(element)
    adapter.notifyItemRemoved(index)
}

inline fun <T> MutableList<T>.addAll(elements: Collection<T>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    val start = size + 1
    addAll(elements)
    adapter.notifyItemRangeInserted(start, elements.size)
}

inline fun <T> MutableList<T>.removeAll(elements: Collection<T>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    val items = elements.map { indexOf(it) }
    removeAll(elements)
    items.forEach { adapter.notifyItemRemoved(it) }
}

inline fun <T> MutableList<T>.set(index: Int, element: T, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    set(index, element)
    adapter.notifyItemChanged(index)
}

inline fun <T> MutableList<T>.add(index: Int, element: T, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    add(index, element)
    adapter.notifyItemInserted(index)
}

inline fun <T> MutableList<T>.removeAt(index: Int, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    removeAt(index)
    adapter.notifyItemRemoved(index)
}