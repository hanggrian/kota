package com.hendraanggrian.support.commonsutils.content

import android.annotation.TargetApi
import android.content.Context
import android.content.res.Configuration
import android.content.res.Configuration.SCREENLAYOUT_SIZE_UNDEFINED
import android.content.res.Resources
import android.support.annotation.RequiresApi
import com.hendraanggrian.support.commonsutils.annotation.ScreenLayoutSize
import com.hendraanggrian.support.commonsutils.annotation.UiModeNight
import com.hendraanggrian.support.commonsutils.annotation.UiModeType

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@ScreenLayoutSize fun Context.getScreenSize(): Int = resources.getScreenSize()
@ScreenLayoutSize fun Resources.getScreenSize(): Int = configuration.getScreenSize()
@ScreenLayoutSize fun Configuration.getScreenSize(): Int = screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK

fun Context.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = resources.isScreenSizeAtLeast(size)
fun Resources.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = configuration.isScreenSizeAtLeast(size)
fun Configuration.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = getScreenSize().let { it != SCREENLAYOUT_SIZE_UNDEFINED && it >= size }

fun Context.isScreenLong(): Boolean = resources.isScreenLong()
fun Resources.isScreenLong(): Boolean = configuration.isScreenLong()
fun Configuration.isScreenLong(): Boolean = screenLayout and Configuration.SCREENLAYOUT_LONG_MASK == Configuration.SCREENLAYOUT_LONG_YES

@RequiresApi(17) @TargetApi(17) fun Context.isRtl(): Boolean = resources.isRtl()
@RequiresApi(17) @TargetApi(17) fun Resources.isRtl(): Boolean = configuration.isRtl()
@RequiresApi(17) @TargetApi(17) fun Configuration.isRtl(): Boolean = layoutDirection and Configuration.SCREENLAYOUT_LAYOUTDIR_MASK == Configuration.SCREENLAYOUT_LAYOUTDIR_RTL

fun Context.hasTouchscreen(): Boolean = resources.hasTouchscreen()
fun Resources.hasTouchscreen(): Boolean = configuration.hasTouchscreen()
fun Configuration.hasTouchscreen(): Boolean = touchscreen == Configuration.TOUCHSCREEN_FINGER

fun Context.hasKeyboard(): Boolean = resources.hasKeyboard()
fun Resources.hasKeyboard(): Boolean = configuration.hasKeyboard()
fun Configuration.hasKeyboard(): Boolean = keyboard == Configuration.KEYBOARD_QWERTY

fun Context.isKeyboardHidden(): Boolean = resources.isKeyboardHidden()
fun Resources.isKeyboardHidden(): Boolean = configuration.isKeyboardHidden()
fun Configuration.isKeyboardHidden(): Boolean = keyboardHidden == Configuration.KEYBOARDHIDDEN_YES

fun Context.isHardKeyboardHidden(): Boolean = resources.isHardKeyboardHidden()
fun Resources.isHardKeyboardHidden(): Boolean = configuration.isHardKeyboardHidden()
fun Configuration.isHardKeyboardHidden(): Boolean = hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_YES

fun Context.hasNavigation(): Boolean = resources.hasNavigation()
fun Resources.hasNavigation(): Boolean = configuration.hasNavigation()
fun Configuration.hasNavigation(): Boolean = navigation != Configuration.NAVIGATION_UNDEFINED && navigation != Configuration.NAVIGATION_NONAV

fun Context.isNavigationHidden(): Boolean = resources.isNavigationHidden()
fun Resources.isNavigationHidden(): Boolean = configuration.isNavigationHidden()
fun Configuration.isNavigationHidden(): Boolean = navigationHidden == Configuration.NAVIGATIONHIDDEN_YES

fun Context.isLandscape(): Boolean = resources.isLandscape()
fun Resources.isLandscape(): Boolean = configuration.isLandscape()
fun Configuration.isLandscape(): Boolean = orientation == Configuration.ORIENTATION_LANDSCAPE

@UiModeType fun Context.getTypeMode(): Int = resources.getTypeMode()
@UiModeType fun Resources.getTypeMode(): Int = configuration.getTypeMode()
@UiModeType fun Configuration.getTypeMode(): Int = uiMode and Configuration.UI_MODE_TYPE_MASK

fun Context.isTypeModeNormal(): Boolean = resources.isTypeModeNormal()
fun Resources.isTypeModeNormal(): Boolean = configuration.isTypeModeNormal()
fun Configuration.isTypeModeNormal(): Boolean = getTypeMode() == Configuration.UI_MODE_TYPE_NORMAL

@UiModeNight fun Context.getNightMode(): Int = resources.getNightMode()
@UiModeNight fun Resources.getNightMode(): Int = configuration.getNightMode()
@UiModeNight fun Configuration.getNightMode(): Int = uiMode and Configuration.UI_MODE_NIGHT_MASK

fun Context.isNightMode(): Boolean = resources.isNightMode()
fun Resources.isNightMode(): Boolean = configuration.isNightMode()
fun Configuration.isNightMode(): Boolean = getNightMode() == Configuration.UI_MODE_NIGHT_YES