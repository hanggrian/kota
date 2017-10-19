@file:JvmMultifileClass
@file:JvmName("CollectionsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.support.v7.widget.RecyclerView
import kota.internal.SetAdapterWrapper

inline infix fun <E> MutableSet<E>.with(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): SetAdapterWrapper<E, MutableSet<E>> = SetAdapterWrapper(this, adapter)

inline infix fun <E> RecyclerView.Adapter<out RecyclerView.ViewHolder>.with(collection: MutableSet<E>): SetAdapterWrapper<E, MutableSet<E>> = SetAdapterWrapper(collection, this)