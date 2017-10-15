@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.views

import android.app.Activity
import android.view.View
import android.view.ViewGroup

inline val Activity.contentView: View? get() = findViewById<ViewGroup>(android.R.id.content)?.getChildAt(0)

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