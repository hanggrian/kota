@file:JvmMultifileClass
@file:JvmName("RecyclerViewAdapters")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.support.v7.widget.RecyclerView

inline fun <T> MutableSet<T>.add(element: T, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    add(element)
    adapter.notifyItemInserted(indexOf(element) - 1)
}

inline fun <T> MutableSet<T>.remove(element: T, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    val index = indexOf(element)
    remove(element)
    adapter.notifyItemRemoved(index)
}

inline fun <T> MutableSet<T>.addAll(elements: Collection<T>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    addAll(elements)
    adapter.notifyDataSetChanged()
}

inline fun <T> MutableSet<T>.removeAll(elements: Collection<T>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    removeAll(elements)
    adapter.notifyDataSetChanged()
}