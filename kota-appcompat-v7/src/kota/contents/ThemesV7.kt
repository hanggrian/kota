@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.contents

import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.support.annotation.Px
import android.support.v7.app.AppCompatDialog

inline fun AppCompatDialog.getAttrText(@AttrRes attr: Int): CharSequence? = context.getAttrText(attr)

inline fun AppCompatDialog.getAttrString(@AttrRes attr: Int): String? = context.getAttrString(attr)

@JvmOverloads
inline fun AppCompatDialog.getAttrBoolean(@AttrRes attr: Int, defValue: Boolean = false): Boolean = context.getAttrBoolean(attr, defValue)

@JvmOverloads
inline fun AppCompatDialog.getAttrInt(@AttrRes attr: Int, defValue: Int = 0): Int = context.getAttrInt(attr, defValue)

@JvmOverloads
inline fun AppCompatDialog.getAttrFloat(@AttrRes attr: Int, defValue: Float = 0F): Float = context.getAttrFloat(attr, defValue)

@ColorInt
@JvmOverloads
inline fun AppCompatDialog.getAttrColor(@AttrRes attr: Int, defValue: Int = 0): Int = context.getAttrColor(attr, defValue)

inline fun AppCompatDialog.getAttrColorStateList(@AttrRes attr: Int): ColorStateList? = context.getAttrColorStateList(attr)

@JvmOverloads
inline fun AppCompatDialog.getAttrInteger(@AttrRes attr: Int, defValue: Int = 0): Int = context.getAttrInteger(attr, defValue)

@JvmOverloads
inline fun AppCompatDialog.getAttrDimension(@AttrRes attr: Int, defValue: Float = 0F): Float = context.getAttrDimension(attr, defValue)

@Px
@JvmOverloads
inline fun AppCompatDialog.getAttrDimensionPixelOffset(@AttrRes attr: Int, defValue: Int = 0): Int = context.getAttrDimensionPixelOffset(attr, defValue)

@Px
@JvmOverloads
inline fun AppCompatDialog.getAttrDimensionPixelSize(@AttrRes attr: Int, defValue: Int = 0): Int = context.getAttrDimensionPixelSize(attr, defValue)

@JvmOverloads
inline fun AppCompatDialog.getAttrFraction(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = context.getAttrFraction(attr, base, pbase, defValue)

@JvmOverloads
inline fun AppCompatDialog.getAttrResourceId(@AttrRes attr: Int, defValue: Int = 0): Int = context.getAttrResourceId(attr, defValue)

inline fun AppCompatDialog.getAttrDrawable(@AttrRes attr: Int): Drawable? = context.getAttrDrawable(attr)

inline fun AppCompatDialog.getAttrTextArray(@AttrRes attr: Int): Array<CharSequence>? = context.getAttrTextArray(attr)