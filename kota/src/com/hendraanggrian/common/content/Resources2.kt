@file:JvmName("Resources2")
@file:Suppress("NOTHING_TO_INLINE")

package com.hendraanggrian.common.content

import android.annotation.SuppressLint
import android.app.Fragment
import android.content.Context
import android.content.res.*
import android.graphics.Movie
import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.support.v4.content.ContextCompat
import android.util.TypedValue
import com.hendraanggrian.common.annotation.Dp
import com.hendraanggrian.common.app.getContext2
import java.io.InputStream

@Px inline fun @receiver:Dp Int.toPx() = (this * Resources.getSystem().displayMetrics.density).toInt()
@Dp inline fun @receiver:Px Int.toDp() = (this / Resources.getSystem().displayMetrics.density).toInt()

@AnyRes inline fun String.toId(context: Context, resType: String) = toId(context.resources, resType, context.packageName)
@AnyRes inline fun String.toId(res: Resources, resType: String, packageName: String) = res.getIdentifier(this, resType, packageName)

@JvmOverloads inline fun Context.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = if (def != null) resources.getText(id, def)!! else getText(id)
@JvmOverloads inline fun Fragment.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = if (def != null) resources.getText(id, def)!! else getText(id)
@JvmOverloads inline fun android.support.v4.app.Fragment.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = if (def != null) resources.getText(id, def) else getText(id)

inline fun Context.getQuantityText(@PluralsRes id: Int, quantity: Int): CharSequence = resources.getQuantityText(id, quantity)
inline fun Fragment.getQuantityText(@PluralsRes id: Int, quantity: Int): CharSequence = resources.getQuantityText(id, quantity)
inline fun android.support.v4.app.Fragment.getQuantityText(@PluralsRes id: Int, quantity: Int): CharSequence = resources.getQuantityText(id, quantity)

inline fun Context.getTextArray(@ArrayRes id: Int): Array<CharSequence> = resources.getTextArray(id)
inline fun Fragment.getTextArray(@ArrayRes id: Int): Array<CharSequence> = resources.getTextArray(id)
inline fun android.support.v4.app.Fragment.getTextArray(@ArrayRes id: Int): Array<CharSequence> = resources.getTextArray(id)

@JvmOverloads inline fun Context.getQuantityString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = if (formatArgs.isNotEmpty()) resources.getQuantityString(id, quantity, formatArgs) else resources.getQuantityString(id, quantity)
@JvmOverloads inline fun Fragment.getQuantityString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = if (formatArgs.isNotEmpty()) resources.getQuantityString(id, quantity, formatArgs) else resources.getQuantityString(id, quantity)
@JvmOverloads inline fun android.support.v4.app.Fragment.getQuantityString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = if (formatArgs.isNotEmpty()) resources.getQuantityString(id, quantity, formatArgs) else resources.getQuantityString(id, quantity)

inline fun Context.getStringArray(@ArrayRes id: Int): Array<String> = resources.getStringArray(id)
inline fun Fragment.getStringArray(@ArrayRes id: Int): Array<String> = resources.getStringArray(id)
inline fun android.support.v4.app.Fragment.getStringArray(@ArrayRes id: Int): Array<String> = resources.getStringArray(id)

inline fun Context.getInteger(@IntegerRes id: Int): Int = resources.getInteger(id)
inline fun Fragment.getInteger(@IntegerRes id: Int): Int = resources.getInteger(id)
inline fun android.support.v4.app.Fragment.getInteger(@IntegerRes id: Int): Int = resources.getInteger(id)

inline fun Context.getIntArray(@ArrayRes id: Int): IntArray = resources.getIntArray(id)
inline fun Fragment.getIntArray(@ArrayRes id: Int): IntArray = resources.getIntArray(id)
inline fun android.support.v4.app.Fragment.getIntArray(@ArrayRes id: Int): IntArray = resources.getIntArray(id)

@SuppressLint("Recycle") inline fun Context.obtainTypedArray(@ArrayRes id: Int): TypedArray = resources.obtainTypedArray(id)
@SuppressLint("Recycle") inline fun Fragment.obtainTypedArray(@ArrayRes id: Int): TypedArray = resources.obtainTypedArray(id)
@SuppressLint("Recycle") inline fun android.support.v4.app.Fragment.obtainTypedArray(@ArrayRes id: Int): TypedArray = resources.obtainTypedArray(id)

inline fun Context.getDimension(@DimenRes id: Int): Float = resources.getDimension(id)
inline fun Fragment.getDimension(@DimenRes id: Int): Float = resources.getDimension(id)
inline fun android.support.v4.app.Fragment.getDimension(@DimenRes id: Int): Float = resources.getDimension(id)

