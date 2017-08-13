@file:JvmName("Configurations")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.content

import android.app.Fragment
import android.content.Context
import android.content.res.Configuration
import android.content.res.Configuration.SCREENLAYOUT_SIZE_UNDEFINED
import android.content.res.Resources
import com.hendraanggrian.common.annotation.ScreenLayoutSize
import com.hendraanggrian.common.annotation.UiModeNight
import com.hendraanggrian.common.annotation.UiModeType
import com.hendraanggrian.common.os.getIfMinSdk

@ScreenLayoutSize inline fun Configuration.getScreenSize(): Int = screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK
@ScreenLayoutSize inline fun Resources.getScreenSize(): Int = configuration.getScreenSize()
@ScreenLayoutSize inline fun Context.getScreenSize(): Int = resources.getScreenSize()
@ScreenLayoutSize inline fun Fragment.getScreenSize(): Int = resources.getScreenSize()
@ScreenLayoutSize inline fun android.support.v4.app.Fragment.getScreenSize(): Int = resources.getScreenSize()

inline fun Configuration.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = getScreenSize().let { it != SCREENLAYOUT_SIZE_UNDEFINED && it >= size }
inline fun Resources.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = configuration.isScreenSizeAtLeast(size)
inline fun Context.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = resources.isScreenSizeAtLeast(size)
inline fun Fragment.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = resources.isScreenSizeAtLeast(size)
inline fun android.support.v4.app.Fragment.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = resources.isScreenSizeAtLeast(size)

inline fun Configuration.isScreenLong(): Boolean = screenLayout and Configuration.SCREENLAYOUT_LONG_MASK == Configuration.SCREENLAYOUT_LONG_YES
inline fun Resources.isScreenLong(): Boolean = configuration.isScreenLong()
inline fun Context.isScreenLong(): Boolean = resources.isScreenLong()
inline fun Fragment.isScreenLong(): Boolean = resources.isScreenLong()
inline fun android.support.v4.app.Fragment.isScreenLong(): Boolean = resources.isScreenLong()

inline fun Configuration.isRtl(): Boolean = getIfMinSdk(17, { layoutDirection and Configuration.SCREENLAYOUT_LAYOUTDIR_MASK == Configuration.SCREENLAYOUT_LAYOUTDIR_RTL }, { false })
inline fun Resources.isRtl(): Boolean = configuration.isRtl()
inline fun Context.isRtl(): Boolean = resources.isRtl()
inline fun Fragment.isRtl(): Boolean = resources.isRtl()
inline fun android.support.v4.app.Fragment.isRtl(): Boolean = resources.isRtl()

inline fun Configuration.hasTouchscreen(): Boolean = touchscreen == Configuration.TOUCHSCREEN_FINGER
inline fun Resources.hasTouchscreen(): Boolean = configuration.hasTouchscreen()
inline fun Context.hasTouchscreen(): Boolean = resources.hasTouchscreen()
inline fun Fragment.hasTouchscreen(): Boolean = resources.hasTouchscreen()
inline fun android.support.v4.app.Fragment.hasTouchscreen(): Boolean = resources.hasTouchscreen()

inline fun Configuration.hasKeyboard(): Boolean = keyboard == Configuration.KEYBOARD_QWERTY
inline fun Resources.hasKeyboard(): Boolean = configuration.hasKeyboard()
inline fun Context.hasKeyboard(): Boolean = resources.hasKeyboard()
inline fun Fragment.hasKeyboard(): Boolean = resources.hasKeyboard()
inline fun android.support.v4.app.Fragment.hasKeyboard(): Boolean = resources.hasKeyboard()

inline fun Configuration.isKeyboardHidden(): Boolean = keyboardHidden == Configuration.KEYBOARDHIDDEN_YES
inline fun Resources.isKeyboardHidden(): Boolean = configuration.isKeyboardHidden()
inline fun Context.isKeyboardHidden(): Boolean = resources.isKeyboardHidden()
inline fun Fragment.isKeyboardHidden(): Boolean = resources.isKeyboardHidden()
inline fun android.support.v4.app.Fragment.isKeyboardHidden(): Boolean = resources.isKeyboardHidden()

