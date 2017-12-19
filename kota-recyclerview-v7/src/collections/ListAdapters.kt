@file:JvmMultifileClass
@file:JvmName("CollectionAdaptersKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.v7.widget.RecyclerView

inline fun <E> MutableList<E>.add(index: Int, element: E, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    add(index, element)
    adapter.notifyItemInserted(index)
}

inline fun <E> MutableList<E>.addAll(index: Int, elements: Collection<E>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): Boolean {
    val start = size + 1
    val success = addAll(index, elements)
    if (success) adapter.notifyItemRangeInserted(start, elements.size)
    return success
}

inline fun <E> MutableList<E>.removeAt(index: Int, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): E {
    val success = removeAt(index)
    if (success != null) adapter.notifyItemRemoved(index)
    return success
}

inline fun <E> MutableList<E>.set(index: Int, element: E, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): E {
    val success = set(index, element)
    if (success != null) adapter.notifyItemChanged(index)
    return success
}