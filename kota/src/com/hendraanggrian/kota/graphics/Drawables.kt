@file:JvmName("DrawablesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.graphics

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.NinePatch
import android.graphics.Picture
import android.graphics.drawable.*
import android.graphics.drawable.shapes.Shape
import android.support.annotation.ColorInt

inline fun Bitmap.toDrawable(res: Resources): Drawable = BitmapDrawable(res, this)

inline fun @receiver:ColorInt Int.toDrawable(): Drawable = ColorDrawable(this)

inline fun NinePatch.toDrawable(res: Resources): Drawable = NinePatchDrawable(res, this)

inline fun Picture.toDrawable(): Drawable = PictureDrawable(this)

inline fun Shape.toDrawable(): Drawable = ShapeDrawable(this)