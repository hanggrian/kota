@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.design.widget.*

//region Layouts

inline fun Context.appBarLayout(init: (@KotaDsl _AppBarLayout).() -> Unit): AppBarLayout = _AppBarLayout(this).apply(init)
inline fun Fragment.appBarLayout(init: (@KotaDsl _AppBarLayout).() -> Unit): AppBarLayout = _AppBarLayout(activity).apply(init)
inline fun Dialog.appBarLayout(init: (@KotaDsl _AppBarLayout).() -> Unit): AppBarLayout = _AppBarLayout(context).apply(init)
inline fun ViewManager2.appBarLayout(init: (@KotaDsl _AppBarLayout).() -> Unit): AppBarLayout = _AppBarLayout(getContext()).apply(init).add()

inline fun Context.bottomNavigationView(init: (@KotaDsl _BottomNavigationView).() -> Unit): BottomNavigationView = _BottomNavigationView(this).apply(init)
inline fun Fragment.bottomNavigationView(init: (@KotaDsl _BottomNavigationView).() -> Unit): BottomNavigationView = _BottomNavigationView(activity).apply(init)
inline fun Dialog.bottomNavigationView(init: (@KotaDsl _BottomNavigationView).() -> Unit): BottomNavigationView = _BottomNavigationView(context).apply(init)
inline fun ViewManager2.bottomNavigationView(init: (@KotaDsl _BottomNavigationView).() -> Unit): BottomNavigationView = _BottomNavigationView(getContext()).apply(init).add()

inline fun Context.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(this).apply(init)
inline fun Fragment.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(activity).apply(init)
inline fun Dialog.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(context).apply(init)
inline fun ViewManager2.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(getContext()).apply(init).add()

inline fun Context.coordinatorLayout(init: (@KotaDsl _CoordinatorLayout).() -> Unit): CoordinatorLayout = _CoordinatorLayout(this).apply(init)
inline fun Fragment.coordinatorLayout(init: (@KotaDsl _CoordinatorLayout).() -> Unit): CoordinatorLayout = _CoordinatorLayout(activity).apply(init)
inline fun Dialog.coordinatorLayout(init: (@KotaDsl _CoordinatorLayout).() -> Unit): CoordinatorLayout = _CoordinatorLayout(context).apply(init)
inline fun ViewManager2.coordinatorLayout(init: (@KotaDsl _CoordinatorLayout).() -> Unit): CoordinatorLayout = _CoordinatorLayout(getContext()).apply(init).add()

inline fun Context.tabLayout(init: (@KotaDsl _TabLayout).() -> Unit): TabLayout = _TabLayout(this).apply(init)
inline fun Fragment.tabLayout(init: (@KotaDsl _TabLayout).() -> Unit): TabLayout = _TabLayout(activity).apply(init)
inline fun Dialog.tabLayout(init: (@KotaDsl _TabLayout).() -> Unit): TabLayout = _TabLayout(context).apply(init)
inline fun ViewManager2.tabLayout(init: (@KotaDsl _TabLayout).() -> Unit): TabLayout = _TabLayout(getContext()).apply(init).add()

inline fun Context.textInputLayout(init: (@KotaDsl _TextInputLayout).() -> Unit): TextInputLayout = _TextInputLayout(this).apply(init)
inline fun Fragment.textInputLayout(init: (@KotaDsl _TextInputLayout).() -> Unit): TextInputLayout = _TextInputLayout(activity).apply(init)
inline fun Dialog.textInputLayout(init: (@KotaDsl _TextInputLayout).() -> Unit): TextInputLayout = _TextInputLayout(context).apply(init)
inline fun ViewManager2.textInputLayout(init: (@KotaDsl _TextInputLayout).() -> Unit): TextInputLayout = _TextInputLayout(getContext()).apply(init).add()
//endregion

//region Views

@JvmOverloads inline fun Context.floatingActionButton(noinline init: ((@KotaDsl FloatingActionButton).() -> Unit)? = null): FloatingActionButton = FloatingActionButton(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.floatingActionButton(noinline init: ((@KotaDsl FloatingActionButton).() -> Unit)? = null): FloatingActionButton = FloatingActionButton(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.floatingActionButton(noinline init: ((@KotaDsl FloatingActionButton).() -> Unit)? = null): FloatingActionButton = FloatingActionButton(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewManager2.floatingActionButton(noinline init: ((@KotaDsl FloatingActionButton).() -> Unit)? = null): FloatingActionButton = FloatingActionButton(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.navigationView(noinline init: ((@KotaDsl NavigationView).() -> Unit)? = null): NavigationView = NavigationView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.navigationView(noinline init: ((@KotaDsl NavigationView).() -> Unit)? = null): NavigationView = NavigationView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.navigationView(noinline init: ((@KotaDsl NavigationView).() -> Unit)? = null): NavigationView = NavigationView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewManager2.navigationView(noinline init: ((@KotaDsl NavigationView).() -> Unit)? = null): NavigationView = NavigationView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.tabItem(noinline init: ((@KotaDsl TabItem).() -> Unit)? = null): TabItem = TabItem(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.tabItem(noinline init: ((@KotaDsl TabItem).() -> Unit)? = null): TabItem = TabItem(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.tabItem(noinline init: ((@KotaDsl TabItem).() -> Unit)? = null): TabItem = TabItem(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewManager2.tabItem(noinline init: ((@KotaDsl TabItem).() -> Unit)? = null): TabItem = TabItem(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.textInputEditText(noinline init: ((@KotaDsl TextInputEditText).() -> Unit)? = null): TextInputEditText = TextInputEditText(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.textInputEditText(noinline init: ((@KotaDsl TextInputEditText).() -> Unit)? = null): TextInputEditText = TextInputEditText(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.textInputEditText(noinline init: ((@KotaDsl TextInputEditText).() -> Unit)? = null): TextInputEditText = TextInputEditText(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewManager2.textInputEditText(noinline init: ((@KotaDsl TextInputEditText).() -> Unit)? = null): TextInputEditText = TextInputEditText(getContext()).apply { init?.invoke(this) }.add()
//endregion