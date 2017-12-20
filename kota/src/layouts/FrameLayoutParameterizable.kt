package kota

import android.view.View
import android.widget.FrameLayout

interface FrameLayoutParameterizable<LP : FrameLayout.LayoutParams> : MarginLayoutParameterizable<LP> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }

    val View.gravity: Int get() = lparams.gravity
}