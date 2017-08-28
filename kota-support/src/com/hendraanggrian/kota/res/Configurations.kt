@file:JvmName("SupportConfigurations")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.res

import android.support.v4.app.Fragment
import com.hendraanggrian.kota.annotation.ScreenLayoutSize
import com.hendraanggrian.kota.annotation.UiNightMode
import com.hendraanggrian.kota.annotation.UiTypeMode

@ScreenLayoutSize inline val Fragment.screenSize: Int get() = context.screenSize

inline fun Fragment.isScreenSizeAtLeast(@ScreenLayoutSize size: Int): Boolean = context.isScreenSizeAtLeast(size)

inline val Fragment.isScreenLong: Boolean get() = context.isScreenLong

inline val Fragment.isRtl: Boolean get() = context.isRtl

inline val Fragment.hasTouchscreen: Boolean get() = context.hasTouchscreen

inline val Fragment.hasKeyboard: Boolean get() = context.hasKeyboard

inline val Fragment.isKeyboardHidden: Boolean get() = context.isKeyboardHidden

inline val Fragment.isHardKeyboardHidden: Boolean get() = context.isHardKeyboardHidden

inline val Fragment.hasNavigation: Boolean get() = context.hasNavigation

inline val Fragment.isNavigationHidden: Boolean get() = context.isNavigationHidden

inline val Fragment.isLandscape: Boolean get() = context.isLandscape

@UiTypeMode inline val Fragment.typeMode: Int get() = context.typeMode

inline val Fragment.isTypeNormal: Boolean get() = context.isTypeNormal

@UiNightMode inline val Fragment.nightMode: Int get() = context.nightMode

inline val Fragment.isNightMode: Boolean get() = context.isNightMode