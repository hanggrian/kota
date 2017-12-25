package kota

import android.appwidget.AppWidgetHostView
import android.content.Context
import android.support.annotation.RequiresApi
import android.support.annotation.StyleRes
import android.view.View
import android.view.ViewGroup
import android.widget.*

interface ViewRoot {
    fun getContext(): Context

    fun addView(view: View)

    fun <V : View> V.add() = apply { addView(this) }
}

interface LayoutParameterizable<LP : ViewGroup.LayoutParams> {
    infix fun <V : View> V.lparams(params: LP): V = apply { layoutParams = params }

    infix fun <V : View> V.width(width: Int): V = apply { lparams.width = width }
    infix fun <V : View> V.height(height: Int): V = apply { lparams.height = height }

    val View.lparams: LP @Suppress("UNCHECKED_CAST") get() = layoutParams as LP

    @RequiresApi(17) infix fun <V : View> V.resolveDirection(direction: Int): V = apply { lparams.resolveLayoutDirection(direction) }
}

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

    @RequiresApi(17) infix fun <V : View> V.direction(direction: Int): V = apply { lparams.setLayoutDirection(direction) }
    val View.direction: Int @RequiresApi(17) get() = lparams.layoutDirection
}

interface LinearLayoutParameterizable<LP : LinearLayout.LayoutParams> : MarginLayoutParameterizable<LP> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }
    infix fun <V : View> V.weight(weight: Float): V = apply { lparams.weight = weight }

    val View.gravity: Int get() = lparams.gravity
    val View.weight: Float get() = lparams.weight
}

interface FrameLayoutParameterizable<LP : FrameLayout.LayoutParams> : MarginLayoutParameterizable<LP> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }

    val View.gravity: Int get() = lparams.gravity
}

open class _AppWidgetHostView(context: Context) : AppWidgetHostView(context), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>

open class _ActionMenuView(context: Context) : ActionMenuView(context), ViewRoot, LinearLayoutParameterizable<ActionMenuView.LayoutParams>

open class _FrameLayout(context: Context, @StyleRes defStyleRes: Int) : FrameLayout(context, null, 0, defStyleRes), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>

open class _GridLayout(context: Context, @StyleRes style: Int) : GridLayout(context, null, 0, style), ViewRoot, MarginLayoutParameterizable<GridLayout.LayoutParams> {
    infix fun <V : View> V.col(spec: GridLayout.Spec) = apply { lparams.columnSpec = spec }
    infix fun <V : View> V.row(spec: GridLayout.Spec) = apply { lparams.rowSpec = spec }
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.setGravity(gravity) }

    val View.col: GridLayout.Spec get() = lparams.columnSpec
    val View.row: GridLayout.Spec get() = lparams.rowSpec
}

open class _GridView(context: Context, @StyleRes style: Int) : GridView(context, null, 0, style), ViewRoot, LayoutParameterizable<AbsListView.LayoutParams>

open class _HorizontalScrollView(context: Context, @StyleRes style: Int) : HorizontalScrollView(context, null, 0, style), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>

open class _ImageSwitcher(context: Context) : ImageSwitcher(context), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>

open class _LinearLayout(context: Context, @StyleRes style: Int, orientation: Int) : LinearLayout(context, null, 0, style), ViewRoot, LinearLayoutParameterizable<LinearLayout.LayoutParams> {
    init {
        setOrientation(orientation)
    }
}

open class _RadioGroup(context: Context) : RadioGroup(context), ViewRoot, LinearLayoutParameterizable<RadioGroup.LayoutParams>

open class _RelativeLayout(context: Context, @StyleRes style: Int) : RelativeLayout(context, null, 0, style), ViewRoot, MarginLayoutParameterizable<RelativeLayout.LayoutParams> {
    infix fun <V : View> V.alignWithParent(align: Boolean): V = apply { lparams.alignWithParent = align }
    infix fun <V : View> V.addRule(verb: Int): V = apply { lparams.addRule(verb) }
    fun <V : View> V.addRule(verb: Int, subject: Int): V = apply { lparams.addRule(verb, subject) }
    @RequiresApi(17) infix fun <V : View> V.removeRule(verb: Int): V = apply { lparams.removeRule(verb) }

    val View.alignWithParent: Boolean get() = lparams.alignWithParent
    val View.rules: IntArray get() = lparams.rules

    @RequiresApi(17) override fun <V : View> V.resolveDirection(direction: Int): V = apply { lparams.resolveLayoutDirection(direction) }
}

open class _ScrollView(context: Context, @StyleRes style: Int) : ScrollView(context, null, 0, style), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>

open class _TableLayout(context: Context) : TableLayout(context), ViewRoot, LinearLayoutParameterizable<TableLayout.LayoutParams>

open class _TableRow(context: Context) : TableRow(context), ViewRoot, LinearLayoutParameterizable<TableRow.LayoutParams> {
    infix fun <V : View> V.col(column: Int) = apply { lparams.column = column }
    infix fun <V : View> V.span(span: Int) = apply { lparams.span = span }

    val View.col: Int get() = lparams.column
    val View.span: Int get() = lparams.span
}

open class _TextSwitcher(context: Context) : TextSwitcher(context), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>

open class _Toolbar(context: Context, @StyleRes style: Int) : Toolbar(context, null, 0, style), ViewRoot, MarginLayoutParameterizable<Toolbar.LayoutParams> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }

    val View.gravity: Int get() = lparams.gravity
}

open class _ViewAnimator(context: Context) : ViewAnimator(context), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>

open class _ViewSwitcher(context: Context) : ViewSwitcher(context), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>