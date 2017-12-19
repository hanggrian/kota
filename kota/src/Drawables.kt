@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.NinePatch
import android.graphics.Picture
import android.graphics.drawable.*
import android.graphics.drawable.shapes.Shape
import android.support.annotation.ColorInt
import android.support.annotation.RequiresApi

inline fun @receiver:ColorInt Int.toDrawable(): Drawable = ColorDrawable(this)
@RequiresApi(26) inline fun Color.toDrawable(): Drawable = ColorDrawable(toArgb())
inline fun ColorStateList.toDrawable(): Drawable = ColorDrawable(defaultColor)

inline fun Drawable.clip(gravity: Int, orientation: Int): Drawable = ClipDrawable(this, gravity, orientation)

inline fun Bitmap.toDrawable(res: Resources): Drawable = BitmapDrawable(res, this)

inline fun @receiver:ColorInt IntArray.toDrawable(orientation: GradientDrawable.Orientation): Drawable = GradientDrawable(orientation, this)

inline fun Drawable.inset(insetLeft: Int, insetTop: Int, insetRight: Int, insetBottom: Int): Drawable = InsetDrawable(this, insetLeft, insetTop, insetRight, insetBottom)
inline fun Drawable.inset(inset: Int): Drawable = InsetDrawable(this, inset)
@RequiresApi(26) inline fun Drawable.inset(inset: Float): Drawable = InsetDrawable(this, inset)

inline fun Array<Drawable>.toLayerDrawable(): Drawable = LayerDrawable(this)
inline fun Collection<Drawable>.toLayerDrawable(): Drawable = LayerDrawable(toTypedArray())

inline fun NinePatch.toDrawable(res: Resources): Drawable = NinePatchDrawable(res, this)

inline fun Int.toPaintDrawable(): Drawable = PaintDrawable(this)
@RequiresApi(26) inline fun Color.toPaintDrawable(): Drawable = PaintDrawable(toArgb())
inline fun ColorStateList.toPaintDrawable(): Drawable = PaintDrawable(defaultColor)

inline fun Picture.toDrawable(): Drawable = PictureDrawable(this)

@RequiresApi(21)
inline fun ColorStateList.toRippleDrawable(content: Drawable?, mask: Drawable?): Drawable = RippleDrawable(this, content, mask)

inline fun Drawable.scale(gravity: Int, scaleWidth: Float, scaleHeight: Float): Drawable = ScaleDrawable(this, gravity, scaleWidth, scaleHeight)

inline fun Shape.toDrawable(): Drawable = ShapeDrawable(this)

inline fun Array<Drawable>.toTransitionDrawable(): Drawable = TransitionDrawable(this)
inline fun Collection<Drawable>.toTransitionDrawable(): Drawable = TransitionDrawable(toTypedArray())