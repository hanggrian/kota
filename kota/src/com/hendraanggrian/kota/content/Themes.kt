@file:JvmName("Themes")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.app.Fragment
import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.os.Build
import android.support.annotation.AnyRes
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.support.annotation.Px
import android.util.AttributeSet
import com.hendraanggrian.kota.annotation.Dp

@JvmOverloads inline fun Resources.Theme.obtainStyledAttributesBy(
        set: AttributeSet? = null,
        /*@StyleableRes*/ attrs: IntArray,
        /*@AttrRes*/ defStyleAttr: Int = 0,
        /*@StyleRes*/ defStyleRes: Int = 0,
        noinline getter: TypedArray.() -> Unit
): Unit {
    val a = obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)
    a.getter()
    a.recycle()
}

@JvmOverloads inline fun Context.obtainStyledAttributesBy(
        set: AttributeSet? = null,
        /*@StyleableRes*/ attrs: IntArray,
        /*@AttrRes*/ defStyleAttr: Int = 0,
        /*@StyleRes*/ defStyleRes: Int = 0,
        noinline getter: TypedArray.() -> Unit
): Unit = theme.obtainStyledAttributesBy(set, attrs, defStyleAttr, defStyleRes, getter)

@JvmOverloads inline fun Fragment.obtainStyledAttributesBy(
        set: AttributeSet? = null,
        /*@StyleableRes*/ attrs: IntArray,
        /*@AttrRes*/ defStyleAttr: Int = 0,
        /*@StyleRes*/ defStyleRes: Int = 0,
        noinline getter: TypedArray.() -> Unit
): Unit = if (Build.VERSION.SDK_INT >= 23) {
    context.obtainStyledAttributesBy(set, attrs, defStyleAttr, defStyleRes, getter)
} else {
    activity.obtainStyledAttributesBy(set, attrs, defStyleAttr, defStyleRes, getter)
}

@JvmOverloads inline fun android.support.v4.app.Fragment.obtainStyledAttributesBy(
        set: AttributeSet? = null,
        /*@StyleableRes*/ attrs: IntArray,
        /*@AttrRes*/ defStyleAttr: Int = 0,
        /*@StyleRes*/ defStyleRes: Int = 0,
        noinline getter: TypedArray.() -> Unit
): Unit = context.obtainStyledAttributesBy(set, attrs, defStyleAttr, defStyleRes, getter)

inline fun Resources.Theme.getText(@AttrRes attr: Int): CharSequence {
    var value: CharSequence? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getTextNotNull(0)
    }
    return checkNotNull(value)
}

inline fun Resources.Theme.getString(@AttrRes attr: Int): String {
    var value: String? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getStringNotNull(0)
    }
    return checkNotNull(value)
}

inline fun Resources.Theme.getBoolean(@AttrRes attr: Int): Boolean {
    var value: Boolean? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getBooleanNotNull(0)
    }
    return checkNotNull(value)
}

inline fun Resources.Theme.getInt(@AttrRes attr: Int): Int {
    var value: Int? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getIntNotNull(0)
    }
    return checkNotNull(value)
}

inline fun Resources.Theme.getFloat(@AttrRes attr: Int): Float {
    var value: Float? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getFloatNotNull(0)
    }
    return checkNotNull(value)
}

@ColorInt
inline fun Resources.Theme.getColor2(@AttrRes attr: Int): Int {
    var value: Int? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getColorNotNull(0)
    }
    return checkNotNull(value)
}

inline fun Resources.Theme.getColorStateList2(@AttrRes attr: Int): ColorStateList {
    var value: ColorStateList? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getColorStateListNotNull(0)
    }
    return checkNotNull(value)
}

inline fun Resources.Theme.getInteger(@AttrRes attr: Int): Int {
    var value: Int? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getIntegerNotNull(0)
    }
    return checkNotNull(value)
}

@Dp
inline fun Resources.Theme.getDimension(@AttrRes attr: Int): Float {
    var value: Float? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getDimensionNotNull(0)
    }
    return checkNotNull(value)
}

@Px
inline fun Resources.Theme.getDimensionPixelOffset(@AttrRes attr: Int): Int {
    var value: Int? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getDimensionPixelOffsetNotNull(0)
    }
    return checkNotNull(value)
}

@Px
inline fun Resources.Theme.getDimensionPixelSize(@AttrRes attr: Int): Int {
    var value: Int? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getDimensionPixelOffsetNotNull(0)
    }
    return checkNotNull(value)
}

inline fun Resources.Theme.getFraction(@AttrRes attr: Int, base: Int, pbase: Int): Float {
    var value: Float? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getFractionNotNull(0, base, pbase)
    }
    return checkNotNull(value)
}

@AnyRes
inline fun Resources.Theme.getResourceId(@AttrRes attr: Int): Int {
    var value: Int? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getDimensionPixelOffsetNotNull(0)
    }
    return checkNotNull(value)
}

inline fun Resources.Theme.getDrawable2(@AttrRes attr: Int): Drawable {
    var value: Drawable? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getDrawableNotNull(0)
    }
    return checkNotNull(value)
}

inline fun Resources.Theme.getTextArray(@AttrRes attr: Int): Array<CharSequence> {
    var value: Array<CharSequence>? = null
    obtainStyledAttributesBy(null, intArrayOf(attr)) {
        value = getTextArrayNotNull(0)
    }
    return checkNotNull(value)
}