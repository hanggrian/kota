package kota

import android.content.Context
import android.support.v7.widget.ActionMenuView
import android.view.View

class _ActionMenuViewV7(context: Context) : ActionMenuView(context), LinearLayoutCompatParameterizable<ActionMenuView.LayoutParams> {
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