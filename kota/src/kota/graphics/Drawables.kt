@file:JvmName("DrawablesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.graphics

import android.annotation.TargetApi
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.*
import android.graphics.drawable.*
import android.graphics.drawable.shapes.Shape
import android.support.annotation.ColorInt
import android.support.annotation.RequiresApi

inline fun Bitmap.toDrawable(res: Resources): Drawable = BitmapDrawable(res, this)

inline fun Drawable.toBitmap(): Bitmap {
    if (this is BitmapDrawable && bitmap != null) {
        return bitmap
    }
    val bitmap = when {
        intrinsicWidth <= 0 || intrinsicHeight <= 0 -> Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888)
        else -> Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888)
    }
    val canvas = Canvas(bitmap)
    setBounds(0, 0, canvas.width, canvas.height)
    draw(canvas)
    return bitmap
}

inline fun @receiver:ColorInt Int.toDrawable(): Drawable = ColorDrawable(this)

@TargetApi(26)
@RequiresApi(26)
inline fun Color.toDrawable(): Drawable = toArgb().toDrawable()

inline fun ColorStateList.toDrawable(): Drawable = defaultColor.toDrawable()

inline fun NinePatch.toDrawable(res: Resources): Drawable = NinePatchDrawable(res, this)

inline fun Picture.toDrawable(): Drawable = PictureDrawable(this)

inline fun Shape.toDrawable(): Drawable = ShapeDrawable(this)