@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.layouts

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.GridLayout
import kota.internal.KotaDsl

inline fun Context.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(this).apply(init)
inline fun Fragment.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(activity).apply(init)
inline fun Dialog.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(context).apply(init)
inline fun ViewGroup.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(context).apply {
    init()
    addView(this)
}

inline fun Context.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(this).apply(init)
inline fun Fragment.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(activity).apply(init)
inline fun Dialog.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(context).apply(init)
inline fun ViewGroup.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(context).apply {
    init()
    addView(this)
}