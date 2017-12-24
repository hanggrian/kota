@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.app.MediaRouteButton
import android.appwidget.AppWidgetHostView
import android.content.Context
import android.gesture.GestureOverlayView
import android.inputmethodservice.ExtractEditText
import android.media.tv.TvView
import android.opengl.GLSurfaceView
import android.support.annotation.RequiresApi
import android.view.SurfaceView
import android.view.TextureView
import android.view.View
import android.view.ViewStub
import android.webkit.WebView
import android.widget.*
import android.widget.LinearLayout.HORIZONTAL
import android.widget.LinearLayout.VERTICAL

//region Layouts

inline fun Context.appWidgetHostView(init: (@KotaDsl _AppWidgetHostView).() -> Unit): AppWidgetHostView = _AppWidgetHostView(this).apply(init)
inline fun Fragment.appWidgetHostView(init: (@KotaDsl _AppWidgetHostView).() -> Unit): AppWidgetHostView = _AppWidgetHostView(activity).apply(init)
inline fun Dialog.appWidgetHostView(init: (@KotaDsl _AppWidgetHostView).() -> Unit): AppWidgetHostView = _AppWidgetHostView(context).apply(init)
inline fun ViewRoot.appWidgetHostView(init: (@KotaDsl _AppWidgetHostView).() -> Unit): AppWidgetHostView = _AppWidgetHostView(getContext()).apply(init).add()

inline fun Context.actionMenuView(init: (@KotaDsl _ActionMenuView).() -> Unit): ActionMenuView = _ActionMenuView(this).apply(init)
inline fun Fragment.actionMenuView(init: (@KotaDsl _ActionMenuView).() -> Unit): ActionMenuView = _ActionMenuView(activity).apply(init)
inline fun Dialog.actionMenuView(init: (@KotaDsl _ActionMenuView).() -> Unit): ActionMenuView = _ActionMenuView(context).apply(init)
inline fun ViewRoot.actionMenuView(init: (@KotaDsl _ActionMenuView).() -> Unit): ActionMenuView = _ActionMenuView(getContext()).apply(init).add()

