/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

package com.hendraanggrian.support.utils.view

import android.support.annotation.IdRes
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import com.hendraanggrian.support.utils.annotation.Visibility

fun View.setVisibleBy(visible: Boolean): Boolean = setVisibilityBy(if (visible) VISIBLE else GONE)
fun View.setVisibilityBy(@Visibility visibility: Int): Boolean {
    if (this.visibility != visibility) {
        this.visibility = visibility
    }
    return this.visibility == VISIBLE
}

@Suppress("UNCHECKED_CAST") fun <T : View> View.findViewBy(@IdRes id: Int): T = findViewById(id) as T