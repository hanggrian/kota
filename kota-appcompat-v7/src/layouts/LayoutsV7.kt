@file:JvmMultifileClass
@file:JvmName("ViewsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.v7.view.menu.ListMenuItemView
import android.support.v7.widget.ButtonBarLayout
import android.view.ViewGroup

inline fun Context.buttonBarLayout(init: (@KotaDsl _ButtonBarLayout).() -> Unit): ButtonBarLayout = _ButtonBarLayout(this).apply(init)
inline fun Fragment.buttonBarLayout(init: (@KotaDsl _ButtonBarLayout).() -> Unit): ButtonBarLayout = _ButtonBarLayout(activity).apply(init)
inline fun Dialog.buttonBarLayout(init: (@KotaDsl _ButtonBarLayout).() -> Unit): ButtonBarLayout = _ButtonBarLayout(context).apply(init)
inline fun ViewGroup.buttonBarLayout(init: (@KotaDsl _ButtonBarLayout).() -> Unit): ButtonBarLayout = _ButtonBarLayout(context).apply {
    init()
    addView(this)
}

inline fun Context.listMenuItemView(init: (@KotaDsl _ListMenuItemView).() -> Unit): ListMenuItemView = _ListMenuItemView(this).apply(init)
inline fun Fragment.listMenuItemView(init: (@KotaDsl _ListMenuItemView).() -> Unit): ListMenuItemView = _ListMenuItemView(activity).apply(init)
inline fun Dialog.listMenuItemView(init: (@KotaDsl _ListMenuItemView).() -> Unit): ListMenuItemView = _ListMenuItemView(context).apply(init)
inline fun ViewGroup.listMenuItemView(init: (@KotaDsl _ListMenuItemView).() -> Unit): ListMenuItemView = _ListMenuItemView(context).apply {
    init()
    addView(this)
}