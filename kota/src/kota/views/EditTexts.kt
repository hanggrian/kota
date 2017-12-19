@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.view.ViewGroup
import android.widget.EditText
import kota.internal.KotaDsl

@JvmOverloads inline fun Context.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(context).apply {
    init?.invoke(this)
    addView(this)
}