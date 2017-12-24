package kota

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.ActionMenuView
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.Toolbar
import android.view.View

interface LinearLayoutCompatParameterizable<LP : LinearLayoutCompat.LayoutParams> : MarginLayoutParameterizable<LP> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }
    infix fun <V : View> V.weight(weight: Float): V = apply { lparams.weight = weight }

    val View.gravity: Int get() = lparams.gravity
    val View.weight: Float get() = lparams.weight
}

open class _ActionMenuViewV7(context: Context) : ActionMenuView(context), ViewRoot, LinearLayoutCompatParameterizable<ActionMenuView.LayoutParams> {
    infix fun <V : View> V.overflowButton(overflow: Boolean): V = apply { lparams.isOverflowButton = overflow }
    infix fun <V : View> V.cellsUsed(cells: Int): V = apply { lparams.cellsUsed = cells }
    infix fun <V : View> V.extraPixels(pixels: Int): V = apply { lparams.extraPixels = pixels }
    infix fun <V : View> V.expandable(expandable: Boolean): V = apply { lparams.expandable = expandable }
    infix fun <V : View> V.preventEdgeOffset(prevent: Boolean): V = apply { lparams.preventEdgeOffset = prevent }

    val View.isOverflowButton: Boolean get() = lparams.isOverflowButton
    val View.cellsUsed: Int get() = lparams.cellsUsed
    val View.extraPixels: Int get() = lparams.extraPixels
    val View.expandable: Boolean get() = lparams.expandable
    val View.preventEdgeOffset: Boolean get() = lparams.preventEdgeOffset
}

@SuppressLint("ViewConstructor")
open class _LinearLayoutCompat(context: Context, orientation: Int) : LinearLayoutCompat(context), ViewRoot, LinearLayoutCompatParameterizable<LinearLayoutCompat.LayoutParams> {
    init {
        setOrientation(orientation)
    }
}

open class _ToolbarV7(context: Context) : Toolbar(context), ViewRoot, MarginLayoutParameterizable<Toolbar.LayoutParams> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }

    val View.gravity: Int get() = lparams.gravity
}