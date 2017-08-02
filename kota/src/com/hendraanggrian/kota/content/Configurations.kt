@file:JvmName("Configurations")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.annotation.TargetApi
import android.content.Context
import android.content.res.Configuration
import android.content.res.Configuration.SCREENLAYOUT_SIZE_UNDEFINED
import android.content.res.Resources
import android.support.annotation.RequiresApi
import com.hendraanggrian.kota.annotation.ScreenLayoutSize
import com.hendraanggrian.kota.annotation.UiModeNight
import com.hendraanggrian.kota.annotation.UiModeType

@ScreenLayoutSize inline fun Configuration.getScreenSize() = screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK
@ScreenLayoutSize inline fun Resources.getScreenSize() = configuration.getScreenSize()
@ScreenLayoutSize inline fun Context.getScreenSize() = resources.getScreenSize()

inline fun Configuration.isScreenSizeAtLeast(@ScreenLayoutSize size: Int) = getScreenSize().let { it != SCREENLAYOUT_SIZE_UNDEFINED && it >= size }
inline fun Resources.isScreenSizeAtLeast(@ScreenLayoutSize size: Int) = configuration.isScreenSizeAtLeast(size)
inline fun Context.isScreenSizeAtLeast(@ScreenLayoutSize size: Int) = resources.isScreenSizeAtLeast(size)

inline fun Configuration.isScreenLong() = screenLayout and Configuration.SCREENLAYOUT_LONG_MASK == Configuration.SCREENLAYOUT_LONG_YES
inline fun Resources.isScreenLong() = configuration.isScreenLong()
inline fun Context.isScreenLong() = resources.isScreenLong()

@RequiresApi(17) @TargetApi(17) inline fun Configuration.isRtl() = layoutDirection and Configuration.SCREENLAYOUT_LAYOUTDIR_MASK == Configuration.SCREENLAYOUT_LAYOUTDIR_RTL
@RequiresApi(17) @TargetApi(17) inline fun Resources.isRtl() = configuration.isRtl()
@RequiresApi(17) @TargetApi(17) inline fun Context.isRtl() = resources.isRtl()

inline fun Configuration.hasTouchscreen() = touchscreen == Configuration.TOUCHSCREEN_FINGER
inline fun Resources.hasTouchscreen() = configuration.hasTouchscreen()
inline fun Context.hasTouchscreen() = resources.hasTouchscreen()

inline fun Configuration.hasKeyboard() = keyboard == Configuration.KEYBOARD_QWERTY
inline fun Resources.hasKeyboard() = configuration.hasKeyboard()
inline fun Context.hasKeyboard() = resources.hasKeyboard()

inline fun Configuration.isKeyboardHidden() = keyboardHidden == Configuration.KEYBOARDHIDDEN_YES
inline fun Resources.isKeyboardHidden() = configuration.isKeyboardHidden()
inline fun Context.isKeyboardHidden() = resources.isKeyboardHidden()

inline fun Configuration.isHardKeyboardHidden() = hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_YES
inline fun Resources.isHardKeyboardHidden() = configuration.isHardKeyboardHidden()
inline fun Context.isHardKeyboardHidden() = resources.isHardKeyboardHidden()

inline fun Configuration.hasNavigation() = navigation != Configuration.NAVIGATION_UNDEFINED && navigation != Configuration.NAVIGATION_NONAV
inline fun Resources.hasNavigation() = configuration.hasNavigation()
inline fun Context.hasNavigation() = resources.hasNavigation()

inline fun Configuration.isNavigationHidden() = navigationHidden == Configuration.NAVIGATIONHIDDEN_YES
inline fun Resources.isNavigationHidden() = configuration.isNavigationHidden()
inline fun Context.isNavigationHidden() = resources.isNavigationHidden()

inline fun Configuration.isLandscape() = orientation == Configuration.ORIENTATION_LANDSCAPE
inline fun Resources.isLandscape() = configuration.isLandscape()
inline fun Context.isLandscape() = resources.isLandscape()

@UiModeType inline fun Configuration.getTypeMode() = uiMode and Configuration.UI_MODE_TYPE_MASK
@UiModeType inline fun Resources.getTypeMode() = configuration.getTypeMode()
@UiModeType inline fun Context.getTypeMode() = resources.getTypeMode()

inline fun Configuration.isTypeModeNormal() = getTypeMode() == Configuration.UI_MODE_TYPE_NORMAL
inline fun Resources.isTypeModeNormal() = configuration.isTypeModeNormal()
inline fun Context.isTypeModeNormal() = resources.isTypeModeNormal()

@UiModeNight inline fun Configuration.getNightMode() = uiMode and Configuration.UI_MODE_NIGHT_MASK
@UiModeNight inline fun Resources.getNightMode() = configuration.getNightMode()
@UiModeNight inline fun Context.getNightMode() = resources.getNightMode()

inline fun Configuration.isNightMode() = getNightMode() == Configuration.UI_MODE_NIGHT_YES
inline fun Resources.isNightMode() = configuration.isNightMode()
inline fun Context.isNightMode() = resources.isNightMode()