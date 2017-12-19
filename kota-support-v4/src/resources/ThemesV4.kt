@file:JvmMultifileClass
@file:JvmName("ResourcesV4Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

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
inline fun Fragment.getDimenAttr(@AttrRes attr: Int, defValue: Float = 0F): Float = context!!.getDimenAttr(attr, defValue)

@Px
@JvmOverloads
inline fun Fragment.getDimenPxOffsetAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getDimenPxOffsetAttr(attr, defValue)

@Px
@JvmOverloads
inline fun Fragment.getDimenPxSizeAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getDimenPxSizeAttr(attr, defValue)

@JvmOverloads
inline fun Fragment.getFractionAttr(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = context!!.getFractionAttr(attr, base, pbase, defValue)

@JvmOverloads
inline fun Fragment.getResIdAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getResIdAttr(attr, defValue)

inline fun Fragment.getDrawableAttr(@AttrRes attr: Int): Drawable? = context!!.getDrawableAttr(attr)

inline fun Fragment.getTextArrayAttr(@AttrRes attr: Int): Array<CharSequence>? = context!!.getTextArrayAttr(attr)