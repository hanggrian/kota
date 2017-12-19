@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.view.ViewGroup
import android.widget.TextView
import kota.internal.KotaDsl

@JvmOverloads inline fun Context.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(context).apply {
    init?.invoke(this)
    addView(this)
}