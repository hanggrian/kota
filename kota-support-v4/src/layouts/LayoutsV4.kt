package kota

import android.content.Context
import android.support.v4.app.FragmentTabHost
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.support.v4.widget.NestedScrollView
import android.support.v4.widget.SlidingPaneLayout
import android.view.View
import android.widget.FrameLayout

class _FragmentTabHost(context: Context) : FragmentTabHost(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>

class _ViewPager(context: Context) : ViewPager(context), ViewManager2, LayoutParameterizable<ViewPager.LayoutParams> {
    infix fun <V : View> V.isDecor(decor: Boolean): V = apply { lparams.isDecor = decor }
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }

    val View.isDecor: Boolean get() = lparams.isDecor
    val View.gravity: Int get() = lparams.gravity
}

class _DrawerLayout(context: Context) : DrawerLayout(context), ViewManager2, MarginLayoutParameterizable<DrawerLayout.LayoutParams>

class _NestedScrollView(context: Context) : NestedScrollView(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>

class _SlidingPaneLayout(context: Context) : SlidingPaneLayout(context), ViewManager2, MarginLayoutParameterizable<SlidingPaneLayout.LayoutParams> {
    infix fun <V : View> V.weight(weight: Float): V = apply { lparams.weight = weight }

    val View.weight: Float get() = lparams.weight
}