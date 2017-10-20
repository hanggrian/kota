@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.design.widget.FloatingActionButton

@PublishedApi
internal inline fun FloatingActionButton.onVisibilityChangedListenerOf(
        noinline onHidden: ((FloatingActionButton) -> Unit)?,
        noinline onShown: ((FloatingActionButton) -> Unit)?
): FloatingActionButton.OnVisibilityChangedListener? =
        if (onHidden == null && onShown == null) null
        else object : FloatingActionButton.OnVisibilityChangedListener() {
            override fun onHidden(fab: FloatingActionButton?): Unit = onHidden?.invoke(this@onVisibilityChangedListenerOf) ?: Unit
            override fun onShown(fab: FloatingActionButton?): Unit = onShown?.invoke(this@onVisibilityChangedListenerOf) ?: Unit
        }

@JvmOverloads
inline fun FloatingActionButton.showIfHidden(
        noinline onHidden: ((FloatingActionButton) -> Unit)? = null,
        noinline onShown: ((FloatingActionButton) -> Unit)? = null
) {
    if (!isShown) show(onVisibilityChangedListenerOf(onHidden, onShown))
}

@JvmOverloads
inline fun FloatingActionButton.hideIfShown(
        noinline onShown: ((FloatingActionButton) -> Unit)? = null,
        noinline onHidden: ((FloatingActionButton) -> Unit)? = null
) {
    if (isShown) hide(onVisibilityChangedListenerOf(onHidden, onShown))
}