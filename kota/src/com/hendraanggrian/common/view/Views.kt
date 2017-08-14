@file:JvmName("Views")
@file:Suppress("NOTHING_TO_INLINE")

package com.hendraanggrian.common.view

import android.view.View
import com.hendraanggrian.common.annotation.Visibility

inline fun <V : View> V.setVisibilityThen(
        @Visibility visibility: Int,
        noinline block: V.() -> Unit,
        noinline fallback: V.() -> Unit
): Unit {
    this.visibility = visibility
    when (visibility) {
        View.VISIBLE -> block(this)
        else -> fallback(this)
    }
}

inline fun <V : View> V.setVisibilityThen(
        @Visibility visibility: Int,
        noinline block: V.() -> Unit
): Unit {
    this.visibility = visibility
    if (visibility == View.VISIBLE) {
        block(this)
    }
}

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        noinline block: V.() -> Unit,
        noinline fallback: V.() -> Unit
): Unit = setVisibilityThen(if (visible) View.VISIBLE else View.GONE, block, fallback)

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        noinline block: V.() -> Unit
): Unit = setVisibilityThen(if (visible) View.VISIBLE else View.GONE, block)