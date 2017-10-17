@file:JvmMultifileClass
@file:JvmName("RecyclerViewAdapters")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.support.v7.widget.RecyclerView

inline fun <T> MutableList<T>.add(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, element: T) {
    add(element)
    adapter.notifyItemInserted(size - 1)
}

inline fun <T> MutableList<T>.remove(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, element: T) {
    val index = indexOf(element)
    remove(element)
    adapter.notifyItemRemoved(index)
}

inline fun <T> MutableList<T>.addAll(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, elements: Collection<T>) {
    val start = size + 1
    addAll(elements)
    adapter.notifyItemRangeInserted(start, size)
}

inline fun <T> MutableList<T>.addAll(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, index: Int, elements: Collection<T>) {
    /*val start = index + 1
    addAll(elements)
    adapter.notifyItemRangeInserted(start, size - index)*/
}

inline fun <T> MutableList<T>.removeAll(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, elements: Collection<T>) {
    val start = size + 1
    addAll(elements)
    adapter.notifyItemRangeRemoved(start, size)
}

inline fun <T> MutableList<T>.clear(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    val size = size
    clear()
    adapter.notifyItemRangeRemoved(0, size)
}

inline fun <T> MutableList<T>.set(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, index: Int, element: T) {
    set(index, element)
    adapter.notifyItemChanged(index)
}

inline fun <T> MutableList<T>.add(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, index: Int, element: T) {
    add(index, element)
    adapter.notifyItemInserted(index)
}

inline fun <T> MutableList<T>.removeAt(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, index: Int) {
    removeAt(index)
    adapter.notifyItemRemoved(index)
}