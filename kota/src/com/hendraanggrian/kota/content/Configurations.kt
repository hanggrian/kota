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

@ScreenLayoutSize fun Configuration.getScreenSize(): Int = screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK
@ScreenLayoutSize fun Resources.getScreenSize(): Int = configuration.getScreenSize()
@ScreenLayoutSize fun Context.getScreenSize(): Int = resources.getScreenSize()

fun Configuration.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = getScreenSize().let { it != SCREENLAYOUT_SIZE_UNDEFINED && it >= size }
fun Resources.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = configuration.isScreenSizeAtLeast(size)
fun Context.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = resources.isScreenSizeAtLeast(size)

fun Configuration.isScreenLong(): Boolean = screenLayout and Configuration.SCREENLAYOUT_LONG_MASK == Configuration.SCREENLAYOUT_LONG_YES
fun Resources.isScreenLong(): Boolean = configuration.isScreenLong()
fun Context.isScreenLong(): Boolean = resources.isScreenLong()

@RequiresApi(17) @TargetApi(17) fun Configuration.isRtl(): Boolean = layoutDirection and Configuration.SCREENLAYOUT_LAYOUTDIR_MASK == Configuration.SCREENLAYOUT_LAYOUTDIR_RTL
@RequiresApi(17) @TargetApi(17) fun Resources.isRtl(): Boolean = configuration.isRtl()
@RequiresApi(17) @TargetApi(17) fun Context.isRtl(): Boolean = resources.isRtl()

fun Configuration.hasTouchscreen(): Boolean = touchscreen == Configuration.TOUCHSCREEN_FINGER
fun Resources.hasTouchscreen(): Boolean = configuration.hasTouchscreen()
fun Context.hasTouchscreen(): Boolean = resources.hasTouchscreen()

fun Configuration.hasKeyboard(): Boolean = keyboard == Configuration.KEYBOARD_QWERTY
fun Resources.hasKeyboard(): Boolean = configuration.hasKeyboard()
fun Context.hasKeyboard(): Boolean = resources.hasKeyboard()

fun Configuration.isKeyboardHidden(): Boolean = keyboardHidden == Configuration.KEYBOARDHIDDEN_YES
fun Resources.isKeyboardHidden(): Boolean = configuration.isKeyboardHidden()
fun Context.isKeyboardHidden(): Boolean = resources.isKeyboardHidden()

fun Configuration.isHardKeyboardHidden(): Boolean = hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_YES
fun Resources.isHardKeyboardHidden(): Boolean = configuration.isHardKeyboardHidden()
fun Context.isHardKeyboardHidden(): Boolean = resources.isHardKeyboardHidden()

fun Configuration.hasNavigation(): Boolean = navigation != Configuration.NAVIGATION_UNDEFINED && navigation != Configuration.NAVIGATION_NONAV
fun Resources.hasNavigation(): Boolean = configuration.hasNavigation()
fun Context.hasNavigation(): Boolean = resources.hasNavigation()

fun Configuration.isNavigationHidden(): Boolean = navigationHidden == Configuration.NAVIGATIONHIDDEN_YES
fun Resources.isNavigationHidden(): Boolean = configuration.isNavigationHidden()
fun Context.isNavigationHidden(): Boolean = resources.isNavigationHidden()

fun Configuration.isLandscape(): Boolean = orientation == Configuration.ORIENTATION_LANDSCAPE
fun Resources.isLandscape(): Boolean = configuration.isLandscape()
fun Context.isLandscape(): Boolean = resources.isLandscape()

@UiModeType fun Configuration.getTypeMode(): Int = uiMode and Configuration.UI_MODE_TYPE_MASK
@UiModeType fun Resources.getTypeMode(): Int = configuration.getTypeMode()
@UiModeType fun Context.getTypeMode(): Int = resources.getTypeMode()

fun Configuration.isTypeModeNormal(): Boolean = getTypeMode() == Configuration.UI_MODE_TYPE_NORMAL
fun Resources.isTypeModeNormal(): Boolean = configuration.isTypeModeNormal()
fun Context.isTypeModeNormal(): Boolean = resources.isTypeModeNormal()

@UiModeNight fun Configuration.getNightMode(): Int = uiMode and Configuration.UI_MODE_NIGHT_MASK
@UiModeNight fun Resources.getNightMode(): Int = configuration.getNightMode()
@UiModeNight fun Context.getNightMode(): Int = resources.getNightMode()

fun Configuration.isNightMode(): Boolean = getNightMode() == Configuration.UI_MODE_NIGHT_YES
fun Resources.isNightMode(): Boolean = configuration.isNightMode()
fun Context.isNightMode(): Boolean = resources.isNightMode()