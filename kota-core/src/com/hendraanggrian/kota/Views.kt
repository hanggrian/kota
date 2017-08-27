@file:JvmName("Views")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.view.View
import android.view.ViewGroup
import com.hendraanggrian.kota.annotation.Visibility

inline val ViewGroup.childs: List<View> get() = (0 until childCount).map { getChildAt(it) }

inline fun <V : View> V.setVisibilityThen(
        @Visibility visibility: Int,
        noinline block: V.() -> Unit,
        noinline fallback: V.() -> Unit
) {
    this.visibility = visibility
    when (visibility) {
        View.VISIBLE -> block(this)
        else -> fallback(this)
    }
}

inline fun <V : View> V.setVisibilityThen(
        @Visibility visibility: Int,
        noinline block: V.() -> Unit
) {
    this.visibility = visibility
    if (visibility == View.VISIBLE) {
        block(this)
    }
}

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        noinline block: V.() -> Unit,
        noinline fallback: V.() -> Unit
) = setVisibilityThen(if (visible) View.VISIBLE else View.GONE, block, fallback)

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        noinline block: V.() -> Unit
) = setVisibilityThen(if (visible) View.VISIBLE else View.GONE, block)