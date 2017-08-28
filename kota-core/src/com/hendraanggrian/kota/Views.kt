@file:JvmName("Views")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.view.View
import android.view.ViewGroup
import com.hendraanggrian.kota.annotation.Visibility

inline val ViewGroup.childs: List<View> get() = (0 until childCount).map { getChildAt(it) }

inline fun ViewGroup.forEach(action: (View) -> Unit) {
    for (child in childs) action(child)
}

inline fun ViewGroup.forEachIndexed(action: (Int, View) -> Unit) {
    var i = 0
    for (child in childs) action(i++, child)
}

inline fun <V : View> V.setVisibilityThen(
        @Visibility visibility: Int,
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
        @Visibility visibility: Int,
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