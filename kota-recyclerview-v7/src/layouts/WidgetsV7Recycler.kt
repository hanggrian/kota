@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView

inline fun Context.recyclerView(init: (@KotaDsl RecyclerView).() -> Unit): RecyclerView = RecyclerView(this).apply(init)
inline fun android.app.Fragment.recyclerView(init: (@KotaDsl RecyclerView).() -> Unit): RecyclerView = RecyclerView(activity).apply(init)
inline fun Fragment.recyclerView(init: (@KotaDsl RecyclerView).() -> Unit): RecyclerView = RecyclerView(context).apply(init)
inline fun Dialog.recyclerView(init: (@KotaDsl RecyclerView).() -> Unit): RecyclerView = RecyclerView(context).apply(init)
inline fun ViewRoot.recyclerView(init: (@KotaDsl RecyclerView).() -> Unit): RecyclerView = RecyclerView(getContext()).apply(init).add()