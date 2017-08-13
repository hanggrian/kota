@file:JvmName("TypedArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.content

import android.content.res.ColorStateList
import android.content.res.Resources
import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.support.annotation.AnyRes
import android.support.annotation.ColorInt
import android.support.annotation.Px
import android.support.annotation.StyleableRes
import com.hendraanggrian.common.annotation.Dp

inline fun TypedArray.getTextNotNull(@StyleableRes index: Int): CharSequence {
    checkHasValue(index)
    return checkNotNull(getText(index))
}

inline fun TypedArray.getStringNotNull(@StyleableRes index: Int): String {
    checkHasValue(index)
    return checkNotNull(getString(index))
}

inline fun TypedArray.getNonResourceStringNotNull(@StyleableRes index: Int): String {
    checkHasValue(index)
    return checkNotNull(getNonResourceString(index))
}

inline fun TypedArray.getBooleanNotNull(@StyleableRes index: Int): Boolean {
    checkHasValue(index)
    return checkNotNull(getBoolean(index, false))
}

inline fun TypedArray.getIntNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return checkNotNull(getInt(index, 0))
}

inline fun TypedArray.getFloatNotNull(@StyleableRes index: Int): Float {
    checkHasValue(index)
    return checkNotNull(getFloat(index, 0f))
}

@ColorInt
inline fun TypedArray.getColorNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return checkNotNull(getColor(index, 0))
}

inline fun TypedArray.getColorStateListNotNull(@StyleableRes index: Int): ColorStateList {
    checkHasValue(index)
    return checkNotNull(getColorStateList(index))
}

inline fun TypedArray.getIntegerNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return checkNotNull(getInteger(index, 0))
}

@Dp
inline fun TypedArray.getDimensionNotNull(@StyleableRes index: Int): Float {
    checkHasValue(index)
    return checkNotNull(getDimension(index, 0f))
}

@Px
inline fun TypedArray.getDimensionPixelOffsetNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return checkNotNull(getDimensionPixelOffset(index, 0))
}

@Px
inline fun TypedArray.getDimensionPixelSizeNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return checkNotNull(getDimensionPixelSize(index, 0))
}

inline fun TypedArray.getFractionNotNull(@StyleableRes index: Int, base: Int, pbase: Int): Float {
    checkHasValue(index)
    return checkNotNull(getFraction(index, base, pbase, 0f))
}

@AnyRes
inline fun TypedArray.getResourceIdNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return checkNotNull(getResourceId(index, 0))
}

inline fun TypedArray.getDrawableNotNull(@StyleableRes index: Int): Drawable {
    checkHasValue(index)
    return checkNotNull(getDrawable(index))
}

inline fun TypedArray.getTextArrayNotNull(@StyleableRes index: Int): Array<CharSequence> {
    checkHasValue(index)
    return checkNotNull(getTextArray(index))
}

inline fun TypedArray.checkHasValue(@StyleableRes index: Int): Unit {
    if (!hasValue(index)) {
        throw Resources.NotFoundException()
    }
}