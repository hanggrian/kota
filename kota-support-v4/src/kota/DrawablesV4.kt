@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.graphics.drawable.Drawable
import android.os.Build.VERSION.SDK_INT
import android.os.Build.VERSION_CODES.LOLLIPOP
import android.support.annotation.ColorInt
import android.support.v4.graphics.drawable.DrawableCompat.setTint
import android.support.v4.graphics.drawable.DrawableCompat.wrap

/** Apply tint on appropriate sdk level. */
inline infix fun Drawable.tint(@ColorInt color: Int): Drawable = if (SDK_INT >= LOLLIPOP) apply { setTint(color) }
else wrap(this).apply { setTint(this, color) }