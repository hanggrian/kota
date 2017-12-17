@file:JvmMultifileClass
@file:JvmName("CollectionAdaptersKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.v7.widget.RecyclerView

inline fun <E> MutableSet<E>.add(element: E, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): Boolean {
    val result = add(element)
    if (result) adapter.notifyItemInserted(indexOf(element) - 1)
    return result
}

inline fun <E> MutableSet<E>.addAll(elements: Collection<E>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): Boolean {
    val result = addAll(elements)
    if (result) adapter.notifyDataSetChanged()
    return result
}

inline fun <E> MutableSet<E>.removeAll(elements: Collection<E>, adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): Boolean {
    val result = removeAll(elements)
    if (result) adapter.notifyDataSetChanged()
    return result
}