package kota

import android.content.Context
import android.support.v7.widget.GridLayout
import android.view.View

open class _GridLayoutV7(context: Context) : GridLayout(context), ViewRoot, MarginLayoutParameterizable<GridLayout.LayoutParams> {
    infix fun <V : View> V.row(spec: GridLayout.Spec) = apply { lparams.rowSpec = spec }
    infix fun <V : View> V.col(spec: GridLayout.Spec) = apply { lparams.columnSpec = spec }
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.setGravity(gravity) }

    val View.col: GridLayout.Spec get() = lparams.columnSpec
    val View.row: GridLayout.Spec get() = lparams.rowSpec
}