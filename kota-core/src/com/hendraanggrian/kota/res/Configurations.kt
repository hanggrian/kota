@file:JvmName("Configurations")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.res

import android.app.Fragment
import android.content.Context
import android.content.res.Configuration
import android.content.res.Configuration.SCREENLAYOUT_SIZE_UNDEFINED
import com.hendraanggrian.kota.annotation.ScreenLayoutSize
import com.hendraanggrian.kota.annotation.UiNightMode
import com.hendraanggrian.kota.annotation.UiTypeMode
import com.hendraanggrian.kota.getIfAtLeast

@ScreenLayoutSize inline val Fragment.screenSize: Int get() = activity.screenSize
@ScreenLayoutSize inline val Context.screenSize: Int get() = configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK

inline fun Fragment.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = activity.isScreenSizeAtLeast(size)
inline fun Context.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = screenSize.let { it != SCREENLAYOUT_SIZE_UNDEFINED && it >= size }

inline val Fragment.isScreenLong: Boolean get() = activity.isScreenLong
inline val Context.isScreenLong: Boolean get() = configuration.screenLayout and Configuration.SCREENLAYOUT_LONG_MASK == Configuration.SCREENLAYOUT_LONG_YES

inline val Fragment.isRtl: Boolean get() = activity.isRtl
inline val Context.isRtl: Boolean get() = getIfAtLeast(17, { configuration.layoutDirection and Configuration.SCREENLAYOUT_LAYOUTDIR_MASK == Configuration.SCREENLAYOUT_LAYOUTDIR_RTL }, { false })

inline val Fragment.hasTouchscreen: Boolean get() = activity.hasTouchscreen
inline val Context.hasTouchscreen: Boolean get() = configuration.touchscreen == Configuration.TOUCHSCREEN_FINGER

inline val Fragment.hasKeyboard: Boolean get() = activity.hasKeyboard
inline val Context.hasKeyboard: Boolean get() = configuration.keyboard == Configuration.KEYBOARD_QWERTY

inline val Fragment.isKeyboardHidden: Boolean get() = activity.isKeyboardHidden
inline val Context.isKeyboardHidden: Boolean get() = configuration.keyboardHidden == Configuration.KEYBOARDHIDDEN_YES

inline val Fragment.isHardKeyboardHidden: Boolean get() = activity.isHardKeyboardHidden
inline val Context.isHardKeyboardHidden: Boolean get() = configuration.hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_YES

inline val Fragment.hasNavigation: Boolean get() = activity.hasNavigation
inline val Context.hasNavigation: Boolean get() = configuration.navigation != Configuration.NAVIGATION_UNDEFINED && configuration.navigation != Configuration.NAVIGATION_NONAV

inline val Fragment.isNavigationHidden: Boolean get() = activity.isNavigationHidden
inline val Context.isNavigationHidden: Boolean get() = configuration.navigationHidden == Configuration.NAVIGATIONHIDDEN_YES

inline val Fragment.isLandscape: Boolean get() = activity.isLandscape
inline val Context.isLandscape: Boolean get() = configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

@UiTypeMode inline val Fragment.typeMode: Int get() = activity.typeMode
@UiTypeMode inline val Context.typeMode: Int get() = configuration.uiMode and Configuration.UI_MODE_TYPE_MASK

inline val Fragment.isTypeNormal: Boolean get() = activity.isTypeNormal
inline val Context.isTypeNormal: Boolean get() = typeMode == Configuration.UI_MODE_TYPE_NORMAL

@UiNightMode inline val Fragment.nightMode: Int get() = activity.nightMode
@UiNightMode inline val Context.nightMode: Int get() = configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK

inline val Fragment.isNightMode: Boolean get() = activity.isNightMode
inline val Context.isNightMode: Boolean get() = nightMode == Configuration.UI_MODE_NIGHT_YES