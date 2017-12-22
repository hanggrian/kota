package kota

import android.content.Context
import android.support.annotation.IdRes
import android.support.design.widget.*
import android.view.View
import android.view.animation.Interpolator
import android.widget.FrameLayout
import android.widget.LinearLayout

open class _AppBarLayout(context: Context) : AppBarLayout(context), ViewRoot, LinearLayoutParameterizable<AppBarLayout.LayoutParams> {
    infix fun <V : View> V.scrollFlags(@LayoutParams.ScrollFlags flags: Int): V = apply { lparams.scrollFlags = flags }
    infix fun <V : View> V.scrollInterpolator(interpolator: Interpolator): V = apply { lparams.scrollInterpolator = interpolator }

    val View.scrollFlags: Int @LayoutParams.ScrollFlags get() = lparams.scrollFlags
    val View.scrollInterpolator: Interpolator get() = lparams.scrollInterpolator
}

open class _BottomNavigationView(context: Context) : BottomNavigationView(context), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>

open class _CollapsingToolbarLayout(context: Context) : CollapsingToolbarLayout(context), ViewRoot, FrameLayoutParameterizable<CollapsingToolbarLayout.LayoutParams> {
    infix fun <V : View> V.collapseMode(mode: Int): V = apply { lparams.collapseMode = mode }
    infix fun <V : View> V.parallaxMultiplier(multiplier: Float): V = apply { lparams.parallaxMultiplier = multiplier }

    val View.collapseMode: Int get() = lparams.collapseMode
    val View.parallaxMultiplier: Float get() = lparams.parallaxMultiplier
}

open class _CoordinatorLayout(context: Context) : CoordinatorLayout(context), ViewRoot, MarginLayoutParameterizable<CoordinatorLayout.LayoutParams> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }
    infix fun <V : View> V.anchorGravity(gravity: Int): V = apply { lparams.anchorGravity = gravity }
    infix fun <V : View> V.keyline(keyline: Int): V = apply { lparams.keyline = keyline }
    infix fun <V : View> V.insetEdge(edge: Int): V = apply { lparams.insetEdge = edge }
    infix fun <V : View> V.dodgeInsetEdges(edges: Int): V = apply { lparams.dodgeInsetEdges = edges }
    infix fun <V : View> V.anchorId(@IdRes id: Int): V = apply { lparams.anchorId = id }
    infix fun <V : View> V.behavior(behavior: Behavior<*>?): V = apply { lparams.behavior = behavior }

    val View.gravity: Int get() = lparams.gravity
    val View.anchorGravity: Int get() = lparams.anchorGravity
    val View.keyline: Int get() = lparams.keyline
    val View.insetEdge: Int get() = lparams.insetEdge
    val View.dodgeInsetEdges: Int get() = lparams.dodgeInsetEdges
    val View.anchorId: Int @IdRes get() = lparams.anchorId
    val View.behavior: Behavior<*>? get() = lparams.behavior
}

open class _TabLayout(context: Context) : TabLayout(context), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>

open class _TextInputLayout(context: Context) : TextInputLayout(context), ViewRoot, LinearLayoutParameterizable<LinearLayout.LayoutParams>