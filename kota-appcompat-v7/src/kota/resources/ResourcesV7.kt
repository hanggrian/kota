@file:JvmMultifileClass
@file:JvmName("ResourcesV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.resources

import android.annotation.SuppressLint
import android.content.res.*
import android.graphics.Movie
import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.support.v7.app.AppCompatDialog
import android.util.DisplayMetrics
import android.util.TypedValue
import java.io.InputStream

inline val AppCompatDialog.configuration: Configuration get() = context.configuration

inline val AppCompatDialog.displayMetrics: DisplayMetrics get() = context.displayMetrics

@JvmOverloads
inline fun AppCompatDialog.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = context.getText(id, def)

inline fun AppCompatDialog.getQuantityText(@PluralsRes id: Int, quantity: Int): CharSequence = context.getQuantityText(id, quantity)

inline fun AppCompatDialog.getTextArray(@ArrayRes id: Int): Array<CharSequence> = context.getTextArray(id)

@JvmOverloads
inline fun AppCompatDialog.getQuantityString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = context.getQuantityString(id, quantity, formatArgs)

inline fun AppCompatDialog.getStringArray(@ArrayRes id: Int): Array<String> = context.getStringArray(id)

inline fun AppCompatDialog.getInteger(@IntegerRes id: Int): Int = context.getInteger(id)

inline fun AppCompatDialog.getIntArray(@ArrayRes id: Int): IntArray = context.getIntArray(id)

@SuppressLint("Recycle")
inline fun AppCompatDialog.obtainTypedArray(@ArrayRes id: Int): TypedArray = context.obtainTypedArray(id)

inline fun AppCompatDialog.getDimension(@DimenRes id: Int): Float = context.getDimension(id)

inline fun AppCompatDialog.getDimensionPixelOffset(@DimenRes id: Int): Int = context.getDimensionPixelOffset(id)

inline fun AppCompatDialog.getDimensionPixelSize(@DimenRes id: Int): Int = context.getDimensionPixelSize(id)

inline fun AppCompatDialog.getDrawable2(@DrawableRes id: Int): Drawable = context.getDrawable2(id)

inline fun AppCompatDialog.getMovie(@RawRes id: Int): Movie = context.getMovie(id)

@ColorInt
inline fun AppCompatDialog.getColor2(@ColorRes id: Int): Int = context.getColor2(id)

inline fun AppCompatDialog.getColorStateList2(@ColorRes id: Int): ColorStateList = context.getColorStateList2(id)

inline fun AppCompatDialog.getBoolean(@BoolRes id: Int): Boolean = context.getBoolean(id)

inline fun AppCompatDialog.getLayout(@LayoutRes id: Int): XmlResourceParser = context.getLayout(id)

inline fun AppCompatDialog.getAnimation(@AnimRes id: Int): XmlResourceParser = context.getAnimation(id)

inline fun AppCompatDialog.getXml(@XmlRes id: Int): XmlResourceParser = context.getXml(id)

@JvmOverloads
inline fun AppCompatDialog.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = context.openRaw(id, value)

inline fun AppCompatDialog.openRawFd(@RawRes id: Int): AssetFileDescriptor = context.openRawFd(id)

inline fun AppCompatDialog.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = context.getFraction(id, base, pbase)