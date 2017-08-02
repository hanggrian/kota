@file:JvmName("TextViews")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.widget

import android.content.Context
import android.os.Build
import android.support.annotation.StyleRes
import android.widget.TextView

@Suppress("deprecation")
inline fun TextView.setTextAppearanceBy(context: Context, @StyleRes resId: Int) = if (Build.VERSION.SDK_INT >= 23) {
    setTextAppearance(resId)
} else {
    setTextAppearance(context, resId)
}