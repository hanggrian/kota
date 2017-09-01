@file:JvmName("Themes")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.resources

import android.app.Fragment
import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.util.AttributeSet

@JvmOverloads
inline fun Context.openTypedArray(
        set: AttributeSet? = null,
        /*@StyleableRes*/ attrs: IntArray,
        /*@AttrRes*/ defStyleAttr: Int = 0,
        /*@StyleRes*/ defStyleRes: Int = 0,
        getter: TypedArray.() -> Unit
) = theme.openTypedArray(set, attrs, defStyleAttr, defStyleRes, getter)

@JvmOverloads
inline fun Fragment.openTypedArray(
        set: AttributeSet? = null,
        /*@StyleableRes*/ attrs: IntArray,
        /*@AttrRes*/ defStyleAttr: Int = 0,
        /*@StyleRes*/ defStyleRes: Int = 0,
        getter: TypedArray.() -> Unit
) = activity.openTypedArray(set, attrs, defStyleAttr, defStyleRes, getter)

@JvmOverloads
inline fun Resources.Theme.openTypedArray(
        set: AttributeSet? = null,
        /*@StyleableRes*/ attrs: IntArray,
        /*@AttrRes*/ defStyleAttr: Int = 0,
        /*@StyleRes*/ defStyleRes: Int = 0,
        getter: TypedArray.() -> Unit
) = obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes).let {
    it.getter()
    it.recycle()
}

inline fun Resources.Theme.getText(@AttrRes attr: Int): CharSequence {
    var value: CharSequence? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getTextNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getString(@AttrRes attr: Int): String {
    var value: String? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getStringNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getBoolean(@AttrRes attr: Int): Boolean {
    var value: Boolean? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getBooleanNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getInt(@AttrRes attr: Int): Int {
    var value: Int? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getIntNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getFloat(@AttrRes attr: Int): Float {
    var value: Float? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getFloatNotNull(0)
    }
    return value!!
}

@ColorInt
inline fun Resources.Theme.getColor2(@AttrRes attr: Int): Int {
    var value: Int? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getColorNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getColorStateList2(@AttrRes attr: Int): ColorStateList {
    var value: ColorStateList? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getColorStateListNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getInteger(@AttrRes attr: Int): Int {
    var value: Int? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getIntegerNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getDimension(@AttrRes attr: Int): Float {
    var value: Float? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getDimensionNotNull(0)
    }
    return value!!
}

@Px
inline fun Resources.Theme.getDimensionPixelOffset(@AttrRes attr: Int): Int {
    var value: Int? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getDimensionPixelOffsetNotNull(0)
    }
    return value!!
}

@Px
inline fun Resources.Theme.getDimensionPixelSize(@AttrRes attr: Int): Int {
    var value: Int? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getDimensionPixelOffsetNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getFraction(@AttrRes attr: Int, base: Int, pbase: Int): Float {
    var value: Float? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getFractionNotNull(0, base, pbase)
    }
    return value!!
}

@AnyRes
inline fun Resources.Theme.getResourceId(@AttrRes attr: Int): Int {
    var value: Int? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getDimensionPixelOffsetNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getDrawable2(@AttrRes attr: Int): Drawable {
    var value: Drawable? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getDrawableNotNull(0)
    }
    return value!!
}

inline fun Resources.Theme.getTextArray(@AttrRes attr: Int): Array<CharSequence> {
    var value: Array<CharSequence>? = null
    openTypedArray(null, intArrayOf(attr)) {
        value = getTextArrayNotNull(0)
    }
    return value!!
}

inline fun TypedArray.getTextNotNull(@StyleableRes index: Int): CharSequence {
    checkHasValue(index)
    return getText(index)!!
}

inline fun TypedArray.getStringNotNull(@StyleableRes index: Int): String {
    checkHasValue(index)
    return getString(index)!!
}

inline fun TypedArray.getNonResourceStringNotNull(@StyleableRes index: Int): String {
    checkHasValue(index)
    return getNonResourceString(index)!!
}

inline fun TypedArray.getBooleanNotNull(@StyleableRes index: Int): Boolean {
    checkHasValue(index)
    return getBoolean(index, false)
}

inline fun TypedArray.getIntNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return getInt(index, 0)
}

inline fun TypedArray.getFloatNotNull(@StyleableRes index: Int): Float {
    checkHasValue(index)
    return getFloat(index, 0f)
}

@ColorInt
inline fun TypedArray.getColorNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return getColor(index, 0)
}

inline fun TypedArray.getColorStateListNotNull(@StyleableRes index: Int): ColorStateList {
    checkHasValue(index)
    return getColorStateList(index)!!
}

inline fun TypedArray.getIntegerNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return getInteger(index, 0)
}

inline fun TypedArray.getDimensionNotNull(@StyleableRes index: Int): Float {
    checkHasValue(index)
    return getDimension(index, 0f)
}

@Px
inline fun TypedArray.getDimensionPixelOffsetNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return getDimensionPixelOffset(index, 0)
}

@Px
inline fun TypedArray.getDimensionPixelSizeNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return getDimensionPixelSize(index, 0)
}

inline fun TypedArray.getFractionNotNull(@StyleableRes index: Int, base: Int, pbase: Int): Float {
    checkHasValue(index)
    return getFraction(index, base, pbase, 0f)
}

@AnyRes
inline fun TypedArray.getResourceIdNotNull(@StyleableRes index: Int): Int {
    checkHasValue(index)
    return getResourceId(index, 0)
}

inline fun TypedArray.getDrawableNotNull(@StyleableRes index: Int): Drawable {
    checkHasValue(index)
    return getDrawable(index)!!
}

inline fun TypedArray.getTextArrayNotNull(@StyleableRes index: Int): Array<CharSequence> {
    checkHasValue(index)
    return getTextArray(index)!!
}

inline fun TypedArray.checkHasValue(@StyleableRes index: Int) {
    if (!hasValue(index)) {
        throw Resources.NotFoundException()
    }
}