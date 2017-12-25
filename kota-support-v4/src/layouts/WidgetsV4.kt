@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.MediaRouteButton
import android.appwidget.AppWidgetHostView
import android.content.Context
import android.gesture.GestureOverlayView
import android.inputmethodservice.ExtractEditText
import android.media.tv.TvView
import android.opengl.GLSurfaceView
import android.support.annotation.RequiresApi
import android.support.annotation.StyleRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTabHost
import android.support.v4.view.PagerTabStrip
import android.support.v4.view.PagerTitleStrip
import android.support.v4.view.ViewPager
import android.support.v4.widget.*
import android.support.v4.widget.Space
import android.view.SurfaceView
import android.view.TextureView
import android.view.View
import android.view.ViewStub
import android.webkit.WebView
import android.widget.*

//region Layouts

inline fun Context.fragmentTabHost(init: (@KotaDsl _FragmentTabHost).() -> Unit): FragmentTabHost = _FragmentTabHost(this).apply(init)
inline fun android.app.Fragment.fragmentTabHost(init: (@KotaDsl _FragmentTabHost).() -> Unit): FragmentTabHost = _FragmentTabHost(activity).apply(init)
inline fun Fragment.fragmentTabHost(init: (@KotaDsl _FragmentTabHost).() -> Unit): FragmentTabHost = _FragmentTabHost(context!!).apply(init)
inline fun Dialog.fragmentTabHost(init: (@KotaDsl _FragmentTabHost).() -> Unit): FragmentTabHost = _FragmentTabHost(context).apply(init)
inline fun ViewRoot.fragmentTabHost(init: (@KotaDsl _FragmentTabHost).() -> Unit): FragmentTabHost = _FragmentTabHost(getContext()).apply(init).add()

inline fun Context.viewPager(init: (@KotaDsl _ViewPager).() -> Unit): ViewPager = _ViewPager(this).apply(init)
inline fun android.app.Fragment.viewPager(init: (@KotaDsl _ViewPager).() -> Unit): ViewPager = _ViewPager(activity).apply(init)
inline fun Fragment.viewPager(init: (@KotaDsl _ViewPager).() -> Unit): ViewPager = _ViewPager(context!!).apply(init)
inline fun Dialog.viewPager(init: (@KotaDsl _ViewPager).() -> Unit): ViewPager = _ViewPager(context).apply(init)
inline fun ViewRoot.viewPager(init: (@KotaDsl _ViewPager).() -> Unit): ViewPager = _ViewPager(getContext()).apply(init).add()

inline fun Context.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(this).apply(init)
inline fun android.app.Fragment.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(activity).apply(init)
inline fun Fragment.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(context!!).apply(init)
inline fun Dialog.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(context).apply(init)
inline fun ViewRoot.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(getContext()).apply(init).add()

inline fun Context.nestedScrollView(init: (@KotaDsl _NestedScrollView).() -> Unit): NestedScrollView = _NestedScrollView(this).apply(init)
inline fun android.app.Fragment.nestedScrollView(init: (@KotaDsl _NestedScrollView).() -> Unit): NestedScrollView = _NestedScrollView(activity).apply(init)
inline fun Fragment.nestedScrollView(init: (@KotaDsl _NestedScrollView).() -> Unit): NestedScrollView = _NestedScrollView(context!!).apply(init)
inline fun Dialog.nestedScrollView(init: (@KotaDsl _NestedScrollView).() -> Unit): NestedScrollView = _NestedScrollView(context).apply(init)
inline fun ViewRoot.nestedScrollView(init: (@KotaDsl _NestedScrollView).() -> Unit): NestedScrollView = _NestedScrollView(getContext()).apply(init).add()

