@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.design.widget.CollapsingToolbarLayout
import android.view.ViewGroup

inline fun Context.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(this).apply(init)
inline fun Fragment.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(activity).apply(init)
inline fun Dialog.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(context).apply(init)
inline fun ViewGroup.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(context).apply {
    init()
    addView(this)
}