@file:JvmName("DisplayMetrics")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.res

import android.content.res.Resources
import android.support.annotation.Px
import com.hendraanggrian.kota.annotation.Dp
import com.hendraanggrian.kota.annotation.Sp


/**
 * Px values of dp.
 */
@Px inline fun dp(dp: Int): Int = (dp * Resources.getSystem().displayMetrics.density).toInt()

@Px inline fun dp(dp: Float): Int = (dp * Resources.getSystem().displayMetrics.density).toInt()

/**
 * Px values of sp.
 */
@Px inline fun sp(sp: Int): Int = (sp * Resources.getSystem().displayMetrics.scaledDensity).toInt()

@Px inline fun sp(sp: Float): Int = (sp * Resources.getSystem().displayMetrics.scaledDensity).toInt()

/**
 * Dp values of px.
 */
@Dp inline fun dpOf(px: Int): Int = (px.toFloat() / Resources.getSystem().displayMetrics.density).toInt()

@Dp inline fun dpOf(px: Float): Int = (px / Resources.getSystem().displayMetrics.density).toInt()

/**
 * Sp values of px.
 */
@Sp inline fun spOf(px: Int): Int = (px.toFloat() / Resources.getSystem().displayMetrics.scaledDensity).toInt()

@Sp inline fun spOf(px: Float): Int = (px / Resources.getSystem().displayMetrics.scaledDensity).toInt()