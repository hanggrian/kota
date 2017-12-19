package kota

import android.view.View
import android.view.ViewGroup

interface LayoutParameterizable<LP : ViewGroup.LayoutParams> {
    infix fun <V : View> V.lparams(params: LP): V = apply { layoutParams = params }

    infix fun <V : View> V.width(width: Int): V = apply { lparams.width = width }
    infix fun <V : View> V.height(height: Int): V = apply { lparams.height = height }

    val View.lparams: LP @Suppress("UNCHECKED_CAST") get() = layoutParams as LP
}