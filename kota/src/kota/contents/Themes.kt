@file:JvmName("ThemesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.contents

import android.app.Fragment
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.support.annotation.AnyRes
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.support.annotation.Px

inline fun Context.getAttrText(@AttrRes attr: Int): CharSequence? = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getText(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getAttrText(@AttrRes attr: Int): CharSequence? = activity.getAttrText(attr)

inline fun Context.getAttrString(@AttrRes attr: Int): String? = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getString(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getAttrString(@AttrRes attr: Int): String? = activity.getAttrString(attr)

@JvmOverloads
inline fun Context.getAttrBoolean(@AttrRes attr: Int, defValue: Boolean = false): Boolean = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getBoolean(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrBoolean(@AttrRes attr: Int, defValue: Boolean = false): Boolean = activity.getAttrBoolean(attr, defValue)

@JvmOverloads
inline fun Context.getAttrInt(@AttrRes attr: Int, defValue: Int = 0): Int = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getInt(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrInt(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrInt(attr, defValue)

@JvmOverloads
inline fun Context.getAttrFloat(@AttrRes attr: Int, defValue: Float = 0F): Float = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getFloat(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrFloat(@AttrRes attr: Int, defValue: Float = 0F): Float = activity.getAttrFloat(attr, defValue)

@ColorInt
@JvmOverloads
inline fun Context.getAttrColor(@AttrRes attr: Int, defValue: Int = 0): Int = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getColor(0, defValue)
    } finally {
        it.recycle()
    }
}

@ColorInt
@JvmOverloads
inline fun Fragment.getAttrColor(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrColor(attr, defValue)

inline fun Context.getAttrColorStateList(@AttrRes attr: Int): ColorStateList? = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getColorStateList(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getAttrColorStateList(@AttrRes attr: Int): ColorStateList? = activity.getAttrColorStateList(attr)

@JvmOverloads
inline fun Context.getAttrInteger(@AttrRes attr: Int, defValue: Int = 0): Int = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getInteger(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrInteger(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrInteger(attr, defValue)

@JvmOverloads
inline fun Context.getAttrDimension(@AttrRes attr: Int, defValue: Float = 0F): Float = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getDimension(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrDimension(@AttrRes attr: Int, defValue: Float = 0F): Float = activity.getAttrDimension(attr, defValue)

@Px
@JvmOverloads
inline fun Context.getAttrDimensionPixelOffset(@AttrRes attr: Int, defValue: Int = 0): Int = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getDimensionPixelOffset(0, defValue)
    } finally {
        it.recycle()
    }
}

@Px
@JvmOverloads
inline fun Fragment.getAttrDimensionPixelOffset(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrDimensionPixelOffset(attr, defValue)

@Px
@JvmOverloads
inline fun Context.getAttrDimensionPixelSize(@AttrRes attr: Int, defValue: Int = 0): Int = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getDimensionPixelSize(0, defValue)
    } finally {
        it.recycle()
    }
}

@Px
@JvmOverloads
inline fun Fragment.getAttrDimensionPixelSize(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrDimensionPixelSize(attr, defValue)

@JvmOverloads
inline fun Context.getAttrFraction(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getFraction(0, base, pbase, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrFraction(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = activity.getAttrFraction(attr, base, pbase, defValue)

@AnyRes
@JvmOverloads
inline fun Context.getAttrResourceId(@AttrRes attr: Int, defValue: Int = 0): Int = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getResourceId(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads
inline fun Fragment.getAttrResourceId(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getAttrResourceId(attr, defValue)

inline fun Context.getAttrDrawable(@AttrRes attr: Int): Drawable? = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getDrawable(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getAttrDrawable(@AttrRes attr: Int): Drawable? = activity.getAttrDrawable(attr)

inline fun Context.getAttrTextArray(@AttrRes attr: Int): Array<CharSequence>? = obtainStyledAttributes(null, IntArray(1) { attr }).let {
    try {
        return it.getTextArray(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getAttrTextArray(@AttrRes attr: Int): Array<CharSequence>? = activity.getAttrTextArray(attr)