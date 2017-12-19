package kota

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.widget.LinearLayout

@SuppressLint("ViewConstructor")
class _LinearLayout(context: Context, orientation: Int) : LinearLayout(context), MarginLayoutParameterizable<LinearLayout.LayoutParams> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }
    infix fun <V : View> V.weight(weight: Float): V = apply { lparams.weight = weight }

    val View.gravity: Int get() = lparams.gravity
    val View.weight: Float get() = lparams.weight

    init {
        setOrientation(orientation)
    }
}