@file:JvmName("ColorStateLists")
@file:Suppress("NOTHING_TO_INLINE")

package com.hendraanggrian.common.content

import android.content.res.ColorStateList
import android.support.annotation.ColorInt

inline fun @receiver:ColorInt Int.toColorStateList(): ColorStateList = ColorStateList.valueOf(this)