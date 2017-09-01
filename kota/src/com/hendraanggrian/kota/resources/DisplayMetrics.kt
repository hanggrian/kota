@file:JvmName("Metrics")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.resources

import android.content.res.Resources
import android.support.annotation.Px
import android.util.DisplayMetrics

@PublishedApi internal inline val systemDisplayMetrics: DisplayMetrics get() = Resources.getSystem().displayMetrics

/** Get converted pixel value of this dp. */
inline val Int.dp: Int @Px get() = (this * systemDisplayMetrics.density).toInt()

/** Get converted pixel value of this dp. */
inline val Float.dp: Int @Px get() = (this * systemDisplayMetrics.density).toInt()

/** Get converted pixel value of this sp. */
inline val Int.sp: Int @Px get() = (this * systemDisplayMetrics.scaledDensity).toInt()

/** Get converted pixel value of this sp. */
inline val Float.sp: Int @Px get() = (this * systemDisplayMetrics.scaledDensity).toInt()

/** Get converted dp value of this pixel. */
inline fun dpOf(@Px px: Int): Int = (px / systemDisplayMetrics.density).toInt()

/** Get converted dp value of this pixel. */
inline fun dpOf(px: Float): Int = (px / systemDisplayMetrics.density).toInt()

/** Get converted sp value of this pixel. */
inline fun spOf(@Px px: Int): Int = (px / systemDisplayMetrics.scaledDensity).toInt()

/** Get converted sp value of this pixel. */
inline fun spOf(px: Float): Int = (px / systemDisplayMetrics.scaledDensity).toInt()