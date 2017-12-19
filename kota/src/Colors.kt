@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.ColorSpace
import android.support.annotation.*
import android.support.annotation.IntRange

@ColorInt
inline fun colorIntOf(colorString: String) = Color.parseColor(colorString)

@ColorInt
@JvmOverloads
inline fun colorIntOf(
        @IntRange(from = 0, to = 255) r: Int,
        @IntRange(from = 0, to = 255) g: Int,
        @IntRange(from = 0, to = 255) b: Int,
        @IntRange(from = 0, to = 255) a: Int = 0xFF
): Int = Color.argb(a, r, g, b)

@ColorInt
@JvmOverloads
@RequiresApi(26)
inline fun colorIntOf(
        @FloatRange(from = 0.0, to = 0.0) r: Float,
        @FloatRange(from = 0.0, to = 0.0) g: Float,
        @FloatRange(from = 0.0, to = 0.0) b: Float,
        @FloatRange(from = 0.0, to = 0.0) a: Float = 0xFF.toFloat()
): Int = Color.argb(a, r, g, b)

@RequiresApi(26) inline fun colorOf(@ColorInt color: Int): Color = Color.valueOf(color)
@RequiresApi(26) inline fun colorOf(color: Long): Color = Color.valueOf(color)
@RequiresApi(26) inline fun colorOf(colorString: String): Color = Color.valueOf(colorIntOf(colorString))

@JvmOverloads
@RequiresApi(26)
inline fun colorOf(
        @FloatRange(from = 0.0, to = 0.0) r: Float,
        @FloatRange(from = 0.0, to = 0.0) g: Float,
        @FloatRange(from = 0.0, to = 0.0) b: Float,
        @FloatRange(from = 0.0, to = 0.0) a: Float = 0xFF.toFloat(),
        colorSpace: ColorSpace? = null
): Color = if (colorSpace != null) Color.valueOf(r, g, b, a, colorSpace) else Color.valueOf(r, g, b, a)

@RequiresApi(26)
inline fun colorOf(
        @Size(min = 4, max = 5) a: FloatArray,
        colorSpace: ColorSpace
): Color = Color.valueOf(a, colorSpace)

inline fun colorStateListOf(@ColorInt color: Int): ColorStateList = ColorStateList.valueOf(color)
inline fun colorStateListOf(colorString: String): ColorStateList = colorStateListOf(colorIntOf(colorString))

inline val @receiver:ColorInt Int.red: Int @IntRange(from = 0, to = 255) get() = Color.red(this)
inline val @receiver:ColorInt Int.green: Int @IntRange(from = 0, to = 255) get() = Color.green(this)
inline val @receiver:ColorInt Int.blue: Int @IntRange(from = 0, to = 255) get() = Color.blue(this)
inline val @receiver:ColorInt Int.alpha: Int @IntRange(from = 0, to = 255) get() = Color.alpha(this)
inline val @receiver:ColorInt Int.luminance: Float @RequiresApi(24) get() = Color.luminance(this)