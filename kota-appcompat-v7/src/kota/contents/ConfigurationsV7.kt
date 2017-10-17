@file:JvmMultifileClass
@file:JvmName("ResourcesV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.contents

import android.support.v7.app.AppCompatDialog

inline val AppCompatDialog.screenSize: Int get() = context.screenSize

inline fun AppCompatDialog.isScreenSizeAtLeast(size: Int): Boolean = context.isScreenSizeAtLeast(size)

inline val AppCompatDialog.isScreenLong: Boolean get() = context.isScreenLong

inline val AppCompatDialog.isRtl: Boolean get() = context.isRtl

inline val AppCompatDialog.hasTouchscreen: Boolean get() = context.hasTouchscreen

inline val AppCompatDialog.hasKeyboard: Boolean get() = context.hasKeyboard

inline val AppCompatDialog.isKeyboardHidden: Boolean get() = context.isKeyboardHidden

inline val AppCompatDialog.isHardKeyboardHidden: Boolean get() = context.isHardKeyboardHidden

inline val AppCompatDialog.hasNavigation: Boolean get() = context.hasNavigation

inline val AppCompatDialog.isNavigationHidden: Boolean get() = context.isNavigationHidden

inline val AppCompatDialog.isLandscape: Boolean get() = context.isLandscape

inline val AppCompatDialog.typeMode: Int get() = context.typeMode

inline val AppCompatDialog.isTypeNormal: Boolean get() = context.isTypeNormal

inline val AppCompatDialog.nightMode: Int get() = context.nightMode

inline val AppCompatDialog.isNightMode: Boolean get() = context.isNightMode