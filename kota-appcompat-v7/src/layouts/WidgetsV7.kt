@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.widget.*
import android.support.v7.widget.LinearLayoutCompat.HORIZONTAL
import android.support.v7.widget.LinearLayoutCompat.VERTICAL

//region Layouts

inline fun Context.supportActionMenuView(init: (@KotaDsl _ActionMenuViewV7).() -> Unit): ActionMenuView = _ActionMenuViewV7(this).apply(init)
inline fun android.app.Fragment.supportActionMenuView(init: (@KotaDsl _ActionMenuViewV7).() -> Unit): ActionMenuView = _ActionMenuViewV7(activity).apply(init)
inline fun Fragment.supportActionMenuView(init: (@KotaDsl _ActionMenuViewV7).() -> Unit): ActionMenuView = _ActionMenuViewV7(context!!).apply(init)
inline fun Dialog.supportActionMenuView(init: (@KotaDsl _ActionMenuViewV7).() -> Unit): ActionMenuView = _ActionMenuViewV7(context).apply(init)
inline fun ViewRoot.supportActionMenuView(init: (@KotaDsl _ActionMenuViewV7).() -> Unit): ActionMenuView = _ActionMenuViewV7(getContext()).apply(init).add()

inline fun Context.verticalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(this, VERTICAL).apply(init)
inline fun android.app.Fragment.verticalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(activity, VERTICAL).apply(init)
inline fun Fragment.verticalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(context!!, VERTICAL).apply(init)
inline fun Dialog.verticalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(context, VERTICAL).apply(init)
inline fun ViewRoot.verticalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(getContext(), VERTICAL).apply(init).add()

inline fun Context.horizontalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(this, HORIZONTAL).apply(init)
inline fun android.app.Fragment.horizontalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(activity, HORIZONTAL).apply(init)
inline fun Fragment.horizontalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(context!!, HORIZONTAL).apply(init)
inline fun Dialog.horizontalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(context, HORIZONTAL).apply(init)
inline fun ViewRoot.horizontalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(getContext(), HORIZONTAL).apply(init).add()

inline fun Context.supportToolbar(init: (@KotaDsl _ToolbarV7).() -> Unit): Toolbar = _ToolbarV7(this).apply(init)
inline fun android.app.Fragment.supportToolbar(init: (@KotaDsl _ToolbarV7).() -> Unit): Toolbar = _ToolbarV7(activity).apply(init)
inline fun Fragment.supportToolbar(init: (@KotaDsl _ToolbarV7).() -> Unit): Toolbar = _ToolbarV7(context!!).apply(init)
inline fun Dialog.supportToolbar(init: (@KotaDsl _ToolbarV7).() -> Unit): Toolbar = _ToolbarV7(context).apply(init)
inline fun ViewRoot.supportToolbar(init: (@KotaDsl _ToolbarV7).() -> Unit): Toolbar = _ToolbarV7(getContext()).apply(init).add()
//endregion

//region Views

inline fun Context.contentFrameLayout(init: (@KotaDsl ContentFrameLayout).() -> Unit): ContentFrameLayout = ContentFrameLayout(this).apply(init)
inline fun android.app.Fragment.contentFrameLayout(init: (@KotaDsl ContentFrameLayout).() -> Unit): ContentFrameLayout = ContentFrameLayout(activity).apply(init)
inline fun Fragment.contentFrameLayout(init: (@KotaDsl ContentFrameLayout).() -> Unit): ContentFrameLayout = ContentFrameLayout(context).apply(init)
inline fun Dialog.contentFrameLayout(init: (@KotaDsl ContentFrameLayout).() -> Unit): ContentFrameLayout = ContentFrameLayout(context).apply(init)
inline fun ViewRoot.contentFrameLayout(init: (@KotaDsl ContentFrameLayout).() -> Unit): ContentFrameLayout = ContentFrameLayout(getContext()).apply(init).add()

inline fun Context.supportSearchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(this).apply(init)
inline fun android.app.Fragment.supportSearchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(activity).apply(init)
inline fun Fragment.supportSearchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(context).apply(init)
inline fun Dialog.supportSearchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(context).apply(init)
inline fun ViewRoot.supportSearchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(getContext()).apply(init).add()

inline fun Context.switchCompat(init: (@KotaDsl SwitchCompat).() -> Unit): SwitchCompat = SwitchCompat(this).apply(init)
inline fun android.app.Fragment.switchCompat(init: (@KotaDsl SwitchCompat).() -> Unit): SwitchCompat = SwitchCompat(activity).apply(init)
inline fun Fragment.switchCompat(init: (@KotaDsl SwitchCompat).() -> Unit): SwitchCompat = SwitchCompat(context).apply(init)
inline fun Dialog.switchCompat(init: (@KotaDsl SwitchCompat).() -> Unit): SwitchCompat = SwitchCompat(context).apply(init)
inline fun ViewRoot.switchCompat(init: (@KotaDsl SwitchCompat).() -> Unit): SwitchCompat = SwitchCompat(getContext()).apply(init).add()
//endregion