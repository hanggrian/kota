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

inline fun Fragment.getAttrText(@AttrRes attr: Int): CharSequence? = context!!.getAttrText(attr)

inline fun Fragment.getAttrString(@AttrRes attr: Int): String? = context!!.getAttrString(attr)

@JvmOverloads
inline fun Fragment.getAttrBoolean(@AttrRes attr: Int, defValue: Boolean = false): Boolean = context!!.getAttrBoolean(attr, defValue)

@JvmOverloads
inline fun Fragment.getAttrInt(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getAttrInt(attr, defValue)

@JvmOverloads
inline fun Fragment.getAttrFloat(@AttrRes attr: Int, defValue: Float = 0F): Float = context!!.getAttrFloat(attr, defValue)

@ColorInt
@JvmOverloads
inline fun Fragment.getAttrColor(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getAttrColor(attr, defValue)

inline fun Fragment.getAttrColorStateList(@AttrRes attr: Int): ColorStateList? = context!!.getAttrColorStateList(attr)

@JvmOverloads
inline fun Fragment.getAttrInteger(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getAttrInteger(attr, defValue)

@JvmOverloads
inline fun Fragment.getAttrDimension(@AttrRes attr: Int, defValue: Float = 0F): Float = context!!.getAttrDimension(attr, defValue)

@Px
@JvmOverloads
inline fun Fragment.getAttrDimensionPixelOffset(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getAttrDimensionPixelOffset(attr, defValue)

@Px
@JvmOverloads
inline fun Fragment.getAttrDimensionPixelSize(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getAttrDimensionPixelSize(attr, defValue)

@JvmOverloads
inline fun Fragment.getAttrFraction(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = context!!.getAttrFraction(attr, base, pbase, defValue)

@JvmOverloads
inline fun Fragment.getAttrResourceId(@AttrRes attr: Int, defValue: Int = 0): Int = context!!.getAttrResourceId(attr, defValue)

inline fun Fragment.getAttrDrawable(@AttrRes attr: Int): Drawable? = context!!.getAttrDrawable(attr)

inline fun Fragment.getAttrTextArray(@AttrRes attr: Int): Array<CharSequence>? = context!!.getAttrTextArray(attr)