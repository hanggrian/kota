package com.hendraanggrian.kota.widget

import android.content.Context
import android.os.Build
import android.support.annotation.StyleRes
import android.widget.TextView

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@Suppress("deprecation")
fun TextView.setTextAppearanceBy(context: Context, @StyleRes resId: Int) = if (Build.VERSION.SDK_INT >= 23) {
    setTextAppearance(resId)
} else {
    setTextAppearance(context, resId)
}