package com.hendraanggrian.support.utils.content

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.annotation.ColorInt
import android.support.annotation.Px

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

private fun Int.textValInternal(theme: Resources.Theme, strict: Boolean): CharSequence? {
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

fun Int.textVal(context: Context): CharSequence = textVal(context.theme)
fun Int.textVal(theme: Resources.Theme): CharSequence = textValInternal(theme, true)!!
fun Int.textValOrNull(context: Context): CharSequence? = textValOrNull(context.theme)
fun Int.textValOrNull(theme: Resources.Theme): CharSequence? = textValInternal(theme, false)

private fun Int.stringValInternal(theme: Resources.Theme, strict: Boolean): String? {
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

fun Int.stringVal(context: Context): String = stringVal(context.theme)
fun Int.stringVal(theme: Resources.Theme): String = stringValInternal(theme, true)!!
fun Int.stringValOrNull(context: Context): String? = stringValOrNull(context.theme)
fun Int.stringValOrNull(theme: Resources.Theme): String? = stringValInternal(theme, false)

private fun Int.booleanValInternal(theme: Resources.Theme, defValue: Boolean, strict: Boolean): Boolean {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getBoolean(0, defValue)
    } finally {
        a.recycle()
    }
}

fun Int.booleanVal(context: Context): Boolean = booleanVal(context.theme)
fun Int.booleanVal(theme: Resources.Theme): Boolean = booleanValInternal(theme, false, true)
fun Int.booleanValOrDefault(context: Context, defValue: Boolean): Boolean = booleanValOrDefault(context.theme, defValue)
fun Int.booleanValOrDefault(theme: Resources.Theme, defValue: Boolean): Boolean = booleanValInternal(theme, defValue, false)

private fun Int.intValInternal(theme: Resources.Theme, defValue: Int, strict: Boolean): Int {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getInt(0, defValue)
    } finally {
        a.recycle()
    }
}

fun Int.intVal(context: Context): Int = intVal(context.theme)
fun Int.intVal(theme: Resources.Theme): Int = intValInternal(theme, 0, true)
fun Int.intValOrDefault(context: Context, defValue: Int): Int = intValOrDefault(context.theme, defValue)
fun Int.intValOrDefault(theme: Resources.Theme, defValue: Int): Int = intValInternal(theme, defValue, false)

private fun Int.floatValInternal(theme: Resources.Theme, defValue: Float, strict: Boolean): Float {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getFloat(0, defValue)
    } finally {
        a.recycle()
    }
}

fun Int.floatVal(context: Context): Float = floatVal(context.theme)
fun Int.floatVal(theme: Resources.Theme): Float = floatValInternal(theme, 0f, true)
fun Int.floatValOrDefault(context: Context, defValue: Float): Float = floatValOrDefault(context.theme, defValue)
fun Int.floatValOrDefault(theme: Resources.Theme, defValue: Float): Float = floatValInternal(theme, defValue, false)


@ColorInt
private fun Int.colorValInternal(theme: Resources.Theme, @ColorInt defValue: Int, strict: Boolean): Int {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getColor(0, defValue)
    } finally {
        a.recycle()
    }
}

@ColorInt fun Int.colorVal(context: Context): Int = colorVal(context.theme)
@ColorInt fun Int.colorVal(theme: Resources.Theme): Int = colorValInternal(theme, Color.TRANSPARENT, true)
@ColorInt fun Int.colorValOrDefault(context: Context, defValue: Int): Int = colorValOrDefault(context.theme, defValue)
@ColorInt fun Int.colorValOrDefault(theme: Resources.Theme, defValue: Int): Int = colorValInternal(theme, defValue, false)

private fun Int.colorStateListValInternal(theme: Resources.Theme, strict: Boolean): ColorStateList? {
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

fun Int.colorStateListVal(context: Context): ColorStateList = colorStateListVal(context.theme)
fun Int.colorStateListVal(theme: Resources.Theme): ColorStateList = colorStateListValInternal(theme, true)!!
fun Int.colorStateListValOrNull(context: Context): ColorStateList? = colorStateListValOrNull(context.theme)
fun Int.colorStateListValOrNull(theme: Resources.Theme): ColorStateList? = colorStateListValInternal(theme, false)

private fun Int.dimensionValInternal(theme: Resources.Theme, defValue: Float, strict: Boolean): Float {
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

fun Int.dimensionVal(context: Context): Float = dimensionVal(context.theme)
fun Int.dimensionVal(theme: Resources.Theme): Float = dimensionValInternal(theme, 0f, true)
fun Int.dimensionValOrDefault(context: Context, defValue: Float): Float = dimensionValOrDefault(context.theme, defValue)
fun Int.dimensionValOrDefault(theme: Resources.Theme, defValue: Float): Float = dimensionValInternal(theme, defValue, false)

private fun Int.dimensionPixelOffsetValInternal(theme: Resources.Theme, defValue: Int, strict: Boolean): Int {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimensionPixelOffset(0, defValue)
    } finally {
        a.recycle()
    }
}

@Px fun Int.dimensionPixelOffsetVal(context: Context): Int = dimensionPixelOffsetVal(context.theme)
@Px fun Int.dimensionPixelOffsetVal(theme: Resources.Theme): Int = dimensionPixelOffsetValInternal(theme, 0, true)
@Px fun Int.dimensionPixelOffsetValOrDefault(context: Context, defValue: Int): Int = dimensionPixelOffsetValOrDefault(context.theme, defValue)
@Px fun Int.dimensionPixelOffsetValOrDefault(theme: Resources.Theme, defValue: Int): Int = dimensionPixelOffsetValInternal(theme, defValue, false)

private fun Int.dimensionPixelSizeValInternal(theme: Resources.Theme, defValue: Int, strict: Boolean): Int {
    val a = theme.obtainStyledAttributes(intArrayOf(this))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimensionPixelSize(0, defValue)
    } finally {
        a.recycle()
    }
}

@Px fun Int.dimensionPixelSizeVal(context: Context): Int = dimensionPixelSizeVal(context.theme)
@Px fun Int.dimensionPixelSizeVal(theme: Resources.Theme): Int = dimensionPixelSizeValInternal(theme, 0, true)
@Px fun Int.dimensionPixelSizeValOrDefault(context: Context, defValue: Int): Int = dimensionPixelSizeValOrDefault(context.theme, defValue)
@Px fun Int.dimensionPixelSizeValOrDefault(theme: Resources.Theme, defValue: Int): Int = dimensionPixelSizeValInternal(theme, defValue, false)

private fun Int.drawableValInternal(theme: Resources.Theme, strict: Boolean): Drawable? {
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

fun Int.drawableVal(context: Context): Drawable = drawableVal(context.theme)
fun Int.drawableVal(theme: Resources.Theme): Drawable = drawableValInternal(theme, true)!!
fun Int.drawableValOrNull(context: Context): Drawable? = drawableValOrNull(context.theme)
fun Int.drawableValOrNull(theme: Resources.Theme): Drawable? = drawableValInternal(theme, false)

private fun Int.textArrayValInternal(theme: Resources.Theme, strict: Boolean): Array<CharSequence>? {
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

fun Int.textArrayVal(context: Context): Array<CharSequence> = textArrayVal(context.theme)
fun Int.textArrayVal(theme: Resources.Theme): Array<CharSequence> = textArrayValInternal(theme, true)!!
fun Int.textArrayValOrNull(context: Context): Array<CharSequence>? = textArrayValOrNull(context.theme)
fun Int.textArrayValOrNull(theme: Resources.Theme): Array<CharSequence>? = textArrayValInternal(theme, false)