@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.design.widget.FloatingActionButton

@JvmOverloads
inline fun FloatingActionButton.showIfHidden(listener: FloatingActionButton.OnVisibilityChangedListener? = null) {
    if (!isShown) show(listener)
}

@JvmOverloads
inline fun FloatingActionButton.hideIfShown(listener: FloatingActionButton.OnVisibilityChangedListener? = null) {
    if (isShown) hide(listener)
}