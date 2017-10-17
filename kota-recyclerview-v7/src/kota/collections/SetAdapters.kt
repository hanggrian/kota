@file:JvmMultifileClass
@file:JvmName("RecyclerViewAdapters")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.support.v7.widget.RecyclerView

inline fun <T> MutableSet<T>.add(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, element: T) {
    add(element)
    adapter.notifyItemInserted(indexOf(element) - 1)
}

inline fun <T> MutableSet<T>.remove(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, element: T) {

}

inline fun <T> MutableSet<T>.addAll(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, elements: Collection<T>) {

}

inline fun <T> MutableSet<T>.removeAll(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>, elements: Collection<T>) {

}

inline fun <T> MutableSet<T>.clear(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {

}