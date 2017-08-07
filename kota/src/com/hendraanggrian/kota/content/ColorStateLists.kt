@file:JvmName("ColorStateLists")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.content.res.ColorStateList
import android.support.annotation.ColorInt

inline fun @receiver:ColorInt Int.toColorStateList(): ColorStateList = ColorStateList.valueOf(this)