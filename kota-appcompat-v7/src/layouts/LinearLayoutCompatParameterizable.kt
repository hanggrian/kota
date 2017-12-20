package kota

import android.support.v7.widget.LinearLayoutCompat
import android.view.View

interface LinearLayoutCompatParameterizable<LP : LinearLayoutCompat.LayoutParams> : MarginLayoutParameterizable<LP> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }
    infix fun <V : View> V.weight(weight: Float): V = apply { lparams.weight = weight }

    val View.gravity: Int get() = lparams.gravity
    val View.weight: Float get() = lparams.weight
}