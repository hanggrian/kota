@file:JvmMultifileClass
@file:JvmName("ResourcesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.resources

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.support.annotation.AnyRes
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.support.annotation.Px

@PublishedApi
internal inline fun Context.obtainAttrs(@AttrRes attr: Int): TypedArray =
        obtainStyledAttributes(null, intArrayOf(attr))

inline fun Context.getTextAttr(@AttrRes attr: Int): CharSequence? = obtainAttrs(attr).let {
    try {
        return it.getText(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getTextAttr(@AttrRes attr: Int): CharSequence? = activity.getTextAttr(attr)
inline fun Dialog.getTextAttr(@AttrRes attr: Int): CharSequence? = context.getTextAttr(attr)

inline fun Context.getStringAttr(@AttrRes attr: Int): String? = obtainAttrs(attr).let {
    try {
        return it.getString(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getStringAttr(@AttrRes attr: Int): String? = activity.getStringAttr(attr)
inline fun Dialog.getStringAttr(@AttrRes attr: Int): String? = context.getStringAttr(attr)

@JvmOverloads
inline fun Context.getBooleanAttr(@AttrRes attr: Int, defValue: Boolean = false): Boolean = obtainAttrs(attr).let {
    try {
        return it.getBoolean(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads inline fun Fragment.getBooleanAttr(@AttrRes attr: Int, defValue: Boolean = false): Boolean = activity.getBooleanAttr(attr, defValue)
@JvmOverloads inline fun Dialog.getBooleanAttr(@AttrRes attr: Int, defValue: Boolean = false): Boolean = context.getBooleanAttr(attr, defValue)

@JvmOverloads
inline fun Context.getIntAttr(@AttrRes attr: Int, defValue: Int = 0): Int = obtainAttrs(attr).let {
    try {
        return it.getInt(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads inline fun Fragment.getIntAttr(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getIntAttr(attr, defValue)
@JvmOverloads inline fun Dialog.getIntAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context.getIntAttr(attr, defValue)

@JvmOverloads
inline fun Context.getFloatAttr(@AttrRes attr: Int, defValue: Float = 0F): Float = obtainAttrs(attr).let {
    try {
        return it.getFloat(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads inline fun Fragment.getFloatAttr(@AttrRes attr: Int, defValue: Float = 0F): Float = activity.getFloatAttr(attr, defValue)
@JvmOverloads inline fun Dialog.getFloatAttr(@AttrRes attr: Int, defValue: Float = 0F): Float = context.getFloatAttr(attr, defValue)

@ColorInt
@JvmOverloads
inline fun Context.getColorAttr(@AttrRes attr: Int, defValue: Int = 0): Int = obtainAttrs(attr).let {
    try {
        return it.getColor(0, defValue)
    } finally {
        it.recycle()
    }
}

@ColorInt
@JvmOverloads
inline fun Fragment.getColorAttr(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getColorAttr(attr, defValue)

@ColorInt
@JvmOverloads
inline fun Dialog.getColorAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context.getColorAttr(attr, defValue)

inline fun Context.getColorStateListAttr(@AttrRes attr: Int): ColorStateList? = obtainAttrs(attr).let {
    try {
        return it.getColorStateList(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getColorStateListAttr(@AttrRes attr: Int): ColorStateList? = activity.getColorStateListAttr(attr)
inline fun Dialog.getColorStateListAttr(@AttrRes attr: Int): ColorStateList? = context.getColorStateListAttr(attr)

@JvmOverloads
inline fun Context.getIntegerAttr(@AttrRes attr: Int, defValue: Int = 0): Int = obtainAttrs(attr).let {
    try {
        return it.getInteger(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads inline fun Fragment.getIntegerAttr(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getIntegerAttr(attr, defValue)
@JvmOverloads inline fun Dialog.getIntegerAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context.getIntegerAttr(attr, defValue)

@JvmOverloads
inline fun Context.getDimenAttr(@AttrRes attr: Int, defValue: Float = 0F): Float = obtainAttrs(attr).let {
    try {
        return it.getDimension(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads inline fun Fragment.getDimenAttr(@AttrRes attr: Int, defValue: Float = 0F): Float = activity.getDimenAttr(attr, defValue)
@JvmOverloads inline fun Dialog.getDimenAttr(@AttrRes attr: Int, defValue: Float = 0F): Float = context.getDimenAttr(attr, defValue)

@Px
@JvmOverloads
inline fun Context.getDimenPxOffsetAttr(@AttrRes attr: Int, defValue: Int = 0): Int = obtainAttrs(attr).let {
    try {
        return it.getDimensionPixelOffset(0, defValue)
    } finally {
        it.recycle()
    }
}

@Px
@JvmOverloads
inline fun Fragment.getDimenPxOffsetAttr(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getDimenPxOffsetAttr(attr, defValue)

@Px
@JvmOverloads
inline fun Dialog.getDimenPxOffsetAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context.getDimenPxOffsetAttr(attr, defValue)

@Px
@JvmOverloads
inline fun Context.getDimenPxSizeAttr(@AttrRes attr: Int, defValue: Int = 0): Int = obtainAttrs(attr).let {
    try {
        return it.getDimensionPixelSize(0, defValue)
    } finally {
        it.recycle()
    }
}

@Px
@JvmOverloads
inline fun Fragment.getDimenPxSizeAttr(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getDimenPxSizeAttr(attr, defValue)

@Px
@JvmOverloads
inline fun Dialog.getDimenPxSizeAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context.getDimenPxSizeAttr(attr, defValue)

@JvmOverloads
inline fun Context.getFractionAttr(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = obtainAttrs(attr).let {
    try {
        return it.getFraction(0, base, pbase, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads inline fun Fragment.getFractionAttr(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = activity.getFractionAttr(attr, base, pbase, defValue)
@JvmOverloads inline fun Dialog.getFractionAttr(@AttrRes attr: Int, base: Int, pbase: Int, defValue: Float = 0F): Float = context.getFractionAttr(attr, base, pbase, defValue)

@AnyRes
@JvmOverloads
inline fun Context.getResIdAttr(@AttrRes attr: Int, defValue: Int = 0): Int = obtainAttrs(attr).let {
    try {
        return it.getResourceId(0, defValue)
    } finally {
        it.recycle()
    }
}

@JvmOverloads inline fun Fragment.getResIdAttr(@AttrRes attr: Int, defValue: Int = 0): Int = activity.getResIdAttr(attr, defValue)
@JvmOverloads inline fun Dialog.getResIdAttr(@AttrRes attr: Int, defValue: Int = 0): Int = context.getResIdAttr(attr, defValue)

inline fun Context.getDrawableAttr(@AttrRes attr: Int): Drawable? = obtainAttrs(attr).let {
    try {
        return it.getDrawable(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getDrawableAttr(@AttrRes attr: Int): Drawable? = activity.getDrawableAttr(attr)
inline fun Dialog.getDrawableAttr(@AttrRes attr: Int): Drawable? = context.getDrawableAttr(attr)

inline fun Context.getTextArrayAttr(@AttrRes attr: Int): Array<CharSequence>? = obtainAttrs(attr).let {
    try {
        return it.getTextArray(0)
    } finally {
        it.recycle()
    }
}

inline fun Fragment.getTextArrayAttr(@AttrRes attr: Int): Array<CharSequence>? = activity.getTextArrayAttr(attr)
inline fun Dialog.getTextArrayAttr(@AttrRes attr: Int): Array<CharSequence>? = context.getTextArrayAttr(attr)