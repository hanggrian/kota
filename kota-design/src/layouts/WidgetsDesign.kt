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
inline fun ViewRoot.appBarLayout(init: (@KotaDsl _AppBarLayout).() -> Unit): AppBarLayout = _AppBarLayout(getContext()).apply(init).add()

inline fun Context.bottomNavigationView(init: (@KotaDsl _BottomNavigationView).() -> Unit): BottomNavigationView = _BottomNavigationView(this).apply(init)
inline fun Fragment.bottomNavigationView(init: (@KotaDsl _BottomNavigationView).() -> Unit): BottomNavigationView = _BottomNavigationView(activity).apply(init)
inline fun Dialog.bottomNavigationView(init: (@KotaDsl _BottomNavigationView).() -> Unit): BottomNavigationView = _BottomNavigationView(context).apply(init)
inline fun ViewRoot.bottomNavigationView(init: (@KotaDsl _BottomNavigationView).() -> Unit): BottomNavigationView = _BottomNavigationView(getContext()).apply(init).add()

inline fun Context.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(this).apply(init)
inline fun Fragment.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(activity).apply(init)
inline fun Dialog.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(context).apply(init)
inline fun ViewRoot.collapsingToolbarLayout(init: (@KotaDsl _CollapsingToolbarLayout).() -> Unit): CollapsingToolbarLayout = _CollapsingToolbarLayout(getContext()).apply(init).add()

inline fun Context.coordinatorLayout(init: (@KotaDsl _CoordinatorLayout).() -> Unit): CoordinatorLayout = _CoordinatorLayout(this).apply(init)
inline fun Fragment.coordinatorLayout(init: (@KotaDsl _CoordinatorLayout).() -> Unit): CoordinatorLayout = _CoordinatorLayout(activity).apply(init)
inline fun Dialog.coordinatorLayout(init: (@KotaDsl _CoordinatorLayout).() -> Unit): CoordinatorLayout = _CoordinatorLayout(context).apply(init)
inline fun ViewRoot.coordinatorLayout(init: (@KotaDsl _CoordinatorLayout).() -> Unit): CoordinatorLayout = _CoordinatorLayout(getContext()).apply(init).add()

inline fun Context.tabLayout(init: (@KotaDsl _TabLayout).() -> Unit): TabLayout = _TabLayout(this).apply(init)
inline fun Fragment.tabLayout(init: (@KotaDsl _TabLayout).() -> Unit): TabLayout = _TabLayout(activity).apply(init)
inline fun Dialog.tabLayout(init: (@KotaDsl _TabLayout).() -> Unit): TabLayout = _TabLayout(context).apply(init)
inline fun ViewRoot.tabLayout(init: (@KotaDsl _TabLayout).() -> Unit): TabLayout = _TabLayout(getContext()).apply(init).add()

inline fun Context.textInputLayout(init: (@KotaDsl _TextInputLayout).() -> Unit): TextInputLayout = _TextInputLayout(this).apply(init)
inline fun Fragment.textInputLayout(init: (@KotaDsl _TextInputLayout).() -> Unit): TextInputLayout = _TextInputLayout(activity).apply(init)
inline fun Dialog.textInputLayout(init: (@KotaDsl _TextInputLayout).() -> Unit): TextInputLayout = _TextInputLayout(context).apply(init)
inline fun ViewRoot.textInputLayout(init: (@KotaDsl _TextInputLayout).() -> Unit): TextInputLayout = _TextInputLayout(getContext()).apply(init).add()
//endregion

//region Views

inline fun Context.floatingActionButton(init: (@KotaDsl FloatingActionButton).() -> Unit): FloatingActionButton = FloatingActionButton(this).apply(init)
inline fun Fragment.floatingActionButton(init: (@KotaDsl FloatingActionButton).() -> Unit): FloatingActionButton = FloatingActionButton(activity).apply(init)
inline fun Dialog.floatingActionButton(init: (@KotaDsl FloatingActionButton).() -> Unit): FloatingActionButton = FloatingActionButton(context).apply(init)
inline fun ViewRoot.floatingActionButton(init: (@KotaDsl FloatingActionButton).() -> Unit): FloatingActionButton = FloatingActionButton(getContext()).apply(init).add()

inline fun Context.navigationView(init: (@KotaDsl NavigationView).() -> Unit): NavigationView = NavigationView(this).apply(init)
inline fun Fragment.navigationView(init: (@KotaDsl NavigationView).() -> Unit): NavigationView = NavigationView(activity).apply(init)
inline fun Dialog.navigationView(init: (@KotaDsl NavigationView).() -> Unit): NavigationView = NavigationView(context).apply(init)
inline fun ViewRoot.navigationView(init: (@KotaDsl NavigationView).() -> Unit): NavigationView = NavigationView(getContext()).apply(init).add()

inline fun Context.tabItem(init: (@KotaDsl TabItem).() -> Unit): TabItem = TabItem(this).apply(init)
inline fun Fragment.tabItem(init: (@KotaDsl TabItem).() -> Unit): TabItem = TabItem(activity).apply(init)
inline fun Dialog.tabItem(init: (@KotaDsl TabItem).() -> Unit): TabItem = TabItem(context).apply(init)
inline fun ViewRoot.tabItem(init: (@KotaDsl TabItem).() -> Unit): TabItem = TabItem(getContext()).apply(init)

inline fun Context.textInputEditText(init: (@KotaDsl TextInputEditText).() -> Unit): TextInputEditText = TextInputEditText(this).apply(init)
inline fun Fragment.textInputEditText(init: (@KotaDsl TextInputEditText).() -> Unit): TextInputEditText = TextInputEditText(activity).apply(init)
inline fun Dialog.textInputEditText(init: (@KotaDsl TextInputEditText).() -> Unit): TextInputEditText = TextInputEditText(context).apply(init)
inline fun ViewRoot.textInputEditText(init: (@KotaDsl TextInputEditText).() -> Unit): TextInputEditText = TextInputEditText(getContext()).apply(init).add()
//endregion