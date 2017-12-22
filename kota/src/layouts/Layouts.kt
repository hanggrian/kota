package kota

import android.annotation.SuppressLint
import android.appwidget.AppWidgetHostView
import android.content.Context
import android.support.annotation.RequiresApi
import android.view.View
import android.view.ViewGroup
import android.widget.*

interface ViewManager2 {
    fun getContext(): Context

    fun addView(view: View)

    fun <T : View> T.add() = apply { addView(this) }
}

interface LayoutParameterizable<LP : ViewGroup.LayoutParams> {
    infix fun <V : View> V.lparams(params: LP): V = apply { layoutParams = params }

    infix fun <V : View> V.width(width: Int): V = apply { lparams.width = width }
    infix fun <V : View> V.height(height: Int): V = apply { lparams.height = height }

    val View.lparams: LP @Suppress("UNCHECKED_CAST") get() = layoutParams as LP
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

    @RequiresApi(17) infix fun <V : View> V.resolveDirection(direction: Int): V = apply { lparams.resolveLayoutDirection(direction) }
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

class _AppWidgetHostView(context: Context) : AppWidgetHostView(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>

class _ActionMenuView(context: Context) : ActionMenuView(context), ViewManager2, LinearLayoutParameterizable<ActionMenuView.LayoutParams>

class _FrameLayout(context: Context) : FrameLayout(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>

class _GridLayout(context: Context) : GridLayout(context), ViewManager2, MarginLayoutParameterizable<GridLayout.LayoutParams> {
    infix fun <V : View> V.col(spec: GridLayout.Spec) = apply { lparams.columnSpec = spec }
    infix fun <V : View> V.row(spec: GridLayout.Spec) = apply { lparams.rowSpec = spec }
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.setGravity(gravity) }

    val View.col: GridLayout.Spec get() = lparams.columnSpec
    val View.row: GridLayout.Spec get() = lparams.rowSpec
}

class _GridView(context: Context) : GridView(context), ViewManager2, LayoutParameterizable<AbsListView.LayoutParams>

class _HorizontalScrollView(context: Context) : HorizontalScrollView(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>

class _ImageSwitcher(context: Context) : ImageSwitcher(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>

@SuppressLint("ViewConstructor")
class _LinearLayout(context: Context, orientation: Int) : LinearLayout(context), ViewManager2, LinearLayoutParameterizable<LinearLayout.LayoutParams> {
    init {
        setOrientation(orientation)
    }
}

class _RadioGroup(context: Context) : RadioGroup(context), ViewManager2, LinearLayoutParameterizable<RadioGroup.LayoutParams>

class _RelativeLayout(context: Context) : RelativeLayout(context), ViewManager2, MarginLayoutParameterizable<RelativeLayout.LayoutParams> {
    infix fun <V : View> V.alignWithParent(align: Boolean): V = apply { lparams.alignWithParent = align }
    infix fun <V : View> V.addRule(verb: Int): V = apply { lparams.addRule(verb) }
    fun <V : View> V.addRule(verb: Int, subject: Int): V = apply { lparams.addRule(verb, subject) }
    @RequiresApi(17) infix fun <V : View> V.removeRule(verb: Int): V = apply { lparams.removeRule(verb) }

    val View.alignWithParent: Boolean get() = lparams.alignWithParent
    val View.rules: IntArray get() = lparams.rules

    @RequiresApi(17) override fun <V : View> V.resolveDirection(direction: Int): V = apply { lparams.resolveLayoutDirection(direction) }
}

class _ScrollView(context: Context) : ScrollView(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>

class _TableLayout(context: Context) : TableLayout(context), ViewManager2, LinearLayoutParameterizable<TableLayout.LayoutParams>

class _TableRow(context: Context) : TableRow(context), ViewManager2, LinearLayoutParameterizable<TableRow.LayoutParams> {
    infix fun <V : View> V.col(column: Int) = apply { lparams.column = column }
    infix fun <V : View> V.span(span: Int) = apply { lparams.span = span }

    val View.col: Int get() = lparams.column
    val View.span: Int get() = lparams.span
}

class _TextSwitcher(context: Context) : TextSwitcher(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>

class _Toolbar(context: Context) : Toolbar(context), ViewManager2, MarginLayoutParameterizable<Toolbar.LayoutParams>

class _ViewAnimator(context: Context) : ViewAnimator(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>

class _ViewSwitcher(context: Context) : ViewSwitcher(context), ViewManager2, FrameLayoutParameterizable<FrameLayout.LayoutParams>