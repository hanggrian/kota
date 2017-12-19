package kota

import android.support.annotation.RequiresApi
import android.view.View
import android.view.ViewGroup

interface MarginLayoutParameterizable<LP : ViewGroup.MarginLayoutParams> : LayoutParameterizable<LP> {
    fun <V : View> V.margins(left: Int, top: Int, right: Int, bottom: Int): V = apply { lparams.setMargins(left, top, right, bottom) }
    infix fun <V : View> V.marginLeft(left: Int): V = apply { lparams.leftMargin = left }
    infix fun <V : View> V.marginTop(top: Int): V = apply { lparams.topMargin = top }
    infix fun <V : View> V.marginRight(right: Int): V = apply { lparams.rightMargin = right }
    infix fun <V : View> V.marginBottom(bottom: Int): V = apply { lparams.bottomMargin = bottom }

    val View.marginLeft: Int get() = lparams.leftMargin
    val View.marginTop: Int get() = lparams.topMargin
    val View.marginRight: Int get() = lparams.rightMargin
    val View.marginBottom: Int get() = lparams.bottomMargin

    @RequiresApi(17) infix fun <V : View> V.marginStart(start: Int): V = apply { lparams.marginStart = start }
    @RequiresApi(17) infix fun <V : View> V.marginEnd(end: Int): V = apply { lparams.marginEnd = end }

    val View.isMarginRelative: Boolean @RequiresApi(17) get() = lparams.isMarginRelative

    @RequiresApi(17) infix fun <V : View> V.resolveDirection(direction: Int): V = apply { lparams.resolveLayoutDirection(direction) }
    @RequiresApi(17) infix fun <V : View> V.direction(direction: Int): V = apply { lparams.setLayoutDirection(direction) }
    val View.direction: Int @RequiresApi(17) get() = lparams.layoutDirection
}