inline fun Context.getDimensionPixelOffset(@DimenRes id: Int): Int = resources.getDimensionPixelOffset(id)
inline fun Fragment.getDimensionPixelOffset(@DimenRes id: Int): Int = resources.getDimensionPixelOffset(id)
inline fun android.support.v4.app.Fragment.getDimensionPixelOffset(@DimenRes id: Int): Int = resources.getDimensionPixelOffset(id)

inline fun Context.getDimensionPixelSize(@DimenRes id: Int): Int = resources.getDimensionPixelSize(id)
inline fun Fragment.getDimensionPixelSize(@DimenRes id: Int): Int = resources.getDimensionPixelSize(id)
inline fun android.support.v4.app.Fragment.getDimensionPixelSize(@DimenRes id: Int): Int = resources.getDimensionPixelSize(id)

inline fun Context.getDrawable2(@DrawableRes id: Int): Drawable = ContextCompat.getDrawable(this, id)
inline fun Fragment.getDrawable2(@DrawableRes id: Int): Drawable = ContextCompat.getDrawable(getContext2(), id)
inline fun android.support.v4.app.Fragment.getDrawable2(@DrawableRes id: Int): Drawable = ContextCompat.getDrawable(context, id)

inline fun Context.getMovie(@RawRes id: Int): Movie = resources.getMovie(id)
inline fun Fragment.getMovie(@RawRes id: Int): Movie = resources.getMovie(id)
inline fun android.support.v4.app.Fragment.getMovie(@RawRes id: Int): Movie = resources.getMovie(id)

@ColorInt inline fun Context.getColor2(@ColorRes id: Int): Int = ContextCompat.getColor(this, id)
@ColorInt inline fun Fragment.getColor2(@ColorRes id: Int): Int = ContextCompat.getColor(getContext2(), id)
@ColorInt inline fun android.support.v4.app.Fragment.getColor2(@ColorRes id: Int): Int = ContextCompat.getColor(context, id)

inline fun Context.getColorStateList2(@ColorRes id: Int): ColorStateList = ContextCompat.getColorStateList(this, id)
inline fun Fragment.getColorStateList2(@ColorRes id: Int): ColorStateList = ContextCompat.getColorStateList(getContext2(), id)
inline fun android.support.v4.app.Fragment.getColorStateList2(@ColorRes id: Int): ColorStateList = ContextCompat.getColorStateList(context, id)

inline fun Context.getBoolean(@BoolRes id: Int): Boolean = resources.getBoolean(id)
inline fun Fragment.getBoolean(@BoolRes id: Int): Boolean = resources.getBoolean(id)
inline fun android.support.v4.app.Fragment.getBoolean(@BoolRes id: Int): Boolean = resources.getBoolean(id)

inline fun Context.getLayout(@LayoutRes id: Int): XmlResourceParser = resources.getLayout(id)
inline fun Fragment.getLayout(@LayoutRes id: Int): XmlResourceParser = resources.getLayout(id)
inline fun android.support.v4.app.Fragment.getLayout(@LayoutRes id: Int): XmlResourceParser = resources.getLayout(id)

inline fun Context.getAnimation(@AnimRes id: Int): XmlResourceParser = resources.getAnimation(id)
inline fun Fragment.getAnimation(@AnimRes id: Int): XmlResourceParser = resources.getAnimation(id)
inline fun android.support.v4.app.Fragment.getAnimation(@AnimRes id: Int): XmlResourceParser = resources.getAnimation(id)

inline fun Context.getXml(@XmlRes id: Int): XmlResourceParser = resources.getXml(id)
inline fun Fragment.getXml(@XmlRes id: Int): XmlResourceParser = resources.getXml(id)
inline fun android.support.v4.app.Fragment.getXml(@XmlRes id: Int): XmlResourceParser = resources.getXml(id)

@JvmOverloads inline fun Context.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = if (value == null) resources.openRawResource(id, value) else resources.openRawResource(id)
@JvmOverloads inline fun Fragment.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = if (value == null) resources.openRawResource(id, value) else resources.openRawResource(id)
@JvmOverloads inline fun android.support.v4.app.Fragment.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = if (value == null) resources.openRawResource(id, value) else resources.openRawResource(id)

inline fun Context.openRawFd(@RawRes id: Int): AssetFileDescriptor = resources.openRawResourceFd(id)
inline fun Fragment.openRawFd(@RawRes id: Int): AssetFileDescriptor = resources.openRawResourceFd(id)
inline fun android.support.v4.app.Fragment.openRawFd(@RawRes id: Int): AssetFileDescriptor = resources.openRawResourceFd(id)

inline fun Context.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = resources.getFraction(id, base, pbase)
inline fun Fragment.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = resources.getFraction(id, base, pbase)
inline fun android.support.v4.app.Fragment.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = resources.getFraction(id, base, pbase)