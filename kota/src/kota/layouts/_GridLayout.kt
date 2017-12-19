package kota

import android.content.Context
import android.view.View
import android.widget.GridLayout

class _GridLayout(context: Context) : GridLayout(context), MarginLayoutParameterizable<GridLayout.LayoutParams> {
    infix fun <V : View> V.col(spec: GridLayout.Spec) = apply { lparams.columnSpec = spec }
    infix fun <V : View> V.row(spec: GridLayout.Spec) = apply { lparams.rowSpec = spec }
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.setGravity(gravity) }
}