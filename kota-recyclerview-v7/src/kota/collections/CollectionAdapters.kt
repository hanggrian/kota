@file:JvmMultifileClass
@file:JvmName("RecyclerViewAdapters")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.support.v7.widget.RecyclerView

inline fun <T> MutableCollection<T>.clear(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
    val size = size
    clear()
    adapter.notifyItemRangeRemoved(0, size)
}