/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

package com.hendraanggrian.support.utils.content

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.annotation.ColorInt
import android.support.annotation.Px

@JvmOverloads fun Int.textAttr(context: Context, strict: Boolean = false): CharSequence? = textAttr(context.theme, strict)
@JvmOverloads fun Int.textAttr(theme: Resources.Theme, strict: Boolean = false): CharSequence? {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getText(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads fun Int.stringAttr(context: Context, strict: Boolean = false): String? = stringAttr(context.theme, strict)
@JvmOverloads fun Int.stringAttr(theme: Resources.Theme, strict: Boolean = false): String? {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getString(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads fun Int.booleanAttr(context: Context, strict: Boolean = false, def: Boolean = false): Boolean = booleanAttr(context.theme, def, strict)
@JvmOverloads fun Int.booleanAttr(theme: Resources.Theme, strict: Boolean = false, def: Boolean = false): Boolean {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getBoolean(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads fun Int.intAttr(context: Context, strict: Boolean = false, def: Int = 0): Int = intAttr(context.theme, strict, def)
@JvmOverloads fun Int.intAttr(theme: Resources.Theme, strict: Boolean = false, def: Int = 0): Int {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getInt(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads fun Int.floatAttr(context: Context, strict: Boolean = false, def: Float = 0f): Float = floatAttr(context.theme, strict, def)
@JvmOverloads fun Int.floatAttr(theme: Resources.Theme, strict: Boolean = false, def: Float = 0f): Float {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getFloat(0, def)
    } finally {
        a.recycle()
    }
}

@ColorInt @JvmOverloads fun Int.colorAttr(context: Context, strict: Boolean = false, @ColorInt def: Int = Color.TRANSPARENT): Int = colorAttr(context.theme, strict, def)
@ColorInt @JvmOverloads fun Int.colorAttr(theme: Resources.Theme, strict: Boolean = false, @ColorInt def: Int = Color.TRANSPARENT): Int {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getColor(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads fun Int.colorStateListAttr(context: Context, strict: Boolean = false): ColorStateList? = colorStateListAttr(context.theme, strict)
@JvmOverloads fun Int.colorStateListAttr(theme: Resources.Theme, strict: Boolean = false): ColorStateList? {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getColorStateList(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads fun Int.dimensionAttr(context: Context, strict: Boolean = false, def: Float = 0f): Float = dimensionAttr(context.theme, strict, def)
@JvmOverloads fun Int.dimensionAttr(theme: Resources.Theme, strict: Boolean = false, defValue: Float = 0f): Float {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimension(0, defValue)
    } finally {
        a.recycle()
    }
}

@Px @JvmOverloads fun Int.dimensionPixelOffsetAttr(context: Context, strict: Boolean = false, def: Int): Int = dimensionPixelOffsetAttr(context.theme, strict, def)
@Px @JvmOverloads fun Int.dimensionPixelOffsetAttr(theme: Resources.Theme, strict: Boolean = false, def: Int): Int {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimensionPixelOffset(0, def)
    } finally {
        a.recycle()
    }
}

@Px @JvmOverloads fun Int.dimensionPixelSizeAttr(context: Context, strict: Boolean = false, def: Int): Int = dimensionPixelSizeAttr(context.theme, strict, def)
@Px @JvmOverloads fun Int.dimensionPixelSizeAttr(theme: Resources.Theme, strict: Boolean = false, def: Int): Int {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimensionPixelSize(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads fun Int.drawableAttr(context: Context, strict: Boolean = false): Drawable? = drawableAttr(context.theme, strict)
@JvmOverloads fun Int.drawableAttr(theme: Resources.Theme, strict: Boolean = false): Drawable? {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDrawable(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads fun Int.textArrayAttr(context: Context, strict: Boolean = false): Array<CharSequence>? = textArrayAttr(context.theme, strict)
@JvmOverloads fun Int.textArrayAttr(theme: Resources.Theme, strict: Boolean = false): Array<CharSequence>? {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getTextArray(0)
    } finally {
        a.recycle()
    }
}