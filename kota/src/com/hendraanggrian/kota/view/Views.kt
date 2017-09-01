@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.view

import android.view.View

inline fun <V : View> V.setVisibilityThen(
        visibility: Int,
        block: V.() -> Unit,
        fallback: V.() -> Unit
) {
    this.visibility = visibility
    when (visibility) {
        View.VISIBLE -> block(this)
        else -> fallback(this)
    }
}

inline fun <V : View> V.setVisibilityThen(
        visibility: Int,
        block: V.() -> Unit
) {
    this.visibility = visibility
    if (visibility == View.VISIBLE) {
        block(this)
    }
}

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        block: V.() -> Unit,
        fallback: V.() -> Unit
) = setVisibilityThen(if (visible) View.VISIBLE else View.GONE, block, fallback)

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        block: V.() -> Unit
) = setVisibilityThen(if (visible) View.VISIBLE else View.GONE, block)