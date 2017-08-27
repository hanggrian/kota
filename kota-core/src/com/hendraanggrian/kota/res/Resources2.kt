@file:JvmName("Resources2")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.res

import android.annotation.SuppressLint
import android.app.Fragment
import android.content.Context
import android.content.res.*
import android.graphics.Movie
import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.support.v4.content.ContextCompat
import android.util.DisplayMetrics
import android.util.TypedValue
import java.io.InputStream

inline val Fragment.configuration: Configuration get() = resources.configuration
inline val Context.configuration: Configuration get() = resources.configuration

inline val Fragment.displayMetrics: DisplayMetrics get() = resources.displayMetrics
inline val Context.displayMetrics: DisplayMetrics get() = resources.displayMetrics

@JvmOverloads inline fun Fragment.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = activity.getText(id, def)
@JvmOverloads inline fun Context.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = when {
    def != null -> resources.getText(id, def)!!
    else -> resources.getText(id)
}

inline fun Fragment.getQuantityText(@PluralsRes id: Int, quantity: Int): CharSequence = activity.getQuantityText(id, quantity)
inline fun Context.getQuantityText(@PluralsRes id: Int, quantity: Int): CharSequence = resources.getQuantityText(id, quantity)

inline fun Fragment.getTextArray(@ArrayRes id: Int): Array<CharSequence> = activity.getTextArray(id)
inline fun Context.getTextArray(@ArrayRes id: Int): Array<CharSequence> = resources.getTextArray(id)

@JvmOverloads inline fun Fragment.getQuantityString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = activity.getQuantityString(id, quantity, formatArgs)
@JvmOverloads inline fun Context.getQuantityString(
        @PluralsRes id: Int,
        quantity: Int,
        vararg formatArgs: Any = emptyArray()
): String = when {
    formatArgs.isNotEmpty() -> resources.getQuantityString(id, quantity, formatArgs)
    else -> resources.getQuantityString(id, quantity)
}

inline fun Fragment.getStringArray(@ArrayRes id: Int): Array<String> = activity.getStringArray(id)
inline fun Context.getStringArray(@ArrayRes id: Int): Array<String> = resources.getStringArray(id)

inline fun Fragment.getInteger(@IntegerRes id: Int): Int = activity.getInteger(id)
inline fun Context.getInteger(@IntegerRes id: Int): Int = resources.getInteger(id)

inline fun Fragment.getIntArray(@ArrayRes id: Int): IntArray = activity.getIntArray(id)
inline fun Context.getIntArray(@ArrayRes id: Int): IntArray = resources.getIntArray(id)

@SuppressLint("Recycle") inline fun Fragment.obtainTypedArray(@ArrayRes id: Int): TypedArray = activity.obtainTypedArray(id)
@SuppressLint("Recycle") inline fun Context.obtainTypedArray(@ArrayRes id: Int): TypedArray = resources.obtainTypedArray(id)

inline fun Fragment.getDimension(@DimenRes id: Int): Float = activity.getDimension(id)
inline fun Context.getDimension(@DimenRes id: Int): Float = resources.getDimension(id)

inline fun Fragment.getDimensionPixelOffset(@DimenRes id: Int): Int = activity.getDimensionPixelOffset(id)
inline fun Context.getDimensionPixelOffset(@DimenRes id: Int): Int = resources.getDimensionPixelOffset(id)

inline fun Fragment.getDimensionPixelSize(@DimenRes id: Int): Int = activity.getDimensionPixelSize(id)
inline fun Context.getDimensionPixelSize(@DimenRes id: Int): Int = resources.getDimensionPixelSize(id)

inline fun Fragment.getDrawable2(@DrawableRes id: Int): Drawable = activity.getDrawable2(id)
inline fun Context.getDrawable2(@DrawableRes id: Int): Drawable = ContextCompat.getDrawable(this, id)

inline fun Fragment.getMovie(@RawRes id: Int): Movie = activity.getMovie(id)
inline fun Context.getMovie(@RawRes id: Int): Movie = resources.getMovie(id)

@ColorInt inline fun Fragment.getColor2(@ColorRes id: Int): Int = activity.getColor2(id)
@ColorInt inline fun Context.getColor2(@ColorRes id: Int): Int = ContextCompat.getColor(this, id)

inline fun Fragment.getColorStateList2(@ColorRes id: Int): ColorStateList = activity.getColorStateList2(id)
inline fun Context.getColorStateList2(@ColorRes id: Int): ColorStateList = ContextCompat.getColorStateList(this, id)

inline fun Fragment.getBoolean(@BoolRes id: Int): Boolean = activity.getBoolean(id)
inline fun Context.getBoolean(@BoolRes id: Int): Boolean = resources.getBoolean(id)

inline fun Fragment.getLayout(@LayoutRes id: Int): XmlResourceParser = activity.getLayout(id)
inline fun Context.getLayout(@LayoutRes id: Int): XmlResourceParser = resources.getLayout(id)

inline fun Fragment.getAnimation(@AnimRes id: Int): XmlResourceParser = activity.getAnimation(id)
inline fun Context.getAnimation(@AnimRes id: Int): XmlResourceParser = resources.getAnimation(id)

inline fun Fragment.getXml(@XmlRes id: Int): XmlResourceParser = activity.getXml(id)
inline fun Context.getXml(@XmlRes id: Int): XmlResourceParser = resources.getXml(id)

@JvmOverloads inline fun Fragment.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = activity.openRaw(id, value)
@JvmOverloads inline fun Context.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = if (value == null) resources.openRawResource(id, value) else resources.openRawResource(id)

inline fun Fragment.openRawFd(@RawRes id: Int): AssetFileDescriptor = activity.openRawFd(id)
inline fun Context.openRawFd(@RawRes id: Int): AssetFileDescriptor = resources.openRawResourceFd(id)

inline fun Fragment.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = activity.getFraction(id, base, pbase)
inline fun Context.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = resources.getFraction(id, base, pbase)