@file:JvmName("Themes")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.support.annotation.Px
import com.hendraanggrian.kota.annotation.Dp

@JvmOverloads inline fun Resources.Theme.getText(
        @AttrRes id: Int,
        strict: Boolean = false
): CharSequence? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getText(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads inline fun Resources.Theme.getString(
        @AttrRes id: Int,
        strict: Boolean = false
): String? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getString(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads inline fun Resources.Theme.getBoolean(
        @AttrRes id: Int,
        strict: Boolean = false,
        def: Boolean = false
): Boolean {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getBoolean(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads inline fun Resources.Theme.getInt(
        @AttrRes id: Int,
        strict: Boolean = false,
        def: Int = 0
): Int {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getInt(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads inline fun Resources.Theme.getFloat(
        @AttrRes id: Int,
        strict: Boolean = false,
        def: Float = 0f
): Float {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getFloat(0, def)
    } finally {
        a.recycle()
    }
}

@ColorInt
@JvmOverloads inline fun Resources.Theme.getColor(
        @AttrRes id: Int,
        strict: Boolean = false,
        @ColorInt def: Int = Color.TRANSPARENT
): Int {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getColor(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads inline fun Resources.Theme.getColorStateList(
        @AttrRes id: Int,
        strict: Boolean = false
): ColorStateList? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getColorStateList(0)
    } finally {
        a.recycle()
    }
}

@Dp
@JvmOverloads inline fun Resources.Theme.getDimension(
        @AttrRes id: Int,
        strict: Boolean = false,
        defValue: Float = 0f
): Float {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimension(0, defValue)
    } finally {
        a.recycle()
    }
}

@Px
@JvmOverloads inline fun Resources.Theme.getDimensionPixelOffset(
        @AttrRes id: Int,
        strict: Boolean = false,
        def: Int = 0
): Int {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimensionPixelOffset(0, def)
    } finally {
        a.recycle()
    }
}

@Px
@JvmOverloads inline fun Resources.Theme.getDimensionPixelSize(
        @AttrRes id: Int,
        strict: Boolean = false,
        def: Int = 0
): Int {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimensionPixelSize(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads inline fun Resources.Theme.getDrawable(
        @AttrRes id: Int,
        strict: Boolean = false
): Drawable? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDrawable(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads inline fun Resources.Theme.getTextArray(
        @AttrRes id: Int,
        strict: Boolean = false
): Array<CharSequence>? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getTextArray(0)
    } finally {
        a.recycle()
    }
}