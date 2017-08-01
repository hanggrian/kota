package com.hendraanggrian.kota.view

import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import com.hendraanggrian.kota.annotation.Visibility

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@Suppress("deprecation")
fun View.setBackgroundBy(drawable: Drawable) = if (Build.VERSION.SDK_INT >= 16) {
    background = drawable
} else {
    setBackgroundDrawable(drawable)
}

fun View.setVisibleBy(visible: Boolean): Boolean = setVisibilityBy(if (visible) VISIBLE else GONE)
fun View.setVisibilityBy(@Visibility visibility: Int): Boolean {
    if (this.visibility != visibility) {
        this.visibility = visibility
    }
    return this.visibility == VISIBLE
}