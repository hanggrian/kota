package com.hendraanggrian.support.utils.view

import android.support.annotation.IdRes
import android.support.annotation.IntDef
import android.view.View
import android.view.View.*

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@IntDef(VISIBLE.toLong(),
        INVISIBLE.toLong(),
        GONE.toLong())
@Retention(AnnotationRetention.SOURCE)
annotation class Visibility

fun View.setVisibleBy(visible: Boolean): Boolean = setVisibilityBy(if (visible) VISIBLE else GONE)
fun View.setVisibilityBy(@Visibility visibility: Int): Boolean {
    if (this.visibility != visibility) {
        this.visibility = visibility
    }
    return this.visibility == VISIBLE
}

@Suppress("UNCHECKED_CAST") fun <T : View> View.findViewBy(@IdRes id: Int): T = findViewById(id) as T