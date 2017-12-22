@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.v7.view.menu.ListMenuItemView
import android.support.v7.widget.*
import android.support.v7.widget.LinearLayoutCompat.HORIZONTAL
import android.support.v7.widget.LinearLayoutCompat.VERTICAL

//region Layouts

inline fun Context.listMenuItemView(init: (@KotaDsl _ListMenuItemView).() -> Unit): ListMenuItemView = _ListMenuItemView(this).apply(init)
inline fun Fragment.listMenuItemView(init: (@KotaDsl _ListMenuItemView).() -> Unit): ListMenuItemView = _ListMenuItemView(activity).apply(init)
inline fun Dialog.listMenuItemView(init: (@KotaDsl _ListMenuItemView).() -> Unit): ListMenuItemView = _ListMenuItemView(context).apply(init)
inline fun ViewRoot.listMenuItemView(init: (@KotaDsl _ListMenuItemView).() -> Unit): ListMenuItemView = _ListMenuItemView(getContext()).apply(init).add()

inline fun Context.actionBarContainer(init: (@KotaDsl _ActionBarContainer).() -> Unit): ActionBarContainer = _ActionBarContainer(this).apply(init)
inline fun Fragment.actionBarContainer(init: (@KotaDsl _ActionBarContainer).() -> Unit): ActionBarContainer = _ActionBarContainer(activity).apply(init)
inline fun Dialog.actionBarContainer(init: (@KotaDsl _ActionBarContainer).() -> Unit): ActionBarContainer = _ActionBarContainer(context).apply(init)
inline fun ViewRoot.actionBarContainer(init: (@KotaDsl _ActionBarContainer).() -> Unit): ActionBarContainer = _ActionBarContainer(getContext()).apply(init).add()

inline fun Context.actionBarOverlayLayout(init: (@KotaDsl _ActionBarOverlayLayout).() -> Unit): ActionBarOverlayLayout = _ActionBarOverlayLayout(this).apply(init)
inline fun Fragment.actionBarOverlayLayout(init: (@KotaDsl _ActionBarOverlayLayout).() -> Unit): ActionBarOverlayLayout = _ActionBarOverlayLayout(activity).apply(init)
inline fun Dialog.actionBarOverlayLayout(init: (@KotaDsl _ActionBarOverlayLayout).() -> Unit): ActionBarOverlayLayout = _ActionBarOverlayLayout(context).apply(init)
inline fun ViewRoot.actionBarOverlayLayout(init: (@KotaDsl _ActionBarOverlayLayout).() -> Unit): ActionBarOverlayLayout = _ActionBarOverlayLayout(getContext()).apply(init).add()

inline fun Context.supportActionMenuView(init: (@KotaDsl _ActionMenuViewV7).() -> Unit): ActionMenuView = _ActionMenuViewV7(this).apply(init)
inline fun Fragment.supportActionMenuView(init: (@KotaDsl _ActionMenuViewV7).() -> Unit): ActionMenuView = _ActionMenuViewV7(activity).apply(init)
inline fun Dialog.supportActionMenuView(init: (@KotaDsl _ActionMenuViewV7).() -> Unit): ActionMenuView = _ActionMenuViewV7(context).apply(init)
inline fun ViewRoot.supportActionMenuView(init: (@KotaDsl _ActionMenuViewV7).() -> Unit): ActionMenuView = _ActionMenuViewV7(getContext()).apply(init).add()

inline fun Context.alertDialogLayout(init: (@KotaDsl _AlertDialogLayout).() -> Unit): AlertDialogLayout = _AlertDialogLayout(this).apply(init)
inline fun Fragment.alertDialogLayout(init: (@KotaDsl _AlertDialogLayout).() -> Unit): AlertDialogLayout = _AlertDialogLayout(activity).apply(init)
inline fun Dialog.alertDialogLayout(init: (@KotaDsl _AlertDialogLayout).() -> Unit): AlertDialogLayout = _AlertDialogLayout(context).apply(init)
inline fun ViewRoot.alertDialogLayout(init: (@KotaDsl _AlertDialogLayout).() -> Unit): AlertDialogLayout = _AlertDialogLayout(getContext()).apply(init).add()

inline fun Context.buttonBarLayout(init: (@KotaDsl _ButtonBarLayout).() -> Unit): ButtonBarLayout = _ButtonBarLayout(this).apply(init)
inline fun Fragment.buttonBarLayout(init: (@KotaDsl _ButtonBarLayout).() -> Unit): ButtonBarLayout = _ButtonBarLayout(activity).apply(init)
inline fun Dialog.buttonBarLayout(init: (@KotaDsl _ButtonBarLayout).() -> Unit): ButtonBarLayout = _ButtonBarLayout(context).apply(init)
inline fun ViewRoot.buttonBarLayout(init: (@KotaDsl _ButtonBarLayout).() -> Unit): ButtonBarLayout = _ButtonBarLayout(getContext()).apply(init).add()

