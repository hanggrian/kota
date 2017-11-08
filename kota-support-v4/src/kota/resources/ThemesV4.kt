@file:JvmMultifileClass
@file:JvmName("ResourcesV4Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.resources

import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.support.annotation.Px
import android.support.v4.app.Fragment

inline fun Fragment.getTextAttr(@AttrRes attr: Int): CharSequence? = context!!.getTextAttr(attr)

inline fun Fragment.getStringAttr(@AttrRes attr: Int): String? = context!!.getStringAttr(attr)

@JvmOverloads
inline fun Fragment.getBooleanAttr(@AttrRes attr: Int, defValue: Boolean = false): Boolean = context!!.getBooleanAttr(attr, defValue)

@JvmOverloads
inline fun Fragment.getIntAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getIntAttr(attr, defValue)

@JvmOverloads
inline fun Fragment.getFloatAttr(@AttrRes attr: Int, defValue: Float = 0F): Float = context!!.getFloatAttr(attr, defValue)

@ColorInt
@JvmOverloads
inline fun Fragment.getColorAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getColorAttr(attr, defValue)

inline fun Fragment.getColorStateListAttr(@AttrRes attr: Int): ColorStateList? = context!!.getColorStateListAttr(attr)

@JvmOverloads
inline fun Fragment.getIntegerAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getIntegerAttr(attr, defValue)

@JvmOverloads
inline fun Fragment.getDimensionAttr(@AttrRes attr: Int, defValue: Float = 0F): Float = context!!.getDimensionAttr(attr, defValue)

@Px
@JvmOverloads
inline fun Fragment.getDimensionPixelOffsetAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getDimensionPixelOffsetAttr(attr, defValue)

@Px
@JvmOverloads
inline fun Fragment.getDimensionPixelSizeAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getDimensionPixelSizeAttr(attr, defValue)

@JvmOverloads
inline fun Fragment.getFractionAttr(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = context!!.getFractionAttr(attr, base, pbase, defValue)

@JvmOverloads
inline fun Fragment.getResourceIdAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getResourceIdAttr(attr, defValue)

inline fun Fragment.getDrawableAttr(@AttrRes attr: Int): Drawable? = context!!.getDrawableAttr(attr)

inline fun Fragment.getTextArrayAttr(@AttrRes attr: Int): Array<CharSequence>? = context!!.getTextArrayAttr(attr)