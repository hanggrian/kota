@file:JvmMultifileClass
@file:JvmName("ResourcesV4Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.resources

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.res.*
import android.graphics.Movie
import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.util.DisplayMetrics
import android.util.TypedValue
import java.io.InputStream

inline val Fragment.configuration: Configuration get() = resources.configuration

inline val Fragment.displayMetrics: DisplayMetrics get() = resources.displayMetrics

@JvmOverloads
inline fun Fragment.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = context!!.getText(id, def)

inline fun Fragment.getQuantityText(@PluralsRes id: Int, quantity: Int): CharSequence = context!!.getQuantityText(id, quantity)

inline fun Fragment.getTextArray(@ArrayRes id: Int): Array<CharSequence> = context!!.getTextArray(id)

@JvmOverloads
inline fun Fragment.getQuantityString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = context!!.getQuantityString(id, quantity, formatArgs)

inline fun Fragment.getStringArray(@ArrayRes id: Int): Array<String> = context!!.getStringArray(id)

inline fun Fragment.getInteger(@IntegerRes id: Int): Int = context!!.getInteger(id)

inline fun Fragment.getIntArray(@ArrayRes id: Int): IntArray = context!!.getIntArray(id)

@SuppressLint("Recycle")
inline fun Fragment.obtainTypedArray(@ArrayRes id: Int): TypedArray = context!!.obtainTypedArray(id)

inline fun Fragment.getDimension(@DimenRes id: Int): Float = context!!.getDimension(id)

inline fun Fragment.getDimensionPixelOffset(@DimenRes id: Int): Int = context!!.getDimensionPixelOffset(id)

inline fun Fragment.getDimensionPixelSize(@DimenRes id: Int): Int = context!!.getDimensionPixelSize(id)

inline fun Context.getDrawable2(@DrawableRes id: Int): Drawable = ContextCompat.getDrawable(this, id)!!
inline fun android.app.Fragment.getDrawable2(@DrawableRes id: Int): Drawable = activity.getDrawable2(id)
inline fun Fragment.getDrawable2(@DrawableRes id: Int): Drawable = context!!.getDrawable2(id)
inline fun Dialog.getDrawable2(@DrawableRes id: Int): Drawable = context!!.getDrawable2(id)

inline fun Fragment.getMovie(@RawRes id: Int): Movie = context!!.getMovie(id)

@ColorInt
inline fun Fragment.getColor2(@ColorRes id: Int): Int = context!!.getColor2(id)

inline fun Fragment.getColorStateList2(@ColorRes id: Int): ColorStateList = context!!.getColorStateList2(id)

inline fun Fragment.getBoolean(@BoolRes id: Int): Boolean = context!!.getBoolean(id)

inline fun Fragment.getLayout(@LayoutRes id: Int): XmlResourceParser = context!!.getLayout(id)

inline fun Fragment.getAnimation(@AnimRes id: Int): XmlResourceParser = context!!.getAnimation(id)

inline fun Fragment.getXml(@XmlRes id: Int): XmlResourceParser = context!!.getXml(id)

@JvmOverloads
inline fun Fragment.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = context!!.openRaw(id, value)

inline fun Fragment.openRawFd(@RawRes id: Int): AssetFileDescriptor = context!!.openRawFd(id)

inline fun Fragment.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = context!!.getFraction(id, base, pbase)