inline fun Configuration.isHardKeyboardHidden(): Boolean = hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_YES
inline fun Resources.isHardKeyboardHidden(): Boolean = configuration.isHardKeyboardHidden()
inline fun Context.isHardKeyboardHidden(): Boolean = resources.isHardKeyboardHidden()
inline fun Fragment.isHardKeyboardHidden(): Boolean = resources.isHardKeyboardHidden()
inline fun android.support.v4.app.Fragment.isHardKeyboardHidden(): Boolean = resources.isHardKeyboardHidden()

inline fun Configuration.hasNavigation(): Boolean = navigation != Configuration.NAVIGATION_UNDEFINED && navigation != Configuration.NAVIGATION_NONAV
inline fun Resources.hasNavigation(): Boolean = configuration.hasNavigation()
inline fun Context.hasNavigation(): Boolean = resources.hasNavigation()
inline fun Fragment.hasNavigation(): Boolean = resources.hasNavigation()
inline fun android.support.v4.app.Fragment.hasNavigation(): Boolean = resources.hasNavigation()

inline fun Configuration.isNavigationHidden(): Boolean = navigationHidden == Configuration.NAVIGATIONHIDDEN_YES
inline fun Resources.isNavigationHidden(): Boolean = configuration.isNavigationHidden()
inline fun Context.isNavigationHidden(): Boolean = resources.isNavigationHidden()
inline fun Fragment.isNavigationHidden(): Boolean = resources.isNavigationHidden()
inline fun android.support.v4.app.Fragment.isNavigationHidden(): Boolean = resources.isNavigationHidden()

inline fun Configuration.isLandscape(): Boolean = orientation == Configuration.ORIENTATION_LANDSCAPE
inline fun Resources.isLandscape(): Boolean = configuration.isLandscape()
inline fun Context.isLandscape(): Boolean = resources.isLandscape()
inline fun Fragment.isLandscape(): Boolean = resources.isLandscape()
inline fun android.support.v4.app.Fragment.isLandscape(): Boolean = resources.isLandscape()

@UiModeType inline fun Configuration.getTypeMode(): Int = uiMode and Configuration.UI_MODE_TYPE_MASK
@UiModeType inline fun Resources.getTypeMode(): Int = configuration.getTypeMode()
@UiModeType inline fun Context.getTypeMode(): Int = resources.getTypeMode()
@UiModeType inline fun Fragment.getTypeMode(): Int = resources.getTypeMode()
@UiModeType inline fun android.support.v4.app.Fragment.getTypeMode(): Int = resources.getTypeMode()

inline fun Configuration.isTypeModeNormal(): Boolean = getTypeMode() == Configuration.UI_MODE_TYPE_NORMAL
inline fun Resources.isTypeModeNormal(): Boolean = configuration.isTypeModeNormal()
inline fun Context.isTypeModeNormal(): Boolean = resources.isTypeModeNormal()
inline fun Fragment.isTypeModeNormal(): Boolean = resources.isTypeModeNormal()
inline fun android.support.v4.app.Fragment.isTypeModeNormal(): Boolean = resources.isTypeModeNormal()

@UiModeNight inline fun Configuration.getNightMode(): Int = uiMode and Configuration.UI_MODE_NIGHT_MASK
@UiModeNight inline fun Resources.getNightMode(): Int = configuration.getNightMode()
@UiModeNight inline fun Context.getNightMode(): Int = resources.getNightMode()
@UiModeNight inline fun Fragment.getNightMode(): Int = resources.getNightMode()
@UiModeNight inline fun android.support.v4.app.Fragment.getNightMode(): Int = resources.getNightMode()

inline fun Configuration.isNightMode(): Boolean = getNightMode() == Configuration.UI_MODE_NIGHT_YES
inline fun Resources.isNightMode(): Boolean = configuration.isNightMode()
inline fun Context.isNightMode(): Boolean = resources.isNightMode()
inline fun Fragment.isNightMode(): Boolean = resources.isNightMode()
inline fun android.support.v4.app.Fragment.isNightMode(): Boolean = resources.isNightMode()