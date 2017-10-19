@file:JvmMultifileClass
@file:JvmName("CollectionsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.collections

import android.support.v7.widget.RecyclerView
import kota.internal.ListAdapterWrapper

inline infix fun <E> MutableList<E>.with(adapter: RecyclerView.Adapter<out RecyclerView.ViewHolder>): ListAdapterWrapper<E, MutableList<E>> = ListAdapterWrapper(this, adapter)

inline infix fun <E> RecyclerView.Adapter<out RecyclerView.ViewHolder>.with(collection: MutableList<E>): ListAdapterWrapper<E, MutableList<E>> = ListAdapterWrapper(collection, this)