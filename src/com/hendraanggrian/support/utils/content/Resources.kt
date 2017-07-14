package com.hendraanggrian.support.utils.content

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.*
import android.graphics.Movie
import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.support.v4.content.ContextCompat
import android.util.TypedValue
import com.hendraanggrian.support.utils.annotation.Dp
import java.io.InputStream

/**
 * [Context] has some direct access to resources, but not all.
 * Extension functions below are meant to bring full [Resources]' getters to [Context].
 *
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@Px
fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

@Dp
fun Int.toDp(): Int = (this / Resources.getSystem().displayMetrics.density).toInt()

@AnyRes fun String.toId(context: Context, resType: String): Int = toId(context.resources, resType, context.packageName)
@AnyRes fun String.toId(res: Resources, resType: String, packageName: String): Int = res.getIdentifier(this, resType, packageName)

@JvmOverloads
fun Context.getText(@StringRes id: Int, def: CharSequence? = null): CharSequence = if (def != null) resources.getText(id, def) else getText(id)

fun Context.getQuantityText(@PluralsRes id: Int, quantity: Int): CharSequence = resources.getQuantityText(id, quantity)

fun Context.getTextArray(@ArrayRes id: Int): Array<CharSequence> = resources.getTextArray(id)

@JvmOverloads
fun Context.getQuantityString(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any = emptyArray()): String = if (formatArgs.isEmpty()) resources.getQuantityString(id, quantity, formatArgs) else resources.getQuantityString(id, quantity)

fun Context.getStringArray(@ArrayRes id: Int): Array<String> = resources.getStringArray(id)

fun Context.getInteger(@IntegerRes id: Int): Int = resources.getInteger(id)

fun Context.getIntArray(@ArrayRes id: Int): IntArray = resources.getIntArray(id)

@SuppressLint("Recycle")
fun Context.obtainTypedArray(@ArrayRes id: Int): TypedArray = resources.obtainTypedArray(id)

fun Context.getDimension(@DimenRes id: Int): Float = resources.getDimension(id)

fun Context.getDimensionPixelOffset(@DimenRes id: Int): Int = resources.getDimensionPixelOffset(id)

fun Context.getDimensionPixelSize(@DimenRes id: Int): Int = resources.getDimensionPixelSize(id)

fun Context.getDrawable2(@DrawableRes id: Int): Drawable = ContextCompat.getDrawable(this, id)

fun Context.getMovie(@RawRes id: Int): Movie = resources.getMovie(id)

@ColorInt
fun Context.getColor2(@ColorRes id: Int): Int = ContextCompat.getColor(this, id)

fun Context.getColorStateList2(@ColorRes id: Int): ColorStateList = ContextCompat.getColorStateList(this, id)

fun Context.getBoolean(@BoolRes id: Int): Boolean = resources.getBoolean(id)

fun Context.getLayout(@LayoutRes id: Int): XmlResourceParser = resources.getLayout(id)

fun Context.getAnimation(@AnimRes id: Int): XmlResourceParser = resources.getAnimation(id)

fun Context.getXml(@XmlRes id: Int): XmlResourceParser = resources.getXml(id)

@JvmOverloads
fun Context.openRaw(@RawRes id: Int, value: TypedValue? = null): InputStream = if (value == null) resources.openRawResource(id, value) else resources.openRawResource(id)

fun Context.openRawFd(@RawRes id: Int): AssetFileDescriptor = resources.openRawResourceFd(id)

fun Context.getFraction(@FractionRes id: Int, base: Int, pbase: Int): Float = resources.getFraction(id, base, pbase)