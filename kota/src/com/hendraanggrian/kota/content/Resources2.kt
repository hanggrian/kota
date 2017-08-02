@file:JvmName("Resources2")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.support.annotation.*
import android.support.v4.content.ContextCompat
import android.util.TypedValue
import com.hendraanggrian.kota.annotation.Dp

@Px inline fun Int.toPx() = (this * Resources.getSystem().displayMetrics.density).toInt()
@Dp inline fun Int.toDp() = (this / Resources.getSystem().displayMetrics.density).toInt()

@AnyRes inline fun String.toId(context: Context, resType: String) = toId(context.resources, resType, context.packageName)
@AnyRes inline fun String.toId(res: Resources, resType: String, packageName: String) = res.getIdentifier(this, resType, packageName)

@JvmOverloads
inline fun Context.getText(@StringRes id: Int, def: CharSequence? = null) = if (def != null) resources.getText(id, def)!! else getText(id)!!

inline fun Context.getQuantityText(@PluralsRes id: Int, quantity: Int) = resources.getQuantityText(id, quantity)!!

inline fun Context.getTextArray(@ArrayRes id: Int): Array<CharSequence> = resources.getTextArray(id)!!

@JvmOverloads
inline fun Context.getQuantityString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()) = if (formatArgs.isNotEmpty()) resources.getQuantityString(id, quantity, formatArgs)!! else resources.getQuantityString(id, quantity)!!

inline fun Context.getStringArray(@ArrayRes id: Int): Array<String> = resources.getStringArray(id)!!

inline fun Context.getInteger(@IntegerRes id: Int) = resources.getInteger(id)

inline fun Context.getIntArray(@ArrayRes id: Int) = resources.getIntArray(id)!!

@SuppressLint("Recycle")
inline fun Context.obtainTypedArray(@ArrayRes id: Int) = resources.obtainTypedArray(id)!!

inline fun Context.getDimension(@DimenRes id: Int) = resources.getDimension(id)

inline fun Context.getDimensionPixelOffset(@DimenRes id: Int) = resources.getDimensionPixelOffset(id)

inline fun Context.getDimensionPixelSize(@DimenRes id: Int) = resources.getDimensionPixelSize(id)

inline fun Context.getDrawable2(@DrawableRes id: Int) = ContextCompat.getDrawable(this, id)!!

inline fun Context.getMovie(@RawRes id: Int) = resources.getMovie(id)!!

@ColorInt
inline fun Context.getColor2(@ColorRes id: Int) = ContextCompat.getColor(this, id)

inline fun Context.getColorStateList2(@ColorRes id: Int) = ContextCompat.getColorStateList(this, id)!!

inline fun Context.getBoolean(@BoolRes id: Int) = resources.getBoolean(id)

inline fun Context.getLayout(@LayoutRes id: Int) = resources.getLayout(id)!!

inline fun Context.getAnimation(@AnimRes id: Int) = resources.getAnimation(id)!!

inline fun Context.getXml(@XmlRes id: Int) = resources.getXml(id)!!

@JvmOverloads
inline fun Context.openRaw(@RawRes id: Int, value: TypedValue? = null) = if (value == null) resources.openRawResource(id, value)!! else resources.openRawResource(id)!!

inline fun Context.openRawFd(@RawRes id: Int) = resources.openRawResourceFd(id)!!

inline fun Context.getFraction(@FractionRes id: Int, base: Int, pbase: Int) = resources.getFraction(id, base, pbase)