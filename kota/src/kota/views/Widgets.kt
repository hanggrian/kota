@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@JvmOverloads inline fun Context.button(noinline init: ((@KotaDsl Button).() -> Unit)? = null): Button = Button(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.button(noinline init: ((@KotaDsl Button).() -> Unit)? = null): Button = Button(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.button(noinline init: ((@KotaDsl Button).() -> Unit)? = null): Button = Button(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.button(noinline init: ((@KotaDsl Button).() -> Unit)? = null): Button = Button(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(context).apply {
    init?.invoke(this)
    addView(this)
}