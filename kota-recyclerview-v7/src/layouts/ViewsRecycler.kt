@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.v7.widget.RecyclerView

@JvmOverloads inline fun Context.recyclerView(noinline init: ((@KotaDsl RecyclerView).() -> Unit)? = null): RecyclerView = RecyclerView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.recyclerView(noinline init: ((@KotaDsl RecyclerView).() -> Unit)? = null): RecyclerView = RecyclerView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.recyclerView(noinline init: ((@KotaDsl RecyclerView).() -> Unit)? = null): RecyclerView = RecyclerView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewManager2.recyclerView(noinline init: ((@KotaDsl RecyclerView).() -> Unit)? = null): RecyclerView = RecyclerView(getContext()).apply { init?.invoke(this) }.add()