inline fun Context.slidingPaneLayout(init: (@KotaDsl _SlidingPaneLayout).() -> Unit): SlidingPaneLayout = _SlidingPaneLayout(this).apply(init)
inline fun android.app.Fragment.slidingPaneLayout(init: (@KotaDsl _SlidingPaneLayout).() -> Unit): SlidingPaneLayout = _SlidingPaneLayout(activity).apply(init)
inline fun Fragment.slidingPaneLayout(init: (@KotaDsl _SlidingPaneLayout).() -> Unit): SlidingPaneLayout = _SlidingPaneLayout(context!!).apply(init)
inline fun Dialog.slidingPaneLayout(init: (@KotaDsl _SlidingPaneLayout).() -> Unit): SlidingPaneLayout = _SlidingPaneLayout(context).apply(init)
inline fun ViewRoot.slidingPaneLayout(init: (@KotaDsl _SlidingPaneLayout).() -> Unit): SlidingPaneLayout = _SlidingPaneLayout(getContext()).apply(init).add()
//endregion

//region Views

inline fun Context.pagerTabStrip(init: (@KotaDsl PagerTabStrip).() -> Unit): PagerTabStrip = PagerTabStrip(this).apply(init)
inline fun android.app.Fragment.pagerTabStrip(init: (@KotaDsl PagerTabStrip).() -> Unit): PagerTabStrip = PagerTabStrip(activity).apply(init)
inline fun Fragment.pagerTabStrip(init: (@KotaDsl PagerTabStrip).() -> Unit): PagerTabStrip = PagerTabStrip(context!!).apply(init)
inline fun Dialog.pagerTabStrip(init: (@KotaDsl PagerTabStrip).() -> Unit): PagerTabStrip = PagerTabStrip(context).apply(init)
inline fun ViewRoot.pagerTabStrip(init: (@KotaDsl PagerTabStrip).() -> Unit): PagerTabStrip = PagerTabStrip(getContext()).apply(init).add()

inline fun Context.pagerTitleStrip(init: (@KotaDsl PagerTitleStrip).() -> Unit): PagerTitleStrip = PagerTitleStrip(this).apply(init)
inline fun android.app.Fragment.pagerTitleStrip(init: (@KotaDsl PagerTitleStrip).() -> Unit): PagerTitleStrip = PagerTitleStrip(activity).apply(init)
inline fun Fragment.pagerTitleStrip(init: (@KotaDsl PagerTitleStrip).() -> Unit): PagerTitleStrip = PagerTitleStrip(context!!).apply(init)
inline fun Dialog.pagerTitleStrip(init: (@KotaDsl PagerTitleStrip).() -> Unit): PagerTitleStrip = PagerTitleStrip(context).apply(init)
inline fun ViewRoot.pagerTitleStrip(init: (@KotaDsl PagerTitleStrip).() -> Unit): PagerTitleStrip = PagerTitleStrip(getContext()).apply(init).add()

inline fun Context.contentLoadingProgressBar(init: (@KotaDsl ContentLoadingProgressBar).() -> Unit): ContentLoadingProgressBar = ContentLoadingProgressBar(this).apply(init)
inline fun android.app.Fragment.contentLoadingProgressBar(init: (@KotaDsl ContentLoadingProgressBar).() -> Unit): ContentLoadingProgressBar = ContentLoadingProgressBar(activity).apply(init)
inline fun Fragment.contentLoadingProgressBar(init: (@KotaDsl ContentLoadingProgressBar).() -> Unit): ContentLoadingProgressBar = ContentLoadingProgressBar(context!!).apply(init)
inline fun Dialog.contentLoadingProgressBar(init: (@KotaDsl ContentLoadingProgressBar).() -> Unit): ContentLoadingProgressBar = ContentLoadingProgressBar(context).apply(init)
inline fun ViewRoot.contentLoadingProgressBar(init: (@KotaDsl ContentLoadingProgressBar).() -> Unit): ContentLoadingProgressBar = ContentLoadingProgressBar(getContext()).apply(init).add()

inline fun Context.supportSpace(init: (@KotaDsl Space).() -> Unit): Space = Space(this).apply(init)
inline fun android.app.Fragment.supportSpace(init: (@KotaDsl Space).() -> Unit): Space = Space(activity).apply(init)
inline fun Fragment.supportSpace(init: (@KotaDsl Space).() -> Unit): Space = Space(context!!).apply(init)
inline fun Dialog.supportSpace(init: (@KotaDsl Space).() -> Unit): Space = Space(context).apply(init)
inline fun ViewRoot.supportSpace(init: (@KotaDsl Space).() -> Unit): Space = Space(getContext()).apply(init).add()

