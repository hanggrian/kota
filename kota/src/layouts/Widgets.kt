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
import android.support.annotation.StyleRes
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

@JvmOverloads inline fun Context.frameLayout(@StyleRes style: Int = 0, init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(this, style).apply(init)
@JvmOverloads inline fun Fragment.frameLayout(@StyleRes style: Int = 0, init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(activity, style).apply(init)
@JvmOverloads inline fun Dialog.frameLayout(@StyleRes style: Int = 0, init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(context, style).apply(init)
@JvmOverloads inline fun ViewRoot.frameLayout(@StyleRes style: Int = 0, init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(getContext(), style).apply(init).add()

@JvmOverloads inline fun Context.gridLayout(@StyleRes style: Int = 0, init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(this, style).apply(init)
@JvmOverloads inline fun Fragment.gridLayout(@StyleRes style: Int = 0, init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(activity, style).apply(init)
@JvmOverloads inline fun Dialog.gridLayout(@StyleRes style: Int = 0, init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(context, style).apply(init)
@JvmOverloads inline fun ViewRoot.gridLayout(@StyleRes style: Int = 0, init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(getContext(), style).apply(init).add()

@JvmOverloads inline fun Context.gridView(@StyleRes style: Int = 0, init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(this, style).apply(init)
@JvmOverloads inline fun Fragment.gridView(@StyleRes style: Int = 0, init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(activity, style).apply(init)
@JvmOverloads inline fun Dialog.gridView(@StyleRes style: Int = 0, init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(context, style).apply(init)
@JvmOverloads inline fun ViewRoot.gridView(@StyleRes style: Int = 0, init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(getContext(), style).apply(init).add()

@JvmOverloads inline fun Context.horizontalScrollView(@StyleRes style: Int = 0, init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(this, style).apply(init)
@JvmOverloads inline fun Fragment.horizontalScrollView(@StyleRes style: Int = 0, init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(activity, style).apply(init)
@JvmOverloads inline fun Dialog.horizontalScrollView(@StyleRes style: Int = 0, init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(context, style).apply(init)
@JvmOverloads inline fun ViewRoot.horizontalScrollView(@StyleRes style: Int = 0, init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(getContext(), style).apply(init).add()

inline fun Context.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(this).apply(init)
inline fun Fragment.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(activity).apply(init)
inline fun Dialog.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(context).apply(init)
inline fun ViewRoot.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(getContext()).apply(init).add()

@JvmOverloads inline fun Context.verticalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(this, style, VERTICAL).apply(init)
@JvmOverloads inline fun Fragment.verticalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(activity, style, VERTICAL).apply(init)
@JvmOverloads inline fun Dialog.verticalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, style, VERTICAL).apply(init)
@JvmOverloads inline fun ViewRoot.verticalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(getContext(), style, VERTICAL).apply(init).add()

@JvmOverloads inline fun Context.horizontalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(this, style, HORIZONTAL).apply(init)
@JvmOverloads inline fun Fragment.horizontalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(activity, style, HORIZONTAL).apply(init)
@JvmOverloads inline fun Dialog.horizontalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context, style, HORIZONTAL).apply(init)
@JvmOverloads inline fun ViewRoot.horizontalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(getContext(), style, HORIZONTAL).apply(init).add()

inline fun Context.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(this).apply(init)
inline fun Fragment.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(activity).apply(init)
inline fun Dialog.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(context).apply(init)
inline fun ViewRoot.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(getContext()).apply(init).add()

@JvmOverloads inline fun Context.relativeLayout(@StyleRes style: Int = 0, init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(this, style).apply(init)
@JvmOverloads inline fun Fragment.relativeLayout(@StyleRes style: Int = 0, init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(activity, style).apply(init)
@JvmOverloads inline fun Dialog.relativeLayout(@StyleRes style: Int = 0, init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(context, style).apply(init)
@JvmOverloads inline fun ViewRoot.relativeLayout(@StyleRes style: Int = 0, init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(getContext(), style).apply(init).add()

@JvmOverloads inline fun Context.scrollView(@StyleRes style: Int = 0, init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(this, style).apply(init)
@JvmOverloads inline fun Fragment.scrollView(@StyleRes style: Int = 0, init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(activity, style).apply(init)
@JvmOverloads inline fun Dialog.scrollView(@StyleRes style: Int = 0, init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(context, style).apply(init)
@JvmOverloads inline fun ViewRoot.scrollView(@StyleRes style: Int = 0, init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(getContext(), style).apply(init).add()

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

@JvmOverloads inline fun Context.toolbar(@StyleRes style: Int = 0, init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(this, style).apply(init)
@JvmOverloads inline fun Fragment.toolbar(@StyleRes style: Int = 0, init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(activity, style).apply(init)
@JvmOverloads inline fun Dialog.toolbar(@StyleRes style: Int = 0, init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(context, style).apply(init)
@JvmOverloads inline fun ViewRoot.toolbar(@StyleRes style: Int = 0, init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(getContext(), style).apply(init).add()

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

@RequiresApi(16) inline fun Context.mediaRouteButton(init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(this).apply(init)
@RequiresApi(16) inline fun Fragment.mediaRouteButton(init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(activity).apply(init)
@RequiresApi(16) inline fun Dialog.mediaRouteButton(init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(context).apply(init)
@RequiresApi(16) inline fun ViewRoot.mediaRouteButton(init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.mediaRouteButton(@StyleRes style: Int, init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.mediaRouteButton(@StyleRes style: Int, init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.mediaRouteButton(@StyleRes style: Int, init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.mediaRouteButton(@StyleRes style: Int, init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(getContext(), null, 0, style).apply(init).add()

inline fun Context.gestureOverlayView(init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(this).apply(init)
inline fun Fragment.gestureOverlayView(init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(activity).apply(init)
inline fun Dialog.gestureOverlayView(init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(context).apply(init)
inline fun ViewRoot.gestureOverlayView(init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.gestureOverlayView(@StyleRes style: Int, init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.gestureOverlayView(@StyleRes style: Int, init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.gestureOverlayView(@StyleRes style: Int, init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.gestureOverlayView(@StyleRes style: Int, init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(getContext(), null, 0, style).apply(init).add()

inline fun Context.extractEditText(init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(this).apply(init)
inline fun Fragment.extractEditText(init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(activity).apply(init)
inline fun Dialog.extractEditText(init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(context).apply(init)
inline fun ViewRoot.extractEditText(init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.extractEditText(@StyleRes style: Int, init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.extractEditText(@StyleRes style: Int, init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.extractEditText(@StyleRes style: Int, init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.extractEditText(@StyleRes style: Int, init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(getContext(), null, 0, style).apply(init).add()

@RequiresApi(21) inline fun Context.tvView(init: (@KotaDsl TvView).() -> Unit): TvView = TvView(this).apply(init)
@RequiresApi(21) inline fun Fragment.tvView(init: (@KotaDsl TvView).() -> Unit): TvView = TvView(activity).apply(init)
@RequiresApi(21) inline fun Dialog.tvView(init: (@KotaDsl TvView).() -> Unit): TvView = TvView(context).apply(init)
@RequiresApi(21) inline fun ViewRoot.tvView(init: (@KotaDsl TvView).() -> Unit): TvView = TvView(getContext()).apply(init).add()

inline fun Context.glSurfaceView(init: (@KotaDsl GLSurfaceView).() -> Unit): GLSurfaceView = GLSurfaceView(this).apply(init)
inline fun Fragment.glSurfaceView(init: (@KotaDsl GLSurfaceView).() -> Unit): GLSurfaceView = GLSurfaceView(activity).apply(init)
inline fun Dialog.glSurfaceView(init: (@KotaDsl GLSurfaceView).() -> Unit): GLSurfaceView = GLSurfaceView(context).apply(init)
inline fun ViewRoot.glSurfaceView(init: (@KotaDsl GLSurfaceView).() -> Unit): GLSurfaceView = GLSurfaceView(getContext()).apply(init).add()

inline fun Context.surfaceView(init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(this).apply(init)
inline fun Fragment.surfaceView(init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(activity).apply(init)
inline fun Dialog.surfaceView(init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(context).apply(init)
inline fun ViewRoot.surfaceView(init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.surfaceView(@StyleRes style: Int, init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.surfaceView(@StyleRes style: Int, init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.surfaceView(@StyleRes style: Int, init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.surfaceView(@StyleRes style: Int, init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(getContext(), null, 0, style).apply(init).add()

inline fun Context.textureView(init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(this).apply(init)
inline fun Fragment.textureView(init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(activity).apply(init)
inline fun Dialog.textureView(init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(context).apply(init)
inline fun ViewRoot.textureView(init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.textureView(@StyleRes style: Int, init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.textureView(@StyleRes style: Int, init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.textureView(@StyleRes style: Int, init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.textureView(@StyleRes style: Int, init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(getContext(), null, 0, style).apply(init).add()

inline fun Context.view(init: (@KotaDsl View).() -> Unit): View = View(this).apply(init)
inline fun Fragment.view(init: (@KotaDsl View).() -> Unit): View = View(activity).apply(init)
inline fun Dialog.view(init: (@KotaDsl View).() -> Unit): View = View(context).apply(init)
inline fun ViewRoot.view(init: (@KotaDsl View).() -> Unit): View = View(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.view(@StyleRes style: Int, init: (@KotaDsl View).() -> Unit): View = View(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.view(@StyleRes style: Int, init: (@KotaDsl View).() -> Unit): View = View(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.view(@StyleRes style: Int, init: (@KotaDsl View).() -> Unit): View = View(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.view(@StyleRes style: Int, init: (@KotaDsl View).() -> Unit): View = View(getContext(), null, 0, style).apply(init).add()

inline fun Context.viewStub(init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(this).apply(init)
inline fun Fragment.viewStub(init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(activity).apply(init)
inline fun Dialog.viewStub(init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(context).apply(init)
inline fun ViewRoot.viewStub(init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.viewStub(@StyleRes style: Int, init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.viewStub(@StyleRes style: Int, init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.viewStub(@StyleRes style: Int, init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.viewStub(@StyleRes style: Int, init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(getContext(), null, 0, style).apply(init).add()

inline fun Context.webView(init: (@KotaDsl WebView).() -> Unit): WebView = WebView(this).apply(init)
inline fun Fragment.webView(init: (@KotaDsl WebView).() -> Unit): WebView = WebView(activity).apply(init)
inline fun Dialog.webView(init: (@KotaDsl WebView).() -> Unit): WebView = WebView(context).apply(init)
inline fun ViewRoot.webView(init: (@KotaDsl WebView).() -> Unit): WebView = WebView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.webView(@StyleRes style: Int, init: (@KotaDsl WebView).() -> Unit): WebView = WebView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.webView(@StyleRes style: Int, init: (@KotaDsl WebView).() -> Unit): WebView = WebView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.webView(@StyleRes style: Int, init: (@KotaDsl WebView).() -> Unit): WebView = WebView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.webView(@StyleRes style: Int, init: (@KotaDsl WebView).() -> Unit): WebView = WebView(getContext(), null, 0, style).apply(init).add()

inline fun Context.adapterViewFlipper(init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(this).apply(init)
inline fun Fragment.adapterViewFlipper(init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(activity).apply(init)
inline fun Dialog.adapterViewFlipper(init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(context).apply(init)
inline fun ViewRoot.adapterViewFlipper(init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.adapterViewFlipper(@StyleRes style: Int, init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.adapterViewFlipper(@StyleRes style: Int, init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.adapterViewFlipper(@StyleRes style: Int, init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.adapterViewFlipper(@StyleRes style: Int, init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(getContext(), null, 0, style).apply(init).add()

inline fun Context.autoCompleteTextView(init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(this).apply(init)
inline fun Fragment.autoCompleteTextView(init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(activity).apply(init)
inline fun Dialog.autoCompleteTextView(init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(context).apply(init)
inline fun ViewRoot.autoCompleteTextView(init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.autoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.autoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.autoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.autoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(getContext(), null, 0, style).apply(init).add()

inline fun Context.button(init: (@KotaDsl Button).() -> Unit): Button = Button(this).apply(init)
inline fun Fragment.button(init: (@KotaDsl Button).() -> Unit): Button = Button(activity).apply(init)
inline fun Dialog.button(init: (@KotaDsl Button).() -> Unit): Button = Button(context).apply(init)
inline fun ViewRoot.button(init: (@KotaDsl Button).() -> Unit): Button = Button(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.button(@StyleRes style: Int, init: (@KotaDsl Button).() -> Unit): Button = Button(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.button(@StyleRes style: Int, init: (@KotaDsl Button).() -> Unit): Button = Button(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.button(@StyleRes style: Int, init: (@KotaDsl Button).() -> Unit): Button = Button(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.button(@StyleRes style: Int, init: (@KotaDsl Button).() -> Unit): Button = Button(getContext(), null, 0, style).apply(init).add()

inline fun Context.calendarView(init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(this).apply(init)
inline fun Fragment.calendarView(init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(activity).apply(init)
inline fun Dialog.calendarView(init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(context).apply(init)
inline fun ViewRoot.calendarView(init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.calendarView(@StyleRes style: Int, init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.calendarView(@StyleRes style: Int, init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.calendarView(@StyleRes style: Int, init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.calendarView(@StyleRes style: Int, init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(getContext(), null, 0, style).apply(init).add()

inline fun Context.checkBox(init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(this).apply(init)
inline fun Fragment.checkBox(init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(activity).apply(init)
inline fun Dialog.checkBox(init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(context).apply(init)
inline fun ViewRoot.checkBox(init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.checkBox(@StyleRes style: Int, init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.checkBox(@StyleRes style: Int, init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.checkBox(@StyleRes style: Int, init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.checkBox(@StyleRes style: Int, init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(getContext(), null, 0, style).apply(init).add()

inline fun Context.checkedTextView(init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(this).apply(init)
inline fun Fragment.checkedTextView(init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(activity).apply(init)
inline fun Dialog.checkedTextView(init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(context).apply(init)
inline fun ViewRoot.checkedTextView(init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.checkedTextView(@StyleRes style: Int, init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.checkedTextView(@StyleRes style: Int, init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.checkedTextView(@StyleRes style: Int, init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.checkedTextView(@StyleRes style: Int, init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(getContext(), null, 0, style).apply(init).add()

inline fun Context.chronometer(init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(this).apply(init)
inline fun Fragment.chronometer(init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(activity).apply(init)
inline fun Dialog.chronometer(init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(context).apply(init)
inline fun ViewRoot.chronometer(init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.chronometer(@StyleRes style: Int, init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.chronometer(@StyleRes style: Int, init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.chronometer(@StyleRes style: Int, init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.chronometer(@StyleRes style: Int, init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(getContext(), null, 0, style).apply(init).add()

inline fun Context.datePicker(init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(this).apply(init)
inline fun Fragment.datePicker(init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(activity).apply(init)
inline fun Dialog.datePicker(init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(context).apply(init)
inline fun ViewRoot.datePicker(init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.datePicker(@StyleRes style: Int, init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.datePicker(@StyleRes style: Int, init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.datePicker(@StyleRes style: Int, init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.datePicker(@StyleRes style: Int, init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(getContext(), null, 0, style).apply(init).add()

inline fun Context.editText(init: (@KotaDsl EditText).() -> Unit): EditText = EditText(this).apply(init)
inline fun Fragment.editText(init: (@KotaDsl EditText).() -> Unit): EditText = EditText(activity).apply(init)
inline fun Dialog.editText(init: (@KotaDsl EditText).() -> Unit): EditText = EditText(context).apply(init)
inline fun ViewRoot.editText(init: (@KotaDsl EditText).() -> Unit): EditText = EditText(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.editText(@StyleRes style: Int, init: (@KotaDsl EditText).() -> Unit): EditText = EditText(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.editText(@StyleRes style: Int, init: (@KotaDsl EditText).() -> Unit): EditText = EditText(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.editText(@StyleRes style: Int, init: (@KotaDsl EditText).() -> Unit): EditText = EditText(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.editText(@StyleRes style: Int, init: (@KotaDsl EditText).() -> Unit): EditText = EditText(getContext(), null, 0, style).apply(init).add()

inline fun Context.expandableListView(init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(this).apply(init)
inline fun Fragment.expandableListView(init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(activity).apply(init)
inline fun Dialog.expandableListView(init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(context).apply(init)
inline fun ViewRoot.expandableListView(init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.expandableListView(@StyleRes style: Int, init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.expandableListView(@StyleRes style: Int, init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.expandableListView(@StyleRes style: Int, init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.expandableListView(@StyleRes style: Int, init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(getContext(), null, 0, style).apply(init).add()

inline fun Context.imageButton(init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(this).apply(init)
inline fun Fragment.imageButton(init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(activity).apply(init)
inline fun Dialog.imageButton(init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(context).apply(init)
inline fun ViewRoot.imageButton(init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.imageButton(@StyleRes style: Int, init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.imageButton(@StyleRes style: Int, init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.imageButton(@StyleRes style: Int, init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.imageButton(@StyleRes style: Int, init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(getContext(), null, 0, style).apply(init).add()

inline fun Context.imageView(init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(this).apply(init)
inline fun Fragment.imageView(init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(activity).apply(init)
inline fun Dialog.imageView(init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(context).apply(init)
inline fun ViewRoot.imageView(init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.imageView(@StyleRes style: Int, init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.imageView(@StyleRes style: Int, init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.imageView(@StyleRes style: Int, init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.imageView(@StyleRes style: Int, init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(getContext(), null, 0, style).apply(init).add()

inline fun Context.listView(init: (@KotaDsl ListView).() -> Unit): ListView = ListView(this).apply(init)
inline fun Fragment.listView(init: (@KotaDsl ListView).() -> Unit): ListView = ListView(activity).apply(init)
inline fun Dialog.listView(init: (@KotaDsl ListView).() -> Unit): ListView = ListView(context).apply(init)
inline fun ViewRoot.listView(init: (@KotaDsl ListView).() -> Unit): ListView = ListView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.listView(@StyleRes style: Int, init: (@KotaDsl ListView).() -> Unit): ListView = ListView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.listView(@StyleRes style: Int, init: (@KotaDsl ListView).() -> Unit): ListView = ListView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.listView(@StyleRes style: Int, init: (@KotaDsl ListView).() -> Unit): ListView = ListView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.listView(@StyleRes style: Int, init: (@KotaDsl ListView).() -> Unit): ListView = ListView(getContext(), null, 0, style).apply(init).add()

inline fun Context.multiAutoCompleteTextView(init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(this).apply(init)
inline fun Fragment.multiAutoCompleteTextView(init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(activity).apply(init)
inline fun Dialog.multiAutoCompleteTextView(init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(context).apply(init)
inline fun ViewRoot.multiAutoCompleteTextView(init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.multiAutoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.multiAutoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.multiAutoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.multiAutoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(getContext(), null, 0, style).apply(init).add()

inline fun Context.numberPicker(init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(this).apply(init)
inline fun Fragment.numberPicker(init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(activity).apply(init)
inline fun Dialog.numberPicker(init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(context).apply(init)
inline fun ViewRoot.numberPicker(init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.numberPicker(@StyleRes style: Int, init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.numberPicker(@StyleRes style: Int, init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.numberPicker(@StyleRes style: Int, init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.numberPicker(@StyleRes style: Int, init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(getContext(), null, 0, style).apply(init).add()

inline fun Context.progressBar(init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(this).apply(init)
inline fun Fragment.progressBar(init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(activity).apply(init)
inline fun Dialog.progressBar(init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(context).apply(init)
inline fun ViewRoot.progressBar(init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.progressBar(@StyleRes style: Int, init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.progressBar(@StyleRes style: Int, init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.progressBar(@StyleRes style: Int, init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.progressBar(@StyleRes style: Int, init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(getContext(), null, 0, style).apply(init).add()

inline fun Context.quickContactBadge(init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(this).apply(init)
inline fun Fragment.quickContactBadge(init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(activity).apply(init)
inline fun Dialog.quickContactBadge(init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(context).apply(init)
inline fun ViewRoot.quickContactBadge(init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.quickContactBadge(@StyleRes style: Int, init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.quickContactBadge(@StyleRes style: Int, init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.quickContactBadge(@StyleRes style: Int, init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.quickContactBadge(@StyleRes style: Int, init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(getContext(), null, 0, style).apply(init).add()

inline fun Context.radioButton(init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(this).apply(init)
inline fun Fragment.radioButton(init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(activity).apply(init)
inline fun Dialog.radioButton(init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(context).apply(init)
inline fun ViewRoot.radioButton(init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.radioButton(@StyleRes style: Int, init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.radioButton(@StyleRes style: Int, init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.radioButton(@StyleRes style: Int, init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.radioButton(@StyleRes style: Int, init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(getContext(), null, 0, style).apply(init).add()

inline fun Context.ratingBar(init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(this).apply(init)
inline fun Fragment.ratingBar(init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(activity).apply(init)
inline fun Dialog.ratingBar(init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(context).apply(init)
inline fun ViewRoot.ratingBar(init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.ratingBar(@StyleRes style: Int, init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.ratingBar(@StyleRes style: Int, init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.ratingBar(@StyleRes style: Int, init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.ratingBar(@StyleRes style: Int, init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(getContext(), null, 0, style).apply(init).add()

inline fun Context.searchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(this).apply(init)
inline fun Fragment.searchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(activity).apply(init)
inline fun Dialog.searchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(context).apply(init)
inline fun ViewRoot.searchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.searchView(@StyleRes style: Int, init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.searchView(@StyleRes style: Int, init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.searchView(@StyleRes style: Int, init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.searchView(@StyleRes style: Int, init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(getContext(), null, 0, style).apply(init).add()

inline fun Context.seekBar(init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(this).apply(init)
inline fun Fragment.seekBar(init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(activity).apply(init)
inline fun Dialog.seekBar(init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(context).apply(init)
inline fun ViewRoot.seekBar(init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.seekBar(@StyleRes style: Int, init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.seekBar(@StyleRes style: Int, init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.seekBar(@StyleRes style: Int, init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.seekBar(@StyleRes style: Int, init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(getContext(), null, 0, style).apply(init).add()

inline fun Context.space(init: (@KotaDsl Space).() -> Unit): Space = Space(this).apply(init)
inline fun Fragment.space(init: (@KotaDsl Space).() -> Unit): Space = Space(activity).apply(init)
inline fun Dialog.space(init: (@KotaDsl Space).() -> Unit): Space = Space(context).apply(init)
inline fun ViewRoot.space(init: (@KotaDsl Space).() -> Unit): Space = Space(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.space(@StyleRes style: Int, init: (@KotaDsl Space).() -> Unit): Space = Space(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.space(@StyleRes style: Int, init: (@KotaDsl Space).() -> Unit): Space = Space(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.space(@StyleRes style: Int, init: (@KotaDsl Space).() -> Unit): Space = Space(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.space(@StyleRes style: Int, init: (@KotaDsl Space).() -> Unit): Space = Space(getContext(), null, 0, style).apply(init).add()

inline fun Context.spinner(init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(this).apply(init)
inline fun Fragment.spinner(init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(activity).apply(init)
inline fun Dialog.spinner(init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(context).apply(init)
inline fun ViewRoot.spinner(init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.spinner(@StyleRes style: Int, init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.spinner(@StyleRes style: Int, init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.spinner(@StyleRes style: Int, init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.spinner(@StyleRes style: Int, init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(getContext(), null, 0, style).apply(init).add()

inline fun Context.stackView(init: (@KotaDsl StackView).() -> Unit): StackView = StackView(this).apply(init)
inline fun Fragment.stackView(init: (@KotaDsl StackView).() -> Unit): StackView = StackView(activity).apply(init)
inline fun Dialog.stackView(init: (@KotaDsl StackView).() -> Unit): StackView = StackView(context).apply(init)
inline fun ViewRoot.stackView(init: (@KotaDsl StackView).() -> Unit): StackView = StackView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.stackView(@StyleRes style: Int, init: (@KotaDsl StackView).() -> Unit): StackView = StackView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.stackView(@StyleRes style: Int, init: (@KotaDsl StackView).() -> Unit): StackView = StackView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.stackView(@StyleRes style: Int, init: (@KotaDsl StackView).() -> Unit): StackView = StackView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.stackView(@StyleRes style: Int, init: (@KotaDsl StackView).() -> Unit): StackView = StackView(getContext(), null, 0, style).apply(init).add()

inline fun Context.switch(init: (@KotaDsl Switch).() -> Unit): Switch = Switch(this).apply(init)
inline fun Fragment.switch(init: (@KotaDsl Switch).() -> Unit): Switch = Switch(activity).apply(init)
inline fun Dialog.switch(init: (@KotaDsl Switch).() -> Unit): Switch = Switch(context).apply(init)
inline fun ViewRoot.switch(init: (@KotaDsl Switch).() -> Unit): Switch = Switch(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.switch(@StyleRes style: Int, init: (@KotaDsl Switch).() -> Unit): Switch = Switch(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.switch(@StyleRes style: Int, init: (@KotaDsl Switch).() -> Unit): Switch = Switch(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.switch(@StyleRes style: Int, init: (@KotaDsl Switch).() -> Unit): Switch = Switch(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.switch(@StyleRes style: Int, init: (@KotaDsl Switch).() -> Unit): Switch = Switch(getContext(), null, 0, style).apply(init).add()

inline fun Context.tabHost(init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(this).apply(init)
inline fun Fragment.tabHost(init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(activity).apply(init)
inline fun Dialog.tabHost(init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(context).apply(init)
inline fun ViewRoot.tabHost(init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.tabHost(@StyleRes style: Int, init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.tabHost(@StyleRes style: Int, init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.tabHost(@StyleRes style: Int, init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.tabHost(@StyleRes style: Int, init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(getContext(), null, 0, style).apply(init).add()

inline fun Context.tabWidget(init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(this).apply(init)
inline fun Fragment.tabWidget(init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(activity).apply(init)
inline fun Dialog.tabWidget(init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(context).apply(init)
inline fun ViewRoot.tabWidget(init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.tabWidget(@StyleRes style: Int, init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.tabWidget(@StyleRes style: Int, init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.tabWidget(@StyleRes style: Int, init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.tabWidget(@StyleRes style: Int, init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(getContext(), null, 0, style).apply(init).add()

@RequiresApi(17) inline fun Context.textClock(init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(this).apply(init)
@RequiresApi(17) inline fun Fragment.textClock(init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(activity).apply(init)
@RequiresApi(17) inline fun Dialog.textClock(init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(context).apply(init)
@RequiresApi(17) inline fun ViewRoot.textClock(init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.textClock(@StyleRes style: Int, init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.textClock(@StyleRes style: Int, init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.textClock(@StyleRes style: Int, init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.textClock(@StyleRes style: Int, init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(getContext(), null, 0, style).apply(init).add()

inline fun Context.textView(init: (@KotaDsl TextView).() -> Unit): TextView = TextView(this).apply(init)
inline fun Fragment.textView(init: (@KotaDsl TextView).() -> Unit): TextView = TextView(activity).apply(init)
inline fun Dialog.textView(init: (@KotaDsl TextView).() -> Unit): TextView = TextView(context).apply(init)
inline fun ViewRoot.textView(init: (@KotaDsl TextView).() -> Unit): TextView = TextView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.textView(@StyleRes style: Int, init: (@KotaDsl TextView).() -> Unit): TextView = TextView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.textView(@StyleRes style: Int, init: (@KotaDsl TextView).() -> Unit): TextView = TextView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.textView(@StyleRes style: Int, init: (@KotaDsl TextView).() -> Unit): TextView = TextView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.textView(@StyleRes style: Int, init: (@KotaDsl TextView).() -> Unit): TextView = TextView(getContext(), null, 0, style).apply(init).add()

inline fun Context.timePicker(init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(this).apply(init)
inline fun Fragment.timePicker(init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(activity).apply(init)
inline fun Dialog.timePicker(init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(context).apply(init)
inline fun ViewRoot.timePicker(init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.timePicker(@StyleRes style: Int, init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.timePicker(@StyleRes style: Int, init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.timePicker(@StyleRes style: Int, init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.timePicker(@StyleRes style: Int, init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(getContext(), null, 0, style).apply(init).add()

inline fun Context.toggleButton(init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(this).apply(init)
inline fun Fragment.toggleButton(init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(activity).apply(init)
inline fun Dialog.toggleButton(init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(context).apply(init)
inline fun ViewRoot.toggleButton(init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.toggleButton(@StyleRes style: Int, init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.toggleButton(@StyleRes style: Int, init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.toggleButton(@StyleRes style: Int, init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.toggleButton(@StyleRes style: Int, init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(getContext(), null, 0, style).apply(init).add()

inline fun Context.videoView(init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(this).apply(init)
inline fun Fragment.videoView(init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(activity).apply(init)
inline fun Dialog.videoView(init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(context).apply(init)
inline fun ViewRoot.videoView(init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(getContext()).apply(init).add()

@RequiresApi(21) inline fun Context.videoView(@StyleRes style: Int, init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(this, null, 0, style).apply(init)
@RequiresApi(21) inline fun Fragment.videoView(@StyleRes style: Int, init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(activity, null, 0, style).apply(init)
@RequiresApi(21) inline fun Dialog.videoView(@StyleRes style: Int, init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(context, null, 0, style).apply(init)
@RequiresApi(21) inline fun ViewRoot.videoView(@StyleRes style: Int, init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(getContext(), null, 0, style).apply(init).add()

inline fun Context.viewFlipper(init: (@KotaDsl ViewFlipper).() -> Unit): ViewFlipper = ViewFlipper(this).apply(init)
inline fun Fragment.viewFlipper(init: (@KotaDsl ViewFlipper).() -> Unit): ViewFlipper = ViewFlipper(activity).apply(init)
inline fun Dialog.viewFlipper(init: (@KotaDsl ViewFlipper).() -> Unit): ViewFlipper = ViewFlipper(context).apply(init)
inline fun ViewRoot.viewFlipper(init: (@KotaDsl ViewFlipper).() -> Unit): ViewFlipper = ViewFlipper(getContext()).apply(init).add()

inline fun Context.zoomControls(init: (@KotaDsl ZoomControls).() -> Unit): ZoomControls = ZoomControls(this).apply(init)
inline fun Fragment.zoomControls(init: (@KotaDsl ZoomControls).() -> Unit): ZoomControls = ZoomControls(activity).apply(init)
inline fun Dialog.zoomControls(init: (@KotaDsl ZoomControls).() -> Unit): ZoomControls = ZoomControls(context).apply(init)
inline fun ViewRoot.zoomControls(init: (@KotaDsl ZoomControls).() -> Unit): ZoomControls = ZoomControls(getContext()).apply(init).add()
//endregion