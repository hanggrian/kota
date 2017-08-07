@file:JvmName("Views")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.view

import android.view.View
import com.hendraanggrian.kota.annotation.Visibility

inline fun <V : View> V.setVisibleBy(
        visible: Boolean,
        noinline doIfVisible: (V.() -> Unit)? = null,
        noinline doIfNotVisible: (V.() -> Unit)? = null
): Unit = setVisibilityBy(if (visible) View.VISIBLE else View.GONE, doIfVisible, doIfNotVisible)

inline fun <V : View> V.setVisibleBy(
        visible: Boolean,
        noinline doIfVisible: (V.() -> Unit)? = null
): Unit = setVisibilityBy(if (visible) View.VISIBLE else View.GONE, doIfVisible)

inline fun <V : View> V.setVisibilityBy(
        @Visibility visibility: Int,
        noinline doIfVisible: (V.() -> Unit)? = null
): Unit {
    if (this.visibility != visibility) {
        this.visibility = visibility
    }
    if (doIfVisible != null && visibility == View.VISIBLE) {
        doIfVisible()
    }
}

inline fun <V : View> V.setVisibilityBy(
        @Visibility visibility: Int,
        noinline doIfVisible: (V.() -> Unit)? = null,
        noinline doIfNotVisible: (V.() -> Unit)? = null
): Unit {
    if (this.visibility != visibility) {
        this.visibility = visibility
    }
    if (doIfVisible != null && visibility == View.VISIBLE) {
        doIfVisible()
    } else if (doIfNotVisible != null && visibility != View.VISIBLE) {
        doIfNotVisible()
    }
}