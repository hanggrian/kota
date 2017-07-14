package com.hendraanggrian.support.commonsutils.view

import android.app.Activity
import android.support.annotation.IdRes
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import com.hendraanggrian.support.commonsutils.annotation.Visibility

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

fun View.setVisibleBy(visible: Boolean): Boolean = setVisibilityBy(if (visible) VISIBLE else GONE)
fun View.setVisibilityBy(@Visibility visibility: Int): Boolean {
    if (this.visibility != visibility) {
        this.visibility = visibility
    }
    return this.visibility == VISIBLE
}

@Suppress("UNCHECKED_CAST") fun <T : View> Activity.findViewBy(@IdRes id: Int): T = findViewById(id) as T
@Suppress("UNCHECKED_CAST") fun <T : View> View.findViewBy(@IdRes id: Int): T = findViewById(id) as T