inline fun Context.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(this).apply(init)
inline fun Fragment.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(activity).apply(init)
inline fun Dialog.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(context).apply(init)
inline fun ViewRoot.frameLayout(init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(getContext()).apply(init).add()

inline fun Context.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(this).apply(init)
inline fun Fragment.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(activity).apply(init)
inline fun Dialog.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(context).apply(init)
inline fun ViewRoot.gridLayout(init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(getContext()).apply(init).add()

inline fun Context.gridView(init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(this).apply(init)
inline fun Fragment.gridView(init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(activity).apply(init)
inline fun Dialog.gridView(init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(context).apply(init)
inline fun ViewRoot.gridView(init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(getContext()).apply(init).add()

inline fun Context.horizontalScrollView(init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(this).apply(init)
inline fun Fragment.horizontalScrollView(init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(activity).apply(init)
inline fun Dialog.horizontalScrollView(init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(context).apply(init)
inline fun ViewRoot.horizontalScrollView(init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(getContext()).apply(init).add()

inline fun Context.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(this).apply(init)
inline fun Fragment.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(activity).apply(init)
inline fun Dialog.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(context).apply(init)
inline fun ViewRoot.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(getContext()).apply(init).add()

inline fun Context.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(this, VERTICAL).apply(init)
inline fun Fragment.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(activity, VERTICAL).apply(init)
inline fun Dialog.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, VERTICAL).apply(init)
inline fun ViewRoot.verticalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(getContext(), VERTICAL).apply(init).add()

inline fun Context.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(this, HORIZONTAL).apply(init)
inline fun Fragment.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(activity, HORIZONTAL).apply(init)
inline fun Dialog.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, HORIZONTAL).apply(init)
inline fun ViewRoot.horizontalLayout(init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(getContext(), HORIZONTAL).apply(init).add()

inline fun Context.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(this).apply(init)
inline fun Fragment.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(activity).apply(init)
inline fun Dialog.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(context).apply(init)
inline fun ViewRoot.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(getContext()).apply(init).add()

inline fun Context.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(this).apply(init)
inline fun Fragment.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(activity).apply(init)
inline fun Dialog.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(context).apply(init)
inline fun ViewRoot.relativeLayout(init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(getContext()).apply(init).add()

inline fun Context.scrollView(init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(this).apply(init)
inline fun Fragment.scrollView(init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(activity).apply(init)
inline fun Dialog.scrollView(init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(context).apply(init)
inline fun ViewRoot.scrollView(init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(getContext()).apply(init).add()

inline fun Context.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(this).apply(init)
inline fun Fragment.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(activity).apply(init)
inline fun Dialog.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(context).apply(init)
inline fun ViewRoot.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(getContext()).apply(init).add()

inline fun Context.tableRow(init: (@KotaDsl _TableRow).() -> Unit): TableRow = _TableRow(this).apply(init)
inline fun Fragment.tableRow(init: (@KotaDsl _TableRow).() -> Unit): TableRow = _TableRow(activity).apply(init)
inline fun Dialog.tableRow(init: (@KotaDsl _TableRow).() -> Unit): TableRow = _TableRow(context).apply(init)
inline fun ViewRoot.tableRow(init: (@KotaDsl _TableRow).() -> Unit): TableRow = _TableRow(getContext()).apply(init).add()

inline fun Context.textSwitcher(init: (@KotaDsl _TextSwitcher).() -> Unit): TextSwitcher = _TextSwitcher(this).apply(init)
inline fun Fragment.textSwitcher(init: (@KotaDsl _TextSwitcher).() -> Unit): TextSwitcher = _TextSwitcher(activity).apply(init)
inline fun Dialog.textSwitcher(init: (@KotaDsl _TextSwitcher).() -> Unit): TextSwitcher = _TextSwitcher(context).apply(init)
inline fun ViewRoot.textSwitcher(init: (@KotaDsl _TextSwitcher).() -> Unit): TextSwitcher = _TextSwitcher(getContext()).apply(init).add()

inline fun Context.toolbar(init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(this).apply(init)
inline fun Fragment.toolbar(init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(activity).apply(init)
inline fun Dialog.toolbar(init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(context).apply(init)
inline fun ViewRoot.toolbar(init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(getContext()).apply(init).add()

inline fun Context.viewAnimator(init: (@KotaDsl _ViewAnimator).() -> Unit): ViewAnimator = _ViewAnimator(this).apply(init)
inline fun Fragment.viewAnimator(init: (@KotaDsl _ViewAnimator).() -> Unit): ViewAnimator = _ViewAnimator(activity).apply(init)
inline fun Dialog.viewAnimator(init: (@KotaDsl _ViewAnimator).() -> Unit): ViewAnimator = _ViewAnimator(context).apply(init)
inline fun ViewRoot.viewAnimator(init: (@KotaDsl _ViewAnimator).() -> Unit): ViewAnimator = _ViewAnimator(getContext()).apply(init).add()

inline fun Context.viewSwitcher(init: (@KotaDsl _ViewSwitcher).() -> Unit): ViewSwitcher = _ViewSwitcher(this).apply(init)
inline fun Fragment.viewSwitcher(init: (@KotaDsl _ViewSwitcher).() -> Unit): ViewSwitcher = _ViewSwitcher(activity).apply(init)
inline fun Dialog.viewSwitcher(init: (@KotaDsl _ViewSwitcher).() -> Unit): ViewSwitcher = _ViewSwitcher(context).apply(init)
inline fun ViewRoot.viewSwitcher(init: (@KotaDsl _ViewSwitcher).() -> Unit): ViewSwitcher = _ViewSwitcher(getContext()).apply(init).add()
//endregion

//region Views

@RequiresApi(16) @JvmOverloads inline fun Context.mediaRouteButton(noinline init: ((@KotaDsl MediaRouteButton).() -> Unit)? = null): MediaRouteButton = MediaRouteButton(this).apply { init?.invoke(this) }
@RequiresApi(16) @JvmOverloads inline fun Fragment.mediaRouteButton(noinline init: ((@KotaDsl MediaRouteButton).() -> Unit)? = null): MediaRouteButton = MediaRouteButton(activity).apply { init?.invoke(this) }
@RequiresApi(16) @JvmOverloads inline fun Dialog.mediaRouteButton(noinline init: ((@KotaDsl MediaRouteButton).() -> Unit)? = null): MediaRouteButton = MediaRouteButton(context).apply { init?.invoke(this) }
@RequiresApi(16) @JvmOverloads inline fun ViewRoot.mediaRouteButton(noinline init: ((@KotaDsl MediaRouteButton).() -> Unit)? = null): MediaRouteButton = MediaRouteButton(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.gestureOverlayView(noinline init: ((@KotaDsl GestureOverlayView).() -> Unit)? = null): GestureOverlayView = GestureOverlayView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.gestureOverlayView(noinline init: ((@KotaDsl GestureOverlayView).() -> Unit)? = null): GestureOverlayView = GestureOverlayView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.gestureOverlayView(noinline init: ((@KotaDsl GestureOverlayView).() -> Unit)? = null): GestureOverlayView = GestureOverlayView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.gestureOverlayView(noinline init: ((@KotaDsl GestureOverlayView).() -> Unit)? = null): GestureOverlayView = GestureOverlayView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.extractEditText(noinline init: ((@KotaDsl ExtractEditText).() -> Unit)? = null): ExtractEditText = ExtractEditText(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.extractEditText(noinline init: ((@KotaDsl ExtractEditText).() -> Unit)? = null): ExtractEditText = ExtractEditText(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.extractEditText(noinline init: ((@KotaDsl ExtractEditText).() -> Unit)? = null): ExtractEditText = ExtractEditText(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.extractEditText(noinline init: ((@KotaDsl ExtractEditText).() -> Unit)? = null): ExtractEditText = ExtractEditText(getContext()).apply { init?.invoke(this) }.add()

@RequiresApi(21) @JvmOverloads inline fun Context.tvView(noinline init: ((@KotaDsl TvView).() -> Unit)? = null): TvView = TvView(this).apply { init?.invoke(this) }
@RequiresApi(21) @JvmOverloads inline fun Fragment.tvView(noinline init: ((@KotaDsl TvView).() -> Unit)? = null): TvView = TvView(activity).apply { init?.invoke(this) }
@RequiresApi(21) @JvmOverloads inline fun Dialog.tvView(noinline init: ((@KotaDsl TvView).() -> Unit)? = null): TvView = TvView(context).apply { init?.invoke(this) }
@RequiresApi(21) @JvmOverloads inline fun ViewRoot.tvView(noinline init: ((@KotaDsl TvView).() -> Unit)? = null): TvView = TvView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.glSurfaceView(noinline init: ((@KotaDsl GLSurfaceView).() -> Unit)? = null): GLSurfaceView = GLSurfaceView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.glSurfaceView(noinline init: ((@KotaDsl GLSurfaceView).() -> Unit)? = null): GLSurfaceView = GLSurfaceView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.glSurfaceView(noinline init: ((@KotaDsl GLSurfaceView).() -> Unit)? = null): GLSurfaceView = GLSurfaceView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.glSurfaceView(noinline init: ((@KotaDsl GLSurfaceView).() -> Unit)? = null): GLSurfaceView = GLSurfaceView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.surfaceView(noinline init: ((@KotaDsl SurfaceView).() -> Unit)? = null): SurfaceView = SurfaceView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.surfaceView(noinline init: ((@KotaDsl SurfaceView).() -> Unit)? = null): SurfaceView = SurfaceView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.surfaceView(noinline init: ((@KotaDsl SurfaceView).() -> Unit)? = null): SurfaceView = SurfaceView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.surfaceView(noinline init: ((@KotaDsl SurfaceView).() -> Unit)? = null): SurfaceView = SurfaceView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.textureView(noinline init: ((@KotaDsl TextureView).() -> Unit)? = null): TextureView = TextureView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.textureView(noinline init: ((@KotaDsl TextureView).() -> Unit)? = null): TextureView = TextureView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.textureView(noinline init: ((@KotaDsl TextureView).() -> Unit)? = null): TextureView = TextureView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.textureView(noinline init: ((@KotaDsl TextureView).() -> Unit)? = null): TextureView = TextureView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.view(noinline init: ((@KotaDsl View).() -> Unit)? = null): View = View(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.view(noinline init: ((@KotaDsl View).() -> Unit)? = null): View = View(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.view(noinline init: ((@KotaDsl View).() -> Unit)? = null): View = View(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.view(noinline init: ((@KotaDsl View).() -> Unit)? = null): View = View(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.viewStub(noinline init: ((@KotaDsl ViewStub).() -> Unit)? = null): ViewStub = ViewStub(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.viewStub(noinline init: ((@KotaDsl ViewStub).() -> Unit)? = null): ViewStub = ViewStub(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.viewStub(noinline init: ((@KotaDsl ViewStub).() -> Unit)? = null): ViewStub = ViewStub(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.viewStub(noinline init: ((@KotaDsl ViewStub).() -> Unit)? = null): ViewStub = ViewStub(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.webView(noinline init: ((@KotaDsl WebView).() -> Unit)? = null): WebView = WebView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.webView(noinline init: ((@KotaDsl WebView).() -> Unit)? = null): WebView = WebView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.webView(noinline init: ((@KotaDsl WebView).() -> Unit)? = null): WebView = WebView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.webView(noinline init: ((@KotaDsl WebView).() -> Unit)? = null): WebView = WebView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.adapterViewFlipper(noinline init: ((@KotaDsl AdapterViewFlipper).() -> Unit)? = null): AdapterViewFlipper = AdapterViewFlipper(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.adapterViewFlipper(noinline init: ((@KotaDsl AdapterViewFlipper).() -> Unit)? = null): AdapterViewFlipper = AdapterViewFlipper(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.adapterViewFlipper(noinline init: ((@KotaDsl AdapterViewFlipper).() -> Unit)? = null): AdapterViewFlipper = AdapterViewFlipper(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.adapterViewFlipper(noinline init: ((@KotaDsl AdapterViewFlipper).() -> Unit)? = null): AdapterViewFlipper = AdapterViewFlipper(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.autoCompleteTextView(noinline init: ((@KotaDsl AutoCompleteTextView).() -> Unit)? = null): AutoCompleteTextView = AutoCompleteTextView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.autoCompleteTextView(noinline init: ((@KotaDsl AutoCompleteTextView).() -> Unit)? = null): AutoCompleteTextView = AutoCompleteTextView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.autoCompleteTextView(noinline init: ((@KotaDsl AutoCompleteTextView).() -> Unit)? = null): AutoCompleteTextView = AutoCompleteTextView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.autoCompleteTextView(noinline init: ((@KotaDsl AutoCompleteTextView).() -> Unit)? = null): AutoCompleteTextView = AutoCompleteTextView(getContext()).apply { init?.invoke(this) }.add()

inline fun Context.button(noinline init: (@KotaDsl Button).() -> Unit): Button = Button(this).apply(init)
inline fun Fragment.button(noinline init: (@KotaDsl Button).() -> Unit): Button = Button(activity).apply(init)
inline fun Dialog.button(noinline init: (@KotaDsl Button).() -> Unit): Button = Button(context).apply(init)
inline fun ViewRoot.button(noinline init: (@KotaDsl Button).() -> Unit): Button = Button(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.button(style: Int, noinline init: (@KotaDsl Button).() -> Unit): Button = Button(this, null, android.R.attr.buttonStyle, style).apply(init)
@RequiresApi(21) inline fun Fragment.button(style: Int, noinline init: (@KotaDsl Button).() -> Unit): Button = Button(activity, null, android.R.attr.buttonStyle, style).apply(init)
@RequiresApi(21) inline fun Dialog.button(style: Int, noinline init: (@KotaDsl Button).() -> Unit): Button = Button(context, null, android.R.attr.buttonStyle, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.button(style: Int, noinline init: (@KotaDsl Button).() -> Unit): Button = Button(getContext(), null, android.R.attr.buttonStyle, style).apply(init).add()

@JvmOverloads inline fun Context.calendarView(noinline init: ((@KotaDsl CalendarView).() -> Unit)? = null): CalendarView = CalendarView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.calendarView(noinline init: ((@KotaDsl CalendarView).() -> Unit)? = null): CalendarView = CalendarView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.calendarView(noinline init: ((@KotaDsl CalendarView).() -> Unit)? = null): CalendarView = CalendarView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.calendarView(noinline init: ((@KotaDsl CalendarView).() -> Unit)? = null): CalendarView = CalendarView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.checkBox(noinline init: ((@KotaDsl CheckBox).() -> Unit)? = null): CheckBox = CheckBox(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.checkBox(noinline init: ((@KotaDsl CheckBox).() -> Unit)? = null): CheckBox = CheckBox(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.checkBox(noinline init: ((@KotaDsl CheckBox).() -> Unit)? = null): CheckBox = CheckBox(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.checkBox(noinline init: ((@KotaDsl CheckBox).() -> Unit)? = null): CheckBox = CheckBox(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.checkedTextView(noinline init: ((@KotaDsl CheckedTextView).() -> Unit)? = null): CheckedTextView = CheckedTextView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.checkedTextView(noinline init: ((@KotaDsl CheckedTextView).() -> Unit)? = null): CheckedTextView = CheckedTextView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.checkedTextView(noinline init: ((@KotaDsl CheckedTextView).() -> Unit)? = null): CheckedTextView = CheckedTextView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.checkedTextView(noinline init: ((@KotaDsl CheckedTextView).() -> Unit)? = null): CheckedTextView = CheckedTextView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.chronometer(noinline init: ((@KotaDsl Chronometer).() -> Unit)? = null): Chronometer = Chronometer(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.chronometer(noinline init: ((@KotaDsl Chronometer).() -> Unit)? = null): Chronometer = Chronometer(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.chronometer(noinline init: ((@KotaDsl Chronometer).() -> Unit)? = null): Chronometer = Chronometer(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.chronometer(noinline init: ((@KotaDsl Chronometer).() -> Unit)? = null): Chronometer = Chronometer(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.datePicker(noinline init: ((@KotaDsl DatePicker).() -> Unit)? = null): DatePicker = DatePicker(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.datePicker(noinline init: ((@KotaDsl DatePicker).() -> Unit)? = null): DatePicker = DatePicker(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.datePicker(noinline init: ((@KotaDsl DatePicker).() -> Unit)? = null): DatePicker = DatePicker(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.datePicker(noinline init: ((@KotaDsl DatePicker).() -> Unit)? = null): DatePicker = DatePicker(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.editText(noinline init: ((@KotaDsl EditText).() -> Unit)? = null): EditText = EditText(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.expandableListView(noinline init: ((@KotaDsl ExpandableListView).() -> Unit)? = null): ExpandableListView = ExpandableListView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.expandableListView(noinline init: ((@KotaDsl ExpandableListView).() -> Unit)? = null): ExpandableListView = ExpandableListView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.expandableListView(noinline init: ((@KotaDsl ExpandableListView).() -> Unit)? = null): ExpandableListView = ExpandableListView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.expandableListView(noinline init: ((@KotaDsl ExpandableListView).() -> Unit)? = null): ExpandableListView = ExpandableListView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.imageButton(noinline init: ((@KotaDsl ImageButton).() -> Unit)? = null): ImageButton = ImageButton(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.imageButton(noinline init: ((@KotaDsl ImageButton).() -> Unit)? = null): ImageButton = ImageButton(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.imageButton(noinline init: ((@KotaDsl ImageButton).() -> Unit)? = null): ImageButton = ImageButton(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.imageButton(noinline init: ((@KotaDsl ImageButton).() -> Unit)? = null): ImageButton = ImageButton(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.imageView(noinline init: ((@KotaDsl ImageView).() -> Unit)? = null): ImageView = ImageView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.imageView(noinline init: ((@KotaDsl ImageView).() -> Unit)? = null): ImageView = ImageView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.imageView(noinline init: ((@KotaDsl ImageView).() -> Unit)? = null): ImageView = ImageView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.imageView(noinline init: ((@KotaDsl ImageView).() -> Unit)? = null): ImageView = ImageView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.listView(noinline init: ((@KotaDsl ListView).() -> Unit)? = null): ListView = ListView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.listView(noinline init: ((@KotaDsl ListView).() -> Unit)? = null): ListView = ListView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.listView(noinline init: ((@KotaDsl ListView).() -> Unit)? = null): ListView = ListView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.listView(noinline init: ((@KotaDsl ListView).() -> Unit)? = null): ListView = ListView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.multiAutoCompleteTextView(noinline init: ((@KotaDsl MultiAutoCompleteTextView).() -> Unit)? = null): MultiAutoCompleteTextView = MultiAutoCompleteTextView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.multiAutoCompleteTextView(noinline init: ((@KotaDsl MultiAutoCompleteTextView).() -> Unit)? = null): MultiAutoCompleteTextView = MultiAutoCompleteTextView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.multiAutoCompleteTextView(noinline init: ((@KotaDsl MultiAutoCompleteTextView).() -> Unit)? = null): MultiAutoCompleteTextView = MultiAutoCompleteTextView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.multiAutoCompleteTextView(noinline init: ((@KotaDsl MultiAutoCompleteTextView).() -> Unit)? = null): MultiAutoCompleteTextView = MultiAutoCompleteTextView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.numberPicker(noinline init: ((@KotaDsl NumberPicker).() -> Unit)? = null): NumberPicker = NumberPicker(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.numberPicker(noinline init: ((@KotaDsl NumberPicker).() -> Unit)? = null): NumberPicker = NumberPicker(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.numberPicker(noinline init: ((@KotaDsl NumberPicker).() -> Unit)? = null): NumberPicker = NumberPicker(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.numberPicker(noinline init: ((@KotaDsl NumberPicker).() -> Unit)? = null): NumberPicker = NumberPicker(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.progressBar(noinline init: ((@KotaDsl ProgressBar).() -> Unit)? = null): ProgressBar = ProgressBar(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.progressBar(noinline init: ((@KotaDsl ProgressBar).() -> Unit)? = null): ProgressBar = ProgressBar(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.progressBar(noinline init: ((@KotaDsl ProgressBar).() -> Unit)? = null): ProgressBar = ProgressBar(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.progressBar(noinline init: ((@KotaDsl ProgressBar).() -> Unit)? = null): ProgressBar = ProgressBar(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.quickContactBadge(noinline init: ((@KotaDsl QuickContactBadge).() -> Unit)? = null): QuickContactBadge = QuickContactBadge(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.quickContactBadge(noinline init: ((@KotaDsl QuickContactBadge).() -> Unit)? = null): QuickContactBadge = QuickContactBadge(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.quickContactBadge(noinline init: ((@KotaDsl QuickContactBadge).() -> Unit)? = null): QuickContactBadge = QuickContactBadge(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.quickContactBadge(noinline init: ((@KotaDsl QuickContactBadge).() -> Unit)? = null): QuickContactBadge = QuickContactBadge(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.radioButton(noinline init: ((@KotaDsl RadioButton).() -> Unit)? = null): RadioButton = RadioButton(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.radioButton(noinline init: ((@KotaDsl RadioButton).() -> Unit)? = null): RadioButton = RadioButton(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.radioButton(noinline init: ((@KotaDsl RadioButton).() -> Unit)? = null): RadioButton = RadioButton(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.radioButton(noinline init: ((@KotaDsl RadioButton).() -> Unit)? = null): RadioButton = RadioButton(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.ratingBar(noinline init: ((@KotaDsl RatingBar).() -> Unit)? = null): RatingBar = RatingBar(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.ratingBar(noinline init: ((@KotaDsl RatingBar).() -> Unit)? = null): RatingBar = RatingBar(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.ratingBar(noinline init: ((@KotaDsl RatingBar).() -> Unit)? = null): RatingBar = RatingBar(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.ratingBar(noinline init: ((@KotaDsl RatingBar).() -> Unit)? = null): RatingBar = RatingBar(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.searchView(noinline init: ((@KotaDsl SearchView).() -> Unit)? = null): SearchView = SearchView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.searchView(noinline init: ((@KotaDsl SearchView).() -> Unit)? = null): SearchView = SearchView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.searchView(noinline init: ((@KotaDsl SearchView).() -> Unit)? = null): SearchView = SearchView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.searchView(noinline init: ((@KotaDsl SearchView).() -> Unit)? = null): SearchView = SearchView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.seekBar(noinline init: ((@KotaDsl SeekBar).() -> Unit)? = null): SeekBar = SeekBar(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.seekBar(noinline init: ((@KotaDsl SeekBar).() -> Unit)? = null): SeekBar = SeekBar(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.seekBar(noinline init: ((@KotaDsl SeekBar).() -> Unit)? = null): SeekBar = SeekBar(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.seekBar(noinline init: ((@KotaDsl SeekBar).() -> Unit)? = null): SeekBar = SeekBar(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.space(noinline init: ((@KotaDsl Space).() -> Unit)? = null): Space = Space(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.space(noinline init: ((@KotaDsl Space).() -> Unit)? = null): Space = Space(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.space(noinline init: ((@KotaDsl Space).() -> Unit)? = null): Space = Space(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.space(noinline init: ((@KotaDsl Space).() -> Unit)? = null): Space = Space(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.spinner(noinline init: ((@KotaDsl Spinner).() -> Unit)? = null): Spinner = Spinner(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.spinner(noinline init: ((@KotaDsl Spinner).() -> Unit)? = null): Spinner = Spinner(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.spinner(noinline init: ((@KotaDsl Spinner).() -> Unit)? = null): Spinner = Spinner(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.spinner(noinline init: ((@KotaDsl Spinner).() -> Unit)? = null): Spinner = Spinner(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.stackView(noinline init: ((@KotaDsl StackView).() -> Unit)? = null): StackView = StackView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.stackView(noinline init: ((@KotaDsl StackView).() -> Unit)? = null): StackView = StackView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.stackView(noinline init: ((@KotaDsl StackView).() -> Unit)? = null): StackView = StackView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.stackView(noinline init: ((@KotaDsl StackView).() -> Unit)? = null): StackView = StackView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.switch(noinline init: ((@KotaDsl Switch).() -> Unit)? = null): Switch = Switch(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.switch(noinline init: ((@KotaDsl Switch).() -> Unit)? = null): Switch = Switch(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.switch(noinline init: ((@KotaDsl Switch).() -> Unit)? = null): Switch = Switch(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.switch(noinline init: ((@KotaDsl Switch).() -> Unit)? = null): Switch = Switch(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.tabHost(noinline init: ((@KotaDsl TabHost).() -> Unit)? = null): TabHost = TabHost(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.tabHost(noinline init: ((@KotaDsl TabHost).() -> Unit)? = null): TabHost = TabHost(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.tabHost(noinline init: ((@KotaDsl TabHost).() -> Unit)? = null): TabHost = TabHost(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.tabHost(noinline init: ((@KotaDsl TabHost).() -> Unit)? = null): TabHost = TabHost(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.tabWidget(noinline init: ((@KotaDsl TabWidget).() -> Unit)? = null): TabWidget = TabWidget(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.tabWidget(noinline init: ((@KotaDsl TabWidget).() -> Unit)? = null): TabWidget = TabWidget(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.tabWidget(noinline init: ((@KotaDsl TabWidget).() -> Unit)? = null): TabWidget = TabWidget(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.tabWidget(noinline init: ((@KotaDsl TabWidget).() -> Unit)? = null): TabWidget = TabWidget(getContext()).apply { init?.invoke(this) }.add()

@RequiresApi(17) @JvmOverloads inline fun Context.textClock(noinline init: ((@KotaDsl TextClock).() -> Unit)? = null): TextClock = TextClock(this).apply { init?.invoke(this) }
@RequiresApi(17) @JvmOverloads inline fun Fragment.textClock(noinline init: ((@KotaDsl TextClock).() -> Unit)? = null): TextClock = TextClock(activity).apply { init?.invoke(this) }
@RequiresApi(17) @JvmOverloads inline fun Dialog.textClock(noinline init: ((@KotaDsl TextClock).() -> Unit)? = null): TextClock = TextClock(context).apply { init?.invoke(this) }
@RequiresApi(17) @JvmOverloads inline fun ViewRoot.textClock(noinline init: ((@KotaDsl TextClock).() -> Unit)? = null): TextClock = TextClock(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.textView(noinline init: ((@KotaDsl TextView).() -> Unit)? = null): TextView = TextView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.timePicker(noinline init: ((@KotaDsl TimePicker).() -> Unit)? = null): TimePicker = TimePicker(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.timePicker(noinline init: ((@KotaDsl TimePicker).() -> Unit)? = null): TimePicker = TimePicker(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.timePicker(noinline init: ((@KotaDsl TimePicker).() -> Unit)? = null): TimePicker = TimePicker(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.timePicker(noinline init: ((@KotaDsl TimePicker).() -> Unit)? = null): TimePicker = TimePicker(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.toggleButton(noinline init: ((@KotaDsl ToggleButton).() -> Unit)? = null): ToggleButton = ToggleButton(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.toggleButton(noinline init: ((@KotaDsl ToggleButton).() -> Unit)? = null): ToggleButton = ToggleButton(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.toggleButton(noinline init: ((@KotaDsl ToggleButton).() -> Unit)? = null): ToggleButton = ToggleButton(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.toggleButton(noinline init: ((@KotaDsl ToggleButton).() -> Unit)? = null): ToggleButton = ToggleButton(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.videoView(noinline init: ((@KotaDsl VideoView).() -> Unit)? = null): VideoView = VideoView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.videoView(noinline init: ((@KotaDsl VideoView).() -> Unit)? = null): VideoView = VideoView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.videoView(noinline init: ((@KotaDsl VideoView).() -> Unit)? = null): VideoView = VideoView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.videoView(noinline init: ((@KotaDsl VideoView).() -> Unit)? = null): VideoView = VideoView(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.viewFlipper(noinline init: ((@KotaDsl ViewFlipper).() -> Unit)? = null): ViewFlipper = ViewFlipper(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.viewFlipper(noinline init: ((@KotaDsl ViewFlipper).() -> Unit)? = null): ViewFlipper = ViewFlipper(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.viewFlipper(noinline init: ((@KotaDsl ViewFlipper).() -> Unit)? = null): ViewFlipper = ViewFlipper(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.viewFlipper(noinline init: ((@KotaDsl ViewFlipper).() -> Unit)? = null): ViewFlipper = ViewFlipper(getContext()).apply { init?.invoke(this) }.add()

@JvmOverloads inline fun Context.zoomControls(noinline init: ((@KotaDsl ZoomControls).() -> Unit)? = null): ZoomControls = ZoomControls(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.zoomControls(noinline init: ((@KotaDsl ZoomControls).() -> Unit)? = null): ZoomControls = ZoomControls(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.zoomControls(noinline init: ((@KotaDsl ZoomControls).() -> Unit)? = null): ZoomControls = ZoomControls(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewRoot.zoomControls(noinline init: ((@KotaDsl ZoomControls).() -> Unit)? = null): ZoomControls = ZoomControls(getContext()).apply { init?.invoke(this) }.add()
//endregion