package com.hendraanggrian.support.utils.content

import android.annotation.TargetApi
import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.support.annotation.IntDef
import android.support.annotation.RequiresApi

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@IntDef(Configuration.SCREENLAYOUT_SIZE_UNDEFINED.toLong(),
        Configuration.SCREENLAYOUT_SIZE_SMALL.toLong(),
        Configuration.SCREENLAYOUT_SIZE_NORMAL.toLong(),
        Configuration.SCREENLAYOUT_SIZE_LARGE.toLong(),
        Configuration.SCREENLAYOUT_SIZE_XLARGE.toLong())
@Retention(AnnotationRetention.SOURCE)
annotation class ScreenSize

@RequiresApi(20)
@TargetApi(20)
@IntDef(Configuration.UI_MODE_TYPE_UNDEFINED.toLong(),
        Configuration.UI_MODE_TYPE_NORMAL.toLong(),
        Configuration.UI_MODE_TYPE_DESK.toLong(),
        Configuration.UI_MODE_TYPE_CAR.toLong(),
        Configuration.UI_MODE_TYPE_TELEVISION.toLong(),
        Configuration.UI_MODE_TYPE_APPLIANCE.toLong(),
        Configuration.UI_MODE_TYPE_WATCH.toLong())
@Retention(AnnotationRetention.SOURCE)
annotation class ModeType

@IntDef(Configuration.UI_MODE_NIGHT_UNDEFINED.toLong(),
        Configuration.UI_MODE_NIGHT_NO.toLong(),
        Configuration.UI_MODE_NIGHT_YES.toLong())
@Retention(AnnotationRetention.SOURCE)
annotation class ModeNight

@ScreenSize fun Context.getScreenSize(): Int = resources.getScreenSize()
@ScreenSize fun Resources.getScreenSize(): Int = configuration.getScreenSize()
@ScreenSize fun Configuration.getScreenSize(): Int = screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK

fun Context.isScreenSizeAtLeast(@ScreenSize size: Int): Boolean = resources.isScreenSizeAtLeast(size)
fun Resources.isScreenSizeAtLeast(@ScreenSize size: Int): Boolean = configuration.isScreenSizeAtLeast(size)
fun Configuration.isScreenSizeAtLeast(@ScreenSize size: Int): Boolean = getScreenSize().let { it != Configuration.SCREENLAYOUT_SIZE_UNDEFINED && it >= size }

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

@ModeType fun Context.getTypeMode(): Int = resources.getTypeMode()
@ModeType fun Resources.getTypeMode(): Int = configuration.getTypeMode()
@ModeType fun Configuration.getTypeMode(): Int = uiMode and Configuration.UI_MODE_TYPE_MASK

fun Context.isTypeModeNormal(): Boolean = resources.isTypeModeNormal()
fun Resources.isTypeModeNormal(): Boolean = configuration.isTypeModeNormal()
fun Configuration.isTypeModeNormal(): Boolean = getTypeMode() == Configuration.UI_MODE_TYPE_NORMAL

@ModeNight fun Context.getNightMode(): Int = resources.getNightMode()
@ModeNight fun Resources.getNightMode(): Int = configuration.getNightMode()
@ModeNight fun Configuration.getNightMode(): Int = uiMode and Configuration.UI_MODE_NIGHT_MASK

fun Context.isNightMode(): Boolean = resources.isNightMode()
fun Resources.isNightMode(): Boolean = configuration.isNightMode()
fun Configuration.isNightMode(): Boolean = getNightMode() == Configuration.UI_MODE_NIGHT_YES