@file:JvmName("ViewGroups")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.view

import android.view.View
import android.view.ViewGroup

inline fun ViewGroup.getChilds(): List<View> = (0..childCount - 1).map { getChildAt(it) }

@JvmOverloads fun ViewGroup.containsView(child: View, recursive: Boolean = false): Boolean {
    for (i in 0..childCount - 1) {
        val view = getChildAt(i)
        if (recursive && view is ViewGroup) {
            if (containsView(child, true)) {
                return true
            }
        } else if (getChildAt(i) === child) {
            return true
        }
    }
    return false
}