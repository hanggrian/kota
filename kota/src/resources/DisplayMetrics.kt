@file:JvmMultifileClass
@file:JvmName("ResourcesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.res.Resources.getSystem
import android.support.annotation.Px

/** Get converted pixel value of this dp. */
inline val Int.dp: Int @Px get() = (this * getSystem().displayMetrics.density).toInt()

/** Get converted pixel value of this dp. */
inline val Float.dp: Int @Px get() = (this * getSystem().displayMetrics.density).toInt()

/** Get converted pixel value of this sp. */
inline val Int.sp: Int @Px get() = (this * getSystem().displayMetrics.scaledDensity).toInt()

/** Get converted pixel value of this sp. */
inline val Float.sp: Int @Px get() = (this * getSystem().displayMetrics.scaledDensity).toInt()

/** Get converted dp value of this pixel. */
inline fun dpOf(@Px px: Int): Int = (px / getSystem().displayMetrics.density).toInt()

/** Get converted dp value of this pixel. */
inline fun dpOf(px: Float): Int = (px / getSystem().displayMetrics.density).toInt()

/** Get converted sp value of this pixel. */
inline fun spOf(@Px px: Int): Int = (px / getSystem().displayMetrics.scaledDensity).toInt()

/** Get converted sp value of this pixel. */
inline fun spOf(px: Float): Int = (px / getSystem().displayMetrics.scaledDensity).toInt()