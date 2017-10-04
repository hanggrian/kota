@file:JvmName("ColorsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.graphics

import android.annotation.TargetApi
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.ColorSpace
import android.support.annotation.ColorInt
import android.support.annotation.RequiresApi

@ColorInt
inline fun colorIntOf(colorString: String): Int = Color.parseColor(colorString)

@ColorInt
@JvmOverloads
inline fun colorIntOf(r: Int, g: Int, b: Int, a: Int = 0xFF): Int = Color.argb(a, r, g, b)

@TargetApi(26)
@RequiresApi(26)
inline fun colorOf(@ColorInt color: Int): Color = Color.valueOf(color)

@TargetApi(26)
@RequiresApi(26)
inline fun colorOf(color: Long): Color = Color.valueOf(color)

@TargetApi(26)
@RequiresApi(26)
inline fun colorOf(colorString: String): Color = Color.valueOf(colorIntOf(colorString))

@TargetApi(26)
@RequiresApi(26)
@JvmOverloads
inline fun colorOf(r: Float, g: Float, b: Float, a: Float = 0xFF.toFloat(), colorSpace: ColorSpace? = null): Color = when {
    colorSpace != null -> Color.valueOf(r, g, b, a, colorSpace)
    else -> Color.valueOf(r, g, b, a)
}

inline fun colorStateListOf(@ColorInt color: Int): ColorStateList = ColorStateList.valueOf(color)

inline val @receiver:ColorInt Int.red: Int get() = Color.red(this)

inline val @receiver:ColorInt Int.green: Int get() = Color.green(this)

inline val @receiver:ColorInt Int.blue: Int get() = Color.blue(this)

inline val @receiver:ColorInt Int.alpha: Int get() = Color.alpha(this)

inline val @receiver:ColorInt Int.luminance: Float @TargetApi(24) @RequiresApi(24) get() = Color.luminance(this)