inline fun Context.swipeRefreshLayout(init: (@KotaDsl SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout = SwipeRefreshLayout(this).apply(init)
inline fun android.app.Fragment.swipeRefreshLayout(init: (@KotaDsl SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout = SwipeRefreshLayout(activity).apply(init)
inline fun Fragment.swipeRefreshLayout(init: (@KotaDsl SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout = SwipeRefreshLayout(context!!).apply(init)
inline fun Dialog.swipeRefreshLayout(init: (@KotaDsl SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout = SwipeRefreshLayout(context).apply(init)
inline fun ViewRoot.swipeRefreshLayout(init: (@KotaDsl SwipeRefreshLayout).() -> Unit): SwipeRefreshLayout = SwipeRefreshLayout(getContext()).apply(init).add()
//endregion

//region Layouts from kota

inline fun Fragment.appWidgetHostView(init: (@KotaDsl _AppWidgetHostView).() -> Unit): AppWidgetHostView = _AppWidgetHostView(context!!).apply(init)

inline fun Fragment.actionMenuView(init: (@KotaDsl _ActionMenuView).() -> Unit): ActionMenuView = _ActionMenuView(context!!).apply(init)

@JvmOverloads inline fun Fragment.frameLayout(@StyleRes style: Int = 0, init: (@KotaDsl _FrameLayout).() -> Unit): FrameLayout = _FrameLayout(context!!, style).apply(init)

@JvmOverloads inline fun Fragment.gridLayout(@StyleRes style: Int = 0, init: (@KotaDsl _GridLayout).() -> Unit): GridLayout = _GridLayout(context!!, style).apply(init)

@JvmOverloads inline fun Fragment.gridView(@StyleRes style: Int = 0, init: (@KotaDsl _GridView).() -> Unit): GridView = _GridView(context!!, style).apply(init)

@JvmOverloads inline fun Fragment.horizontalScrollView(@StyleRes style: Int = 0, init: (@KotaDsl _HorizontalScrollView).() -> Unit): HorizontalScrollView = _HorizontalScrollView(context!!, style).apply(init)

inline fun Fragment.imageSwitcher(init: (@KotaDsl _ImageSwitcher).() -> Unit): ImageSwitcher = _ImageSwitcher(context!!).apply(init)

@JvmOverloads inline fun Fragment.verticalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context!!, style, LinearLayout.VERTICAL).apply(init)

@JvmOverloads inline fun Fragment.horizontalLayout(@StyleRes style: Int = 0, init: (@KotaDsl _LinearLayout).() -> Unit): LinearLayout = _LinearLayout(context!!, style, LinearLayout.HORIZONTAL).apply(init)

inline fun Fragment.radioGroup(init: (@KotaDsl _RadioGroup).() -> Unit): RadioGroup = _RadioGroup(context!!).apply(init)

@JvmOverloads inline fun Fragment.relativeLayout(@StyleRes style: Int = 0, init: (@KotaDsl _RelativeLayout).() -> Unit): RelativeLayout = _RelativeLayout(context!!, style).apply(init)

@JvmOverloads inline fun Fragment.scrollView(@StyleRes style: Int = 0, init: (@KotaDsl _ScrollView).() -> Unit): ScrollView = _ScrollView(context!!, style).apply(init)

inline fun Fragment.tableLayout(init: (@KotaDsl _TableLayout).() -> Unit): TableLayout = _TableLayout(context!!).apply(init)

inline fun Fragment.tableRow(init: (@KotaDsl _TableRow).() -> Unit): TableRow = _TableRow(context!!).apply(init)

inline fun Fragment.textSwitcher(init: (@KotaDsl _TextSwitcher).() -> Unit): TextSwitcher = _TextSwitcher(context!!).apply(init)

@JvmOverloads inline fun Fragment.toolbar(@StyleRes style: Int = 0, init: (@KotaDsl _Toolbar).() -> Unit): Toolbar = _Toolbar(context!!, style).apply(init)

inline fun Fragment.viewAnimator(init: (@KotaDsl _ViewAnimator).() -> Unit): ViewAnimator = _ViewAnimator(context!!).apply(init)

inline fun Fragment.viewSwitcher(init: (@KotaDsl _ViewSwitcher).() -> Unit): ViewSwitcher = _ViewSwitcher(context!!).apply(init)
//endregion

//region Views from kota

@RequiresApi(16) inline fun Fragment.mediaRouteButton(init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(context).apply(init)
@RequiresApi(21) inline fun Fragment.mediaRouteButton(@StyleRes style: Int, init: (@KotaDsl MediaRouteButton).() -> Unit): MediaRouteButton = MediaRouteButton(context, null, 0, style).apply(init)

inline fun Fragment.gestureOverlayView(init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(context).apply(init)
@RequiresApi(21) inline fun Fragment.gestureOverlayView(@StyleRes style: Int, init: (@KotaDsl GestureOverlayView).() -> Unit): GestureOverlayView = GestureOverlayView(context, null, 0, style).apply(init)

inline fun Fragment.extractEditText(init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(context).apply(init)
@RequiresApi(21) inline fun Fragment.extractEditText(@StyleRes style: Int, init: (@KotaDsl ExtractEditText).() -> Unit): ExtractEditText = ExtractEditText(context, null, 0, style).apply(init)

@RequiresApi(21) inline fun Fragment.tvView(init: (@KotaDsl TvView).() -> Unit): TvView = TvView(context).apply(init)

inline fun Fragment.glSurfaceView(init: (@KotaDsl GLSurfaceView).() -> Unit): GLSurfaceView = GLSurfaceView(context).apply(init)

inline fun Fragment.surfaceView(init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(context).apply(init)
@RequiresApi(21) inline fun Fragment.surfaceView(@StyleRes style: Int, init: (@KotaDsl SurfaceView).() -> Unit): SurfaceView = SurfaceView(context, null, 0, style).apply(init)

inline fun Fragment.textureView(init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(context).apply(init)
@RequiresApi(21) inline fun Fragment.textureView(@StyleRes style: Int, init: (@KotaDsl TextureView).() -> Unit): TextureView = TextureView(context, null, 0, style).apply(init)

inline fun Fragment.view(init: (@KotaDsl View).() -> Unit): View = View(context).apply(init)
@RequiresApi(21) inline fun Fragment.view(@StyleRes style: Int, init: (@KotaDsl View).() -> Unit): View = View(context, null, 0, style).apply(init)

inline fun Fragment.viewStub(init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(context).apply(init)
@RequiresApi(21) inline fun Fragment.viewStub(@StyleRes style: Int, init: (@KotaDsl ViewStub).() -> Unit): ViewStub = ViewStub(context, null, 0, style).apply(init)

inline fun Fragment.webView(init: (@KotaDsl WebView).() -> Unit): WebView = WebView(context).apply(init)
@RequiresApi(21) inline fun Fragment.webView(@StyleRes style: Int, init: (@KotaDsl WebView).() -> Unit): WebView = WebView(context, null, 0, style).apply(init)

inline fun Fragment.adapterViewFlipper(init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(context).apply(init)
@RequiresApi(21) inline fun Fragment.adapterViewFlipper(@StyleRes style: Int, init: (@KotaDsl AdapterViewFlipper).() -> Unit): AdapterViewFlipper = AdapterViewFlipper(context, null, 0, style).apply(init)

inline fun Fragment.autoCompleteTextView(init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(context).apply(init)
@RequiresApi(21) inline fun Fragment.autoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl AutoCompleteTextView).() -> Unit): AutoCompleteTextView = AutoCompleteTextView(context, null, 0, style).apply(init)

inline fun Fragment.button(init: (@KotaDsl Button).() -> Unit): Button = Button(context).apply(init)
@RequiresApi(21) inline fun Fragment.button(@StyleRes style: Int, init: (@KotaDsl Button).() -> Unit): Button = Button(context, null, 0, style).apply(init)

inline fun Fragment.calendarView(init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(context).apply(init)
@RequiresApi(21) inline fun Fragment.calendarView(@StyleRes style: Int, init: (@KotaDsl CalendarView).() -> Unit): CalendarView = CalendarView(context, null, 0, style).apply(init)

inline fun Fragment.checkBox(init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(context).apply(init)
@RequiresApi(21) inline fun Fragment.checkBox(@StyleRes style: Int, init: (@KotaDsl CheckBox).() -> Unit): CheckBox = CheckBox(context, null, 0, style).apply(init)

inline fun Fragment.checkedTextView(init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(context).apply(init)
@RequiresApi(21) inline fun Fragment.checkedTextView(@StyleRes style: Int, init: (@KotaDsl CheckedTextView).() -> Unit): CheckedTextView = CheckedTextView(context, null, 0, style).apply(init)

inline fun Fragment.chronometer(init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(context).apply(init)
@RequiresApi(21) inline fun Fragment.chronometer(@StyleRes style: Int, init: (@KotaDsl Chronometer).() -> Unit): Chronometer = Chronometer(context, null, 0, style).apply(init)

inline fun Fragment.datePicker(init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(context).apply(init)
@RequiresApi(21) inline fun Fragment.datePicker(@StyleRes style: Int, init: (@KotaDsl DatePicker).() -> Unit): DatePicker = DatePicker(context, null, 0, style).apply(init)

inline fun Fragment.editText(init: (@KotaDsl EditText).() -> Unit): EditText = EditText(context).apply(init)
@RequiresApi(21) inline fun Fragment.editText(@StyleRes style: Int, init: (@KotaDsl EditText).() -> Unit): EditText = EditText(context, null, 0, style).apply(init)

inline fun Fragment.expandableListView(init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(context).apply(init)
@RequiresApi(21) inline fun Fragment.expandableListView(@StyleRes style: Int, init: (@KotaDsl ExpandableListView).() -> Unit): ExpandableListView = ExpandableListView(context, null, 0, style).apply(init)

inline fun Fragment.imageButton(init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(context).apply(init)
@RequiresApi(21) inline fun Fragment.imageButton(@StyleRes style: Int, init: (@KotaDsl ImageButton).() -> Unit): ImageButton = ImageButton(context, null, 0, style).apply(init)

inline fun Fragment.imageView(init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(context).apply(init)
@RequiresApi(21) inline fun Fragment.imageView(@StyleRes style: Int, init: (@KotaDsl ImageView).() -> Unit): ImageView = ImageView(context, null, 0, style).apply(init)

inline fun Fragment.listView(init: (@KotaDsl ListView).() -> Unit): ListView = ListView(context).apply(init)
@RequiresApi(21) inline fun Fragment.listView(@StyleRes style: Int, init: (@KotaDsl ListView).() -> Unit): ListView = ListView(context, null, 0, style).apply(init)

inline fun Fragment.multiAutoCompleteTextView(init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(context).apply(init)
@RequiresApi(21) inline fun Fragment.multiAutoCompleteTextView(@StyleRes style: Int, init: (@KotaDsl MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView = MultiAutoCompleteTextView(context, null, 0, style).apply(init)

inline fun Fragment.numberPicker(init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(context).apply(init)
@RequiresApi(21) inline fun Fragment.numberPicker(@StyleRes style: Int, init: (@KotaDsl NumberPicker).() -> Unit): NumberPicker = NumberPicker(context, null, 0, style).apply(init)

inline fun Fragment.progressBar(init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(context).apply(init)
@RequiresApi(21) inline fun Fragment.progressBar(@StyleRes style: Int, init: (@KotaDsl ProgressBar).() -> Unit): ProgressBar = ProgressBar(context, null, 0, style).apply(init)

inline fun Fragment.quickContactBadge(init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(context).apply(init)
@RequiresApi(21) inline fun Fragment.quickContactBadge(@StyleRes style: Int, init: (@KotaDsl QuickContactBadge).() -> Unit): QuickContactBadge = QuickContactBadge(context, null, 0, style).apply(init)

inline fun Fragment.radioButton(init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(context).apply(init)
@RequiresApi(21) inline fun Fragment.radioButton(@StyleRes style: Int, init: (@KotaDsl RadioButton).() -> Unit): RadioButton = RadioButton(context, null, 0, style).apply(init)

inline fun Fragment.ratingBar(init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(context).apply(init)
@RequiresApi(21) inline fun Fragment.ratingBar(@StyleRes style: Int, init: (@KotaDsl RatingBar).() -> Unit): RatingBar = RatingBar(context, null, 0, style).apply(init)

inline fun Fragment.searchView(init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(context).apply(init)
@RequiresApi(21) inline fun Fragment.searchView(@StyleRes style: Int, init: (@KotaDsl SearchView).() -> Unit): SearchView = SearchView(context, null, 0, style).apply(init)

inline fun Fragment.seekBar(init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(context).apply(init)
@RequiresApi(21) inline fun Fragment.seekBar(@StyleRes style: Int, init: (@KotaDsl SeekBar).() -> Unit): SeekBar = SeekBar(context, null, 0, style).apply(init)

inline fun Fragment.space(init: (@KotaDsl android.widget.Space).() -> Unit): android.widget.Space = android.widget.Space(context).apply(init)
@RequiresApi(21) inline fun Fragment.space(@StyleRes style: Int, init: (@KotaDsl android.widget.Space).() -> Unit): android.widget.Space = android.widget.Space(context, null, 0, style).apply(init)

inline fun Fragment.spinner(init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(context).apply(init)
@RequiresApi(21) inline fun Fragment.spinner(@StyleRes style: Int, init: (@KotaDsl Spinner).() -> Unit): Spinner = Spinner(context, null, 0, style).apply(init)

inline fun Fragment.stackView(init: (@KotaDsl StackView).() -> Unit): StackView = StackView(context).apply(init)
@RequiresApi(21) inline fun Fragment.stackView(@StyleRes style: Int, init: (@KotaDsl StackView).() -> Unit): StackView = StackView(context, null, 0, style).apply(init)

inline fun Fragment.switch(init: (@KotaDsl Switch).() -> Unit): Switch = Switch(context).apply(init)
@RequiresApi(21) inline fun Fragment.switch(@StyleRes style: Int, init: (@KotaDsl Switch).() -> Unit): Switch = Switch(context, null, 0, style).apply(init)

inline fun Fragment.tabHost(init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(context).apply(init)
@RequiresApi(21) inline fun Fragment.tabHost(@StyleRes style: Int, init: (@KotaDsl TabHost).() -> Unit): TabHost = TabHost(context, null, 0, style).apply(init)

inline fun Fragment.tabWidget(init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(context).apply(init)
@RequiresApi(21) inline fun Fragment.tabWidget(@StyleRes style: Int, init: (@KotaDsl TabWidget).() -> Unit): TabWidget = TabWidget(context, null, 0, style).apply(init)

@RequiresApi(17) inline fun Fragment.textClock(init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(context).apply(init)
@RequiresApi(21) inline fun Fragment.textClock(@StyleRes style: Int, init: (@KotaDsl TextClock).() -> Unit): TextClock = TextClock(context, null, 0, style).apply(init)

inline fun Fragment.textView(init: (@KotaDsl TextView).() -> Unit): TextView = TextView(context).apply(init)
@RequiresApi(21) inline fun Fragment.textView(@StyleRes style: Int, init: (@KotaDsl TextView).() -> Unit): TextView = TextView(context, null, 0, style).apply(init)

inline fun Fragment.timePicker(init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(context).apply(init)
@RequiresApi(21) inline fun Fragment.timePicker(@StyleRes style: Int, init: (@KotaDsl TimePicker).() -> Unit): TimePicker = TimePicker(context, null, 0, style).apply(init)

inline fun Fragment.toggleButton(init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(context).apply(init)
@RequiresApi(21) inline fun Fragment.toggleButton(@StyleRes style: Int, init: (@KotaDsl ToggleButton).() -> Unit): ToggleButton = ToggleButton(context, null, 0, style).apply(init)

inline fun Fragment.videoView(init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(context).apply(init)
@RequiresApi(21) inline fun Fragment.videoView(@StyleRes style: Int, init: (@KotaDsl VideoView).() -> Unit): VideoView = VideoView(context, null, 0, style).apply(init)

inline fun Fragment.viewFlipper(init: (@KotaDsl ViewFlipper).() -> Unit): ViewFlipper = ViewFlipper(context).apply(init)

inline fun Fragment.zoomControls(init: (@KotaDsl ZoomControls).() -> Unit): ZoomControls = ZoomControls(context).apply(init)
//endregion