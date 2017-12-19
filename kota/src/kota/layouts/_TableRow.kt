package kota

import android.content.Context
import android.view.View
import android.widget.TableRow

class _TableRow(context: Context) : TableRow(context), MarginLayoutParameterizable<TableRow.LayoutParams> {
    infix fun <V : View> V.col(column: Int) = apply { lparams.column = column }
    infix fun <V : View> V.span(span: Int) = apply { lparams.span = span }

    val View.col: Int get() = lparams.column
    val View.span: Int get() = lparams.span
}