@file:JvmMultifileClass
@file:JvmName("ResourcesV4Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.resources

import android.support.v4.app.Fragment

inline val Fragment.screenSize: Int get() = context!!.screenSize

inline fun Fragment.isScreenSizeAtLeast(size: Int): Boolean = context!!.isScreenSizeAtLeast(size)

inline val Fragment.isScreenLong: Boolean get() = context!!.isScreenLong

inline val Fragment.isRtl: Boolean get() = context!!.isRtl

inline val Fragment.hasTouchscreen: Boolean get() = context!!.hasTouchscreen

inline val Fragment.hasKeyboard: Boolean get() = context!!.hasKeyboard

inline val Fragment.isKeyboardHidden: Boolean get() = context!!.isKeyboardHidden

inline val Fragment.isHardKeyboardHidden: Boolean get() = context!!.isHardKeyboardHidden

inline val Fragment.hasNavigation: Boolean get() = context!!.hasNavigation

inline val Fragment.isNavigationHidden: Boolean get() = context!!.isNavigationHidden

inline val Fragment.isLandscape: Boolean get() = context!!.isLandscape

inline val Fragment.typeMode: Int get() = context!!.typeMode

inline val Fragment.isTypeNormal: Boolean get() = context!!.isTypeNormal

inline val Fragment.nightMode: Int get() = context!!.nightMode

inline val Fragment.isNightMode: Boolean get() = context!!.isNightMode