@file:JvmName("ThemesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.contents

import android.app.Fragment
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.support.annotation.AnyRes
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.support.annotation.Px

@PublishedApi internal val TEMP_ARRAY = IntArray(1)

inline fun Context.getAttrText(@AttrRes attr: Int): CharSequence? {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getText(0)
    } finally {
        a.recycle()
    }
}

inline fun Fragment.getAttrText(@AttrRes attr: Int): CharSequence? = activity.getAttrText(attr)

inline fun Context.getAttrString(@AttrRes attr: Int): String? {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getString(0)
    } finally {
        a.recycle()
    }
}

inline fun Fragment.getAttrString(@AttrRes attr: Int): String? = activity.getAttrString(attr)

@JvmOverloads
inline fun Context.getAttrBoolean(@AttrRes attr: Int, defValue: Boolean = false): Boolean {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getBoolean(0, defValue)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrBoolean(@AttrRes attr: Int, defValue: Boolean = false): Boolean = activity.getAttrBoolean(attr, defValue)

@JvmOverloads
inline fun Context.getAttrInt(@AttrRes attr: Int, defValue: Int = 0): Int {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getInt(0, defValue)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrInt(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrInt(attr, defValue)

@JvmOverloads
inline fun Context.getAttrFloat(@AttrRes attr: Int, defValue: Float = 0F): Float {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getFloat(0, defValue)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrFloat(@AttrRes attr: Int, defValue: Float = 0F): Float = activity.getAttrFloat(attr, defValue)

@ColorInt
@JvmOverloads
inline fun Context.getAttrColor(@AttrRes attr: Int, defValue: Int = 0): Int {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getColor(0, defValue)
    } finally {
        a.recycle()
    }
}

@ColorInt
@JvmOverloads
inline fun Fragment.getAttrColor(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrColor(attr, defValue)

inline fun Context.getAttrColorStateList(@AttrRes attr: Int): ColorStateList? {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getColorStateList(0)
    } finally {
        a.recycle()
    }
}

inline fun Fragment.getAttrColorStateList(@AttrRes attr: Int): ColorStateList? = activity.getAttrColorStateList(attr)

@JvmOverloads
inline fun Context.getAttrInteger(@AttrRes attr: Int, defValue: Int = 0): Int {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getInteger(0, defValue)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrInteger(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrInteger(attr, defValue)

@JvmOverloads
inline fun Context.getAttrDimension(@AttrRes attr: Int, defValue: Float = 0F): Float {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getDimension(0, defValue)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrDimension(@AttrRes attr: Int, defValue: Float = 0F): Float = activity.getAttrDimension(attr, defValue)

@Px
@JvmOverloads
inline fun Context.getAttrDimensionPixelOffset(@AttrRes attr: Int, defValue: Int = 0): Int {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getDimensionPixelOffset(0, defValue)
    } finally {
        a.recycle()
    }
}

@Px
@JvmOverloads
inline fun Fragment.getAttrDimensionPixelOffset(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrDimensionPixelOffset(attr, defValue)

@Px
@JvmOverloads
inline fun Context.getAttrDimensionPixelSize(@AttrRes attr: Int, defValue: Int = 0): Int {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getDimensionPixelSize(0, defValue)
    } finally {
        a.recycle()
    }
}

@Px
@JvmOverloads
inline fun Fragment.getAttrDimensionPixelSize(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrDimensionPixelSize(attr, defValue)

@JvmOverloads
inline fun Context.getAttrFraction(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getFraction(0, base, pbase, defValue)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrFraction(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = activity.getAttrFraction(attr, base, pbase, defValue)

@AnyRes
@JvmOverloads
inline fun Context.getAttrResourceId(@AttrRes attr: Int, defValue: Int = 0): Int {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getResourceId(0, defValue)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrResourceId(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrResourceId(attr, defValue)

inline fun Context.getAttrDrawable(@AttrRes attr: Int): Drawable? {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getDrawable(0)
    } finally {
        a.recycle()
    }
}

inline fun Fragment.getAttrDrawable(@AttrRes attr: Int): Drawable? = activity.getAttrDrawable(attr)

inline fun Context.getAttrTextArray(@AttrRes attr: Int): Array<CharSequence>? {
    TEMP_ARRAY[0] = attr
    val a = obtainStyledAttributes(null, TEMP_ARRAY)
    try {
        return a.getTextArray(0)
    } finally {
        a.recycle()
    }
}

inline fun Fragment.getAttrTextArray(@AttrRes attr: Int): Array<CharSequence>? = activity.getAttrTextArray(attr)