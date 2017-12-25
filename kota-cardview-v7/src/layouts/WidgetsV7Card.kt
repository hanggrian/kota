@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView

inline fun Context.cardView(init: (@KotaDsl _CardView).() -> Unit): CardView = _CardView(this).apply(init)
inline fun android.app.Fragment.cardView(init: (@KotaDsl _CardView).() -> Unit): CardView = _CardView(activity).apply(init)
inline fun Fragment.cardView(init: (@KotaDsl _CardView).() -> Unit): CardView = _CardView(context!!).apply(init)
inline fun Dialog.cardView(init: (@KotaDsl _CardView).() -> Unit): CardView = _CardView(context).apply(init)
inline fun ViewRoot.cardView(init: (@KotaDsl _CardView).() -> Unit): CardView = _CardView(getContext()).apply(init).add()