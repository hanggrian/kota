@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.contents

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.ColorSpace
import android.support.annotation.ColorInt
import android.support.annotation.IntRange
import android.support.annotation.RequiresApi

@ColorInt
inline fun colorIntOf(colorString: String): Int = Color.parseColor(colorString)

@ColorInt
@JvmOverloads
inline fun colorIntOf(
        @IntRange(from = 0, to = 255) r: Int,
        @IntRange(from = 0, to = 255) g: Int,
        @IntRange(from = 0, to = 255) b: Int,
        @IntRange(from = 0, to = 255) a: Int = 0xFF
): Int = Color.argb(a, r, g, b)

@RequiresApi(26)
inline fun colorOf(@ColorInt color: Int): Color = Color.valueOf(color)

@RequiresApi(26)
inline fun colorOf(color: Long): Color = Color.valueOf(color)

@RequiresApi(26)
inline fun colorOf(colorString: String): Color = Color.valueOf(colorIntOf(colorString))

@RequiresApi(26)
@JvmOverloads
inline fun colorOf(r: Float, g: Float, b: Float, a: Float = 0xFF.toFloat(), colorSpace: ColorSpace? = null): Color = when {
    colorSpace != null -> Color.valueOf(r, g, b, a, colorSpace)
    else -> Color.valueOf(r, g, b, a)
}

inline fun colorStateListOf(@ColorInt color: Int): ColorStateList = ColorStateList.valueOf(color)

inline val @receiver:ColorInt Int.red: Int @IntRange(from = 0, to = 255) get() = Color.red(this)
inline val @receiver:ColorInt Int.green: Int @IntRange(from = 0, to = 255) get() = Color.green(this)
inline val @receiver:ColorInt Int.blue: Int @IntRange(from = 0, to = 255) get() = Color.blue(this)
inline val @receiver:ColorInt Int.alpha: Int @IntRange(from = 0, to = 255) get() = Color.alpha(this)
inline val @receiver:ColorInt Int.luminance: Float @RequiresApi(24) get() = Color.luminance(this)