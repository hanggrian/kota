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
import java.io.InputStream

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@Px
fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

fun Int.toDp(): Int = (this / Resources.getSystem().displayMetrics.density).toInt()

@AnyRes fun String.toResourceId(context: Context, resType: String): Int = toResourceId(context.resources, resType, context.packageName)
@AnyRes fun String.toResourceId(res: Resources, resType: String, packageName: String): Int = res.getIdentifier(this, resType, packageName)

// string

fun Int.text(ctx: Context): CharSequence = text(ctx.resources)
fun Int.text(res: Resources): CharSequence = res.getText(this)

fun Int.text(ctx: Context, def: CharSequence): CharSequence = text(ctx.resources, def)
fun Int.text(res: Resources, def: CharSequence): CharSequence = res.getText(this, def)

fun Int.quantityText(ctx: Context, quantity: Int): CharSequence = quantityText(ctx.resources, quantity)
fun Int.quantityText(res: Resources, quantity: Int): CharSequence = res.getQuantityText(this, quantity)

fun Int.textArray(ctx: Context): Array<CharSequence> = textArray(ctx.resources)
fun Int.textArray(res: Resources): Array<CharSequence> = res.getTextArray(this)

fun Int.string(ctx: Context): String = string(ctx.resources)
fun Int.string(res: Resources): String = res.getString(this)

fun Int.string(ctx: Context, vararg formatArgs: Any): String = string(ctx.resources, formatArgs)
fun Int.string(res: Resources, vararg formatArgs: Any): String = res.getString(this, formatArgs)

fun Int.quantityString(ctx: Context, quantity: Int, vararg formatArgs: Any): String = quantityString(ctx.resources, quantity, formatArgs)
fun Int.quantityString(res: Resources, quantity: Int, vararg formatArgs: Any): String = res.getQuantityString(this, quantity, formatArgs)

fun Int.quantityString(ctx: Context, quantity: Int): String = quantityString(ctx.resources, quantity)
fun Int.quantityString(res: Resources, quantity: Int): String = res.getQuantityString(this, quantity)

fun Int.stringArray(ctx: Context): Array<String> = stringArray(ctx.resources)
fun Int.stringArray(res: Resources): Array<String> = res.getStringArray(this)

// int

fun Int.int(ctx: Context): Int = int(ctx.resources)
fun Int.int(res: Resources): Int = res.getInteger(this)

fun Int.intArray(ctx: Context): IntArray = intArray(ctx.resources)
fun Int.intArray(res: Resources): IntArray = res.getIntArray(this)

// attrs

fun Int.typedArray(ctx: Context): TypedArray = typedArray(ctx.resources)
@SuppressLint("Recycle") fun Int.typedArray(res: Resources): TypedArray = res.obtainTypedArray(this)

// dimen

fun Int.dimension(ctx: Context): Float = dimension(ctx.resources)
fun Int.dimension(res: Resources): Float = res.getDimension(this)

fun Int.dimensionPixelOffset(ctx: Context): Int = dimensionPixelOffset(ctx.resources)
fun Int.dimensionPixelOffset(res: Resources): Int = res.getDimensionPixelOffset(this)

fun Int.dimensionPixelSize(ctx: Context): Int = dimensionPixelSize(ctx.resources)
fun Int.dimensionPixelSize(res: Resources): Int = res.getDimensionPixelSize(this)

// drawable

fun Int.drawable(ctx: Context): Drawable = ContextCompat.getDrawable(ctx, this)
@Deprecated("Consider using drawable(Context).", ReplaceWith("res.getDrawable(this)")) fun Int.drawable(res: Resources): Drawable = res.getDrawable(this)

// movie

fun Int.movie(ctx: Context): Movie = movie(ctx.resources)
fun Int.movie(res: Resources): Movie = res.getMovie(this)

// color

@ColorInt fun Int.color(ctx: Context): Int = ContextCompat.getColor(ctx, this)
@ColorInt @Deprecated("Consider using color(Context).", ReplaceWith("res.getColor(this)")) fun Int.color(res: Resources): Int = res.getColor(this)

fun Int.colorStateList(ctx: Context): ColorStateList = ContextCompat.getColorStateList(ctx, this)
@Deprecated("Consider using colorStateList(Context).", ReplaceWith("res.getColorStateList(this)")) fun Int.colorStateList(res: Resources): ColorStateList = res.getColorStateList(this)

// bool

fun Int.boolean(ctx: Context): Boolean = boolean(ctx.resources)
fun Int.boolean(res: Resources): Boolean = res.getBoolean(this)

// layout

fun Int.layout(ctx: Context): XmlResourceParser = layout(ctx.resources)
fun Int.layout(res: Resources): XmlResourceParser = res.getLayout(this)

// anim

fun Int.animation(ctx: Context): XmlResourceParser = animation(ctx.resources)
fun Int.animation(res: Resources): XmlResourceParser = res.getAnimation(this)

// xml

fun Int.xml(ctx: Context): XmlResourceParser = xml(ctx.resources)
fun Int.xml(res: Resources): XmlResourceParser = res.getXml(this)

// raw

fun Int.raw(ctx: Context): InputStream = raw(ctx.resources)
fun Int.raw(res: Resources): InputStream = res.openRawResource(this)

fun Int.raw(ctx: Context, value: TypedValue): InputStream = raw(ctx.resources, value)
fun Int.raw(res: Resources, value: TypedValue): InputStream = res.openRawResource(this, value)

fun Int.rawFd(ctx: Context): AssetFileDescriptor = rawFd(ctx.resources)
fun Int.rawFd(res: Resources): AssetFileDescriptor = res.openRawResourceFd(this)

// others

fun Int.fraction(ctx: Context, base: Int, pbase: Int): Float = fraction(ctx.resources, base, pbase)
fun Int.fraction(res: Resources, base: Int, pbase: Int): Float = res.getFraction(this, base, pbase)