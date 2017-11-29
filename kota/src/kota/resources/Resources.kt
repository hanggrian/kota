@file:JvmMultifileClass
@file:JvmName("ResourcesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.resources

import android.annotation.SuppressLint
import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.content.res.*
import android.graphics.Movie
import android.os.Build.VERSION.SDK_INT
import android.support.annotation.*
import android.util.DisplayMetrics
import android.util.TypedValue
import java.io.InputStream

inline val Context.configuration: Configuration get() = resources.configuration
inline val Fragment.configuration: Configuration get() = activity.configuration
inline val Dialog.configuration: Configuration get() = context.configuration

inline val Context.displayMetrics: DisplayMetrics get() = resources.displayMetrics
inline val Fragment.displayMetrics: DisplayMetrics get() = activity.displayMetrics
inline val Dialog.displayMetrics: DisplayMetrics get() = context.displayMetrics

@JvmOverloads inline fun Context.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = if (def != null) resources.getText(id, def)!! else resources.getText(id)
@JvmOverloads inline fun Fragment.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = activity.getText(id, def)
@JvmOverloads inline fun Dialog.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = context.getText(id, def)

inline fun Context.getQtyText(@PluralsRes id: Int, quantity: Int): CharSequence = resources.getQuantityText(id, quantity)
inline fun Fragment.getQtyText(@PluralsRes id: Int, quantity: Int): CharSequence = activity.getQtyText(id, quantity)
inline fun Dialog.getQtyText(@PluralsRes id: Int, quantity: Int): CharSequence = context.getQtyText(id, quantity)

inline fun Context.getTextArray(@ArrayRes id: Int): Array<CharSequence> = resources.getTextArray(id)
inline fun Fragment.getTextArray(@ArrayRes id: Int): Array<CharSequence> = activity.getTextArray(id)
inline fun Dialog.getTextArray(@ArrayRes id: Int): Array<CharSequence> = context.getTextArray(id)

@JvmOverloads inline fun Context.getQtyString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = if (formatArgs.isNotEmpty()) resources.getQuantityString(id, quantity, formatArgs) else resources.getQuantityString(id, quantity)
@JvmOverloads inline fun Fragment.getQtyString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = activity.getQtyString(id, quantity, formatArgs)
@JvmOverloads inline fun Dialog.getQtyString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = context.getQtyString(id, quantity, formatArgs)

inline fun Context.getStringArray(@ArrayRes id: Int): Array<String> = resources.getStringArray(id)
inline fun Fragment.getStringArray(@ArrayRes id: Int): Array<String> = activity.getStringArray(id)
inline fun Dialog.getStringArray(@ArrayRes id: Int): Array<String> = context.getStringArray(id)

inline fun Context.getInt(@IntegerRes id: Int): Int = resources.getInteger(id)
inline fun Fragment.getInt(@IntegerRes id: Int): Int = activity.getInt(id)
inline fun Dialog.getInt(@IntegerRes id: Int): Int = context.getInt(id)

inline fun Context.getIntArray(@ArrayRes id: Int): IntArray = resources.getIntArray(id)
inline fun Fragment.getIntArray(@ArrayRes id: Int): IntArray = activity.getIntArray(id)
inline fun Dialog.getIntArray(@ArrayRes id: Int): IntArray = context.getIntArray(id)

@SuppressLint("Recycle") inline fun Context.obtainTypedArray(@ArrayRes id: Int): TypedArray = resources.obtainTypedArray(id)
@SuppressLint("Recycle") inline fun Fragment.obtainTypedArray(@ArrayRes id: Int): TypedArray = activity.obtainTypedArray(id)
@SuppressLint("Recycle") inline fun Dialog.obtainTypedArray(@ArrayRes id: Int): TypedArray = context.obtainTypedArray(id)

inline fun Context.getDimen(@DimenRes id: Int): Float = resources.getDimension(id)
inline fun Fragment.getDimen(@DimenRes id: Int): Float = activity.getDimen(id)
inline fun Dialog.getDimen(@DimenRes id: Int): Float = context.getDimen(id)

inline fun Context.getDimenPxOffset(@DimenRes id: Int): Int = resources.getDimensionPixelOffset(id)
inline fun Fragment.getDimenPxOffset(@DimenRes id: Int): Int = activity.getDimenPxOffset(id)
inline fun Dialog.getDimenPxOffset(@DimenRes id: Int): Int = context.getDimenPxOffset(id)

inline fun Context.getDimenPxSize(@DimenRes id: Int): Int = resources.getDimensionPixelSize(id)
inline fun Fragment.getDimenPxSize(@DimenRes id: Int): Int = activity.getDimenPxSize(id)
inline fun Dialog.getDimenPxSize(@DimenRes id: Int): Int = context.getDimenPxSize(id)

inline fun Context.getMovie(@RawRes id: Int): Movie = resources.getMovie(id)
inline fun Fragment.getMovie(@RawRes id: Int): Movie = activity.getMovie(id)
inline fun Dialog.getMovie(@RawRes id: Int): Movie = context.getMovie(id)

@ColorInt inline fun Context.getColor2(@ColorRes id: Int): Int = if (SDK_INT < 23) @Suppress("DEPRECATION") resources.getColor(id) else getColor(id)
@ColorInt inline fun Fragment.getColor2(@ColorRes id: Int): Int = activity.getColor2(id)
@ColorInt inline fun Dialog.getColor2(@ColorRes id: Int): Int = context.getColor2(id)

inline fun Context.getColorStateList2(@ColorRes id: Int): ColorStateList = if (SDK_INT < 23) @Suppress("DEPRECATION") resources.getColorStateList(id) else getColorStateList(id)
inline fun Fragment.getColorStateList2(@ColorRes id: Int): ColorStateList = activity.getColorStateList2(id)
inline fun Dialog.getColorStateList2(@ColorRes id: Int): ColorStateList = context.getColorStateList2(id)

inline fun Context.getBoolean(@BoolRes id: Int): Boolean = resources.getBoolean(id)
inline fun Fragment.getBoolean(@BoolRes id: Int): Boolean = activity.getBoolean(id)
inline fun Dialog.getBoolean(@BoolRes id: Int): Boolean = context.getBoolean(id)

inline fun Context.getLayout(@LayoutRes id: Int): XmlResourceParser = resources.getLayout(id)
inline fun Fragment.getLayout(@LayoutRes id: Int): XmlResourceParser = activity.getLayout(id)
inline fun Dialog.getLayout(@LayoutRes id: Int): XmlResourceParser = context.getLayout(id)

inline fun Context.getAnimation(@AnimRes id: Int): XmlResourceParser = resources.getAnimation(id)
inline fun Fragment.getAnimation(@AnimRes id: Int): XmlResourceParser = activity.getAnimation(id)
inline fun Dialog.getAnimation(@AnimRes id: Int): XmlResourceParser = context.getAnimation(id)

inline fun Context.getXml(@XmlRes id: Int): XmlResourceParser = resources.getXml(id)
inline fun Fragment.getXml(@XmlRes id: Int): XmlResourceParser = activity.getXml(id)
inline fun Dialog.getXml(@XmlRes id: Int): XmlResourceParser = context.getXml(id)

@JvmOverloads inline fun Context.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = if (value == null) resources.openRawResource(id, value) else resources.openRawResource(id)
@JvmOverloads inline fun Fragment.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = activity.openRaw(id, value)
@JvmOverloads inline fun Dialog.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = context.openRaw(id, value)

inline fun Context.openRawFd(@RawRes id: Int): AssetFileDescriptor = resources.openRawResourceFd(id)
inline fun Fragment.openRawFd(@RawRes id: Int): AssetFileDescriptor = activity.openRawFd(id)
inline fun Dialog.openRawFd(@RawRes id: Int): AssetFileDescriptor = context.openRawFd(id)

inline fun Context.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = resources.getFraction(id, base, pbase)
inline fun Fragment.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = activity.getFraction(id, base, pbase)
inline fun Dialog.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = context.getFraction(id, base, pbase)