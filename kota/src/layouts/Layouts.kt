@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.appwidget.AppWidgetHostView
import android.content.Context
import android.view.ViewGroup
import android.widget.*
import android.widget.LinearLayout.HORIZONTAL
import android.widget.LinearLayout.VERTICAL

inline fun Context.actionMenuView(init: (@KotaDsl _ActionMenuView).() -> Unit): ActionMenuView = _ActionMenuView(this).apply(init)
inline fun Fragment.actionMenuView(init: (@KotaDsl _ActionMenuView).() -> Unit): ActionMenuView = _ActionMenuView(activity).apply(init)
inline fun Dialog.actionMenuView(init: (@KotaDsl _ActionMenuView).() -> Unit): ActionMenuView = _ActionMenuView(context).apply(init)
inline fun ViewGroup.actionMenuView(init: (@KotaDsl _ActionMenuView).() -> Unit): ActionMenuView = _ActionMenuView(context).apply {
    init()
    addView(this)
}

inline fun Context.appWidgetHostView(init: (@KotaDsl _AppWidgetHostView).() -> Unit): AppWidgetHostView = _AppWidgetHostView(this).apply(init)
inline fun Fragment.appWidgetHostView(init: (@KotaDsl _AppWidgetHostView).() -> Unit): AppWidgetHostView = _AppWidgetHostView(activity).apply(init)
inline fun Dialog.appWidgetHostView(init: (@KotaDsl _AppWidgetHostView).() -> Unit): AppWidgetHostView = _AppWidgetHostView(context).apply(init)
inline fun ViewGroup.appWidgetHostView(init: (@KotaDsl _AppWidgetHostView).() -> Unit): AppWidgetHostView = _AppWidgetHostView(context).apply {
    init()
    addView(this)
}

inline fun Context.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(this).apply(init)
inline fun Fragment.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(activity).apply(init)
inline fun Dialog.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(context).apply(init)
inline fun ViewGroup.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(context).apply {
    init()
    addView(this)
}

inline fun Context.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(this).apply(init)
inline fun Fragment.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(activity).apply(init)
inline fun Dialog.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(context).apply(init)
inline fun ViewGroup.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(context).apply {
    init()
    addView(this)
}

inline fun Context.gridView(init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(this).apply(init)
inline fun Fragment.gridView(init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(activity).apply(init)
inline fun Dialog.gridView(init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(context).apply(init)
inline fun ViewGroup.gridView(init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(context).apply {
    init()
    addView(this)
}

inline fun Context.horizontalScrollView(init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(this).apply(init)
inline fun Fragment.horizontalScrollView(init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(activity).apply(init)
inline fun Dialog.horizontalScrollView(init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(context).apply(init)
inline fun ViewGroup.horizontalScrollView(init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(context).apply {
    init()
    addView(this)
}

inline fun Context.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(this).apply(init)
inline fun Fragment.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(activity).apply(init)
inline fun Dialog.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(context).apply(init)
inline fun ViewGroup.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(context).apply {
    init()
    addView(this)
}

inline fun Context.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(this, VERTICAL).apply(init)
inline fun Fragment.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(activity, VERTICAL).apply(init)
inline fun Dialog.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, VERTICAL).apply(init)
inline fun ViewGroup.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, VERTICAL).apply {
    init()
    addView(this)
}

inline fun Context.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(this, HORIZONTAL).apply(init)
inline fun Fragment.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(activity, HORIZONTAL).apply(init)
inline fun Dialog.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, HORIZONTAL).apply(init)
inline fun ViewGroup.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, HORIZONTAL).apply {
    init()
    addView(this)
}

inline fun Context.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(this).apply(init)
inline fun Fragment.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(activity).apply(init)
inline fun Dialog.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(context).apply(init)
inline fun ViewGroup.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(context).apply {
    init()
    addView(this)
}

inline fun Context.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(this).apply(init)
inline fun Fragment.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(activity).apply(init)
inline fun Dialog.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(context).apply(init)
inline fun ViewGroup.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(context).apply {
    init()
    addView(this)
}

inline fun Context.scrollView(init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(this).apply(init)
inline fun Fragment.scrollView(init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(activity).apply(init)
inline fun Dialog.scrollView(init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(context).apply(init)
inline fun ViewGroup.scrollView(init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(context).apply {
    init()
    addView(this)
}

inline fun Context.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(this).apply(init)
inline fun Fragment.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(activity).apply(init)
inline fun Dialog.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(context).apply(init)
inline fun ViewGroup.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(context).apply {
    init()
    addView(this)
}

inline fun Context.tableRow(init: (@KotaDsl _TableRow).() -> Unit): TableRow = _TableRow(this).apply(init)
inline fun Fragment.tableRow(init: (@KotaDsl _TableRow).() -> Unit): TableRow = _TableRow(activity).apply(init)
inline fun Dialog.tableRow(init: (@KotaDsl _TableRow).() -> Unit): TableRow = _TableRow(context).apply(init)
inline fun ViewGroup.tableRow(init: (@KotaDsl _TableRow).() -> Unit): TableRow = _TableRow(context).apply {
    init()
    addView(this)
}

inline fun Context.textSwitcher(init: (@KotaDsl _TextSwitcher).() -> Unit): TextSwitcher = _TextSwitcher(this).apply(init)
inline fun Fragment.textSwitcher(init: (@KotaDsl _TextSwitcher).() -> Unit): TextSwitcher = _TextSwitcher(activity).apply(init)
inline fun Dialog.textSwitcher(init: (@KotaDsl _TextSwitcher).() -> Unit): TextSwitcher = _TextSwitcher(context).apply(init)
inline fun ViewGroup.textSwitcher(init: (@KotaDsl _TextSwitcher).() -> Unit): TextSwitcher = _TextSwitcher(context).apply {
    init()
    addView(this)
}

inline fun Context.toolbar(init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(this).apply(init)
inline fun Fragment.toolbar(init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(activity).apply(init)
inline fun Dialog.toolbar(init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(context).apply(init)
inline fun ViewGroup.toolbar(init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(context).apply {
    init()
    addView(this)
}

inline fun Context.viewAnimator(init: (@KotaDsl _ViewAnimator).() -> Unit): ViewAnimator = _ViewAnimator(this).apply(init)
inline fun Fragment.viewAnimator(init: (@KotaDsl _ViewAnimator).() -> Unit): ViewAnimator = _ViewAnimator(activity).apply(init)
inline fun Dialog.viewAnimator(init: (@KotaDsl _ViewAnimator).() -> Unit): ViewAnimator = _ViewAnimator(context).apply(init)
inline fun ViewGroup.viewAnimator(init: (@KotaDsl _ViewAnimator).() -> Unit): ViewAnimator = _ViewAnimator(context).apply {
    init()
    addView(this)
}

inline fun Context.viewSwitcher(init: (@KotaDsl _ViewSwitcher).() -> Unit): ViewSwitcher = _ViewSwitcher(this).apply(init)
inline fun Fragment.viewSwitcher(init: (@KotaDsl _ViewSwitcher).() -> Unit): ViewSwitcher = _ViewSwitcher(activity).apply(init)
inline fun Dialog.viewSwitcher(init: (@KotaDsl _ViewSwitcher).() -> Unit): ViewSwitcher = _ViewSwitcher(context).apply(init)
inline fun ViewGroup.viewSwitcher(init: (@KotaDsl _ViewSwitcher).() -> Unit): ViewSwitcher = _ViewSwitcher(context).apply {
    init()
    addView(this)
}