/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

package com.hendraanggrian.support.utils.content

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.*
import android.graphics.Movie
import android.graphics.drawable.Drawable
import android.support.annotation.AnyRes
import android.support.annotation.ColorInt
import android.support.annotation.Px
import android.support.v4.content.ContextCompat
import android.util.TypedValue
import com.hendraanggrian.support.utils.annotation.Dp
import java.io.InputStream

@Px
fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

@Dp
fun Int.toDp(): Int = (this / Resources.getSystem().displayMetrics.density).toInt()

@AnyRes fun String.toId(context: Context, resType: String): Int = toId(context.resources, resType, context.packageName)
@AnyRes fun String.toId(res: Resources, resType: String, packageName: String): Int = res.getIdentifier(this, resType, packageName)

// string

@JvmOverloads fun Int.text(ctx: Context, def: CharSequence? = null): CharSequence = text(ctx.resources, def)
@JvmOverloads fun Int.text(res: Resources, def: CharSequence? = null): CharSequence {
    return if (def != null)
        res.getText(this, def)
    else
        res.getText(this)
}

fun Int.quantityText(ctx: Context, quantity: Int): CharSequence = quantityText(ctx.resources, quantity)
fun Int.quantityText(res: Resources, quantity: Int): CharSequence = res.getQuantityText(this, quantity)

fun Int.textArray(ctx: Context): Array<CharSequence> = textArray(ctx.resources)
fun Int.textArray(res: Resources): Array<CharSequence> = res.getTextArray(this)

@JvmOverloads fun Int.string(ctx: Context, vararg formatArgs: Any = emptyArray()): String = string(ctx.resources, formatArgs)
@JvmOverloads fun Int.string(res: Resources, vararg formatArgs: Any = emptyArray()): String {
    return if (formatArgs.isEmpty())
        res.getString(this, formatArgs)
    else
        res.getString(this)
}

@JvmOverloads fun Int.quantityString(ctx: Context, quantity: Int, vararg formatArgs: Any = emptyArray()): String = quantityString(ctx.resources, quantity, formatArgs)
@JvmOverloads fun Int.quantityString(res: Resources, quantity: Int, vararg formatArgs: Any = emptyArray()): String {
    return if (formatArgs.isEmpty())
        res.getQuantityString(this, quantity, formatArgs)
    else
        res.getQuantityString(this, quantity)
}

fun Int.stringArray(ctx: Context): Array<String> = stringArray(ctx.resources)
fun Int.stringArray(res: Resources): Array<String> = res.getStringArray(this)

// int

fun Int.int(ctx: Context): Int = int(ctx.resources)
fun Int.int(res: Resources): Int = res.getInteger(this)

fun Int.intArray(ctx: Context): IntArray = intArray(ctx.resources)
fun Int.intArray(res: Resources): IntArray = res.getIntArray(this)

fun Int.typedArray(ctx: Context): TypedArray = typedArray(ctx.resources)
@SuppressLint("Recycle") fun Int.typedArray(res: Resources): TypedArray = res.obtainTypedArray(this)

fun Int.dimen(ctx: Context): Float = dimen(ctx.resources)
fun Int.dimen(res: Resources): Float = res.getDimension(this)

fun Int.dimenPixelOffset(ctx: Context): Int = dimenPixelOffset(ctx.resources)
fun Int.dimenPixelOffset(res: Resources): Int = res.getDimensionPixelOffset(this)

fun Int.dimenPixelSize(ctx: Context): Int = dimenPixelSize(ctx.resources)
fun Int.dimenPixelSize(res: Resources): Int = res.getDimensionPixelSize(this)

fun Int.drawable(ctx: Context): Drawable = ContextCompat.getDrawable(ctx, this)

fun Int.movie(ctx: Context): Movie = movie(ctx.resources)
fun Int.movie(res: Resources): Movie = res.getMovie(this)

@ColorInt fun Int.color(ctx: Context): Int = ContextCompat.getColor(ctx, this)
fun Int.colorStateList(ctx: Context): ColorStateList = ContextCompat.getColorStateList(ctx, this)

fun Int.boolean(ctx: Context): Boolean = boolean(ctx.resources)
fun Int.boolean(res: Resources): Boolean = res.getBoolean(this)

fun Int.layout(ctx: Context): XmlResourceParser = layout(ctx.resources)
fun Int.layout(res: Resources): XmlResourceParser = res.getLayout(this)

fun Int.animation(ctx: Context): XmlResourceParser = animation(ctx.resources)
fun Int.animation(res: Resources): XmlResourceParser = res.getAnimation(this)

fun Int.xml(ctx: Context): XmlResourceParser = xml(ctx.resources)
fun Int.xml(res: Resources): XmlResourceParser = res.getXml(this)

@JvmOverloads fun Int.raw(ctx: Context, value: TypedValue? = null): InputStream = raw(ctx.resources, value)
@JvmOverloads fun Int.raw(res: Resources, value: TypedValue? = null): InputStream {
    return if (value == null)
        res.openRawResource(this, value)
    else
        res.openRawResource(this)
}

fun Int.rawFd(ctx: Context): AssetFileDescriptor = rawFd(ctx.resources)
fun Int.rawFd(res: Resources): AssetFileDescriptor = res.openRawResourceFd(this)

fun Int.fraction(ctx: Context, base: Int, pbase: Int): Float = fraction(ctx.resources, base, pbase)
fun Int.fraction(res: Resources, base: Int, pbase: Int): Float = res.getFraction(this, base, pbase)