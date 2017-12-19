@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.view.ViewGroup
import android.widget.*
import android.widget.LinearLayout.HORIZONTAL
import android.widget.LinearLayout.VERTICAL

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

inline fun Context.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(this, VERTICAL).apply(init)
inline fun Fragment.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(activity, VERTICAL).apply(init)
inline fun Dialog.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, VERTICAL).apply(init)
inline fun ViewGroup.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, VERTICAL).apply {
    init()
    addView(this)
}

inline fun Context.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(this, HORIZONTAL).apply(init)
inline fun Fragment.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(activity, HORIZONTAL).apply(init)
inline fun Dialog.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, HORIZONTAL).apply(init)
inline fun ViewGroup.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, HORIZONTAL).apply {
    init()
    addView(this)
}

inline fun Context.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(this).apply(init)
inline fun Fragment.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(activity).apply(init)
inline fun Dialog.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(context).apply(init)
inline fun ViewGroup.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(context).apply {
    init()
    addView(this)
}

inline fun Context.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(this).apply(init)
inline fun Fragment.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(activity).apply(init)
inline fun Dialog.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(context).apply(init)
inline fun ViewGroup.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(context).apply {
    init()
    addView(this)
}