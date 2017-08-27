@file:JvmName("ColorStateLists")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.content.res.ColorStateList
import android.support.annotation.ColorInt

inline fun colorStateListOf(@ColorInt color: Int): ColorStateList = ColorStateList.valueOf(color)