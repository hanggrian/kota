package kota.layouts

import android.content.Context
import android.view.View
import android.widget.FrameLayout

class _FrameLayout(context: Context) : FrameLayout(context), MarginLayoutParamsable<FrameLayout.LayoutParams> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }

    val View.gravity: Int get() = lparams.gravity
}