inline fun Context.verticalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(this, VERTICAL).apply(init)
inline fun Fragment.verticalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(activity, VERTICAL).apply(init)
inline fun Dialog.verticalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(context, VERTICAL).apply(init)
inline fun ViewRoot.verticalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(getContext(), VERTICAL).apply(init).add()

inline fun Context.horizontalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(this, HORIZONTAL).apply(init)
inline fun Fragment.horizontalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(activity, HORIZONTAL).apply(init)
inline fun Dialog.horizontalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(context, HORIZONTAL).apply(init)
inline fun ViewRoot.horizontalLayoutCompat(init: (@KotaDsl _LinearLayoutCompat).() -> Unit): LinearLayoutCompat = _LinearLayoutCompat(getContext(), HORIZONTAL).apply(init).add()

inline fun Context.listViewCompat(init: (@KotaDsl _ListViewCompat).() -> Unit): ListViewCompat = _ListViewCompat(this).apply(init)
inline fun Fragment.listViewCompat(init: (@KotaDsl _ListViewCompat).() -> Unit): ListViewCompat = _ListViewCompat(activity).apply(init)
inline fun Dialog.listViewCompat(init: (@KotaDsl _ListViewCompat).() -> Unit): ListViewCompat = _ListViewCompat(context).apply(init)
inline fun ViewRoot.listViewCompat(init: (@KotaDsl _ListViewCompat).() -> Unit): ListViewCompat = _ListViewCompat(getContext()).apply(init).add()

inline fun Context.scrollingTabContainerView(init: (@KotaDsl _ScrollingTabContainerView).() -> Unit): ScrollingTabContainerView = _ScrollingTabContainerView(this).apply(init)
inline fun Fragment.scrollingTabContainerView(init: (@KotaDsl _ScrollingTabContainerView).() -> Unit): ScrollingTabContainerView = _ScrollingTabContainerView(activity).apply(init)
inline fun Dialog.scrollingTabContainerView(init: (@KotaDsl _ScrollingTabContainerView).() -> Unit): ScrollingTabContainerView = _ScrollingTabContainerView(context).apply(init)
inline fun ViewRoot.scrollingTabContainerView(init: (@KotaDsl _ScrollingTabContainerView).() -> Unit): ScrollingTabContainerView = _ScrollingTabContainerView(getContext()).apply(init).add()

inline fun Context.supportToolbar(init: (@KotaDsl _ToolbarV7).() -> Unit): Toolbar = _ToolbarV7(this).apply(init)
inline fun Fragment.supportToolbar(init: (@KotaDsl _ToolbarV7).() -> Unit): Toolbar = _ToolbarV7(activity).apply(init)
inline fun Dialog.supportToolbar(init: (@KotaDsl _ToolbarV7).() -> Unit): Toolbar = _ToolbarV7(context).apply(init)
inline fun ViewRoot.supportToolbar(init: (@KotaDsl _ToolbarV7).() -> Unit): Toolbar = _ToolbarV7(getContext()).apply(init).add()
//endregion

//region Views

@JvmOverloads inline fun Context.contentFrameLayout(noinline init: ((@KotaDsl ContentFrameLayout).() -> Unit)? = null): ContentFrameLayout = ContentFrameLayout(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.contentFrameLayout(noinline init: ((@KotaDsl ContentFrameLayout).() -> Unit)? = null): ContentFrameLayout = ContentFrameLayout(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.contentFrameLayout(noinline init: ((@KotaDsl ContentFrameLayout).() -> Unit)? = null): ContentFrameLayout = ContentFrameLayout(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.contentFrameLayout(noinline init: ((@KotaDsl ContentFrameLayout).() -> Unit)? = null): ContentFrameLayout = ContentFrameLayout(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.supportSearchView(noinline init: ((@KotaDsl SearchView).() -> Unit)? = null): SearchView = SearchView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.supportSearchView(noinline init: ((@KotaDsl SearchView).() -> Unit)? = null): SearchView = SearchView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.supportSearchView(noinline init: ((@KotaDsl SearchView).() -> Unit)? = null): SearchView = SearchView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.supportSearchView(noinline init: ((@KotaDsl SearchView).() -> Unit)? = null): SearchView = SearchView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.switchCompat(noinline init: ((@KotaDsl SwitchCompat).() -> Unit)? = null): SwitchCompat = SwitchCompat(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.switchCompat(noinline init: ((@KotaDsl SwitchCompat).() -> Unit)? = null): SwitchCompat = SwitchCompat(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.switchCompat(noinline init: ((@KotaDsl SwitchCompat).() -> Unit)? = null): SwitchCompat = SwitchCompat(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.switchCompat(noinline init: ((@KotaDsl SwitchCompat).() -> Unit)? = null): SwitchCompat = SwitchCompat(getContext()).apply { init?.invoke(this) }.add()
//endregion