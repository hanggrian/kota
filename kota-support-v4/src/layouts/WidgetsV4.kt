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

@JvmOverloads inline fun Context.pagerTabStrip(noinline init: ((@KotaDsl PagerTabStrip).() -> Unit)? = null): PagerTabStrip = PagerTabStrip(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.pagerTabStrip(noinline init: ((@KotaDsl PagerTabStrip).() -> Unit)? = null): PagerTabStrip = PagerTabStrip(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.pagerTabStrip(noinline init: ((@KotaDsl PagerTabStrip).() -> Unit)? = null): PagerTabStrip = PagerTabStrip(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.pagerTabStrip(noinline init: ((@KotaDsl PagerTabStrip).() -> Unit)? = null): PagerTabStrip = PagerTabStrip(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.pagerTitleStrip(noinline init: ((@KotaDsl PagerTitleStrip).() -> Unit)? = null): PagerTitleStrip = PagerTitleStrip(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.pagerTitleStrip(noinline init: ((@KotaDsl PagerTitleStrip).() -> Unit)? = null): PagerTitleStrip = PagerTitleStrip(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.pagerTitleStrip(noinline init: ((@KotaDsl PagerTitleStrip).() -> Unit)? = null): PagerTitleStrip = PagerTitleStrip(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.pagerTitleStrip(noinline init: ((@KotaDsl PagerTitleStrip).() -> Unit)? = null): PagerTitleStrip = PagerTitleStrip(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.contentLoadingProgressBar(noinline init: ((@KotaDsl ContentLoadingProgressBar).() -> Unit)? = null): ContentLoadingProgressBar = ContentLoadingProgressBar(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.contentLoadingProgressBar(noinline init: ((@KotaDsl ContentLoadingProgressBar).() -> Unit)? = null): ContentLoadingProgressBar = ContentLoadingProgressBar(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.contentLoadingProgressBar(noinline init: ((@KotaDsl ContentLoadingProgressBar).() -> Unit)? = null): ContentLoadingProgressBar = ContentLoadingProgressBar(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.contentLoadingProgressBar(noinline init: ((@KotaDsl ContentLoadingProgressBar).() -> Unit)? = null): ContentLoadingProgressBar = ContentLoadingProgressBar(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.supportSpace(noinline init: ((@KotaDsl Space).() -> Unit)? = null): Space = Space(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.supportSpace(noinline init: ((@KotaDsl Space).() -> Unit)? = null): Space = Space(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.supportSpace(noinline init: ((@KotaDsl Space).() -> Unit)? = null): Space = Space(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.supportSpace(noinline init: ((@KotaDsl Space).() -> Unit)? = null): Space = Space(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.swipeRefreshLayout(noinline init: ((@KotaDsl SwipeRefreshLayout).() -> Unit)? = null): SwipeRefreshLayout = SwipeRefreshLayout(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.swipeRefreshLayout(noinline init: ((@KotaDsl SwipeRefreshLayout).() -> Unit)? = null): SwipeRefreshLayout = SwipeRefreshLayout(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.swipeRefreshLayout(noinline init: ((@KotaDsl SwipeRefreshLayout).() -> Unit)? = null): SwipeRefreshLayout = SwipeRefreshLayout(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.swipeRefreshLayout(noinline init: ((@KotaDsl SwipeRefreshLayout).() -> Unit)? = null): SwipeRefreshLayout = SwipeRefreshLayout(getContext()).apply { init?.invoke(this) }.add()
//endregion