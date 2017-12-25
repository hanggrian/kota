@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.v4.app.FragmentTabHost
import android.support.v4.view.PagerTabStrip
import android.support.v4.view.PagerTitleStrip
import android.support.v4.view.ViewPager
import android.support.v4.widget.*

//region Layouts

inline fun Context.fragmentTabHost(init: (@KotaDsl _FragmentTabHost).() -> Unit): FragmentTabHost = _FragmentTabHost(this).apply(init)
inline fun Fragment.fragmentTabHost(init: (@KotaDsl _FragmentTabHost).() -> Unit): FragmentTabHost = _FragmentTabHost(activity).apply(init)
inline fun Dialog.fragmentTabHost(init: (@KotaDsl _FragmentTabHost).() -> Unit): FragmentTabHost = _FragmentTabHost(context).apply(init)
inline fun ViewRoot.fragmentTabHost(init: (@KotaDsl _FragmentTabHost).() -> Unit): FragmentTabHost = _FragmentTabHost(getContext()).apply(init).add()

inline fun Context.viewPager(init: (@KotaDsl _ViewPager).() -> Unit): ViewPager = _ViewPager(this).apply(init)
inline fun Fragment.viewPager(init: (@KotaDsl _ViewPager).() -> Unit): ViewPager = _ViewPager(activity).apply(init)
inline fun Dialog.viewPager(init: (@KotaDsl _ViewPager).() -> Unit): ViewPager = _ViewPager(context).apply(init)
inline fun ViewRoot.viewPager(init: (@KotaDsl _ViewPager).() -> Unit): ViewPager = _ViewPager(getContext()).apply(init).add()

inline fun Context.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(this).apply(init)
inline fun Fragment.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(activity).apply(init)
inline fun Dialog.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(context).apply(init)
inline fun ViewRoot.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(getContext()).apply(init).add()

inline fun Context.nestedScrollView(init: (@KotaDsl _NestedScrollView).() -> Unit): NestedScrollView = _NestedScrollView(this).apply(init)
inline fun Fragment.nestedScrollView(init: (@KotaDsl _NestedScrollView).() -> Unit): NestedScrollView = _NestedScrollView(activity).apply(init)
inline fun Dialog.nestedScrollView(init: (@KotaDsl _NestedScrollView).() -> Unit): NestedScrollView = _NestedScrollView(context).apply(init)
inline fun ViewRoot.nestedScrollView(init: (@KotaDsl _NestedScrollView).() -> Unit): NestedScrollView = _NestedScrollView(getContext()).apply(init).add()

inline fun Context.slidingPaneLayout(init: (@KotaDsl _SlidingPaneLayout).() -> Unit): SlidingPaneLayout = _SlidingPaneLayout(this).apply(init)
inline fun Fragment.slidingPaneLayout(init: (@KotaDsl _SlidingPaneLayout).() -> Unit): SlidingPaneLayout = _SlidingPaneLayout(activity).apply(init)
inline fun Dialog.slidingPaneLayout(init: (@KotaDsl _SlidingPaneLayout).() -> Unit): SlidingPaneLayout = _SlidingPaneLayout(context).apply(init)
inline fun ViewRoot.slidingPaneLayout(init: (@KotaDsl _SlidingPaneLayout).() -> Unit): SlidingPaneLayout = _SlidingPaneLayout(getContext()).apply(init).add()
//endregion

//region Views

inline fun Context.pagerTabStrip(init: (@KotaDsl PagerTabStrip).() -> Unit): PagerTabStrip = PagerTabStrip(this).apply(init)
inline fun Fragment.pagerTabStrip(init: (@KotaDsl PagerTabStrip).() -> Unit): PagerTabStrip = PagerTabStrip(activity).apply(init)
inline fun Dialog.pagerTabStrip(init: (@KotaDsl PagerTabStrip).() -> Unit): PagerTabStrip = PagerTabStrip(context).apply(init)
inline fun ViewRoot.pagerTabStrip(init: (@KotaDsl PagerTabStrip).() -> Unit): PagerTabStrip = PagerTabStrip(getContext()).apply(init).add()

inline fun Context.pagerTitleStrip(init: (@KotaDsl PagerTitleStrip).() -> Unit): PagerTitleStrip = PagerTitleStrip(this).apply(init)
inline fun Fragment.pagerTitleStrip(init: (@KotaDsl PagerTitleStrip).() -> Unit): PagerTitleStrip = PagerTitleStrip(activity).apply(init)
inline fun Dialog.pagerTitleStrip(init: (@KotaDsl PagerTitleStrip).() -> Unit): PagerTitleStrip = PagerTitleStrip(context).apply(init)
inline fun ViewRoot.pagerTitleStrip(init: (@KotaDsl PagerTitleStrip).() -> Unit): PagerTitleStrip = PagerTitleStrip(getContext()).apply(init).add()

inline fun Context.contentLoadingProgressBar(init: (@KotaDsl ContentLoadingProgressBar).() -> Unit): ContentLoadingProgressBar = ContentLoadingProgressBar(this).apply(init)
inline fun Fragment.contentLoadingProgressBar(init: (@KotaDsl ContentLoadingProgressBar).() -> Unit): ContentLoadingProgressBar = ContentLoadingProgressBar(activity).apply(init)
inline fun Dialog.contentLoadingProgressBar(init: (@KotaDsl ContentLoadingProgressBar).() -> Unit): ContentLoadingProgressBar = ContentLoadingProgressBar(context).apply(init)
inline fun ViewRoot.contentLoadingProgressBar(init: (@KotaDsl ContentLoadingProgressBar).() -> Unit): ContentLoadingProgressBar = ContentLoadingProgressBar(getContext()).apply(init).add()

inline fun Context.supportSpace(init: (@KotaDsl Space).() -> Unit): Space = Space(this).apply(init)
inline fun Fragment.supportSpace(init: (@KotaDsl Space).() -> Unit): Space = Space(activity).apply(init)
inline fun Dialog.supportSpace(init: (@KotaDsl Space).() -> Unit): Space = Space(context).apply(init)
inline fun ViewRoot.supportSpace(init: (@KotaDsl Space).() -> Unit): Space = Space(getContext()).apply(init).add()

inline fun Context.swipeRefreshLayout(init: (@KotaDsl SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout = SwipeRefreshLayout(this).apply(init)
inline fun Fragment.swipeRefreshLayout(init: (@KotaDsl SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout = SwipeRefreshLayout(activity).apply(init)
inline fun Dialog.swipeRefreshLayout(init: (@KotaDsl SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout = SwipeRefreshLayout(context).apply(init)
inline fun ViewRoot.swipeRefreshLayout(init: (@KotaDsl SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout = SwipeRefreshLayout(getContext()).apply(init).add()
//endregion