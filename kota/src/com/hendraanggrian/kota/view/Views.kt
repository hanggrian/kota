@file:JvmName("Views")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.view

import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import com.hendraanggrian.kota.annotation.Visibility

@Suppress("deprecation")
inline fun View.setBackgroundBy(drawable: Drawable) = if (Build.VERSION.SDK_INT >= 16) {
    background = drawable
} else {
    setBackgroundDrawable(drawable)
}

inline fun View.setVisibleBy(visible: Boolean) = setVisibilityBy(if (visible) VISIBLE else GONE)
inline fun View.setVisibilityBy(@Visibility visibility: Int): Boolean {
    if (this.visibility != visibility) {
        this.visibility = visibility
    }
    return this.visibility == VISIBLE
}